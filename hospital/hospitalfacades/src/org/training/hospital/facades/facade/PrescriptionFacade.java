package org.training.hospital.facades.facade;

import java.util.List;

import org.training.hospital.facades.product.data.PrescriptionData;

public interface PrescriptionFacade {
	
	public List<PrescriptionData> getPrescriptionsForPatientCode();

}
