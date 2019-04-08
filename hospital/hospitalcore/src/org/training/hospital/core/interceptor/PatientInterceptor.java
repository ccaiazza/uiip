package org.training.hospital.core.interceptor;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.training.hospital.core.model.PatientModel;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

public class PatientInterceptor implements PrepareInterceptor<PatientModel> {

	@Override
	public void onPrepare(PatientModel patientModel, InterceptorContext ctx) throws InterceptorException {
		final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"),Locale.ITALY);
		final Date today = calendar.getTime();
		if(patientModel!= null) {
			if(patientModel.getDateExit() == today){
				patientModel.setBed(null);
				
			} 




		}

	}
}
