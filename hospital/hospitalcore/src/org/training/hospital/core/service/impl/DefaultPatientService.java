/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.PatientDao;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.service.PatientService;

/**
 * @author soprasteria
 *
 */
public class DefaultPatientService implements PatientService
{
	private PatientDao patientDao;

	/* (non-Javadoc)
	 * @see org.training.hospital.core.service.PatientService#getPatientForDateEntry()
	 */
	@Override
	public List<PatientModel> getPatientForDateEntry(final String entry)
			throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<PatientModel> result = patientDao.findPatientbyDateEntry(entry);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Patient not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Patient is not unique, patient found!");
		}
		return result;
	}

	/**
	 * @return the patientDao
	 */
	public PatientDao getPatientDao()
	{
		return patientDao;
	}

	/**
	 * @param patientDao
	 *           the patientDao to set
	 */
	@Required
	public void setPatientDao(final PatientDao patientDao)
	{
		this.patientDao = patientDao;
	}



}


