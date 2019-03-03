/**
 *
 */
package org.training.hospital.core.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.training.hospital.core.dao.HeadDao;
import org.training.hospital.core.model.HeadModel;

/**
 * @author soprasteria
 *
 */
public class DefaultHeadDao extends DefaultGenericDao<HeadModel> implements HeadDao
{


	private static final String Cardarelli = null;



	/**
	 * @param typecode
	 */
	public DefaultHeadDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<HeadModel> findHeadByHospital(final String code)
	{
		validateParameterNotNull(code, "Hospital code must not be null!");

		final String fsq = "SELECT{PK} FROM {Reparto AS R JOIN Head as H ON {H.codHead=R.head}} WHERE {R.hospital=?code\"}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("code", code));

		final SearchResult<HeadModel> result = (SearchResult<HeadModel>) getFlexibleSearchService().search(query);

		return result.getResult();

	}

	public List<HeadModel> findHeadByHospitalName()
	{
		final String hospitalName = "Cardarelli";


		final String fsq = "SELECT{PK} FROM {Head AS H JOIN REPARTO as R ON {H.codeHead=R.head} JOIN Hospital AS O ON{R.hospital=O.code} } WHERE {O.name=?hospitalName\"}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("name", hospitalName));

		final SearchResult<HeadModel> result = (SearchResult<HeadModel>) getFlexibleSearchService().search(query);

		return result.getResult();

	}






	public List<HeadModel> findHeadByReparto(final String codeReparto)
	{
		validateParameterNotNull(codeReparto, "Hospital code must not be null!");
		final Map parameters = new HashMap();
		final String fsq = "SELECT{PK} FROM {Reparto AS R JOIN HEAD AS H ON {H.codeHead=R.head}} WHERE {R.codeReparto=?codeReparto\"}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("codeReparto", codeReparto));

		final SearchResult<HeadModel> result = (SearchResult<HeadModel>) getFlexibleSearchService().search(query);


		return result.getResult();




	}
}
