/**
 *
 */
package org.training.hospital.facades.facade;

import java.util.List;

import org.training.hospital.facades.product.data.PatientData;


/**
 * @author soprasteria
 *
 */
public interface PatientFacade
{
	public List<PatientData> getPatientbyDateEntry(String enty);

}
