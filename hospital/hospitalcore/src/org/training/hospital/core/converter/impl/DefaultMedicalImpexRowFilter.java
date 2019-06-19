package org.training.hospital.core.converter.impl;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.PrescriptionService;

import de.hybris.platform.acceleratorservices.dataimport.batch.converter.ImpexRowFilter;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;

public class DefaultMedicalImpexRowFilter implements ImpexRowFilter {

	private PrescriptionService prescriptionService;
	private String expression;
	private Integer column;
	Logger log1 = Logger.getLogger("myLog"); 
	
	@Override
	public boolean filter(Map<Integer, String> row) throws ModelNotFoundException{
		
			String code = row.get(column);
			PrescriptionModel model = prescriptionService.getPrescriptionForCode(code);
			if(model == null) {
				row.put(column, " ");
				return true;
			}
			else {
				return true;
			}	
		}
		
	
	/**
	 * @return the prescriptionService
	 */
	public PrescriptionService getPrescriptionService() {
		return prescriptionService;
	}

	/**
	 * @param prescriptionService the prescriptionService to set
	 */
	@Required
	public void setPrescriptionService(PrescriptionService prescriptionService) {
		this.prescriptionService = prescriptionService;
	}
	/**
	 * @return the expression
	 */
	public String getExpression() {
		return expression;
	}
	/**
	 * @param expression the expression to set
	 */
	@Required
	public void setExpression(String expression) {
		this.expression = expression;
	}
	/**
	 * @return the column
	 */
	public Integer getColumn() {
		return column;
	}
	/**
	 * @param column the column to set
	 */
	@Required
	public void setColumn(Integer column) {
		this.column = column;
	}
	
	


	

}
