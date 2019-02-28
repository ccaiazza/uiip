/**
 *
 */
package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.RepartoModel;


/**
 * @author soprasteria
 *
 */
public interface RepartoService
{

	public List<RepartoModel> getRepartiforHospital(String code);
}
