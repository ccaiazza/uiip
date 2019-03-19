/**
 *
 */
package org.traininghospital.facades.facades;

import java.util.List;

import org.training.hospital.facades.product.data.HeadData;


/**
 * @author soprasteria
 *
 */
public interface HeadFacade
{
	public List<HeadData> getHeadForHospital(String code);

	public List<HeadData> getHeadForReparto(String codeRep);

	public List<HeadData> getHeadForHospitalName(String name);
}
