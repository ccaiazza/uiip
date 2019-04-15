package org.training.hospital.facades.facade;

import java.util.List;


import org.training.hospital.facades.product.data.BedData;

public interface BedFacade {
	
	public Integer getNumberBedsForRoom(String code);
	public List<BedData> getBedsForRoom(String code);

}
