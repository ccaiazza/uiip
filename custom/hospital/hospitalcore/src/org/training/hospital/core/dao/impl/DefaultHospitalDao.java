/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.jalo.SearchResult;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.training.hospital.core.dao.HospitalDao;
import org.training.hospital.core.model.HospitalModel;

/**
 * @author soprasteria
 *
 */
public class DefaultHospitalDao extends DefaultGenericDao<HospitalModel> implements HospitalDao
{
	private FlexibleSearchService flexibleSearchService;
	/**
	 * @param typecode
	 */
	public DefaultHospitalDao(final String typecode)
	{
		super(typecode);

	}

	public List<HospitalModel> findHospital()
	{



		final String fsq = "SELECT{" + HospitalModel.NAME + " " + HospitalModel.NUMBERREP + " " + HospitalModel.REPARTI
				+ "} FROM {HOSPITAL}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);

		final SearchResult<HospitalModel> result = (SearchResult<HospitalModel>) getFlexibleSearchService().search(query);

		return result.getResult();

	}

	public List<HospitalModel> findInfoHospital()
	{



		final String fsq = "SELECT{" + HospitalModel.NAME + " " + HospitalModel.NUMBERREP + " " + HospitalModel.REPARTI
				+ "} FROM {HOSPITAL}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);

		final SearchResult<HospitalModel> result = (SearchResult<HospitalModel>) getFlexibleSearchService().search(query);

		return result.getResult();

	}






	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.HospitalDao#findRepartiByHospital(java.lang.String)
	 */

}
