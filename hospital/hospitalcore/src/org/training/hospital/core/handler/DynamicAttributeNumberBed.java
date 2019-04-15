package org.training.hospital.core.handler;


import org.training.hospital.core.model.RoomModel;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

public class DynamicAttributeNumberBed implements DynamicAttributeHandler<Integer, RoomModel> {

	@Override
	public Integer get(RoomModel item) {
		if (item == null)
		{
			throw new IllegalArgumentException("Item model is required");
		}
		return item.getBeds().size();
		
	}
	

	@Override
	public void set(RoomModel var1, Integer var2) {
		// TODO Auto-generated method stub
		
	}

}
