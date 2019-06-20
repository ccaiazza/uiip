package org.training.hospital.core.dao;

import org.training.hospital.core.model.PrescriptionModel;

public interface PrescriptionDao {

	public PrescriptionModel findPrescriptionByCode(String code);
}
