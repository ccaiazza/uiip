package org.training.hospital.core.service.impl;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.RoomDao;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.core.service.RoomService;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

public class DefaultRoomService implements RoomService {
	private RoomDao roomDao;

	
	@Override
	public RoomModel getRoomForCode(String code) {
		if(code==null) {
			throw new IllegalArgumentException("code is null");
		}
		else {
		final RoomModel roomModel = roomDao.findRoomByCode(code);
		if (roomModel == null)
		{
			throw new UnknownIdentifierException("Room not found!");
		}
		return roomModel;
	}
}
	/**
	 * @return the roomDao
	 */
	public RoomDao getRoomDao() {
		return roomDao;
	}

	/**
	 * @param roomDao the roomDao to set
	 */
	@Required
	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

}


