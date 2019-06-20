package org.training.hospital.core.service.impl;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.PrescriptionDao;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.PrescriptionService;


public class DefaultPrescriptionService implements PrescriptionService {

	private PrescriptionDao prescriptionDao;
	
	
	
	@Override
	public PrescriptionModel getPrescriptionForCode(String code) {
		
		final PrescriptionModel rs=prescriptionDao.findPrescriptionByCode(code);
		if(rs !=null) {
			return rs;
		}
		return rs;
	}

	/**
	 * @return the prescriptionDao
	 */
	public PrescriptionDao getPrescriptionDao() {
		return prescriptionDao;
	}

	@Required
	public void setPrescriptionDao(PrescriptionDao prescriptionDao) {
		this.prescriptionDao = prescriptionDao;
	}
	
	
	

}
