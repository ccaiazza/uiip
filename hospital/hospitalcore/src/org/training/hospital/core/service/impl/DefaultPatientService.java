/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.PatientDao;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.service.BedService;
import org.training.hospital.core.service.PatientService;

/**
 * @author soprasteria
 *
 */
public class DefaultPatientService implements PatientService
{
	private PatientDao patientDao;
	private ModelService modelService;
	
	/* (non-Javadoc)
	 * @see org.training.hospital.core.service.PatientService#getPatientForDateEntry()
	 */
	@Override
	public List<PatientModel> getPatientForDateEntry(final Date entry)
			throws UnknownIdentifierException
	{
		final List<PatientModel> result = patientDao.findPatientbyDateEntry(entry);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Patient not found!");
		}
		//		else if (result.size() > 1)
		//		{
		//			throw new AmbiguousIdentifierException("Patient is not unique, patient found!");
		//		}
		return result;
	}
	
	@Override
	public List<PatientModel> getPatients() {
		
		final List<PatientModel> result =patientDao.findPatients();
		if(result.isEmpty()) {
			throw new UnknownIdentifierException("Patient not found!");
		}
		
		return result;
	}
	
	@Override
	public PatientModel getPatientForCode(String uid) {
		final PatientModel result=patientDao.findPatientbyCode(uid);
		if(result==null) {
			throw new UnknownIdentifierException("Patient not found!");
		}
		return result;
	}

	
	
	
	

public PatientModel releasePatient(String code) {

	final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"), Locale.ITALY);
	final Date today = calendar.getTime();

		final PatientModel patient= patientDao.findPatientbyCode(code);
		patient.setDateExit(today);
		modelService.save(patient);
		return patient;
		
	}

	
	
	
	

	public PatientDao getPatientDao()
	{
		return patientDao;
	}

	
	@Required
	public void setPatientDao(final PatientDao patientDao)
	{
		this.patientDao = patientDao;
	}
	

}


