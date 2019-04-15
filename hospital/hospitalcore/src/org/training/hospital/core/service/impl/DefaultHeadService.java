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
	 * @see org.training.hospital.core.service.HeadService#getHeadForReparto(java.lang.String)
	 */
	@Override
	public List<HeadModel> getHeadForReparto(final String codeReparto)
			throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<HeadModel> result = headDao.findHeadByReparto(codeReparto);
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


	/* (non-Javadoc)
	 * @see org.training.hospital.core.service.HeadService#getHeadForHospital(java.lang.String)
	 */
	@Override
	public List<HeadModel> getHeadForHospital(final String codeHospital)
			throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<HeadModel> result = headDao.findHeadByHospital(codeHospital);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Primario not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Primario is not unique, reparto found!");
		}
		return result;
	}

	public List<HeadModel> getHeadForHospitalName(final String name)
			throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<HeadModel> result = headDao.findHeadByHospitalName(name);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Primario not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException("Primario is not unique, reparto found!");
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


	/**
	 * @param headDao
	 *           the headDao to set
	 */
	@Required
	public void setHeadDao(final HeadDao headDao)
	{
		this.headDao = headDao;
	}



}
