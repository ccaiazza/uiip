package org.training.hospital.facades.impl;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.core.service.RoomService;
import org.training.hospital.facades.facade.RoomFacade;
import org.training.hospital.facades.product.data.RoomData;

import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.model.ModelService;

public class DefaultRoomFacade implements RoomFacade {

	private RoomService roomService;
	private Converter<RoomModel, RoomData> roomConverter;

	@Override
	public RoomData getRoomForCode(String code) {
		final RoomModel roomModel = roomService.getRoomForCode(code);
		
		
		return roomConverter.convert(roomModel);
		
	}
	/**
	 * @return the roomService
	 */
	public RoomService getRoomService() {
		return roomService;
	}
	/**
	 * @param roomService the roomService to set
	 */
	@Required
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	/**
	 * @return the roomConverter
	 */
	public Converter<RoomModel, RoomData> getRoomConverter() {
		return roomConverter;
	}
	/**
	 * @param roomConverter the roomConverter to set
	 */
	@Required
	public void setRoomConverter(Converter<RoomModel, RoomData> roomConverter) {
		this.roomConverter = roomConverter;
	}
	
	
	

}
