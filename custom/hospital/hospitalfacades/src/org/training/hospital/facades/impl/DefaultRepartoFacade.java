/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.core.service.RepartoService;
import org.training.hospital.facades.product.data.RepartoData;
import org.traininghospital.facades.facades.RepartoFacade;

/**
 * @author soprasteria
 *
 */
public class DefaultRepartoFacade implements RepartoFacade
{

	private RepartoService repartoService;
	private Converter<RepartoModel, RepartoData> repartoConverter;


	@Override
	public List<RepartoData> getRepartoByHospital(final String code)
	{
		final List<RepartoModel> repartoModels = repartoService.getRepartiByHospital(code);

		return repartoConverter.convertAll(repartoModels);
	}


	/**
	 * @return the repartoService
	 */
	public RepartoService getRepartoService()
	{
		return repartoService;
	}


	/**
	 * @param repartoService
	 *           the repartoService to set
	 */
	@Required
	public void setRepartoService(final RepartoService repartoService)
	{
		this.repartoService = repartoService;
	}


	/**
	 * @return the repartoConverter
	 */
	public Converter<RepartoModel, RepartoData> getRepartoConverter()
	{
		return repartoConverter;
	}


	/**
	 * @param repartoConverter
	 *           the repartoConverter to set
	 */
	@Required
	public void setRepartoConverter(final Converter<RepartoModel, RepartoData> repartoConverter)
	{
		this.repartoConverter = repartoConverter;
	}

}
