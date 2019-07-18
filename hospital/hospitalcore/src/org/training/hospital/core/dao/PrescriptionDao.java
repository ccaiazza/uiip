package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.PrescriptionModel;

public interface PrescriptionDao {

	public PrescriptionModel findPrescriptionByCode(String code);
	public List<PrescriptionModel> findPrescriptionsByPatientCode(String code);
}
