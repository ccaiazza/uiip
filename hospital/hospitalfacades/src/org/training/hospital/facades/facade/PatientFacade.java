/**
 *
 */
package org.training.hospital.facades.facade;

import java.util.Date;
import java.util.List;

import org.training.hospital.core.model.PatientModel;
import org.training.hospital.facades.product.data.PatientData;


/**
 * @author soprasteria
 *
 */
public interface PatientFacade
{
	public List<PatientData> getPatientForDateEntry(Date enty);
	public List<PatientData> getPatients();
	public PatientData getPatientForUid(String uid);
	public PatientData releasePatient(String code);

}
