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



public class HospitalRemoveInterceptor implements RemoveInterceptor<HospitalModel>
{

	@Override
	public void onRemove(final HospitalModel hospitalModel, final InterceptorContext ctx) throws InterceptorException
	{
		System.out.println("This hospitalModel will be removed from the database: " + hospitalModel.toString());

		final List<RepartoModel> lista = hospitalModel.getReparti();

		for (final RepartoModel r : lista)
		{
			ctx.getModelService().remove(r);
		}


	}


}
