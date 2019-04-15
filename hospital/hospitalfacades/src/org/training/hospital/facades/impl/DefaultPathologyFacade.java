/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PathologyModel;
import org.training.hospital.core.service.PathologyService;
import org.training.hospital.facades.facade.PathologyFacade;
import org.training.hospital.facades.product.data.PathologyData;

/**
 * @author soprasteria
 *
 */
public class DefaultPathologyFacade implements PathologyFacade
{

	private PathologyService pathologyService;
	private Converter<PathologyModel, PathologyData> pathologyConverter;
	/* (non-Javadoc)
	 * @see org.training.hospital.facades.facade.PathologyFacade#getPatologyforPatient(java.lang.String)
	 */
	@Override
	public List<PathologyData> getPatologyForPatient(final String codePatient)
	{
		final List<PathologyModel> pathologyModels = pathologyService.getPatologyForPatient(codePatient);
		return pathologyConverter.convertAll(pathologyModels);

	}

	/**
	 * @return the pathologyService
	 */
	public PathologyService getPathologyService()
	{
		return pathologyService;
	}

	/**
	 * @param pathologyService
	 *           the pathologyService to set
	 */
	@Required
	public void setPathologyService(final PathologyService pathologyService)
	{
		this.pathologyService = pathologyService;
	}

	/**
	 * @return the pathologyConverter
	 */
	public Converter<PathologyModel, PathologyData> getPathologyConverter()
	{
		return pathologyConverter;
	}

	/**
	 * @param pathologyConverter
	 *           the pathologyConverter to set
	 */
	@Required
	public void setPathologyConverter(final Converter<PathologyModel, PathologyData> pathologyConverter)
	{
		this.pathologyConverter = pathologyConverter;
	}



}
