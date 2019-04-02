package org.training.hospital.facades.populators;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.core.model.RoomModel;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.RepartoData;
import org.training.hospital.facades.product.data.RoomData;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;

public class RoomPopulator implements Populator<RoomModel, RoomData> {

	private Converter<PatientModel, PatientData> patientConverter;
	private Converter<RepartoModel, RepartoData> repartoConverter;
	
	@Override
	public void populate(RoomModel source, RoomData target) throws ConversionException {
		if (source == null)
		{
			throw new IllegalArgumentException("Model is empty");
		}
		else
		{
			target.setCode(source.getCode());
			target.setNumberBeds(source.getNumberBeds());
			target.setNumberRoom(source.getNumberRoom());
			target.setTelephoneNumber(source.getTelephoneNumber());
			target.setDepartament(repartoConverter.convert(source.getDepartament()));
			target.setPatients(patientConverter.convertAll(source.getPatients()));
		}

	}

	public Converter<PatientModel, PatientData> getPatientConverter() {
		return patientConverter;
	}

	@Required
	public void setPatientConverter(Converter<PatientModel, PatientData> patientConverter) {
		this.patientConverter = patientConverter;
	}

	
	public Converter<RepartoModel, RepartoData> getRepartoConverter() {
		return repartoConverter;
	}
	@Required
	public void setRepartoConverter(Converter<RepartoModel, RepartoData> repartoConverter) {
		this.repartoConverter = repartoConverter;
	}

}
