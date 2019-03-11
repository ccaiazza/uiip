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

import org.training.hospital.core.dao.PatientDao;
import org.training.hospital.core.model.PatientModel;

/**
 * @author soprasteria
 *
 */
public class DefaultPatientDao extends DefaultGenericDao<PatientModel> implements PatientDao
{

	public DefaultPatientDao(final String typecode)
	{
		super(typecode);

	}


	@Override
	public List<PatientModel> findPatientByCode(final String id)
	{
		validateParameterNotNull(id, "Patient id must not be null!");
		final String fsq = "SELECT {PK}* FROM {PATIENT AS P} WHERE {P.uid=?id}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("id", id));
		final SearchResult<PatientModel> result = (SearchResult<PatientModel>) getFlexibleSearchService().search(query);

		return result.getResult();

	}

}
