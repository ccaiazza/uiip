/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.facades.product.data.RepartoData;


/**
 * @author soprasteria
 *
 */
public class RepartoPopulator implements Populator<RepartoModel, RepartoData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final RepartoModel source, final RepartoData target) throws ConversionException
	{

		target.setNameRep(source.getNameRep());
		target.setCodeReparto(source.getCodeReparto());


	}

}
