package org.training.hospital.core.handler;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.training.hospital.core.model.HospitalModel;


/**
 *
 */

/**
 * @author soprasteria
 *
 */
public class DynamicAttributeNumberDepartment implements DynamicAttributeHandler<String, HospitalModel>
{


	public String get(final HospitalModel item)
	{

		if (item == null)
		{
			throw new IllegalArgumentException("Item model is required");
		}
		return item.getReparti().size() + " ";
	}


	@Override
	public void set(final HospitalModel arg0, final String arg1)
	{


	}


}
