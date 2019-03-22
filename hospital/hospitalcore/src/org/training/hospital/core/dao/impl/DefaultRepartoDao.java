/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.training.hospital.core.dao.RepartoDao;
import org.training.hospital.core.model.HospitalModel;
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
	public List<RepartoModel> findRepartiByHospital(final String code)
	{
		// Build a query for the flexible search.
		final String queryString = "SELECT { " + RepartoModel.PK + " } " + "FROM {" + RepartoModel._TYPECODE + " AS R JOIN "
				+ HospitalModel._TYPECODE + " AS H ON {R.hospital } = {H.pk} } " + "WHERE {H.code} =?code";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final SearchResult<RepartoModel> result = getFlexibleSearchService().search(query);




		return result.getResult();
	}

	/**
	 * @return the flexibleSearchService
	 */




	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.RepartoDao#findHeadByHospital(java.lang.String)
	 */



}
