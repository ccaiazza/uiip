package org.training.hospital.core.translators;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.converter.impl.DefaultMedicalImpexRowFilter;
import org.training.hospital.core.jalo.Prescription;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.PrescriptionService;

import java.util.Date;
import java.util.regex.*;  
import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.security.JaloSecurityException;
import de.hybris.platform.servicelayer.exceptions.SystemException;

public class PrescriptionValueTranslator extends AbstractValueTranslator {

	

	
	String strPattern ="[a-zA-Z]{2}\\d{1,8}$";
	boolean b = false;
	Date today=new Date();
	
	public static Logger LOG = Logger.getLogger(PrescriptionValueTranslator.class);


	@Override
	public String exportValue(Object arg0) throws JaloInvalidParameterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object importValue(String valueExpr, final Item toItem) throws JaloInvalidParameterException
	{
		 if (valueExpr != null)
		{
			String result = String.valueOf(valueExpr);
				Pattern pattern = Pattern.compile(strPattern);    
				Matcher m= pattern.matcher(result);
				b= m.matches();
				if(b==true) {
					return result + "_" + today;
				}
		}
		LOG.info("Prescription code cannot load !");
		return null;
	}

	
}