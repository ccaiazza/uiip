package org.training.hospital.core.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.BedDao;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.service.BedService;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;


public class DefaultBedService implements BedService {

	private BedDao bedDao;
	private ModelService modelService;
	
	@Override
	public Integer getNumberBedsForCode(String code) {
		final Integer numberBedsFree = bedDao.findBedsFreeByRoom(code);
		if (numberBedsFree == null)
		{
			throw new UnknownIdentifierException("Bed not found!");
		}
		return numberBedsFree;
		
	}
	
	@Override
	public List<BedModel> getBedsforRoom(String code) {
		final List<BedModel> beds = bedDao.findBedsByRoom(code);
		if (beds == null)
		{
			throw new UnknownIdentifierException("Bed not found!");
		}
		return beds;
		
	}
	@Override
	public void occupyBed(String code) {
		final BedModel bed = bedDao.findBedByCode(code);
		bed.setFree(false);
		modelService.save(bed);
		
	}
	@Override
	public void realeseBed(String code) {
		final BedModel bed = bedDao.findBedByCode(code);
		bed.setFree(true);
		modelService.save(bed);
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

	/**
	 * @return the modelService
	 */
	public ModelService getModelService() {
		return modelService;
	}

	/**
	 * @param modelService the modelService to set
	 */
	@Required
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}
	
	
	
	
	

}
