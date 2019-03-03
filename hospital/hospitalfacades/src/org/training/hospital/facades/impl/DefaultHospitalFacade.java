/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.service.HospitalService;
import org.training.hospital.facades.facade.HospitalFacade;
import org.training.hospital.facades.product.data.HospitalData;

/**
 * @author soprasteria
 *
 */
public class DefaultHospitalFacade implements HospitalFacade
{

	private HospitalService hospitalService;
	private Converter<HospitalModel, HospitalData> hospitalConverter;


	/**
	 * @return the hospitalService
	 */
	@Override
	public List<HospitalData> getHospitalInfo()
	{
		final List<HospitalModel> hospitalModelsInfo = hospitalService.getHospitalInfo();


		return hospitalConverter.convertAll(hospitalModelsInfo);
	}

	/**
	 * @param hospitalService
	 *           the hospitalService to set
	 */
	@Override
	public List<HospitalData> getHospitals()
	{
		final List<HospitalModel> hospitalModels = hospitalService.getHospitals();

		return hospitalConverter.convertAll(hospitalModels);
	}

	@Required
	public void setHospitalService(final HospitalService hospitalService)
	{
		this.hospitalService = hospitalService;
	}

	/**
	 * @return the hospitalConverter
	 */
	public Converter<HospitalModel, HospitalData> getHospitalConverter()
	{
		return hospitalConverter;
	}

	/**
	 * @param hospitalConverter
	 *           the hospitalConverter to set
	 */
	@Required
	public void setHospitalConverter(final Converter<HospitalModel, HospitalData> hospitalConverter)
	{
		this.hospitalConverter = hospitalConverter;
	}

	/**
	 * @return the hospitalService
	 */
	public HospitalService getHospitalService()
	{
		return hospitalService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.facades.facade.HospitalFacade#getHeadbyReparto()
	 */



}
