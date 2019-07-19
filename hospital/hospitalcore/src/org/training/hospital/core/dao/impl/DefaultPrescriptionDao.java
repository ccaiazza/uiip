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
	public List<PrescriptionModel> findPrescriptionsByPatientCode(String code) {
		final String queryString= "SELECT {" +PrescriptionModel.PK +"} FROM {Prescription AS P JOIN Patient AS C ON{P.Patient} = {C.pk}} WHERE{C.uid} =?code";

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


