/**
 *
 */
package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.HeadModel;


/**
 * @author soprasteria
 *
 */
public interface HeadService
{
	public List<HeadModel> getHeadByHospital(String code);

	public List<HeadModel> getHeadByReparto(String codeReparto);
	
	public List <HeadModel> getHeadByHospitalName();
}
