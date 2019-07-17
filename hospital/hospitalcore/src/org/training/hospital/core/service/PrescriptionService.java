package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.PrescriptionModel;

public interface PrescriptionService {

	public PrescriptionModel getPrescriptionForCode(String code);
	public List<PrescriptionModel> getPrescriptionForPatient(String code);
}
