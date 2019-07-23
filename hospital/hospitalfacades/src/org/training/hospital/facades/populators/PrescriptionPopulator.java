package org.training.hospital.facades.populators;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.MedicalProductModel;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.facades.product.data.MedicalProductData;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.PrescriptionData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class PrescriptionPopulator implements Populator<PrescriptionModel, PrescriptionData> {

	
	private Converter<PatientModel, PatientData> patientConverter;
	private Converter<MedicalProductModel, MedicalProductData> medicalProductConverter;
	
	
	@Override
	public void populate(PrescriptionModel source, PrescriptionData target) throws ConversionException {
	
		if (source == null)
		{
			throw new IllegalArgumentException("Model is empty");
		}
		else
		{
			target.setCode((source.getCode()));
			target.setAsl(source.getAsl());
			target.setDistrict(source.getDistrict());
			target.setDate(source.getDate());
			target.setExemption(source.getExemption());
			target.setPatient(patientConverter.convert(source.getPatient()));
			target.setProducts(medicalProductConverter.convertAll(source.getProducts()));
		}

		
		
		
	}



	public Converter<PatientModel, PatientData> getPatientConverter() {
		return patientConverter;
	}


	@Required
	public void setPatientConverter(Converter<PatientModel, PatientData> patientConverter) {
		this.patientConverter = patientConverter;
	}


	public Converter<MedicalProductModel, MedicalProductData> getMedicalProductConverter() {
		return medicalProductConverter;
	}
	@Required
	public void setMedicalProductConverter(Converter<MedicalProductModel, MedicalProductData> medicalProductConverter) {
		this.medicalProductConverter = medicalProductConverter;
	}



	



	
	



	

		
		
	

}
