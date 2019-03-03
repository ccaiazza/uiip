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
	public List<HeadData> getHeadByHospital(String code);

	public List<HeadData> getHeadByReparto(String codeRep);

	public List<HeadData> getHeadByHospitalName();
}
