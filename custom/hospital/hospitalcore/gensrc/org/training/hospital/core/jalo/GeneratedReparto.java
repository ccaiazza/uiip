/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mar-2019 16.42.19                         ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Head;
import org.training.hospital.core.jalo.Hospital;
import org.training.hospital.core.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Reparto}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReparto extends GenericItem
{
	/** Qualifier of the <code>Reparto.codeReparto</code> attribute **/
	public static final String CODEREPARTO = "codeReparto";
	/** Qualifier of the <code>Reparto.nameRep</code> attribute **/
	public static final String NAMEREP = "nameRep";
	/** Qualifier of the <code>Reparto.head</code> attribute **/
	public static final String HEAD = "head";
	/** Qualifier of the <code>Reparto.hospital</code> attribute **/
	public static final String HOSPITAL = "hospital";
	/** Qualifier of the <code>Reparto.list_patient</code> attribute **/
	public static final String LIST_PATIENT = "list_patient";
	/** Relation ordering override parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_SRC_ORDERED = "relation.Patient2RepartoRelation.source.ordered";
	protected static String PATIENT2REPARTORELATION_TGT_ORDERED = "relation.Patient2RepartoRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_MARKMODIFIED = "relation.Patient2RepartoRelation.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOSPITAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedReparto> HOSPITALHANDLER = new BidirectionalOneToManyHandler<GeneratedReparto>(
	HospitalCoreConstants.TC.REPARTO,
	false,
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
		tmp.put(CODEREPARTO, AttributeMode.INITIAL);
		tmp.put(NAMEREP, AttributeMode.INITIAL);
		tmp.put(HEAD, AttributeMode.INITIAL);
		tmp.put(HOSPITAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.codeReparto</code> attribute.
	 * @return the codeReparto - Codice Reparto
	 */
	public String getCodeReparto(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODEREPARTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.codeReparto</code> attribute.
	 * @return the codeReparto - Codice Reparto
	 */
	public String getCodeReparto()
	{
		return getCodeReparto( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.codeReparto</code> attribute. 
	 * @param value the codeReparto - Codice Reparto
	 */
	public void setCodeReparto(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODEREPARTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.codeReparto</code> attribute. 
	 * @param value the codeReparto - Codice Reparto
	 */
	public void setCodeReparto(final String value)
	{
		setCodeReparto( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOSPITALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.head</code> attribute.
	 * @return the head - Codice Reparto
	 */
	public Head getHead(final SessionContext ctx)
	{
		return (Head)getProperty( ctx, HEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.head</code> attribute.
	 * @return the head - Codice Reparto
	 */
	public Head getHead()
	{
		return getHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.head</code> attribute. 
	 * @param value the head - Codice Reparto
	 */
	public void setHead(final SessionContext ctx, final Head value)
	{
		setProperty(ctx, HEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.head</code> attribute. 
	 * @param value the head - Codice Reparto
	 */
	public void setHead(final Head value)
	{
		setHead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.hospital</code> attribute.
	 * @return the hospital
	 */
	public Hospital getHospital(final SessionContext ctx)
	{
		return (Hospital)getProperty( ctx, HOSPITAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.hospital</code> attribute.
	 * @return the hospital
	 */
	public Hospital getHospital()
	{
		return getHospital( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.hospital</code> attribute. 
	 * @param value the hospital
	 */
	protected void setHospital(final SessionContext ctx, final Hospital value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+HOSPITAL+"' is not changeable", 0 );
		}
		HOSPITALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.hospital</code> attribute. 
	 * @param value the hospital
	 */
	protected void setHospital(final Hospital value)
	{
		setHospital( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Patient");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.list_patient</code> attribute.
	 * @return the list_patient
	 */
	public Collection<Patient> getList_patient(final SessionContext ctx)
	{
		final List<Patient> items = getLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Patient",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.list_patient</code> attribute.
	 * @return the list_patient
	 */
	public Collection<Patient> getList_patient()
	{
		return getList_patient( getSession().getSessionContext() );
	}
	
	public long getList_patientCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Patient",
			null
		);
	}
	
	public long getList_patientCount()
	{
		return getList_patientCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.list_patient</code> attribute. 
	 * @param value the list_patient
	 */
	protected void setList_patient(final SessionContext ctx, final Collection<Patient> value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+LIST_PATIENT+"' is not changeable", 0 );
		}
		setLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.list_patient</code> attribute. 
	 * @param value the list_patient
	 */
	protected void setList_patient(final Collection<Patient> value)
	{
		setList_patient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to list_patient. 
	 * @param value the item to add to list_patient
	 */
	protected void addToList_patient(final SessionContext ctx, final Patient value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+LIST_PATIENT+"' is not changeable", 0 );
		}
		addLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to list_patient. 
	 * @param value the item to add to list_patient
	 */
	protected void addToList_patient(final Patient value)
	{
		addToList_patient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from list_patient. 
	 * @param value the item to remove from list_patient
	 */
	protected void removeFromList_patient(final SessionContext ctx, final Patient value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+LIST_PATIENT+"' is not changeable", 0 );
		}
		removeLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from list_patient. 
	 * @param value the item to remove from list_patient
	 */
	protected void removeFromList_patient(final Patient value)
	{
		removeFromList_patient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.nameRep</code> attribute.
	 * @return the nameRep - Nome reparto.
	 */
	public String getNameRep(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReparto.getNameRep requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAMEREP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.nameRep</code> attribute.
	 * @return the nameRep - Nome reparto.
	 */
	public String getNameRep()
	{
		return getNameRep( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.nameRep</code> attribute. 
	 * @return the localized nameRep - Nome reparto.
	 */
	public Map<Language,String> getAllNameRep(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAMEREP,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Reparto.nameRep</code> attribute. 
	 * @return the localized nameRep - Nome reparto.
	 */
	public Map<Language,String> getAllNameRep()
	{
		return getAllNameRep( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.nameRep</code> attribute. 
	 * @param value the nameRep - Nome reparto.
	 */
	public void setNameRep(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedReparto.setNameRep requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAMEREP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.nameRep</code> attribute. 
	 * @param value the nameRep - Nome reparto.
	 */
	public void setNameRep(final String value)
	{
		setNameRep( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.nameRep</code> attribute. 
	 * @param value the nameRep - Nome reparto.
	 */
	public void setAllNameRep(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAMEREP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Reparto.nameRep</code> attribute. 
	 * @param value the nameRep - Nome reparto.
	 */
	public void setAllNameRep(final Map<Language,String> value)
	{
		setAllNameRep( getSession().getSessionContext(), value );
	}
	
}
