/**
 *
 */
package org.training.hospital.facades.facade;

import java.util.List;

import org.training.hospital.facades.product.data.HeadData;

/**
 * @author soprasteria
 *
 */
public interface HeadFacade
{
	public List<HeadData> getHeadbyHospital(String code);

	public List<HeadData> getHeadbyReparto(String code);

}
