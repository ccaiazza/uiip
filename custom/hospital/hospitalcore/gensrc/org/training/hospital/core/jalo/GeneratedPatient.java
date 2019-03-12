/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12-mar-2019 12.39.59                        ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Pathology;
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
	/** Qualifier of the <code>Patient.pathologies</code> attribute **/
	public static final String PATHOLOGIES = "pathologies";
	/** Relation ordering override parameter constants for Patient2PathologyRelation from ((hospitalcore))*/
	protected static String PATIENT2PATHOLOGYRELATION_SRC_ORDERED = "relation.Patient2PathologyRelation.source.ordered";
	protected static String PATIENT2PATHOLOGYRELATION_TGT_ORDERED = "relation.Patient2PathologyRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2PathologyRelation from ((hospitalcore))*/
	protected static String PATIENT2PATHOLOGYRELATION_MARKMODIFIED = "relation.Patient2PathologyRelation.markmodified";
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
	public List<Reparto> getDepartments(final SessionContext ctx)
	{
		final List<Reparto> items = getLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			"Reparto",
			null,
			Utilities.getRelationOrderingOverride(PATIENT2REPARTORELATION_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.departments</code> attribute.
	 * @return the departments
	 */
	public List<Reparto> getDepartments()
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
	public void setDepartments(final SessionContext ctx, final List<Reparto> value)
	{
		setLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2REPARTORELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(PATIENT2REPARTORELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final List<Reparto> value)
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
			Utilities.getRelationOrderingOverride(PATIENT2REPARTORELATION_SRC_ORDERED, true),
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
			Utilities.getRelationOrderingOverride(PATIENT2REPARTORELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2REPARTORELATION_MARKMODIFIED)
		);
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
	 * @return the entryDate - Patient Entry Date
	 */
	public Date getEntryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENTRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.entryDate</code> attribute.
	 * @return the entryDate - Patient Entry Date
	 */
	public Date getEntryDate()
	{
		return getEntryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.entryDate</code> attribute. 
	 * @param value the entryDate - Patient Entry Date
	 */
	public void setEntryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENTRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.entryDate</code> attribute. 
	 * @param value the entryDate - Patient Entry Date
	 */
	public void setEntryDate(final Date value)
	{
		setEntryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate - Patient Exit Date
	 */
	public Date getExitDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXITDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate - Patient Exit Date
	 */
	public Date getExitDate()
	{
		return getExitDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate - Patient Exit Date
	 */
	public void setExitDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXITDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate - Patient Exit Date
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
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Pathology");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.pathologies</code> attribute.
	 * @return the pathologies
	 */
	public List<Pathology> getPathologies(final SessionContext ctx)
	{
		final List<Pathology> items = getLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			"Pathology",
			null,
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.pathologies</code> attribute.
	 * @return the pathologies
	 */
	public List<Pathology> getPathologies()
	{
		return getPathologies( getSession().getSessionContext() );
	}
	
	public long getPathologiesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			"Pathology",
			null
		);
	}
	
	public long getPathologiesCount()
	{
		return getPathologiesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.pathologies</code> attribute. 
	 * @param value the pathologies
	 */
	public void setPathologies(final SessionContext ctx, final List<Pathology> value)
	{
		setLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.pathologies</code> attribute. 
	 * @param value the pathologies
	 */
	public void setPathologies(final List<Pathology> value)
	{
		setPathologies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pathologies. 
	 * @param value the item to add to pathologies
	 */
	public void addToPathologies(final SessionContext ctx, final Pathology value)
	{
		addLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pathologies. 
	 * @param value the item to add to pathologies
	 */
	public void addToPathologies(final Pathology value)
	{
		addToPathologies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pathologies. 
	 * @param value the item to remove from pathologies
	 */
	public void removeFromPathologies(final SessionContext ctx, final Pathology value)
	{
		removeLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pathologies. 
	 * @param value the item to remove from pathologies
	 */
	public void removeFromPathologies(final Pathology value)
	{
		removeFromPathologies( getSession().getSessionContext(), value );
	}
	
}
