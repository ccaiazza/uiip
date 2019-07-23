package org.training.hospital.facades.populators;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.MedicalProductModel;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.MedicalProductService;
import org.training.hospital.core.service.PatientService;
import org.training.hospital.facades.product.data.MedicalProductData;
import org.training.hospital.facades.product.data.PrescriptionData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;

public class ReversePrescriptionPopulator implements Populator<PrescriptionData, PrescriptionModel> {

	
	private ModelService modelService;
	private UserService userService;
	private PatientService patientService;
	private MedicalProductService medicalProductService;
	private static final Logger LOG = Logger.getLogger(ReversePrescriptionPopulator.class);
	
	@Override
	public void populate(PrescriptionData source, PrescriptionModel target) throws ConversionException {
		
		target.setAsl(source.getAsl());
		target.setCode(source.getCode());
		target.setDistrict(source.getDistrict());
		target.setDate(source.getDate());
		target.setExemption(source.getExemption());
		final UserModel currentUser = userService.getCurrentUser();
		final String patientCode = currentUser.getUid();
		PatientModel patient = patientService.getPatientForUid(patientCode);
		target.setPatient(patient);
		

		List<MedicalProductModel> list = new ArrayList<MedicalProductModel>();
		
		for(MedicalProductData p : source.getProducts()) {
			MedicalProductModel medical = medicalProductService.getMedicalProductForCode(p.getCode());
			if(medical!= null) {
			list.add(medical);
			}
			else {
				LOG.warn("Product "+p.getCode()+" no exist!");
			}	
		}
		if(list.isEmpty()) {
			throw new UnknownIdentifierException("Products list is empty!");
		}
		target.setProducts(list);
		modelService.save(target);
		LOG.info("Prescription successfully created");
	}

	public ModelService getModelService() {
		return modelService;
	}
    @Required
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}

	public UserService getUserService() {
		return userService;
	}

    @Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public PatientService getPatientService() {
		return patientService;
	}
    @Required
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	public MedicalProductService getMedicalProductService() {
		return medicalProductService;
	}

    @Required
	public void setMedicalProductService(MedicalProductService medicalProductService) {
		this.medicalProductService = medicalProductService;
	}  
}
