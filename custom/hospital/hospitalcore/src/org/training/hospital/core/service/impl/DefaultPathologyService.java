/**
 *
 */
package org.training.hospital.core.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
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

	@Override
	public List<PathologyModel> getPathologyByName(final String name)
			throws UnknownIdentifierException, AmbiguousIdentifierException
	{

		final List<PathologyModel> result = pathologyDao.fingPathologybyName(name);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("not found");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Pathology name " + name + " is not unique, " + result.size() + " pathologies found!");
		}
		return result;
	}


	public PathologyDao getPathologyDao()
	{
		return pathologyDao;
	}

	@Required
	public void setPathologyDao(final PathologyDao pathologyDao)
	{
		this.pathologyDao = pathologyDao;
	}

}
