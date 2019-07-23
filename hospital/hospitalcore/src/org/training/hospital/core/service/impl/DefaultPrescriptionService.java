package org.training.hospital.core.service.impl;

import java.util.List;

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
		else {
			return null;
		}
	}

	@Override
	public List<PrescriptionModel> getPrescriptionsForPatientCode(String code) {
		final List<PrescriptionModel> rs=  prescriptionDao.findPrescriptionsByPatientCode(code);
		return rs;
	}


	
	public PrescriptionDao getPrescriptionDao() {
		return prescriptionDao;
	}

	@Required
	public void setPrescriptionDao(PrescriptionDao prescriptionDao) {
		this.prescriptionDao = prescriptionDao;
	}

	


}
