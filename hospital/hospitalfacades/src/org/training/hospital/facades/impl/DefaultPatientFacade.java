/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.service.PatientService;
import org.training.hospital.facades.facade.PatientFacade;
import org.training.hospital.facades.product.data.PatientData;

/**
 * @author soprasteria
 *
 */
public class DefaultPatientFacade implements PatientFacade
{

	private PatientService patientService;
	private Converter<PatientModel, PatientData> patientConverter;

	@Override
	public List<PatientData> getPatientbyDateEntry(final Date entry)
	{

		final List<PatientModel> patients = patientService.getPatientForDateEntry(entry);
		final List<PatientData> patientsResult = patientConverter.convertAll(patients);
		return patientsResult;
	}


	@Override
	public List<PatientData> getPatients() {
		final List<PatientModel> patients=patientService.getPatients();
		return patientConverter.convertAll(patients);
			
	}


	@Override
	public PatientData getPatientForCode(String uid) {
		final PatientModel patient=patientService.getPatientForCode(uid);
		return patientConverter.convert(patient);
			
	}
	
	
	
	
	
	
	
	/**
	 * @return the patientService
	 */
	public PatientService getPatientService()
	{
		return patientService;
	}

	/**
	 * @param patientService
	 *           the patientService to set
	 */
	@Required
	public void setPatientService(final PatientService patientService)
	{
		this.patientService = patientService;
	}

	/**
	 * @return the patientConverter
	 */
	public Converter<PatientModel, PatientData> getPatientConverter()
	{
		return patientConverter;
	}

	/**
	 * @param patientConverter
	 *           the patientConverter to set
	 */
	@Required
	public void setPatientConverter(final Converter<PatientModel, PatientData> patientConverter)
	{
		this.patientConverter = patientConverter;
	}



}
