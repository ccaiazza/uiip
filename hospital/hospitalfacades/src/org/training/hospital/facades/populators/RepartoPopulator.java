/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.facades.product.data.HeadData;
import org.training.hospital.facades.product.data.HospitalData;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.RepartoData;


/**
 * @author soprasteria
 *
 */
public class RepartoPopulator implements Populator<RepartoModel, RepartoData>
{

	private Converter<PatientModel, PatientData> patientConverter;
	private Converter<HeadModel, HeadData> headConverter;
	private Converter<HospitalModel, HospitalData> hospitalConverter;

	@Override
	public void populate(final RepartoModel source, final RepartoData target) throws ConversionException
	{
		if (source == null)
		{
			throw new IllegalArgumentException("Model is empty");
		}
		else
		{

				target.setCode((source.getCode()));
				target.setName(source.getName());
			}


			//target.setHead(headConverter.convert(source.getHead()));
			//target.setHospital(hospitalConverter.convert(source.getHospital()));
			//target.setPatients(patientConverter.convertAll(source.getPatients()));
		}



	/**
	 * @return the patientConverter
	 */
	public Converter<PatientModel, PatientData> getPatientConverter()
	{
		return patientConverter;
	}

	/**
	 * @param patientConverter
	 *           the patientConverter to set
	 */
	@Required
	public void setPatientConverter(final Converter<PatientModel, PatientData> patientConverter)
	{
		this.patientConverter = patientConverter;
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


}
