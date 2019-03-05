/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-mar-2019 12.59.24                         ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Reparto;

/**
 * Generated class for type {@link org.training.hospital.core.jalo.Hospital Hospital}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHospital extends GenericItem
{
	/** Qualifier of the <code>Hospital.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Hospital.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Hospital.citta</code> attribute **/
	public static final String CITTA = "citta";
	/** Qualifier of the <code>Hospital.reparti</code> attribute **/
	public static final String REPARTI = "reparti";
	/**
	* {@link OneToManyHandler} for handling 1:n REPARTI's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Reparto> REPARTIHANDLER = new OneToManyHandler<Reparto>(
	HospitalCoreConstants.TC.REPARTO,
	true,
	"hospital",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CITTA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.citta</code> attribute.
	 * @return the citta
	 */
	public String getCitta(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITTA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.citta</code> attribute.
	 * @return the citta
	 */
	public String getCitta()
	{
		return getCitta( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.citta</code> attribute. 
	 * @param value the citta
	 */
	public void setCitta(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITTA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.citta</code> attribute. 
	 * @param value the citta
	 */
	public void setCitta(final String value)
	{
		setCitta( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHospital.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedHospital.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.reparti</code> attribute.
	 * @return the reparti
	 */
	public Set<Reparto> getReparti(final SessionContext ctx)
	{
		return (Set<Reparto>)REPARTIHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.reparti</code> attribute.
	 * @return the reparti
	 */
	public Set<Reparto> getReparti()
	{
		return getReparti( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.reparti</code> attribute. 
	 * @param value the reparti
	 */
	public void setReparti(final SessionContext ctx, final Set<Reparto> value)
	{
		REPARTIHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.reparti</code> attribute. 
	 * @param value the reparti
	 */
	public void setReparti(final Set<Reparto> value)
	{
		setReparti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reparti. 
	 * @param value the item to add to reparti
	 */
	public void addToReparti(final SessionContext ctx, final Reparto value)
	{
		REPARTIHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to reparti. 
	 * @param value the item to add to reparti
	 */
	public void addToReparti(final Reparto value)
	{
		addToReparti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reparti. 
	 * @param value the item to remove from reparti
	 */
	public void removeFromReparti(final SessionContext ctx, final Reparto value)
	{
		REPARTIHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from reparti. 
	 * @param value the item to remove from reparti
	 */
	public void removeFromReparti(final Reparto value)
	{
		removeFromReparti( getSession().getSessionContext(), value );
	}
	
}
