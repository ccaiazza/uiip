package org.training.hospital.facades.facade;

import java.util.List;


import org.training.hospital.facades.product.data.BedData;

public interface BedFacade {
	
	public Integer getNumberBedsForCode(String code);
	public List<BedData> getBedsforRoom(String code);

}
