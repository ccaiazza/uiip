package org.training.hospital.core.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.dao.RoomDao;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.core.service.RoomService;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

public class DefaultRoomService implements RoomService {
	private RoomDao roomDao;

	@Override
	public Integer getNumberBedsFreeForCode(String code) {

		final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"),Locale.ITALY);
		final Date today = calendar.getTime();
		final RoomModel room = roomDao.findRoombyCode(code);
//		final List<PatientModel> patients = room.getPatients();
//		Integer numberFree = room.getNumberBeds();
//		for (final PatientModel pa : patients)
//		{
//			final Date dataExit = pa.getDateExit();
//			if(dataExit != null) {
//				if (today.before(dataExit))
//				{
//					numberFree -= 1;
//				}
//			} else {
//				numberFree -= 1;
//			}
//		}
//
//		if (numberFree <= room.getNumberBeds())
//		{
//			return numberFree;
//		}
//		else
//		{
			return room.getNumberBeds();
//		}
	}
	@Override
	public RoomModel getRoomForCode(String code) {
		final RoomModel roomModel = roomDao.findRoombyCode(code);
		if (roomModel == null)
		{
			throw new UnknownIdentifierException("Room not found!");
		}
		return roomModel;
	}
	/**
	 * @return the roomDao
	 */
	public RoomDao getRoomDao() {
		return roomDao;
	}

	/**
	 * @param roomDao the roomDao to set
	 */
	@Required
	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

}


