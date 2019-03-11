/**
 *
 */
package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.PathologyModel;


/**
 * @author soprasteria
 *
 */
public interface PathologyDao
{

	public List<PathologyModel> findPatologybyPatient(String patientCode);
}
