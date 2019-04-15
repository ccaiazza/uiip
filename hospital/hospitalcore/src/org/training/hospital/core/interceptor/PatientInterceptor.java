package org.training.hospital.core.interceptor;

import java.util.Date;
import java.text.SimpleDateFormat;
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


		final Date today = new Date();

		if(patientModel!= null && patientModel.getDateExit() != null) {
			if(  (patientModel.getDateExit().before(today) || patientModel.getDateExit().equals(today))) {
				patientModel.setBed(null);
			} 
		}
		
		if(patientModel.getDateExit().before(patientModel.getDateEntry())) {
			
		}
		
		
		
	}
}
