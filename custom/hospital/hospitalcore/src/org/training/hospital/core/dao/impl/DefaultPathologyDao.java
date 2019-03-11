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

import org.training.hospital.core.dao.PathologyDao;
import org.training.hospital.core.model.PathologyModel;

/**
 * @author soprasteria
 *
 */
public class DefaultPathologyDao extends DefaultGenericDao<PathologyModel> implements PathologyDao
{


	public DefaultPathologyDao(final String typecode)
	{
		super(typecode);

	}


	@Override
	public List<PathologyModel> fingPathologybyName(final String name)
	{
		validateParameterNotNull(name, "Pathology Name must not be null!");
		final String fsq = "SELECT {PK} FROM {PATHOLOGY AS P} WHERE {P.name=?name}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("name", name));
		final SearchResult<PathologyModel> result = (SearchResult<PathologyModel>) getFlexibleSearchService().search(query);

		return result.getResult();
	}






}
