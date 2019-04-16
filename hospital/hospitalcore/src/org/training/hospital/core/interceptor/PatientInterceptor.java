package org.training.hospital.core.interceptor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.service.BedService;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

public class PatientInterceptor implements PrepareInterceptor<PatientModel> {

	private BedService bedService;

	@Override
	public void onPrepare(PatientModel patientModel, InterceptorContext ctx) throws InterceptorException {


		final Date today = new Date();

		if(patientModel!= null) {
			if(patientModel.getDateExit() != null) {
				if(  (patientModel.getDateExit().before(today) || patientModel.getDateExit().equals(today))) {
					
					patientModel.setBed(null);
			
					}
				
				else {
					if(patientModel.getBed().getFree()) {
					bedService.occupyBed(patientModel.getBed().getCode());
				}
					else {
						patientModel.setBed(null);
					}
				}
				if(patientModel.getDateExit().before(patientModel.getDateEntry())) {
					patientModel.setDateExit(null);
				}
			}
			else {
				
				if(patientModel.getBed().getFree()) {
					bedService.occupyBed(patientModel.getBed().getCode());
				}
					else {
						patientModel.setBed(null);
					}
			}

			
		}
	}
	public BedService getBedService() {
		return bedService;
	}
	@Required
	public void setBedService(BedService bedService) {
		this.bedService = bedService;
	}

}
