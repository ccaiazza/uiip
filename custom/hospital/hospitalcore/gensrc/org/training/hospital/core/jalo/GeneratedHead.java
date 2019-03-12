/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12-mar-2019 12.39.59                        ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.user.Customer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.hospital.core.constants.HospitalCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Customer Head}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHead extends Customer
{
	/** Qualifier of the <code>Head.specialization</code> attribute **/
	public static final String SPECIALIZATION = "specialization";
	/** Qualifier of the <code>Head.registration</code> attribute **/
	public static final String REGISTRATION = "registration";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SPECIALIZATION, AttributeMode.INITIAL);
		tmp.put(REGISTRATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.registration</code> attribute.
	 * @return the registration - Head Registration
	 */
	public Boolean isRegistration(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHead.isRegistration requires a session language", 0 );
		}
		return (Boolean)getLocalizedProperty( ctx, REGISTRATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.registration</code> attribute.
	 * @return the registration - Head Registration
	 */
	public Boolean isRegistration()
	{
		return isRegistration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.registration</code> attribute. 
	 * @return the registration - Head Registration
	 */
	public boolean isRegistrationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRegistration( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.registration</code> attribute. 
	 * @return the registration - Head Registration
	 */
	public boolean isRegistrationAsPrimitive()
	{
		return isRegistrationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.registration</code> attribute. 
	 * @return the localized registration - Head Registration
	 */
	public Map<Language,Boolean> getAllRegistration(final SessionContext ctx)
	{
		return (Map<Language,Boolean>)getAllLocalizedProperties(ctx,REGISTRATION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.registration</code> attribute. 
	 * @return the localized registration - Head Registration
	 */
	public Map<Language,Boolean> getAllRegistration()
	{
		return getAllRegistration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.registration</code> attribute. 
	 * @param value the registration - Head Registration
	 */
	public void setRegistration(final SessionContext ctx, final Boolean value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHead.setRegistration requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REGISTRATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.registration</code> attribute. 
	 * @param value the registration - Head Registration
	 */
	public void setRegistration(final Boolean value)
	{
		setRegistration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.registration</code> attribute. 
	 * @param value the registration - Head Registration
	 */
	public void setRegistration(final SessionContext ctx, final boolean value)
	{
		setRegistration( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.registration</code> attribute. 
	 * @param value the registration - Head Registration
	 */
	public void setRegistration(final boolean value)
	{
		setRegistration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.registration</code> attribute. 
	 * @param value the registration - Head Registration
	 */
	public void setAllRegistration(final SessionContext ctx, final Map<Language,Boolean> value)
	{
		setAllLocalizedProperties(ctx,REGISTRATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.registration</code> attribute. 
	 * @param value the registration - Head Registration
	 */
	public void setAllRegistration(final Map<Language,Boolean> value)
	{
		setAllRegistration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.specialization</code> attribute.
	 * @return the specialization - Head Specialization
	 */
	public String getSpecialization(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHead.getSpecialization requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SPECIALIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.specialization</code> attribute.
	 * @return the specialization - Head Specialization
	 */
	public String getSpecialization()
	{
		return getSpecialization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.specialization</code> attribute. 
	 * @return the localized specialization - Head Specialization
	 */
	public Map<Language,String> getAllSpecialization(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SPECIALIZATION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.specialization</code> attribute. 
	 * @return the localized specialization - Head Specialization
	 */
	public Map<Language,String> getAllSpecialization()
	{
		return getAllSpecialization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.specialization</code> attribute. 
	 * @param value the specialization - Head Specialization
	 */
	public void setSpecialization(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHead.setSpecialization requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SPECIALIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.specialization</code> attribute. 
	 * @param value the specialization - Head Specialization
	 */
	public void setSpecialization(final String value)
	{
		setSpecialization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.specialization</code> attribute. 
	 * @param value the specialization - Head Specialization
	 */
	public void setAllSpecialization(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SPECIALIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.specialization</code> attribute. 
	 * @param value the specialization - Head Specialization
	 */
	public void setAllSpecialization(final Map<Language,String> value)
	{
		setAllSpecialization( getSession().getSessionContext(), value );
	}
	
}
