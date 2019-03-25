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

	public List<HeadModel> getHeadForReparto(String codeReparto);

	public List<HeadModel> getHeadForHospital(String code);

	public List<HeadModel> getHeadforHospitalName(String name);
}
