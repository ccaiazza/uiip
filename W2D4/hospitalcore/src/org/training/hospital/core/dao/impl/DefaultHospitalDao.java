package org.training.hospital.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

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

	public List<HospitalModel> findHospital()
	{

		final String queryString = "SELECT {" + HospitalModel.NAME + " " + HospitalModel.REPARTI + "} " + "FROM {"
				+ HospitalModel._TYPECODE;




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);//prendere parametri
		final SearchResult<HospitalModel> result = (SearchResult<HospitalModel>) getFlexibleSearchService().search(query);


		return result.getResult();
	}




}