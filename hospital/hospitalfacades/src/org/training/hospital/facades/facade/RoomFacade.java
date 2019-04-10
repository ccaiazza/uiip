package org.training.hospital.facades.facade;

import org.training.hospital.core.model.RoomModel;
import org.training.hospital.facades.product.data.RoomData;

public interface RoomFacade {
	
	//public Integer getNumberBedsFree(String code);
	public RoomData getRoomForCode(String code);

}
