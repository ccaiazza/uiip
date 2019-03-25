/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.training.hospital.core.dao.HospitalDao;
import org.training.hospital.core.model.HospitalModel;

/**
 * @author soprasteria
 *
 */
public class DefaultHospitalDao extends DefaultGenericDao<HospitalModel> implements HospitalDao
{
	@Autowired
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

		final String fsq = "SELECT {h:" + HospitalModel.PK + "} FROM {" + HospitalModel._TYPECODE + " AS h}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);

		return flexibleSearchService.<HospitalModel> search(query).getResult();
	}




	public List<HospitalModel> findHospitalByCode(final String code)
	{
		final String fsq = "SELECT{h:" + HospitalModel.PK + "} FROM {" + HospitalModel._TYPECODE + " AS h}" //
				+ "WHERE " + "{h:" + HospitalModel.CODE + "}=?code";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);
		query.addQueryParameter("code", code);


		return flexibleSearchService.<HospitalModel> search(query).getResult();
	}

}
