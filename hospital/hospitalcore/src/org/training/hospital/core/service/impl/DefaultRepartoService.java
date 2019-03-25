/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.RepartoDao;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.core.service.RepartoService;

/**
 * @author soprasteria
 *
 */
public class DefaultRepartoService implements RepartoService
{

	private RepartoDao repartoDao;
	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.core.service.RepartoService#getRepartiForHospital(java.lang.String)
	 */
	@Override
	public List<RepartoModel> getRepartiforHospital(final String code)
			throws UnknownIdentifierException
	{
		final List<RepartoModel> result = repartoDao.findRepartiByHospital(code);

		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Reparto not found!");


		}
		//		else if (result.size() > 1)
		//		{
		//			throw new AmbiguousIdentifierException("Reparto is not unique, reparto found!");
		//		}


		return result;


	}

	/**
	 * @return the repartoDao
	 */
	public RepartoDao getRepartoDao()
	{
		return repartoDao;
	}

	/**
	 * @param repartoDao
	 *           the repartoDao to set
	 */
	@Required
	public void setRepartoDao(final RepartoDao repartoDao)
	{
		this.repartoDao = repartoDao;
	}


}
