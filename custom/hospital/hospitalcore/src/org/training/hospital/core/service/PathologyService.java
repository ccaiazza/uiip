/**
 *
 */
package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.PathologyModel;


/**
 * @author soprasteria
 *
 */
public interface PathologyService
{
	public List<PathologyModel> getPathologyByName(String name);
}
