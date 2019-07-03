package org.training.hospital.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class MedicalPopulator implements Populator<ProductModel, ProductData> {

	@Override
	public void populate(ProductModel source, ProductData target) throws ConversionException {
		target.setAge(source.getAge());
		target.setPregnancy(source.getPregnancy());
		target.setSymtom(source.getSymptom());
		target.setUse(source.getUse());
		target.setAction(source.getAction());

	}

}
