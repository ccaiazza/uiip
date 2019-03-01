/**
 * 
 */
package org.training.hospital.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.facades.product.data.HeadData;
import org.training.hospital.facades.product.data.RepartoData;

/**
 * @author soprasteria
 *
 */
public class HeadPopulator implements Populator <HeadModel, HeadData>
{

	@Override
	public void populate(HeadModel source, HeadData target) throws ConversionException
	{
		source.setCodeHead(target.getCodeHead());
		source.setName(target.getName());
		
		
	}

}
