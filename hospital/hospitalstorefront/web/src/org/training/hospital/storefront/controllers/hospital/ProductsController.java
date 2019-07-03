package org.training.hospital.storefront.controllers.hospital;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.training.hospital.facades.constants.HospitalFacadesConstants;
import org.training.hospital.storefront.controllers.ControllerConstants;


import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;



@Controller
@RequestMapping(value = "/pharmacy")

public class ProductsController  {

	private static final String BASIC_OPTION = "BASIC,DESCRIPTION,MEDICAL,CATEGORIES";
	//private static final String DESCRIPTION = "DESCRIPTION";
	//private static final String PRICE = "PRICE";


		
	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@RequestMapping(value = "/product/{code}") 
	public String showProductDetails( @PathVariable final String code, 
			@RequestParam(required = false, defaultValue = BASIC_OPTION) final String options,
			final Model model)
			throws UnsupportedEncodingException
	{
		
			
			//final Collection <ProductOption> opts=null;
			final Set<ProductOption> opts = extractOptions(options);
			final ProductData product = productFacade.getProductForCodeAndOptions(code,opts);
			model.addAttribute("code", code);
			model.addAttribute("product", product);
			model.addAllAttributes(opts);
			
		

			return ControllerConstants.Views.Pages.Pharmacy.Product;
	
		}
	
	
	protected Set<ProductOption> extractOptions(final String options)
	{
		final String[] optionsStrings = options.split(HospitalFacadesConstants.OPTIONS_SEPARATOR);

		final Set<ProductOption> opts = new HashSet<ProductOption>();
		for (final String option : optionsStrings)
		{
			opts.add(ProductOption.valueOf(option));
		}
		return opts;
	}
	
		
	}

	
	
	






