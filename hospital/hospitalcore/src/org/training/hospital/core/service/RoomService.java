package org.training.hospital.core.service;

import org.training.hospital.core.model.RoomModel;

public interface RoomService {
	
	public RoomModel getRoomForCode(final String code);

}
