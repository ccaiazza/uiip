package org.training.hospital.core.service;

import org.training.hospital.core.model.MedicalProductModel;

public interface MedicalProductService {
	public MedicalProductModel getMedicalProductForCode(String code);

}
