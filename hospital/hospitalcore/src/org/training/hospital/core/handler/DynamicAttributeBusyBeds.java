/**
 *
 */
package org.training.hospital.core.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.training.hospital.core.model.RepartoModel;

/**
 * @author ctammaro
 *
 */
public class DynamicAttributeBusyBeds implements DynamicAttributeHandler<Integer, RepartoModel>
{


	@Override
	public Integer get(final RepartoModel item)
	{

		if (item == null)
		{
			throw new IllegalArgumentException("RepartoModel model is required");
		}

		else
		{
			if (item.getPatients() == null)
			{
				return 0;
			}
			else
			{
				return item.getPatients().size();
			}
		}
	}


	@Override
	public void set(final RepartoModel arg0, final Integer arg1)
	{

	}

}
