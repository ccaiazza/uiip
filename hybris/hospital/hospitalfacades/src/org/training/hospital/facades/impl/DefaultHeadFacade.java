/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.service.HeadService;
import org.training.hospital.facades.facade.HeadFacade;
import org.training.hospital.facades.product.data.HeadData;

/**
 * @author soprasteria
 *
 */
public class DefaultHeadFacade implements HeadFacade
{
	private HeadService headService;
	private Converter<HeadModel, HeadData> headConverter;
	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.facades.facade.HeadFacade#getHead(java.lang.String)
	 */
	@Override
	public List<HeadData> getHeadbyReparto(final String code)
	{
		final List<HeadModel> headModels = headService.getHeadForReparto(code);


		return headConverter.convertAll(headModels);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.facades.facade.HeadFacade#getHeadbyHospital(java.lang.String)
	 */
	@Override
	public List<HeadData> getHeadbyHospital(final String code)
	{
		final List<HeadModel> headModels = headService.getHeadForHospital(code);

		return headConverter.convertAll(headModels);
	}

	/**
	 * @return the headService
	 */
	public HeadService getHeadService()
	{
		return headService;
	}

	/**
	 * @param headService
	 *           the headService to set
	 */
	@Required
	public void setHeadService(final HeadService headService)
	{
		this.headService = headService;
	}

	/**
	 * @return the repartoConverter
	 */
	public Converter<HeadModel, HeadData> getHeadConverter()
	{
		return headConverter;
	}

	/**
	 * @param repartoConverter
	 *           the repartoConverter to set
	 */
	@Required
	public void setHeadConverter(final Converter<HeadModel, HeadData> headConverter)
	{
		this.headConverter = headConverter;
	}



}
