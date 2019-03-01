/**
 *
 */
package org.training.hospital.core.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

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
public class DefaultRepartoDao extends DefaultGenericDao<RepartoModel> implements RepartoDao

{

	/**
	 * @param typecode
	 */
	public DefaultRepartoDao(final String typecode)
	{
		super(typecode);
	}

	@Override
	public List<RepartoModel> findRepartiByHospital(final String code)
	{

		validateParameterNotNull(code, "Hospital code must not be null!");

		final String fsq = "SELECT{PK} FROM {REPARTO as R} WHERE {R.hospital=?code}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("code", code));

		final SearchResult<RepartoModel> result = (SearchResult<RepartoModel>) getFlexibleSearchService().search(query);


		return result.getResult();


	}



}
