/**
 *
 */
package org.training.hospital.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.List;

import org.training.hospital.core.dao.DoctorDao;
import org.training.hospital.core.model.DoctorModel;

/**
 * @author ssole
 *
 */
public class DefaultDoctorDao extends DefaultGenericDao implements DoctorDao
{

	/**
	 * @param typecode
	 */
	public DefaultDoctorDao(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.training.hospital.core.dao.DoctorDao#findDoctorbyName(java.lang.String)
	 */
	@Override
	public List<DoctorDao> findDoctorbyName(final String name)
	{
		final String query = "SELECT {" + DoctorModel.PK + "} 	FROM {" + DoctorModel._TYPECODE + " }" + "WHERE { "
				+ DoctorModel.NAME + " ?= name";


		return null;
	}

}
