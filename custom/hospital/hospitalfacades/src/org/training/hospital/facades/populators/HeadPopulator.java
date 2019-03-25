/**
 *
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.training.hospital.core.model.HeadModel;
import org.training.hospital.facades.product.data.HeadData;

/**
 * @author soprasteria
 *
 */
public class HeadPopulator implements Populator <HeadModel, HeadData>
{

	@Override
	public void populate(final HeadModel source, final HeadData target) throws ConversionException
	{
		target.setUid(source.getUid());
		target.setName(source.getName());


	}

}
