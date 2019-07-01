package org.training.hospital.facades.populators;
import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


public class ProductPharmacyPopulator extends ProductPopulator{

	@Override
	public void populate(ProductModel source, ProductData target) throws ConversionException {
		super.populate(source, target);
		target.setManufacturerAID(source.getManufacturerAID());
		target.setOfflineDate(source.getOfflineDate());
		target.setOnlineDate(source.getOnlineDate());
		target.setEan(source.getEan());
		target.setPriceQuantity(source.getPriceQuantity());
		target.setApprovalStatus(source.getApprovalStatus());
		
	
		
		
	}
	

}
