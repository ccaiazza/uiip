/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collections;
import java.util.List;

import org.training.hospital.core.dao.PathologyDao;
import org.training.hospital.core.model.PathologyModel;

/**
 * @author soprasteria
 *
 */
public class DefaulPathologyDao extends DefaultGenericDao implements PathologyDao
{

	/**
	 * @param typecode
	 */
	public DefaulPathologyDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.PathologyDao#findPatologybyPatient(org.training.hospital.core.model.PatientModel)
	 */
	@Override
	public List<PathologyModel> findPatologybyPatient(final String patientCode)
	{
		final String query = "SELECT" + PathologyModel.PK + "FROM {" + PathologyModel._TYPECODE + "} WHERE{ "
				+ PathologyModel.PATIENTS + "}" + "=?patient";
		final FlexibleSearchQuery resultQuery = new FlexibleSearchQuery(query, Collections.singletonMap("patient", patientCode));
		final SearchResult<PathologyModel> result = (SearchResult<PathologyModel>) getFlexibleSearchService().search(resultQuery);
		return result.getResult();
	}

}
