/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.HospitalModel;

//import org.training.hospital.core.model.HeadModel;
//import org.training.hospital.core.model.HospitalModel;
//import org.training.hospital.core.model.RepartoModel;




/**
 * @author soprasteria
 *
 */
public interface HospitalDao
{
	public List<HospitalModel> findHospital();
}
