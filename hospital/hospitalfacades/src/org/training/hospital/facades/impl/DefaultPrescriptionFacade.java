package org.training.hospital.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.PrescriptionService;
import org.training.hospital.facades.facade.PrescriptionFacade;
import org.training.hospital.facades.product.data.PrescriptionData;

import de.hybris.platform.servicelayer.dto.converter.Converter;

public class DefaultPrescriptionFacade implements PrescriptionFacade {
	
	private PrescriptionService prescriptionService;
	private Converter<PrescriptionModel, PrescriptionData> prescriptionConverter ;
	

	@Override
	public List<PrescriptionData> getPrescriptionForPatient(String code) {
		List<PrescriptionModel> list = prescriptionService.getPrescriptionForPatient(code);
		return prescriptionConverter.convertAll(list);	
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
}
