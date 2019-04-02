package org.training.hospital.core.service;

import org.training.hospital.core.model.RoomModel;

public interface RoomService {
	public Integer getNumberBedsFree(final String code);
	public RoomModel getRoomForCode(final String code);

}
