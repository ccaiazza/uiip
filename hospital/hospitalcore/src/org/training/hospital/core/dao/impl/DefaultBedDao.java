package org.training.hospital.core.dao.impl;

import java.util.List;

import org.training.hospital.core.dao.BedDao;
import org.training.hospital.core.model.BedModel;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

public class DefaultBedDao extends DefaultGenericDao implements BedDao {

	public DefaultBedDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer findBedsFreeByRoom(String code) {

		final String queryString = "SELECT { "+BedModel.PK+" } FROM {Bed AS B JOIN Room AS R ON{R.pk} = {B.room}} WHERE{R.code}=?code AND {B.pk} NOT IN ({{ SELECT {B.pk} FROM{Bed AS B JOIN Room AS R ON{R.pk} = {B.room} JOIN Patient AS P ON{P.bed}={B.pk}} WHERE {R.code}=?code  }})";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final SearchResult<Integer> result = getFlexibleSearchService().search(query);
		return result.getResult().size();
	}


	@Override
	public List<BedModel> findBedsByRoom(String code) {
		final String queryString = "SELECT { "+ BedModel.PK+ " } FROM{ Bed AS B JOIN Room AS R ON{R.pk} = {B.room}} WHERE {R.code}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final SearchResult<BedModel> result = getFlexibleSearchService().search(query);
		return result.getResult();


	}

	@Override
	public BedModel findBedByCode(String code) {
		final String queryString = "SELECT { "+ BedModel.PK+ " } FROM{ Bed AS B } WHERE {B.code}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final BedModel result = getFlexibleSearchService().searchUnique(query);
		return result;
	}
	
	



}
