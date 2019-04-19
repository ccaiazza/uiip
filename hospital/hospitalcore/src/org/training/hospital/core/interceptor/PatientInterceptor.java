package org.training.hospital.core.interceptor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.model.PatientModel;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.model.ModelService;

public class PatientInterceptor implements PrepareInterceptor<PatientModel> {

	
	private ModelService modelService;
	

	@Override
	public void onPrepare(PatientModel patientModel, InterceptorContext ctx) throws InterceptorException {


		final Date today = new Date();

		if(patientModel!= null) {
			if(patientModel.getDateExit() != null) {
				if(patientModel.getDateExit().before(today) || patientModel.getDateExit().equals(today)) {
					BedModel bed = patientModel.getBed();
					bed.setIsFree(true);
					modelService.save(bed);
					patientModel.setBed(null);
					}
				}
		}
		
	}	
	
	
	public ModelService getModelService() {
		return modelService;
	}

	/**
	 * @param modelService the modelService to set
	 */
	@Required
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}
	
	

}
