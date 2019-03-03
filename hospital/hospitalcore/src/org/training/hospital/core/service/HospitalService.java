/**
 *
 */
package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.HospitalModel;


/**
 * @author soprasteria
 *
 */
public interface HospitalService
{

	public List<HospitalModel> getHospitalInfo();

	public List<HospitalModel> getHospitals();

}
