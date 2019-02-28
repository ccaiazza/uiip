/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
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
	 * @see org.training.hospital.core.service.RepartoService#getRepartiByHospital(org.training.hospital.core.model.
	 * HospitalModel)
	 */
	@Override
	public List<RepartoModel> getRepartiByHospital(final String code)throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<RepartoModel> result = repartoDao.findRepartiByHospital(code);
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

	/**
	 * @return the repartoDao
	 */
	public RepartoDao getRepartoDao()
	{
		return repartoDao;
	}

	@Required
	public void setRepartoDao(final RepartoDao repartoDao)
	{
		this.repartoDao = repartoDao;
	}




}
