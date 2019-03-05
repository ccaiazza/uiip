/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-mar-2019 12.59.24                         ---
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
 * Generated class for type {@link org.training.hospital.core.jalo.Patient Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends User
{
	/** Qualifier of the <code>Patient.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Patient.dateEntry</code> attribute **/
	public static final String DATEENTRY = "dateEntry";
	/** Qualifier of the <code>Patient.reparti</code> attribute **/
	public static final String REPARTI = "reparti";
	/** Relation ordering override parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_SRC_ORDERED = "relation.Patient2RepartoRelation.source.ordered";
	protected static String PATIENT2REPARTORELATION_TGT_ORDERED = "relation.Patient2RepartoRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_MARKMODIFIED = "relation.Patient2RepartoRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(User.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(DATEENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateEntry</code> attribute.
	 * @return the dateEntry
	 */
	public String getDateEntry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DATEENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateEntry</code> attribute.
	 * @return the dateEntry
	 */
	public String getDateEntry()
	{
		return getDateEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateEntry</code> attribute. 
	 * @param value the dateEntry
	 */
	public void setDateEntry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DATEENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateEntry</code> attribute. 
	 * @param value the dateEntry
	 */
	public void setDateEntry(final String value)
	{
		setDateEntry( getSession().getSessionContext(), value );
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
	 * <i>Generated method</i> - Getter of the <code>Patient.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.reparti</code> attribute.
	 * @return the reparti
	 */
	public Set<Reparto> getReparti(final SessionContext ctx)
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
	 * <i>Generated method</i> - Getter of the <code>Patient.reparti</code> attribute.
	 * @return the reparti
	 */
	public Set<Reparto> getReparti()
	{
		return getReparti( getSession().getSessionContext() );
	}
	
	public long getRepartiCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Reparto",
			null
		);
	}
	
	public long getRepartiCount()
	{
		return getRepartiCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.reparti</code> attribute. 
	 * @param value the reparti
	 */
	public void setReparti(final SessionContext ctx, final Set<Reparto> value)
	{
		new PartOfHandler<Set<Reparto>>()
		{
			@Override
			protected Set<Reparto> doGetValue(final SessionContext ctx)
			{
				return getReparti( ctx );
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
	 * <i>Generated method</i> - Setter of the <code>Patient.reparti</code> attribute. 
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
	 * <i>Generated method</i> - Removes <code>value</code> from reparti. 
	 * @param value the item to remove from reparti
	 */
	public void removeFromReparti(final Reparto value)
	{
		removeFromReparti( getSession().getSessionContext(), value );
	}
	
}
