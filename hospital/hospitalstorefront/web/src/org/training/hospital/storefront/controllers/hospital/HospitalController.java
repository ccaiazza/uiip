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
import org.training.hospital.core.model.PatientModel;
import org.training.hospital.core.service.PatientService;
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

	@Resource(name = "patientService")
	private PatientService patientService;

	@Resource(name = "roomService")
	private RoomService roomService;
	


	@RequestMapping(value = "/reparto/{code}") //nome file jsp
	public String showRepartiDetails(@PathVariable("code") String code, final Model model)
			throws UnsupportedEncodingException
	{
		code = URLDecoder.decode(code, "UTF-8");

		if (repartoFacade != null)
		{
			final List<RepartoData> reparti = repartoFacade.getRepartoForCode(code);
			model.addAttribute("code", code);
			model.addAttribute("reparto", reparti);
			return ControllerConstants.Views.Pages.Hospital.RepartiHospital;
		}
		else
		{
			return ControllerConstants.Views.Pages.Hospital.RepartiHospital;
		}
	}

	@RequestMapping(value = "/nReparti/{code}") //nome file jsp
	public String showNomeRepartiDetails(@PathVariable("code") String code, final Model model) throws UnsupportedEncodingException
	{

		code = URLDecoder.decode(code, "UTF-8");
		final List<HospitalData> hospitals = hospitalFacade.getHospitals();
		final List<HospitalData> hospitalData = hospitalFacade.getHospitalInfo(code);
		final List<String> number = hospitalFacade.getNumberDepartamentForCodeHospital(code);
		
		model.addAttribute("code", code);
		model.addAttribute("hospitalData", hospitalData);
		model.addAttribute("number", number);
		model.addAttribute("hospitals", hospitals);
		return ControllerConstants.Views.Pages.Hospital.Nreparti;
	}

	@RequestMapping(value = "/patientList/{entry}")
	public String showPatientsDetails(@PathVariable("entry")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	final Date entry, final Model model) throws UnsupportedEncodingException
	{
		final List<PatientData> patients = patientFacade.getPatientForDateEntry(entry);
		model.addAttribute("entry", entry);
		model.addAttribute("patients", patients);
		return ControllerConstants.Views.Pages.Hospital.Patients;

	}

	@RequestMapping(value = "/pathology/{codePatient}")
	public String showPathologiesDetails(@PathVariable("codePatient")
	final String codePatient, final Model model) throws UnsupportedEncodingException
	{
		final List<PathologyData> pathologies = pathologyFacade.getPatologyForPatient(codePatient);
		model.addAttribute("codePatient", codePatient);
		model.addAttribute("pathology", pathologies);


		return ControllerConstants.Views.Pages.Hospital.Pathologies;

	}

	@RequestMapping(value = "/room/{code}")
	public String showRoomDetails(@PathVariable("code")
	final String code, final Model model) throws UnsupportedEncodingException
	{
		final RoomData room = roomFacade.getRoomForCode(code);
		final List<BedData> beds = bedFacade.getBedsForRoom(code);
		final Integer numberBedsFree = bedFacade.getNumberBedsForRoom(code); 
		model.addAttribute("code", code);
		model.addAttribute("beds", beds);
		model.addAttribute("room", room);
		model.addAttribute("numberBedsFree",numberBedsFree);



		return ControllerConstants.Views.Pages.Hospital.Room;

	}

	@RequestMapping(value = "/patient/{code}" )
	public String showPatientsDetails(@PathVariable("code")
	final String code,final Model model) throws UnsupportedEncodingException
	{
		final PatientData patient = patientFacade.getPatientForUid(code);
		final PatientModel pmodel = patientService.releasePatient(code);
		final List<PatientData> patientlist = patientFacade.getPatients();

		model.addAttribute("code", code);
		model.addAttribute("patient", patient);
		model.addAttribute("patientlist", patientlist);
		model.addAttribute("pmodel", pmodel);
		return ControllerConstants.Views.Pages.Hospital.PatientList;

	}

	
	

}
