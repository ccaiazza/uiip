package org.training.hospital.facades.facade;

import java.util.List;

import org.training.hospital.core.model.RoomModel;
import org.training.hospital.facades.product.data.RoomData;

public interface RoomFacade {

	public Integer getNumberBedsFreeForCode(String code);
	
	public RoomData getRoomforCode (String code);
	
}
