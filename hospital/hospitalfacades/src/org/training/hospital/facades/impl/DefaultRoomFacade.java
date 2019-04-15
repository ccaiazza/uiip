package org.training.hospital.facades.impl;


import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.core.service.RoomService;
import org.training.hospital.facades.facade.RoomFacade;
import org.training.hospital.facades.product.data.RoomData;

import de.hybris.platform.servicelayer.dto.converter.Converter;


public class DefaultRoomFacade implements RoomFacade {

	private RoomService roomService;

	private Converter<RoomModel, RoomData> roomConverter;

	@Override
	public RoomData getRoomForCode(String code) {
		final RoomModel roomModel = roomService.getRoomForCode(code);
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
