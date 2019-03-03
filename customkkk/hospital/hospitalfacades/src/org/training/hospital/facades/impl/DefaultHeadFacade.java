/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.service.HeadService;
import org.training.hospital.facades.product.data.HeadData;
import org.traininghospital.facades.facades.HeadFacade;


/**
 * @author soprasteria
 *
 */
public class DefaultHeadFacade implements HeadFacade
{


	private HeadService headService;
	private Converter<HeadModel, HeadData> headConverter;

	/**
	 * @return the headService
	 */
	public HeadService getHeadService()
	{
		return headService;
	}


	/**
	 * @return the headConverter
	 */
	public Converter<HeadModel, HeadData> getHeadConverter()
	{
		return headConverter;
	}


	/**
	 * @param headConverter
	 *           the headConverter to set
	 */
	@Required
	public void setHeadConverter(final Converter<HeadModel, HeadData> headConverter)
	{
		this.headConverter = headConverter;
	}


	@Required
	public void setHeadService(final HeadService headService)
	{
		this.headService = headService;
	}



	@Override
	public List<HeadData> getHeadByHospital(final String code)
	{
		 final List<HeadModel> headModels = headService.getHeadByHospital(code);
		return headConverter.convertAll(headModels);


   }


	@Override
	public List<HeadData> getHeadByReparto(final String codeReparto)
	{
		final List<HeadModel> headModels = headService.getHeadByReparto(codeReparto);
		return headConverter.convertAll(headModels);


	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.traininghospital.facades.facades.HeadFacade#getHeadByHospitalName()
	 */
	@Override
	public List<HeadData> getHeadByHospitalName()
	{
		final List<HeadModel> headModels = headService.getHeadByHospitalName();
		return headConverter.convertAll(headModels);


	}








	}


