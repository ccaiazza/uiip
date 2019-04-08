package org.training.hospital.core.dao.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

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
	public Integer findBedsFreebyCode(String code) {
		final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"),Locale.ITALY);
		final Date today = calendar.getTime();
		final String queryString = "SELECT distinct { "+BedModel.PK+" } FROM{ Bed AS B JOIN Room AS R ON{R.pk} = {B.room} JOIN Patient AS P ON{P.bed}={B.pk}} WHERE {R.code}=?code AND {P.dateExit}<?today AND {P.dateExit} is not null AND {B.pk}  NOT IN ({{ SELECT {B.pk} FROM {Bed AS B JOIN Patient AS P ON{P.bed}={B.pk}} WHERE {P.dateExit}>=?today OR {P.dateExit} is null }})";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		query.addQueryParameter("today", today);
		final SearchResult<BedModel> result = getFlexibleSearchService().search(query);
		return result.getResult().size();
	}


	@Override
	public List<BedModel> findBedsbyRoom(String code) {
		final String queryString = "SELECT { "+ BedModel.PK+ " } FROM{ Bed AS B JOIN Room AS R ON{R.pk} = {B.room}} WHERE {R.code}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final SearchResult<BedModel> result = getFlexibleSearchService().search(query);
		return result.getResult();


	}



}
