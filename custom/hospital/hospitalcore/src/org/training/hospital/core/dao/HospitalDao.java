/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.HospitalModel;


/**
 * @author soprasteria
 *
 */
public interface HospitalDao
{
	public List<HospitalModel> findHospital();

	public List<HospitalModel> findHospitalByCode(String code);
}
