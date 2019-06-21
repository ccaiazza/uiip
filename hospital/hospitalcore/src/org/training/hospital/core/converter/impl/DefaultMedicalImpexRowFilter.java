package org.training.hospital.core.converter.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.PrescriptionModel;
import org.training.hospital.core.service.PrescriptionService;

import de.hybris.platform.acceleratorservices.dataimport.batch.converter.ImpexRowFilter;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;

public class DefaultMedicalImpexRowFilter implements ImpexRowFilter {

	public static Logger LOG = Logger.getLogger(DefaultMedicalImpexRowFilter.class);
	private PrescriptionService prescriptionService;
	private String expression;
	private Integer column;
	
	
	@Override
	public boolean filter(Map<Integer, String> row) throws ModelNotFoundException{
		
		LOG.debug(" Start filtering row: " + row);
			String code = row.get(column);
			PrescriptionModel model = prescriptionService.getPrescriptionForCode(code);
			if(model == null) {
				LOG.debug("Prescription no exist with code: "+ row.get(column));
				row.put(column, " ");
				return true;
			}
			else {
				LOG.debug("Prescription exist with code: "+ row.get(column));
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
