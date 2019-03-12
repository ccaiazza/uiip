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
import org.training.hospital.facades.product.data.PathologyData;
import org.training.hospital.facades.product.data.PatientData;

/**
 * @author ctammaro
 *
 */
public class PathologyPopulator implements Populator<PathologyModel, PathologyData>
{

	private Converter<PatientModel, PatientData> patientConverter;

	@Override
	public void populate(final PathologyModel source, final PathologyData target) throws ConversionException
	{

		target.setName(source.getName());
		target.setPatients(patientConverter.convertAll(source.getPatients()));

	}


	public Converter<PatientModel, PatientData> getPatientConverter()
	{
		return patientConverter;
	}


	@Required
	public void setPatientConverter(final Converter<PatientModel, PatientData> patientConverter)
	{
		this.patientConverter = patientConverter;
	}




}
