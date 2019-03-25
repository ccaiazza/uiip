/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.RepartoModel;


/**
 * @author soprasteria
 *
 */
public interface RepartoDao
{
	public List<RepartoModel> findRepartoByHospital(String code);

	public List<RepartoModel> findDepartments();
}
