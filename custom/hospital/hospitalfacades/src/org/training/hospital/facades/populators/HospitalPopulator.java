/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.facades.product.data.HospitalData;
import org.training.hospital.facades.product.data.RepartoData;


/**
 * @author soprasteria
 *
 */
public class HospitalPopulator implements Populator<HospitalModel, HospitalData>
{
	private Converter<RepartoModel, RepartoData> repartoConverter;


	@Override
	public void populate(final HospitalModel source, final HospitalData target) throws ConversionException
	{


		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setNumberRep(source.getNumberRep());

		target.setReparti(repartoConverter.convertAll(source.getReparti()));


	}


	public Converter<RepartoModel, RepartoData> getRepartoConverter()
	{
		return repartoConverter;
	}

	@Required
	public void setRepartoConverter(final Converter<RepartoModel, RepartoData> repartoConverter)
	{
		this.repartoConverter = repartoConverter;
	}






}