/**
 *
 */
package org.training.controllers;

import static org.training.constants.HospitalwebservicesConstants.CLIENT_CREDENTIAL_AUTHORIZATION_NAME;
import static org.training.constants.HospitalwebservicesConstants.PASSWORD_AUTHORIZATION_NAME;

import de.hybris.platform.webservicescommons.cache.CacheControl;
import de.hybris.platform.webservicescommons.cache.CacheControlDirective;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.training.constants.HospitalwebservicesConstants;
import org.training.dto.PrescriptionWsDTO;
import org.training.hospital.facades.facade.PrescriptionFacade;
import org.training.hospital.facades.product.data.PrescriptionData;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;


@Controller
@RequestMapping(value ="/prescription/patient/{patientId}/catalogs/{catalogId}/{catalogVersion}" )
public class PrescriptionController extends BaseController
{
	@Resource
	private PrescriptionFacade prescriptionFacade;

	@RequestMapping(value = "/description", method = RequestMethod.GET)
	@CacheControl(directive = CacheControlDirective.PUBLIC, maxAge = 1800)
	@ResponseBody
	@ApiOperation(value = "Method with path parameter returns sample DTO", notes = "Sample method returning Cache-Control header and using Path Variable", produces = "application/json,application/xml", authorizations =
{ @Authorization(value = CLIENT_CREDENTIAL_AUTHORIZATION_NAME), @Authorization(value = PASSWORD_AUTHORIZATION_NAME) })
	public List<PrescriptionWsDTO> getPrescriptionWsDTO(
	@ApiParam(value = "Sample path variable parameter. It should be returned in response DTO", required = true)
	@RequestParam(required = false, defaultValue = HospitalwebservicesConstants.FULL_FIELD_SET)
	final String fields)
	{
		final List<PrescriptionData> prescriptionData = prescriptionFacade.getPrescriptionsForPatientCode();
		return getDataMapper().mapAsList(prescriptionData, PrescriptionWsDTO.class, fields);
	}
}
