package org.training.hospital.core.service.impl;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.MedicalProductDao;
import org.training.hospital.core.model.MedicalProductModel;
import org.training.hospital.core.service.MedicalProductService;

public class DefaultMedicalProductService implements MedicalProductService {

	private MedicalProductDao medicalProductDao;

	@Override
	public MedicalProductModel getMedicalProductForCode(String code) {
	
		final MedicalProductModel medicalmodel = medicalProductDao.findMedicalProductByCode(code);
		if(medicalmodel !=null) {
			return medicalmodel;
		}
		
		return null;
	}

	/**
	 * @return the medicalProductDao
	 */
	public MedicalProductDao getMedicalProductDao() {
		return medicalProductDao;
	}

    @Required
	public void setMedicalProductDao(MedicalProductDao medicalProductDao) {
		this.medicalProductDao = medicalProductDao;
	}
	
	

}
