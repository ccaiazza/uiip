/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.HospitalDao;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.service.HospitalService;

/**
 * @author soprasteria
 *
 */
public class DefaultHospitalService implements HospitalService
{


	private HospitalDao hospitalDao;
	@Override
	public List<HospitalModel> getHospitalInfoforCode(final String code)
			throws AmbiguousIdentifierException, UnknownIdentifierException
		{
		final List<HospitalModel> result = hospitalDao.findHospitalInfo(code);
			if (result.isEmpty())
			{
				throw new UnknownIdentifierException("Reparto not found!");
			}
			else if (result.size() > 1)
			{
				throw new AmbiguousIdentifierException(
						"Reparto is not unique, reparto found!");
			}
			return result;
		}

	public List<HospitalModel> getHospitals() throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<HospitalModel> result = hospitalDao.findHospitals();
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Reparto not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Reparto is not unique, reparto found!");
		}
		return result;
	}
	/**
	 * @return the hospitalDao
	 */
	public HospitalDao getHospitalDao()
	{
		return hospitalDao;
	}

	/**
	 * @param hospitalDao
	 *           the hospitalDao to set
	 */
	@Required
	public void setHospitalDao(final HospitalDao hospitalDao)
	{
		this.hospitalDao = hospitalDao;
	}

	}


