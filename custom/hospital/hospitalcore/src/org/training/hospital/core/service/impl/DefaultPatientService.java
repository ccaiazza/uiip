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


	@Override
	public List<PatientModel> getPatientByCode(final String id) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<PatientModel> result = patientDao.findPatientByCode(id);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Patient Id" + id + "is not unique, " + result.size() + " patients found!");
		}
		return result;
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
