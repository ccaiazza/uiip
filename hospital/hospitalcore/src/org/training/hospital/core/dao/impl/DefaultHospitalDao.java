package org.training.hospital.core.dao.impl;



import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.training.hospital.core.dao.HospitalDao;
import org.training.hospital.core.model.HospitalModel;


public class DefaultHospitalDao extends DefaultGenericDao implements HospitalDao
{

	/**
	 * @param typecode
	 */
	public DefaultHospitalDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	public List<HospitalModel> findHospitalInfo(final String code)
	{

		final String queryString = "SELECT {" + HospitalModel.NAME + " " + HospitalModel.REPARTI + "} " + "FROM {"
				+ HospitalModel._TYPECODE + "WHERE { " + HospitalModel.CODE + "?=code }";




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);//prendere parametri
		final SearchResult<HospitalModel> result = getFlexibleSearchService().search(query);


		return result.getResult();
	}

	public List<HospitalModel> findHospitals()
	{

		final String queryString = "SELECT {" + HospitalModel.PK + "} " + "FROM {" + HospitalModel._TYPECODE + "}";




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);//prendere parametri
		final SearchResult<HospitalModel> result = getFlexibleSearchService().search(query);


		return result.getResult();
	}



}