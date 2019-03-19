/**
 *
 */
package org.traininghospital.facades.facades;

import java.util.List;

import org.training.hospital.facades.product.data.RepartoData;
/**
 * @author soprasteria
 *
 */
public interface RepartoFacade
{

	public List<RepartoData> getRepartoForHospital(String code);
}
