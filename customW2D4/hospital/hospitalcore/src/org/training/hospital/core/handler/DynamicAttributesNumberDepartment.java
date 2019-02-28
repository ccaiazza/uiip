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
public class DynamicAttributesNumberDepartment implements DynamicAttributeHandler<String, HospitalModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#get(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel)
	 */



	@Override
	public String get(final HospitalModel item)
	{


		if (item == null)
		{
			throw new IllegalArgumentException("Item model is required");
		}
		return item.getReparti().size() + " ";

	}



	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#set(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel, java.lang.Object)
	 */
	@Override
	public void set(final HospitalModel arg0, final String arg1)
	{
		// XXX Auto-generated method stub

	}

}
