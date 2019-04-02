package org.training.hospital.core.dao.impl;

import org.training.hospital.core.dao.RoomDao;
import org.training.hospital.core.model.RoomModel;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

public class DefaultRoomDao extends DefaultGenericDao implements RoomDao {

	public DefaultRoomDao(String typecode) {
		super(typecode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public RoomModel findRoombyCode(String code) {

		final String queryString = "SELECT {" + RoomModel.PK + " } FROM { "+ RoomModel._TYPECODE + " } WHERE {"+ RoomModel.CODE + "}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final SearchResult<RoomModel> result = getFlexibleSearchService().search(query);
		return result.getResult().get(0);
	}

}
