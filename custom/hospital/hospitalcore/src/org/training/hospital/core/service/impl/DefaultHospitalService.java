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
	public List<HospitalModel> getHospital()
	{
		return hospitalDao.findHospital();
	}

	/**
	 * @return the hospitalDao
	 */
	public HospitalDao getHospitalDao()
	{
		return hospitalDao;
	}

	@Required
	public void setHospitalDao(final HospitalDao hospitalDao)
	{
		this.hospitalDao = hospitalDao;
	}


	@Override
	public HospitalModel getHospitalForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException

	{
		final List<HospitalModel> result = hospitalDao.findHospitalByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Hospital with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Hospital code '" + code + "' is not unique, " + result.size() + " hospital found!");
		}
		return result.get(0);
	}

}
