/**
 *
 */
package org.training.hospital.core.dao;


import java.util.Date;
import java.util.List;

import org.training.hospital.core.model.PatientModel;


/**
 * @author soprasteria
 *
 */
public interface PatientDao
{
	public List<PatientModel> findPatientByDateEntry(Date entry);

	public List<PatientModel> findPatients();
	
	public PatientModel findPatientByUid(String uid); 


}
