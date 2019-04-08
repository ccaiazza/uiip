/**
 *
 */
package org.training.hospital.storefront.controllers.hospital;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.hospital.core.service.RoomService;
import org.training.hospital.facades.facade.BedFacade;
import org.training.hospital.facades.facade.HospitalFacade;
import org.training.hospital.facades.facade.PathologyFacade;
import org.training.hospital.facades.facade.PatientFacade;
import org.training.hospital.facades.facade.RepartoFacade;
import org.training.hospital.facades.facade.RoomFacade;
import org.training.hospital.facades.product.data.BedData;
import org.training.hospital.facades.product.data.HospitalData;
import org.training.hospital.facades.product.data.PathologyData;
import org.training.hospital.facades.product.data.PatientData;
import org.training.hospital.facades.product.data.RepartoData;
import org.training.hospital.facades.product.data.RoomData;
import org.training.hospital.storefront.controllers.ControllerConstants;

import com.sap.security.core.server.csi.util.URLDecoder;




/**
 * @author soprasteria
 *
 */
@Controller
@RequestMapping(value = "/hospital")
public class HospitalController
{

	@Resource(name = "repartoFacade")
	private RepartoFacade repartoFacade; //NO GET E SET

	@Resource(name = "hospitalFacade")
	private HospitalFacade hospitalFacade; //NO GET E SET

	@Resource(name = "patientFacade")
	private PatientFacade patientFacade;

	@Resource(name = "pathologyFacade")
	private PathologyFacade pathologyFacade;
	
	@Resource(name = "roomFacade")
	private RoomFacade roomFacade;
	
	@Resource(name = "bedFacade")
	private BedFacade bedFacade;
	
	


	@RequestMapping(value = "/repartu/{code}") //nome file jsp
	public String showRepartiDetails(@PathVariable("code") String code, final Model model)
			throws UnsupportedEncodingException
	{
		code = URLDecoder.decode(code, "UTF-8");

		if (repartoFacade != null)
		{
			final List<RepartoData> reparti = repartoFacade.getReparto(code);
		model.addAttribute("code", code);
		model.addAttribute("repartu", reparti);
		return ControllerConstants.Views.Pages.Hospital.RepartiHospital;
	}
		else
		{
			return ControllerConstants.Views.Pages.Hospital.RepartiHospital;
		}
	}

	@RequestMapping(value = "/nReparti") //nome file jsp
	public String showNomeRepartiDetails(final Model model) throws UnsupportedEncodingException
	{

		final List<HospitalData> nReparti = hospitalFacade.getHospitals();

		model.addAttribute("nReparti", nReparti);
		return ControllerConstants.Views.Pages.Hospital.Nreparti;
	}

	@RequestMapping(value = "/patients/{entry}")
	public String showPatientsDetails(@PathVariable("entry")
	@DateTimeFormat(pattern = "yyyy.MM.dd")
	final Date entry, final Model model) throws UnsupportedEncodingException
	{
		final List<PatientData> patients = patientFacade.getPatientbyDateEntry(entry);
		model.addAttribute("entry", entry);
		model.addAttribute("patients", patients);
		return ControllerConstants.Views.Pages.Hospital.Patients;

	}

	@RequestMapping(value = "/pathology/{codePatient}")
	public String showPathologiesDetails(@PathVariable("codePatient")
	final String codePatient, final Model model) throws UnsupportedEncodingException
	{
		final List<PathologyData> pathologies = pathologyFacade.getPatologyforPatient(codePatient);
		model.addAttribute("codePatient", codePatient);
		model.addAttribute("pathology", pathologies);


		return ControllerConstants.Views.Pages.Hospital.Pathologies;

	}
	
	@RequestMapping(value = "/room/{code}")
	public String showRoomDetails(@PathVariable("code")
	final String code, final Model model) throws UnsupportedEncodingException
	{
		final RoomData room = roomFacade.getRoomForCode(code);
		final List<BedData> beds = bedFacade.getBedsforRoom(code);
		final Integer numberBedsFree = bedFacade.getNumberBedsForCode(code); 
		model.addAttribute("code", code);
		model.addAttribute("beds", beds);
		model.addAttribute("room", room);
		model.addAttribute("numberBedsFree",numberBedsFree);
		


		return ControllerConstants.Views.Pages.Hospital.Room;

	}
	




}
