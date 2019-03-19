/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.HeadModel;


/**
 * @author soprasteria
 *
 */
public interface HeadDao
{

	public List<HeadModel> findHeadByHospital(String code);

	public List<HeadModel> findHeadByHospitalName(String name);

	public List<HeadModel> findHeadByReparto(String code);
}
