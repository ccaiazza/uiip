/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mar-2019 16.42.19                         ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Reparto;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.User Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends User
{
	/** Qualifier of the <code>Patient.surnamePatient</code> attribute **/
	public static final String SURNAMEPATIENT = "surnamePatient";
	/** Qualifier of the <code>Patient.entryDate</code> attribute **/
	public static final String ENTRYDATE = "entryDate";
	/** Qualifier of the <code>Patient.exitDate</code> attribute **/
	public static final String EXITDATE = "exitDate";
	/** Qualifier of the <code>Patient.list_reparti</code> attribute **/
	public static final String LIST_REPARTI = "list_reparti";
	/** Relation ordering override parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_SRC_ORDERED = "relation.Patient2RepartoRelation.source.ordered";
	protected static String PATIENT2REPARTORELATION_TGT_ORDERED = "relation.Patient2RepartoRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_MARKMODIFIED = "relation.Patient2RepartoRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SURNAMEPATIENT, AttributeMode.INITIAL);
		tmp.put(ENTRYDATE, AttributeMode.INITIAL);
		tmp.put(EXITDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.entryDate</code> attribute.
	 * @return the entryDate - Data Ingresso
	 */
	public String getEntryDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENTRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.entryDate</code> attribute.
	 * @return the entryDate - Data Ingresso
	 */
	public String getEntryDate()
	{
		return getEntryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.entryDate</code> attribute. 
	 * @param value the entryDate - Data Ingresso
	 */
	public void setEntryDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENTRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.entryDate</code> attribute. 
	 * @param value the entryDate - Data Ingresso
	 */
	public void setEntryDate(final String value)
	{
		setEntryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate - Data uscita
	 */
	public String getExitDate(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXITDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate - Data uscita
	 */
	public String getExitDate()
	{
		return getExitDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate - Data uscita
	 */
	public void setExitDate(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXITDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate - Data uscita
	 */
	public void setExitDate(final String value)
	{
		setExitDate( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Reparto");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.list_reparti</code> attribute.
	 * @return the list_reparti
	 */
	public Set<Reparto> getList_reparti(final SessionContext ctx)
	{
		final List<Reparto> items = getLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Reparto",
			null,
			false,
			false
		);
		return new LinkedHashSet<Reparto>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.list_reparti</code> attribute.
	 * @return the list_reparti
	 */
	public Set<Reparto> getList_reparti()
	{
		return getList_reparti( getSession().getSessionContext() );
	}
	
	public long getList_repartiCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Reparto",
			null
		);
	}
	
	public long getList_repartiCount()
	{
		return getList_repartiCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.list_reparti</code> attribute. 
	 * @param value the list_reparti
	 */
	public void setList_reparti(final SessionContext ctx, final Set<Reparto> value)
	{
		new PartOfHandler<Set<Reparto>>()
		{
			@Override
			protected Set<Reparto> doGetValue(final SessionContext ctx)
			{
				return getList_reparti( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Set<Reparto> _value)
			{
				final Set<Reparto> value = _value;
				setLinkedItems( 
					ctx,
					true,
					HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.list_reparti</code> attribute. 
	 * @param value the list_reparti
	 */
	public void setList_reparti(final Set<Reparto> value)
	{
		setList_reparti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to list_reparti. 
	 * @param value the item to add to list_reparti
	 */
	public void addToList_reparti(final SessionContext ctx, final Reparto value)
	{
		addLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to list_reparti. 
	 * @param value the item to add to list_reparti
	 */
	public void addToList_reparti(final Reparto value)
	{
		addToList_reparti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from list_reparti. 
	 * @param value the item to remove from list_reparti
	 */
	public void removeFromList_reparti(final SessionContext ctx, final Reparto value)
	{
		removeLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from list_reparti. 
	 * @param value the item to remove from list_reparti
	 */
	public void removeFromList_reparti(final Reparto value)
	{
		removeFromList_reparti( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.surnamePatient</code> attribute.
	 * @return the surnamePatient - Cognome Paziente
	 */
	public String getSurnamePatient(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAMEPATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.surnamePatient</code> attribute.
	 * @return the surnamePatient - Cognome Paziente
	 */
	public String getSurnamePatient()
	{
		return getSurnamePatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.surnamePatient</code> attribute. 
	 * @param value the surnamePatient - Cognome Paziente
	 */
	public void setSurnamePatient(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAMEPATIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.surnamePatient</code> attribute. 
	 * @param value the surnamePatient - Cognome Paziente
	 */
	public void setSurnamePatient(final String value)
	{
		setSurnamePatient( getSession().getSessionContext(), value );
	}
	
}
