package org.training.hospital.core.dao;

import org.training.hospital.core.model.MedicalProductModel;

public interface MedicalProductDao {

	public MedicalProductModel findMedicalProductByCode(String code);
}
