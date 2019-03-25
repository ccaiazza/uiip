package org.training.hospital.storefront.controllers.hospital;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.hospital.facades.product.data.HospitalData;
import org.training.hospital.facades.product.data.RepartoData;
import org.training.hospital.storefront.controllers.ControllerConstants;
import org.traininghospital.facades.facades.HospitalFacade;
import org.traininghospital.facades.facades.RepartoFacade;

import com.sap.security.core.server.csi.util.URLDecoder;



/**
 *
 */

/**
 * @author soprasteria
 *
 */

@Controller
@RequestMapping(value = "/hospital")
public class HospitalController
{
	@Resource(name = "repartoFacade")
	private RepartoFacade repartoFacade;

	@Resource(name = "hospitalFacade")
	private HospitalFacade hospitalFacade;



	@RequestMapping(value = "HospitalDetails/{code}") //Punto di accesso HTTP
	// Stampa le informazioni dell'ospedale relativo al codeHospital inserito
	public String showHospitalDetails(@PathVariable("code") String code, final Model model)
			throws UnsupportedEncodingException
	{
		code = URLDecoder.decode(code, "UTF-8");
		final HospitalData hospital = hospitalFacade.getHospitalForCode(code);
		model.addAttribute("hospital", hospital);
		return ControllerConstants.Views.Pages.Hospital.HospitalDetails;
	}

	@RequestMapping(value = "/hospitals")
	//Stampa la lista di ospedali presenti nel db
	public String getHospitals(final Model model) throws UnsupportedEncodingException
	{
		final List<HospitalData> hospitals = hospitalFacade.getHospital();
		model.addAttribute("hospitals", hospitals);
		return ControllerConstants.Views.Pages.Hospital.HospitalListing;

	}

	@RequestMapping(value = "RepartoDetails/{code}") //Punto di accesso HTTP
	//Stampa  la lista di reparti presenti nell'ospedale richiesto
	public String showReparti(@PathVariable("code") String code, final Model model) throws UnsupportedEncodingException
	{
		code = URLDecoder.decode(code, "UTF-8");
		final List<RepartoData> reparti = repartoFacade.getRepartoForHospital(code);

		model.addAttribute("reparti", reparti);
		return ControllerConstants.Views.Pages.Hospital.RepartoListing;
	}

	@RequestMapping(value = "/departments")
	//Stampa la lista di reparti presenti nel db
	public String getDepartment(final Model model) throws UnsupportedEncodingException
	{
		final List<RepartoData> reparti = repartoFacade.getDepartments();
		model.addAttribute("reparti", reparti);
		return ControllerConstants.Views.Pages.Hospital.DepartmentListing;
	}








}
