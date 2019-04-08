package org.training.hospital.facades.populators;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.facades.product.data.BedData;
import org.training.hospital.facades.product.data.RoomData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class BedPopulator implements Populator<BedModel, BedData> {

	private Converter<RoomModel, RoomData> roomConverter;

	@Override
	public void populate(BedModel source, BedData target) throws ConversionException {
		target.setCode(source.getCode());
		target.setNumber(source.getNumber());
		//target.setRoom(roomConverter.convert(source.getRoom()));

	}

	/**
	 * @return the roomConverter
	 */
	public Converter<RoomModel, RoomData> getRoomConverter() {
		return roomConverter;
	}

	/**
	 * @param roomConverter the roomConverter to set
	 */
	@Required
	public void setRoomConverter(Converter<RoomModel, RoomData> roomConverter) {
		this.roomConverter = roomConverter;
	}
	
	

}
