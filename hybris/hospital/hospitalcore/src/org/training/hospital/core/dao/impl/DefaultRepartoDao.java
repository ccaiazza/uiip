/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collections;
import java.util.List;

import org.training.hospital.core.dao.RepartoDao;
import org.training.hospital.core.model.RepartoModel;

/**
 * @author soprasteria
 *
 */
public class DefaultRepartoDao extends DefaultGenericDao implements RepartoDao
{



	/**
	 * @param typecode
	 */
	public DefaultRepartoDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<RepartoModel> findRepartiByHospital(final String codeHospital)
	{



		/**
		 * Finds all Stadiums by performing a FlexibleSearch using the {@link FlexibleSearchService}.
		 */

		// Build a query for the flexible search.
		final String queryString = "SELECT {" + RepartoModel.PK + "} " + "FROM {" + RepartoModel._TYPECODE
				+ " AS R JOIN Hospital AS H ON{R.codeReparto= H.code}} " + "WHERE {H.code = codeHospital}";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString, Collections.singletonMap("code", codeHospital));
		final SearchResult<RepartoModel> result = (SearchResult<RepartoModel>) getFlexibleSearchService().search(query);


		return result.getResult();
	}

	/**
	 * @return the flexibleSearchService
	 */




	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.RepartoDao#findHeadByHospital(java.lang.String)
	 */



}
