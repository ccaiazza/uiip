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
	public List<PatientData> getPatientForDateEntry(final Date entry)
	{
		
		final List<PatientModel> patients = patientService.getPatientForDateEntry(entry);
		if(patients.isEmpty()) {
			return null;
		}
		else {
		final List<PatientData> patientsResult = patientConverter.convertAll(patients);
		return patientsResult;
	}
	}

	@Override
	public List<PatientData> getPatients() {
		final List<PatientModel> patients=patientService.getPatients();
		if(patients == null) {
			return null;
		}
		else {
			final List<PatientData> patientsResult = patientConverter.convertAll(patients);
			return patientsResult;
		}
	}
	
	@Override
	public PatientData getPatientForUid(String uid) {
		final PatientModel patient=patientService.getPatientForUid(uid);
		if(patient == null) {
			return null;
		}
		else
		return patientConverter.convert(patient);
			
	}
	
	@Override
	public PatientData releasePatient(String code) {
		final PatientModel patient= patientService.releasePatient(code);
		if(patient == null) {
			return null;
		}
		else
		return patientConverter.convert(patient);
	}

	
	
	
	
	
	
	public PatientService getPatientService()
	{
		return patientService;
	}

	
	@Required
	public void setPatientService(final PatientService patientService)
	{
		this.patientService = patientService;
	}


	public Converter<PatientModel, PatientData> getPatientConverter()
	{
		return patientConverter;
	}

	
	@Required
	public void setPatientConverter(final Converter<PatientModel, PatientData> patientConverter)
	{
		this.patientConverter = patientConverter;
	}



}
