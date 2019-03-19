/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-mar-2019 9.09.39                         ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Doctor;

/**
 * Generated class for type {@link org.training.hospital.core.jalo.Head Head}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHead extends Doctor
{
	/** Qualifier of the <code>Head.yearsExperience</code> attribute **/
	public static final String YEARSEXPERIENCE = "yearsExperience";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Doctor.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(YEARSEXPERIENCE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.yearsExperience</code> attribute.
	 * @return the yearsExperience
	 */
	public String getYearsExperience(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEARSEXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Head.yearsExperience</code> attribute.
	 * @return the yearsExperience
	 */
	public String getYearsExperience()
	{
		return getYearsExperience( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.yearsExperience</code> attribute. 
	 * @param value the yearsExperience
	 */
	public void setYearsExperience(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEARSEXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Head.yearsExperience</code> attribute. 
	 * @param value the yearsExperience
	 */
	public void setYearsExperience(final String value)
	{
		setYearsExperience( getSession().getSessionContext(), value );
	}
	
}
