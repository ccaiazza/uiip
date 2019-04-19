/**
 *
 */
package org.training.hospital.core.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.PatientDao;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.service.PatientService;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;

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
		final List<PatientModel> result = patientDao.findPatientByDateEntry(entry);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Patient not found!");
		}
		
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
	public PatientModel getPatientForUid(String uid) {
		if(uid==null) {
			throw new IllegalArgumentException("uid is null");
		}
		else {
		final PatientModel result=patientDao.findPatientByUid(uid);
		if(result==null) {
			throw new UnknownIdentifierException("Patient not found!");
		}
		return result;
	}
	}

	public PatientModel releasePatient(String code) {


		
		
		Date today = new Date();


		final PatientModel patient= patientDao.findPatientByUid(code);
		if(code==null) {
			throw new IllegalArgumentException("code is null");
		}
		else {
		if(patient==null) {
			throw new UnknownIdentifierException("Patient not found!");
		}
		else {
			patient.setDateExit(today);
			modelService.save(patient);
			}
		
		return patient;
	}
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


	public ModelService getModelService() {
		return modelService;
	}

	@Required
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}




}


