package org.training.hospital.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.service.BedService;
import org.training.hospital.facades.facade.BedFacade;
import org.training.hospital.facades.product.data.BedData;

import de.hybris.platform.servicelayer.dto.converter.Converter;

public class DefaultBedFacade implements BedFacade {

	private BedService bedService;
	private Converter<BedModel, BedData> bedConverter ;
	
	@Override
	public Integer getNumberBedsForRoom(String code) {
		final Integer numberBeds = bedService.getNumberBedsForCode(code);
		return numberBeds;
	}
	
	@Override
	public List<BedData> getBedsForRoom(String code) {
		final List<BedModel> bedModels = bedService.getBedsForRoom(code);
		return bedConverter.convertAll(bedModels);
		
	}
	

	/**
	 * @return the bedService
	 */
	public BedService getBedService() {
		return bedService;
	}

	/**
	 * @param bedService the bedService to set
	 */
	@Required
	public void setBedService(BedService bedService) {
		this.bedService = bedService;
	}

	/**
	 * @return the bedConverter
	 */
	public Converter<BedModel, BedData> getBedConverter() {
		return bedConverter;
	}

	/**
	 * @param bedConverter the bedConverter to set
	 */
	@Required
	public void setBedConverter(Converter<BedModel, BedData> bedConverter) {
		this.bedConverter = bedConverter;
	}

	
	
}