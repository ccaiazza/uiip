/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.PathologyDao;
import org.training.hospital.core.model.PathologyModel;
import org.training.hospital.core.service.PathologyService;

/**
 * @author soprasteria
 *
 */
public class DefaultPathologyService implements PathologyService
{

	private PathologyDao pathologyDao;
	/* (non-Javadoc)
	 * @see org.training.hospital.core.service.PathologyService#getPatologyforPatient(org.training.hospital.core.model.PatientModel)
	 */
	@Override
	public List<PathologyModel> getPatologyForPatient(final String codePatient)
			throws UnknownIdentifierException
	{
		final List<PathologyModel> result = pathologyDao.findPatologyByPatient(codePatient);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Pathology not found!");
		}
		//		else if (result.size() > 1)
		//		{
		//			throw new AmbiguousIdentifierException("Pathology is not unique, pathology found!");
		//		}
		return result;
	}

	/**
	 * @return the pathologyDao
	 */
	public PathologyDao getPathologyDao()
	{
		return pathologyDao;
	}

	/**
	 * @param pathologyDao
	 *           the pathologyDao to set
	 */
	@Required
	public void setPathologyDao(final PathologyDao pathologyDao)
	{
		this.pathologyDao = pathologyDao;
	}




}


