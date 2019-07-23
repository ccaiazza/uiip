package org.training.hospital.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.PrescriptionService;
import org.training.hospital.facades.facade.PrescriptionFacade;
import org.training.hospital.facades.product.data.PrescriptionData;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.user.UserService;

public class DefaultPrescriptionFacade implements PrescriptionFacade {
	
	private PrescriptionService prescriptionService;
	private Converter<PrescriptionModel, PrescriptionData> prescriptionConverter ;
	private Converter<PrescriptionData, PrescriptionModel> reversePrescriptionConverter ;
	private UserService userService;
	
	
	

	@Override
	public List<PrescriptionData> getPrescriptionsForPatientCode() {
		final UserModel currentUser = userService.getCurrentUser();
		final String patientCode = currentUser.getUid();
		List<PrescriptionModel> list = prescriptionService.getPrescriptionsForPatientCode(patientCode);
		return prescriptionConverter.convertAll(list);	
	}
	

	@Override
	public void create(PrescriptionData prescription) {
		PrescriptionModel prescriptionModel = prescriptionService.getPrescriptionForCode(prescription.getCode());
		if(prescriptionModel == null) {
		reversePrescriptionConverter.convert(prescription);
		}
		else {
			throw new UnknownIdentifierException("Prescription exist!");
		}		
	}	

	public PrescriptionService getPrescriptionService() {
		return prescriptionService;
	}

	@Required
	public void setPrescriptionService(PrescriptionService prescriptionService) {
		this.prescriptionService = prescriptionService;
	}

	public Converter<PrescriptionModel, PrescriptionData> getPrescriptionConverter() {
		return prescriptionConverter;
	}

	@Required
	public void setPrescriptionConverter(Converter<PrescriptionModel, PrescriptionData> prescriptionConverter) {
		this.prescriptionConverter = prescriptionConverter;
	}

	
	public UserService getUserService() {
		return userService;
	}

	@Required
	public void setUserService(UserService userService) {
		this.userService = userService;
	
	}
	public Converter<PrescriptionData, PrescriptionModel> getReversePrescriptionConverter() {
		return reversePrescriptionConverter;
	}
    @Required
	public void setReversePrescriptionConverter(
			Converter<PrescriptionData, PrescriptionModel> reversePrescriptionConverter) {
		this.reversePrescriptionConverter = reversePrescriptionConverter;
	}	
    
    
    
}
