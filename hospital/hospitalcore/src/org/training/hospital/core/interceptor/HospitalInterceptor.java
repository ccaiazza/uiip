/**
 *
 */
package org.training.hospital.core.interceptor;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import java.util.List;

import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.model.RepartoModel;


/**
 * @author soprasteria
 *
 */
public class HospitalInterceptor implements RemoveInterceptor<HospitalModel>
{





	@Override
	public void onRemove(final HospitalModel hospitalModel, final InterceptorContext ctx) throws InterceptorException
	{

		final List<RepartoModel> lista = hospitalModel.getReparti();
		for (final RepartoModel r : lista)
		{
			ctx.getModelService().remove(r);
		}

	}
}









