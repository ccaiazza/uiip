/**
 *
 */
package org.training.hospital.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.apache.commons.lang3.StringUtils;
import org.training.hospital.core.model.HeadModel;

/**
 * @author ctammaro
 *
 */
public class HeadValidateInterceptor implements ValidateInterceptor <Object>
{


	@Override
	public void onValidate(final Object o, final InterceptorContext ctx) throws InterceptorException
	{

		if (o instanceof HeadModel) {
			final HeadModel hm = (HeadModel) o;
			if (StringUtils.isEmpty(hm.getName()))
			{

				throw new InterceptorException("Head cannot have empty name");
			}
		}

	}



}
