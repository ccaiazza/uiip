/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Date;
import java.util.List;

import org.training.hospital.core.dao.PatientDao;
import org.training.hospital.core.model.PatientModel;

/**
 * @author soprasteria
 *
 */
public class DefaultPatientDao extends DefaultGenericDao implements PatientDao
{


	/**
	 * @param typecode
	 */
	public DefaultPatientDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<PatientModel> findPatientbyDateEntry(final Date entry)
	{

		final String query = "SELECT {" + PatientModel.PK + "} FROM {" + PatientModel._TYPECODE + " AS P }"
				+ "WHERE{P.dateEntry}=?entry";
		final FlexibleSearchQuery resultQuery = new FlexibleSearchQuery(query);
		resultQuery.addQueryParameter("entry", entry);
		final SearchResult<PatientModel> result = getFlexibleSearchService().search(resultQuery);
		return result.getResult();
	}





}
