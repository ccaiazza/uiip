/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12-mar-2019 12.39.55                        ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.hospital.core.constants.HospitalCoreConstants;

/**
 * Generated class for type {@link org.training.hospital.core.jalo.Head Head}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHead extends Customer
{
	/** Qualifier of the <code>Head.specialization</code> attribute **/
	public static final String SPECIALIZATION = "specialization";
	/** Qualifier of the <code>Head.register</code> attribute **/
	public static final String REGISTER = "register";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SPECIALIZATION, AttributeMode.INITIAL);
		tmp.put(REGISTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.register</code> attribute.
	 * @return the register
	 */
	public Boolean isRegister(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REGISTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.register</code> attribute.
	 * @return the register
	 */
	public Boolean isRegister()
	{
		return isRegister( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.register</code> attribute. 
	 * @return the register
	 */
	public boolean isRegisterAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRegister( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.register</code> attribute. 
	 * @return the register
	 */
	public boolean isRegisterAsPrimitive()
	{
		return isRegisterAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.register</code> attribute. 
	 * @param value the register
	 */
	public void setRegister(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REGISTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.register</code> attribute. 
	 * @param value the register
	 */
	public void setRegister(final Boolean value)
	{
		setRegister( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.register</code> attribute. 
	 * @param value the register
	 */
	public void setRegister(final SessionContext ctx, final boolean value)
	{
		setRegister( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.register</code> attribute. 
	 * @param value the register
	 */
	public void setRegister(final boolean value)
	{
		setRegister( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.specialization</code> attribute.
	 * @return the specialization
	 */
	public String getSpecialization(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SPECIALIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.specialization</code> attribute.
	 * @return the specialization
	 */
	public String getSpecialization()
	{
		return getSpecialization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.specialization</code> attribute. 
	 * @param value the specialization
	 */
	public void setSpecialization(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SPECIALIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.specialization</code> attribute. 
	 * @param value the specialization
	 */
	public void setSpecialization(final String value)
	{
		setSpecialization( getSession().getSessionContext(), value );
	}
	
}
