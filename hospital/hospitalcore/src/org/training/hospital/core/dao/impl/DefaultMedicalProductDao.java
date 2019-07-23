package org.training.hospital.core.dao.impl;

import org.training.hospital.core.dao.MedicalProductDao;
import org.training.hospital.core.model.MedicalProductModel;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

public class DefaultMedicalProductDao extends DefaultGenericDao implements MedicalProductDao {

	public DefaultMedicalProductDao(String typecode) {
		super(typecode);
	}

	@Override
	public MedicalProductModel findMedicalProductByCode(String code) {
		final String queryString = " SELECT { "+ MedicalProductModel.PK + " } FROM {MedicalProduct AS M} WHERE {M.code}=?code" ;
		final FlexibleSearchQuery query= new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code",code);
		final SearchResult<MedicalProductModel> result = getFlexibleSearchService().search(query);
		if(result.getResult().isEmpty()) {

			return null;
		}
		else {	return result.getResult().get(0);
		}
		
	}

}
