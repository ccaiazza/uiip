/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;


/**
 * @author ssole
 *
 */
public interface DoctorDao
{
	public List<DoctorDao> findDoctorbyName(String name);

}
