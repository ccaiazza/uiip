/**
 *
 */
package org.training.hospital.core.dao.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.training.hospital.core.dao.RepartoDao;
import org.training.hospital.core.model.RepartoModel;
public class DefaultRepartoDao extends DefaultGenericDao<RepartoModel> implements RepartoDao

{

	/**
	 * @param typecode
	 */
	public DefaultRepartoDao(final String typecode)
	{
		super(typecode);
	}

	@Autowired
	private FlexibleSearchService flexibleSearchService;


	@Override
	public List<RepartoModel> findRepartoByHospital(final String code)
	{

		validateParameterNotNull(code, "Hospital code must not be null!");

		final String fsq = "SELECT {p.PK} FROM {REPARTO AS p JOIN HOSPITAL AS h ON {h.pk}={p.hospital}} WHERE {h.code}=?code";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq, Collections.singletonMap("code", code));
		return flexibleSearchService.<RepartoModel> search(query).getResult();

	}

	public List <RepartoModel> findDepartments(){

		final String fsq = "SELECT {Reparto.PK} FROM {Reparto}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);

		return flexibleSearchService.<RepartoModel> search(query).getResult();

	}





}
