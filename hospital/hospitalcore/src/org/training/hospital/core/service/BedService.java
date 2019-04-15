package org.training.hospital.core.service;

import java.util.List;

import org.training.hospital.core.model.BedModel;

public interface BedService {
	public Integer getNumberBedsForCode(String code);
	public List<BedModel> getBedsforRoom(String code);

}
