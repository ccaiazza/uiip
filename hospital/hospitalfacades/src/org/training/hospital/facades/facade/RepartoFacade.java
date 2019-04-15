/**
 *
 */
package org.training.hospital.facades.facade;

import java.util.List;

import org.training.hospital.facades.product.data.RepartoData;


/**
 * @author soprasteria
 *
 */
public interface RepartoFacade
{

	public List<RepartoData> getRepartoForCode(String code);

}
