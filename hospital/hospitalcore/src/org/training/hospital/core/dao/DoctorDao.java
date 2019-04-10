/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.DoctorModel;


/**
 * @author ssole
 *
 */
public interface DoctorDao
{
	public List<DoctorModel> findDoctorByName(String name);

}
