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


	@Override
	public List<RepartoModel> getRepartoForHospital(final String code)
			throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<RepartoModel> result = repartoDao.findRepartoByHospital(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("not found!");
		}
		//		else if (result.size() > 1)
		//		{
		//			throw new AmbiguousIdentifierException(
		//					"Hospital code " + code + " is not unique, " + result.size() + " hospital found!");
		//		}
		return result;
	}
	public RepartoDao getRepartoDao()
	{
		return repartoDao;
	}

	@Required
	public void setRepartoDao(final RepartoDao repartoDao)
	{
		this.repartoDao = repartoDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.core.service.RepartoService#getDepartments()
	 */
	@Override
	public List<RepartoModel> getDepartments()
	{

		return repartoDao.findDepartments();
	}











}
