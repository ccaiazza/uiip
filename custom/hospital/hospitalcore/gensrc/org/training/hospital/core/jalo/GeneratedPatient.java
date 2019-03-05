/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-mar-2019 17.32.23                         ---
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
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Reparto;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Customer Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends Customer
{
	/** Qualifier of the <code>Patient.entryDate</code> attribute **/
	public static final String ENTRYDATE = "entryDate";
	/** Qualifier of the <code>Patient.exitDate</code> attribute **/
	public static final String EXITDATE = "exitDate";
	/** Qualifier of the <code>Patient.departments</code> attribute **/
	public static final String DEPARTMENTS = "departments";
	/** Relation ordering override parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_SRC_ORDERED = "relation.Patient2RepartoRelation.source.ordered";
	protected static String PATIENT2REPARTORELATION_TGT_ORDERED = "relation.Patient2RepartoRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2RepartoRelation from ((hospitalcore))*/
	protected static String PATIENT2REPARTORELATION_MARKMODIFIED = "relation.Patient2RepartoRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Customer.DEFAULT_INITIAL_ATTRIBUTES);
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
	 * <i>Generated method</i> - Getter of the <code>Patient.departments</code> attribute.
	 * @return the departments
	 */
	public Set<Reparto> getDepartments(final SessionContext ctx)
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
	 * <i>Generated method</i> - Getter of the <code>Patient.departments</code> attribute.
	 * @return the departments
	 */
	public Set<Reparto> getDepartments()
	{
		return getDepartments( getSession().getSessionContext() );
	}
	
	public long getDepartmentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Reparto",
			null
		);
	}
	
	public long getDepartmentsCount()
	{
		return getDepartmentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final SessionContext ctx, final Set<Reparto> value)
	{
		new PartOfHandler<Set<Reparto>>()
		{
			@Override
			protected Set<Reparto> doGetValue(final SessionContext ctx)
			{
				return getDepartments( ctx );
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
	 * <i>Generated method</i> - Setter of the <code>Patient.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final Set<Reparto> value)
	{
		setDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departments. 
	 * @param value the item to add to departments
	 */
	public void addToDepartments(final SessionContext ctx, final Reparto value)
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
	 * <i>Generated method</i> - Adds <code>value</code> to departments. 
	 * @param value the item to add to departments
	 */
	public void addToDepartments(final Reparto value)
	{
		addToDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departments. 
	 * @param value the item to remove from departments
	 */
	public void removeFromDepartments(final SessionContext ctx, final Reparto value)
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
	 * <i>Generated method</i> - Removes <code>value</code> from departments. 
	 * @param value the item to remove from departments
	 */
	public void removeFromDepartments(final Reparto value)
	{
		removeFromDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.entryDate</code> attribute.
	 * @return the entryDate - Data Ingresso
	 */
	public Date getEntryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENTRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.entryDate</code> attribute.
	 * @return the entryDate - Data Ingresso
	 */
	public Date getEntryDate()
	{
		return getEntryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.entryDate</code> attribute. 
	 * @param value the entryDate - Data Ingresso
	 */
	public void setEntryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENTRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.entryDate</code> attribute. 
	 * @param value the entryDate - Data Ingresso
	 */
	public void setEntryDate(final Date value)
	{
		setEntryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate - Data uscita
	 */
	public Date getExitDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXITDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate - Data uscita
	 */
	public Date getExitDate()
	{
		return getExitDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate - Data uscita
	 */
	public void setExitDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXITDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate - Data uscita
	 */
	public void setExitDate(final Date value)
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
	
}
