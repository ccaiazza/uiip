/**
 *
 */
package org.training.hospital.core.dao;


import java.util.List;

import org.training.hospital.core.model.PatientModel;


/**
 * @author soprasteria
 *
 */
public interface PatientDao
{
	public List<PatientModel> findPatientbyDateEntry(String entry);



}
