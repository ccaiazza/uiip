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
public class DynamicAttributesNumberPathology implements DynamicAttributeHandler<String, PatientModel>
{


	@Override
	public String get(final PatientModel item)
	{
		if (item == null)
		{
			throw new IllegalArgumentException("Item model is required");
		}
		if (item.getPathologies() != null)
		{
		return item.getPathologies().size() + " ";
	}
		else
		{
			return 0 + " ";
		}
	}

	@Override
	public void set(final PatientModel arg0, final String arg1)
	{



	}



}
