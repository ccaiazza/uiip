/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.HeadDao;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.service.HeadService;

/**
 * @author soprasteria
 *
 */
public class DefaultHeadService implements HeadService
{
	private HeadDao headDao;
	/* (non-Javadoc)
	 * @see org.training.hospital.core.service.HeadService#getHeadByHospital(java.lang.String)
	 */
	@Override
	public List<HeadModel> getHeadForHospital(final String code)
	{
		final List<HeadModel> result = headDao.findHeadByHospital(code);
      if (result.isEmpty())
      {
			throw new UnknownIdentifierException("not found!");
      }
      else if (result.size() > 1)
      {
			throw new AmbiguousIdentifierException(
					"Hospital code '" + code + "' is not unique, " + result.size() + " hospital found!");
      }
		return result;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.core.service.HeadService#getHeadByReparto(java.lang.String)
	 */
	@Override
	public List<HeadModel> getHeadForReparto(final String code)
	{

		final List<HeadModel> result = headDao.findHeadByHospital(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Reparto code '" + code + "' is not unique, " + result.size() + " reparto found!");
		}
		return result;
	}

	/**
	 * @return the headDao
	 */
	public HeadDao getHeadDao()
	{
		return headDao;
	}

	@Required
	public void setHeadDao(final HeadDao headDao)
	{
		this.headDao = headDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.core.service.HeadService#getHeadByHospitalName()
	 */

	@Override
	public List<HeadModel> getHeadForHospitalName(final String name)
	{
		final List<HeadModel> result = headDao.findHeadByHospitalName(name);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(" reparto found!");
		}
		return result;

	}


}
