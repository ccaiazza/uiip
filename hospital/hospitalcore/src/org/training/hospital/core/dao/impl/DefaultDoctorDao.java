/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collections;
import java.util.List;

import org.training.hospital.core.dao.DoctorDao;
import org.training.hospital.core.model.DoctorModel;

/**
 * @author ssole
 *
 */
public class DefaultDoctorDao extends DefaultGenericDao implements DoctorDao
{

	/**
	 * @param typecode
	 */
	public DefaultDoctorDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.DoctorDao#findDoctorbyName(java.lang.String)
	 */
	@Override
	public List<DoctorModel> findDoctorbyName(final String name)
	{
		final String queryString = "SELECT {" + DoctorModel.PK + "} 	FROM {" + DoctorModel._TYPECODE + " }" + "WHERE { "
				+ DoctorModel.NAME + " ?= name";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString, Collections.singletonMap("name", name));
		final SearchResult<DoctorModel> result =  (SearchResult<DoctorModel>) getFlexibleSearchService().search(query);


		return result.getResult();
	}

}
