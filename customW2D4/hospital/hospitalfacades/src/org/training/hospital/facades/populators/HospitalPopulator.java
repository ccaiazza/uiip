/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.facades.product.data.HospitalData;


/**
 * @author soprasteria
 *
 */
public class HospitalPopulator implements Populator<HospitalModel, HospitalData>
{

	@Override
	public void populate(final HospitalModel source, final HospitalData target) throws ConversionException
	{


		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setNumberRep(source.getNumberRep());






	}
}