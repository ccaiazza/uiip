/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.model.PathologyModel;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.facades.product.data.BedData;
import org.training.hospital.facades.product.data.PathologyData;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.RepartoData;


/**
 * @author soprasteria
 *
 */
public class PatientPopulator implements Populator<PatientModel, PatientData>
{
	
	private Converter<PathologyModel, PathologyData> pathologyConverter;
	private Converter<BedModel, BedData> bedConverter;
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
		target.setBed(bedConverter.convert(source.getBed()));
		

	}

	

	/**
	 * @return the bedConverter
	 */
	public Converter<BedModel, BedData> getBedConverter() {
		return bedConverter;
	}


	@Required
	public void setBedConverter(Converter<BedModel, BedData> bedConverter) {
		this.bedConverter = bedConverter;
	}



	public Converter<PathologyModel, PathologyData> getPathologyConverter()
	{
		return pathologyConverter;
	}

	
	@Required
	public void setPathologyConverter(final Converter<PathologyModel, PathologyData> pathologyConverter)
	{
		this.pathologyConverter = pathologyConverter;
	}

	
	



}
