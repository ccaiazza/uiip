/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collections;
import java.util.List;

import org.training.hospital.core.dao.HeadDao;
import org.training.hospital.core.model.HeadModel;

/**
 * @author soprasteria
 *
 */
public class DefaultHeadDao extends DefaultGenericDao implements HeadDao
{

	/**
	 * @param typecode
	 */
	public DefaultHeadDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<HeadModel> findHeadByReparto(final String codeReparto)
	{


		// Build a query for the flexible search.
		final String queryString = "SELECT {" + HeadModel.PK + "} " + "FROM {" + HeadModel._TYPECODE
				+ " AS H JOIN Reaparto AS R ON{H.uid= R.head}} " + "WHERE {R.codeReparto =?codeReparto}";




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString, Collections.singletonMap("code", codeReparto));
		final SearchResult<HeadModel> result = (SearchResult<HeadModel>) getFlexibleSearchService().search(query);


		return result.getResult();
	}

	@Override
	public List<HeadModel> findHeadByHospital(final String codeHospital)
	{
		// Build a query for the flexible search.
		final String queryString = "SELECT {" + HeadModel.PK + "} " + "FROM {" + HeadModel._TYPECODE
				+ " AS P JOIN Reparto AS R ON{P.uid= R.head}} " + "WHERE {R.hospital =?codeHospital}";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString, Collections.singletonMap("code", codeHospital));
		final SearchResult<HeadModel> result = (SearchResult<HeadModel>) getFlexibleSearchService().search(query);


		return result.getResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.training.hospital.core.dao.HeadDao#findHeadByHospitalName(java.lang.String)
	 */
	@Override
	public List<HeadModel> findHeadByHospitalName(final String name)
	{

		final String queryString = "SELECT {" + HeadModel.PK + "} " + "FROM {" + HeadModel._TYPECODE
				+ " AS H JOIN Reaparto AS R ON{H.uid= R.head} " + " JOIN Hospital AS O ON{R.hospital =O.code }}"
				+ "WHERE {R.name=? name}";




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString, Collections.singletonMap("name", name));//prendere parametri
		final SearchResult<HeadModel> result = (SearchResult<HeadModel>) getFlexibleSearchService().search(query);


		return result.getResult();
	}




}
