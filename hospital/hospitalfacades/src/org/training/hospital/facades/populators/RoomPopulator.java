package org.training.hospital.facades.populators;



import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.BedModel;
import org.training.hospital.core.model.HeadModel;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.facades.product.data.BedData;
import org.training.hospital.facades.product.data.HeadData;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.RoomData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class RoomPopulator implements Populator<RoomModel, RoomData> {



	private Converter<BedModel, BedData> bedConverter;

	@Override
	public void populate(RoomModel source, RoomData target) throws ConversionException {


		if (source == null)
		{
			throw new IllegalArgumentException("Model is empty");
		}
		else
		{
			target.setCode((source.getCode()));
			target.setNumberBeds(source.getNumberBeds());
			target.setBeds(bedConverter.convertAll(source.getBeds()));
			target.setNumberBeds(source.getNumberBeds());
		}

	}

	public Converter<BedModel, BedData> getBedConverter() {
		return bedConverter;
	}


	@Required
	public void setBedConverter(Converter<BedModel, BedData> bedConverter) {
		this.bedConverter = bedConverter;
	}

}
