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

		final List<HospitalModel> result = hospitalDao.findHospital();
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("hospital found!");
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

	@Required
	public void setHospitalDao(final HospitalDao hospitalDao)
	{
		this.hospitalDao = hospitalDao;
	}

}
