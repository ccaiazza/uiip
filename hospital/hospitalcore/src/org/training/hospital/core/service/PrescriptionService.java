package org.training.hospital.core.service;

import org.training.hospital.core.model.PrescriptionModel;

public interface PrescriptionService {

	public PrescriptionModel getPrescriptionForCode(String code);
}
