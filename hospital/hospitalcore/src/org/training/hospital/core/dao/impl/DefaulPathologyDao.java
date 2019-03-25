/**
 *
 */
package org.training.hospital.core.dao.impl;



import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Collections;
import java.util.List;

import org.training.hospital.core.dao.PathologyDao;
import org.training.hospital.core.model.PathologyModel;
import org.training.hospital.core.model.PatientModel;

/**
 * @author soprasteria
 *
 */
public class DefaulPathologyDao extends DefaultGenericDao implements PathologyDao
{

	/**
	 * @param typecode
	 */
	public DefaulPathologyDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.PathologyDao#findPatologybyPatient(org.training.hospital.core.model.PatientModel)
	 */
	@Override
	public List<PathologyModel> findPatologybyPatient(final String codePatient)
	{
		final String query = "SELECT { " + PathologyModel.PK + " } FROM {" + PathologyModel._TYPECODE
				+ " AS P JOIN Patient2PathologyRelation AS P2p ON{P.pk} = {P2p.target} JOIN " + PatientModel._TYPECODE
				+ " AS M ON{M.pk} = {P2p.source} } WHERE{ M.uid }=?codePatient";

		final FlexibleSearchQuery resultQuery = new FlexibleSearchQuery(query,
				Collections.singletonMap("codePatient", codePatient));
		//resultQuery.addQueryParameter("codePatient", codePatient);
		final SearchResult<PathologyModel> result = getFlexibleSearchService().search(resultQuery);
		return result.getResult();
	}

}
