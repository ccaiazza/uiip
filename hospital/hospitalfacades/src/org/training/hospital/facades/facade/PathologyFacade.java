/**
 *
 */
package org.training.hospital.facades.facade;

import java.util.List;

import org.training.hospital.facades.product.data.PathologyData;


/**
 * @author soprasteria
 *
 */
public interface PathologyFacade
{

	public List<PathologyData> getPatologyForPatient(final String patient);
}
