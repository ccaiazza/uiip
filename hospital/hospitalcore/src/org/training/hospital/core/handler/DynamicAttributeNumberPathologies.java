/**
 *
 */
package org.training.hospital.core.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import org.training.hospital.core.model.PatientModel;


/**
 * @author soprasteria
 *
 */
public class DynamicAttributeNumberPathologies implements DynamicAttributeHandler<String, PatientModel>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#get(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel)
	 */
	@Override
	public String get(final PatientModel item)
	{
		if (item == null)
		{
			throw new IllegalArgumentException("Patient model is required");
		}

		else
		{
			if (item.getPathologies() == null)
			{
				return 0 + " ";
			}
			else
			{
				return item.getPathologies().size() + " ";
			}
		}
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler#set(de.hybris.platform.servicelayer.model.
	 * AbstractItemModel, java.lang.Object)
	 */
	@Override
	public void set(final PatientModel arg0, final String arg1)
	{
		// XXX Auto-generated method stub

	}

}
