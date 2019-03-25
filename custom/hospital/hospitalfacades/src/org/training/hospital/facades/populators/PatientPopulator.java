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


	@Override
	public void populate(final PatientModel source, final PatientData target) throws ConversionException
	{
		target.setUid(source.getUid());
		target.setName(source.getName());
		target.setEntryDate(source.getEntryDate());
		target.setExitDate(source.getExitDate());
		//target.setDepartments(repartoConverter.convertAll(source.getDepartments()));
		target.setPathologies(pathologyConverter.convertAll(source.getPathologies()));
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
