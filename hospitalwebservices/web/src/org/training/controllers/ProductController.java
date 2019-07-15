/**
 *
 */
package org.training.controllers;

import static org.training.constants.HospitalwebservicesConstants.CLIENT_CREDENTIAL_AUTHORIZATION_NAME;
import static org.training.constants.HospitalwebservicesConstants.PASSWORD_AUTHORIZATION_NAME;

import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercewebservicescommons.dto.product.ProductWsDTO;
import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;
import de.hybris.platform.webservicescommons.mapping.DataMapper;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.training.constants.HospitalwebservicesConstants;
import org.training.hospital.facades.constants.HospitalFacadesConstants;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;



@Controller
@RequestMapping(value = "/product/catalogs/{catalogId}/{catalogVersion}")
public class ProductController
{

	@Resource(name = "dataMapper")
	private DataMapper dataMapper;

	@Resource(name = "productFacade")
	private ProductFacade productFacade;

	@RequestMapping(value = "/dto/{code}", method = RequestMethod.GET)
	@CacheControl(directive = CacheControlDirective.PUBLIC, maxAge = 1800)
	@ResponseBody
	@ApiOperation(value = "Method with path parameter returns sample DTO", notes = "Sample method returning Cache-Control header and using Path Variable", produces = "application/json,application/xml", authorizations =
	{ @Authorization(value = CLIENT_CREDENTIAL_AUTHORIZATION_NAME), @Authorization(value = PASSWORD_AUTHORIZATION_NAME) })
	public ProductWsDTO getProductWsDTO(@PathVariable
	final String code, @ApiParam(value = "Sample path variable parameter. It should be returned in response DTO", required = true)
	@RequestParam(required = false, defaultValue = HospitalwebservicesConstants.FULL_FIELD_SET)
	final String fields, @RequestParam(required = false, defaultValue = HospitalwebservicesConstants.BASIC_OPTION)
	final String opt)
	{
		final Set<ProductOption> opts = extractOptions(opt);
		final ProductData productData = productFacade.getProductForCodeAndOptions(code, opts);
		return dataMapper.map(productData, ProductWsDTO.class, fields);

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
