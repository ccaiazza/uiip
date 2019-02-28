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








	@RequestMapping(value = "/reparti/{hospitalCode}")
	public String showRepartidetails(@PathVariable String hospitalCode, final Model model) throws UnsupportedEncodingException
	{
		hospitalCode = URLDecoder.decode(hospitalCode, "UTF-8");
		final List<RepartoData> reparti = repartoFacade.getRepartoByHospital(hospitalCode);
		model.addAttribute("hospitalCode", hospitalCode);
		model.addAttribute("reparti", reparti);
		return ControllerConstants.Views.Pages.Hospital.RepartiHospital;
	}


	@RequestMapping(value = "/nnreparti/")
	public String showRepartietails(@PathVariable
	final Model model) throws UnsupportedEncodingException
	{

		final List<HospitalData> nnreparti = hospitalFacade.getHospital();

		model.addAttribute("nnreparti", nnreparti);
		return ControllerConstants.Views.Pages.Hospital.Nnreparti;






	}



}
