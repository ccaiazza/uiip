/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.service.HospitalService;
import org.training.hospital.facades.product.data.HospitalData;
import org.traininghospital.facades.facades.HospitalFacade;

/**
 * @author soprasteria
 *
 */
public class DefaultHospitalFacade implements HospitalFacade

{
	private HospitalService hospitalService;
	private Converter<HospitalModel, HospitalData> hospitalConverter;


	/*
	 * (non-Javadoc)
	 *
	 * @see org.traininghospital.facades.facades.HospitalFacade#getHospital()
	 *
	 * @Override public List<HospitalData> getHospital() { // XXX Auto-generated method stub return null; }
	 *
	 * /**
	 *
	 * @return the hospitalService
	 */
	public HospitalService getHospitalService()
	{
		return hospitalService;
	}

	@Required
	public void setHospitalService(final HospitalService hospitalService)
	{
		this.hospitalService = hospitalService;
	}


	@Override
	public List<HospitalData> getHospital()
	{

		final List<HospitalModel> hospitalModels = hospitalService.getHospital();
		return hospitalConverter.convertAll(hospitalModels);

	}

	/**
	 * @return the hospitalConverter
	 */
	public Converter<HospitalModel, HospitalData> getHospitalConverter()
	{
		return hospitalConverter;
	}

	@Required
	public void setHospitalConverter(final Converter<HospitalModel, HospitalData> hospitalConverter)
	{
		this.hospitalConverter = hospitalConverter;
	}

	/**
	 * @return the hospitalConverter
	 */



}
