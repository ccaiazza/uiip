package org.training.hospital.facades.facade;

import org.training.hospital.facades.product.data.RoomData;

public interface RoomFacade {

	public RoomData getRoomForCode(String code);
	
}
