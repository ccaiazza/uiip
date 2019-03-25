/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PathologyModel;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.facades.product.data.PathologyData;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.RepartoData;


/**
 * @author soprasteria
 *
 */
public class PatientPopulator implements Populator<PatientModel, PatientData>
{
	private Converter<RepartoModel, RepartoData> repartoConverter;
	private Converter<PathologyModel, PathologyData> pathologyConverter;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final PatientModel source, final PatientData target) throws ConversionException
	{

		target.setDateEntry(source.getDateEntry());
		target.setDateExit(source.getDateExit());
		target.setNumberPathologies(source.getNumberPathologies());
		target.setUid(source.getUid());
		target.setName(source.getName());
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
