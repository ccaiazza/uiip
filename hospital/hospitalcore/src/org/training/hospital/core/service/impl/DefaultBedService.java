package org.training.hospital.core.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.BedDao;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.service.BedService;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;


public class DefaultBedService implements BedService {

	private BedDao bedDao;
	@Override
	public Integer getNumberBedsForCode(String code) {
		final Integer numberBedsFree = bedDao.findBedsFreebyCode(code);
		if (numberBedsFree == null)
		{
			throw new UnknownIdentifierException("Bed not found!");
		}
		return numberBedsFree;
		
	}
	
	@Override
	public List<BedModel> getBedsforRoom(String code) {
		final List<BedModel> beds = bedDao.findBedsbyRoom(code);
		if (beds == null)
		{
			throw new UnknownIdentifierException("Bed not found!");
		}
		return beds;
		
	}
	/**
	 * @return the bedDao
	 */
	public BedDao getBedDao() {
		return bedDao;
	}
	/**
	 * @param bedDao the bedDao to set
	 */
	@Required
	public void setBedDao(BedDao bedDao) {
		this.bedDao = bedDao;
	}
	
	
	

}
