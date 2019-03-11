/**
 *
 */
package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.PatientModel;


/**
 * @author soprasteria
 *
 */
public interface PatientService
{

	List<PatientModel> getPatientForDateEntry(final String entry);
}
