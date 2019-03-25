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
		final List<HospitalData> hospitalFacadeData = new ArrayList<HospitalData>();
		for (final HospitalModel hm : hospitalModels)
		{
			final HospitalData hd = new HospitalData();
			hd.setCode(hm.getCode());
			hd.setName(hm.getName());
			hd.setCitta(hm.getCitta());
			hospitalFacadeData.add(hd);
		}
		return hospitalFacadeData;

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


	@Override
	public HospitalData getHospitalForCode(final String code)
	{
		HospitalModel hospital = null;
		if (code != null)
		{
			hospital = hospitalService.getHospitalForCode(code);
			if (hospital == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Hospital with code " + code + " not found.");
		}


		final HospitalData hospitalData = new HospitalData();
		hospitalData.setCode(hospital.getCode());
		hospitalData.setName(hospital.getName());
		hospitalData.setCitta(hospital.getCitta());
		hospitalData.setNumberRep(hospital.getNumberRep());
		return hospitalData;
	}







}
