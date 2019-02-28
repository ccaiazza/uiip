/**
 *
 */
package org.training.hospital.storefront.controllers.hospital;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.training.hospital.facades.facade.RepartoFacade;
import org.training.hospital.facades.product.data.RepartoData;
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


	@RequestMapping(value = "/repartu{hospitalCode}") //nome file jsp
	public String showRepartiDetails(@PathVariable String codeHospital, final Model model) throws UnsupportedEncodingException
	{
		codeHospital = URLDecoder.decode(codeHospital, "UTF-8");
		final List<RepartoData> reparti = repartoFacade.getReparto(codeHospital);
		model.addAttribute("hospitalCode", codeHospital);
		model.addAttribute("repartu", reparti);
		return ControllerConstants.Views.Pages.Hospital.RepartiHospital;
	}


}
