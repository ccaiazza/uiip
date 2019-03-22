/**
 *
 */
package org.training.hospital.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
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
	public List<HospitalData> getHospitalInfo(final String code)
	{
		//final List<HospitalModel> hospitalModelsInfo = hospitalService.getHospitalInfoforCode(code);

		final List<HospitalModel> hospitalModels = hospitalService.getHospitals();
		return hospitalConverter.convertAll(hospitalModels);







	}

	/**
	 * @param hospitalService
	 *           the hospitalService to set
	 */
	@Override
	public List<HospitalData> getHospitals()
	{
		final List<HospitalModel> hospitalModels = hospitalService.getHospitals();
		final List<HospitalData> hospitalData = new ArrayList<HospitalData>();
		for (final HospitalModel hm : hospitalModels)
		{
			final HospitalData sfd = new HospitalData();
			sfd.setName(hm.getName());
			sfd.setCitta(hm.getCitta());
			sfd.setCode(hm.getCode());
			hospitalData.add(sfd);
		}
		return hospitalData;
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
