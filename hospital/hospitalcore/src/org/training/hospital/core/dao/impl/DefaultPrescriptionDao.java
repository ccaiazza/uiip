package org.training.hospital.core.dao.impl;

import java.util.List;

import org.training.hospital.core.dao.PrescriptionDao;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.model.RoomModel;

import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

public class DefaultPrescriptionDao extends DefaultGenericDao implements PrescriptionDao {

	public DefaultPrescriptionDao(String typecode) {
		super(typecode);

	}
	@Override
	public PrescriptionModel findPrescriptionByCode(String code)  {

		final String queryString = " SELECT {"+ PrescriptionModel.PK + "} FROM {"+ PrescriptionModel._TYPECODE + "} WHERE {"+ PrescriptionModel.CODE + "}=?code " ;
		final FlexibleSearchQuery query= new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code",code);
		final SearchResult<PrescriptionModel> result = getFlexibleSearchService().search(query);
		if(result.getResult().isEmpty()) {

			return null;
		}
		else {	return result.getResult().get(0);
		}
	}
	@Override
	public List<PrescriptionModel> findPrescriptionByPatient(String code) {
		final String queryString= "SELECT {" +PrescriptionModel.PK +"} FROM {PRESCRIPTION AS P JOIN PATIENT AS C ON{"+ PrescriptionModel.PATIENT +"} = {C.PK}} WHERE{C.UID} =?code";

		final FlexibleSearchQuery query=new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		final SearchResult<PrescriptionModel> result=getFlexibleSearchService().search(query);
		if(result.getResult().isEmpty()) {

			return null;
		}
		else {	return result.getResult();
		}
	}
}


