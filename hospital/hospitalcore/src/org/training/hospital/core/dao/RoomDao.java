package org.training.hospital.core.dao;

import org.training.hospital.core.model.RoomModel;

public interface RoomDao {
	public RoomModel findRoomByCode(final String code);

}
