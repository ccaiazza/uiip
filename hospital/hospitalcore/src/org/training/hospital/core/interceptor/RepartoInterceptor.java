/**
 *
 */
package org.training.hospital.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.LoadInterceptor;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.model.RepartoModel;


/**
 * @author ssole
 *
 */
public class RepartoInterceptor implements LoadInterceptor<RepartoModel>
{

	private String nomeHead;
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.LoadInterceptor#onLoad(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onLoad(final RepartoModel repartoModel, final InterceptorContext ctx) throws InterceptorException
	{

		final HeadModel headmodel = repartoModel.getHead();

		if (headmodel != null)
		{
			if (headmodel.getName() == null)
			{

				repartoModel.getHead().setName(nomeHead);

			}
		}
	}

	/**
	 * @return the nomeHead
	 */
	public String getNomeHead()
	{
		return nomeHead;
	}

	/**
	 * @param nomeHead
	 *           the nomeHead to set
	 */
	@Required
	public void setNomeHead(final String nomeHead)
	{
		this.nomeHead = nomeHead;
	}


}


