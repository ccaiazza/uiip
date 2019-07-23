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

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.training.constants.HospitalwebservicesConstants;
import org.training.dto.MessageWsDTO;
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

	@Resource(name = "prescriptionFacade")
	private PrescriptionFacade prescriptionFacade;

	private static final Logger LOG = Logger.getLogger(PrescriptionController.class);




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

	@RequestMapping(value = "/postPrescription", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	@ApiOperation(value = "Method with body paramter", notes = "Sample method handling POST body parameter", produces = "application/json,application/xml", consumes = "application/json,application/xml", authorizations =
	{ @Authorization(value = CLIENT_CREDENTIAL_AUTHORIZATION_NAME), @Authorization(value = PASSWORD_AUTHORIZATION_NAME) })
	public MessageWsDTO createPrescription(@ApiParam(value = "Prescription object.", required = true)
	@RequestBody
	final PrescriptionWsDTO prescriptionWsDTO,
			@ApiParam(value = "Response configuration. This is the list of fields that should be returned in the response body.", allowableValues = "BASIC, DEFAULT, FULL")
			@RequestParam(defaultValue = HospitalwebservicesConstants.BASIC_FIELD_SET)
			final String fields)

	{


		final PrescriptionData prescription = getDataMapper().map(prescriptionWsDTO, PrescriptionData.class);
		prescriptionFacade.create(prescription);
		final MessageWsDTO messageDTO = new MessageWsDTO();
		messageDTO.setValue("Prescription with code: " + prescription.getCode() + " created correctly!");
		return messageDTO;
	}







}
