/**
 *
 */
package org.training.hospital.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.training.hospital.core.model.HeadModel;

import reactor.util.StringUtils;


/**
 * @author ssole
 *
 */
public class HeadInterceptor implements ValidateInterceptor
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.ValidateInterceptor#onValidate(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onValidate(final Object o, final InterceptorContext ctx) throws InterceptorException
	{
		if (o instanceof HeadModel)
		{
			final HeadModel headModel = (HeadModel) o;

			if (StringUtils.isEmpty(headModel.getName()) && StringUtils.isEmpty(headModel.getUid()))
			{

				throw new InterceptorException("Head cannot have empty name and uid");
			}

		}
	}

}
