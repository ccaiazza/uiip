package org.training.hospital.core.dao;

import java.util.List;

import org.training.hospital.core.model.BedModel;

public interface BedDao {
	public Integer findBedsFreeByRoom(String code);
	public List<BedModel> findBedsByRoom(String code);

}
