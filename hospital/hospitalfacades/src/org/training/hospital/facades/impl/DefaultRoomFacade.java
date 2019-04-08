package org.training.hospital.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.core.service.RoomService;
import org.training.hospital.facades.facade.RoomFacade;
import org.training.hospital.facades.product.data.RoomData;

import de.hybris.platform.servicelayer.dto.converter.Converter;

public class DefaultRoomFacade implements RoomFacade {

	private RoomService roomService;
	private Converter <RoomModel, RoomData> roomConverter;

	@Override
	public Integer getNumberBedsFreeForCode(String code) {

		final Integer freeBeds = roomService.getNumberBedsFreeForCode(code);
		return freeBeds;
		
	}
	
	public RoomData getRoomforCode(String code) {
		final RoomModel roomModel = roomService.getRoomforCode(code);
		return roomConverter.convert(roomModel);
	}
		
	
	
	
	
	


	public RoomService getRoomService() {
		return roomService;
	}

	@Required
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}


	
	public Converter<RoomModel, RoomData> getRoomConverter() {
		return roomConverter;
	}


	
	  @Required
	 public void setRoomConverter(Converter<RoomModel, RoomData> roomConverter) {
	this.roomConverter = roomConverter;
	}


	






}
