/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.training.hospital.core.model.PatientModel;
import org.training.hospital.facades.product.data.PatientData;

/**
 * @author soprasteria
 *
 */
public class PatientPopulator implements Populator<PatientModel, PatientData>
{


	@Override
	public void populate(final PatientModel source, final PatientData target) throws ConversionException
	{
		target.setUid(source.getUid());
		target.setName(source.getName());
		target.setEntryDate(source.getEntryDate());
		target.setExitDate(source.getExitDate());




	}


}
