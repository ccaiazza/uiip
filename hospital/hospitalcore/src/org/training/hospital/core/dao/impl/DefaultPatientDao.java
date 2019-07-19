/**
 *
 */
package org.training.hospital.core.dao.impl;

import java.util.Date;
import java.util.List;

import org.training.hospital.core.dao.PatientDao;
import org.training.hospital.core.model.PatientModel;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

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
	public List<PatientModel> findPatientByDateEntry(final Date entry)
	{

		final String query = "SELECT {" + PatientModel.PK + "} FROM {" + PatientModel._TYPECODE + " AS P }"
				+ "WHERE{P.dateEntry}=?entry";
		final FlexibleSearchQuery resultQuery = new FlexibleSearchQuery(query);
		resultQuery.addQueryParameter("entry", entry);
		final SearchResult<PatientModel> result = getFlexibleSearchService().search(resultQuery);
		return result.getResult();
	}

	@Override
	public List<PatientModel> findPatients() {
	
		final String queryString="SELECT {"+ PatientModel.PK + "} FROM {" + PatientModel._TYPECODE +"} ";
		final FlexibleSearchQuery query= new FlexibleSearchQuery(queryString); 
		final SearchResult <PatientModel> result= getFlexibleSearchService().search(query);
				return result.getResult();
	}

	@Override
	public PatientModel findPatientByUid(String uid) {

		final String queryString= "SELECT {"+ PatientModel.PK +"} FROM {"+ PatientModel._TYPECODE +" AS P } WHERE {P.uid}=?uid ";	

		final FlexibleSearchQuery query= new FlexibleSearchQuery(queryString);
		query.addQueryParameter("uid", uid);
		final SearchResult<PatientModel> result=getFlexibleSearchService().search(query);
		if(result.getResult().isEmpty()) {
			return null;
		}
		else return result.getResult().get(0);
	}
}
