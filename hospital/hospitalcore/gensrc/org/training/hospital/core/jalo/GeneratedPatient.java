/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-mar-2019 18.00.40                        ---
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
 * Generated class for type {@link org.training.hospital.core.jalo.Patient Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends Customer
{
	/** Qualifier of the <code>Patient.dateEntry</code> attribute **/
	public static final String DATEENTRY = "dateEntry";
	/** Qualifier of the <code>Patient.dateExit</code> attribute **/
	public static final String DATEEXIT = "dateExit";
	/** Qualifier of the <code>Patient.departaments</code> attribute **/
	public static final String DEPARTAMENTS = "departaments";
	/** Relation ordering override parameter constants for Patient2DepartmentRelation from ((hospitalcore))*/
	protected static String PATIENT2DEPARTMENTRELATION_SRC_ORDERED = "relation.Patient2DepartmentRelation.source.ordered";
	protected static String PATIENT2DEPARTMENTRELATION_TGT_ORDERED = "relation.Patient2DepartmentRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2DepartmentRelation from ((hospitalcore))*/
	protected static String PATIENT2DEPARTMENTRELATION_MARKMODIFIED = "relation.Patient2DepartmentRelation.markmodified";
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
		tmp.put(DATEENTRY, AttributeMode.INITIAL);
		tmp.put(DATEEXIT, AttributeMode.INITIAL);
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
	public Date getDateEntry(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateEntry</code> attribute.
	 * @return the dateEntry
	 */
	public Date getDateEntry()
	{
		return getDateEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateEntry</code> attribute. 
	 * @param value the dateEntry
	 */
	public void setDateEntry(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateEntry</code> attribute. 
	 * @param value the dateEntry
	 */
	public void setDateEntry(final Date value)
	{
		setDateEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateExit</code> attribute.
	 * @return the dateExit
	 */
	public Date getDateExit(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEEXIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateExit</code> attribute.
	 * @return the dateExit
	 */
	public Date getDateExit()
	{
		return getDateExit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateExit</code> attribute. 
	 * @param value the dateExit
	 */
	public void setDateExit(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEEXIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateExit</code> attribute. 
	 * @param value the dateExit
	 */
	public void setDateExit(final Date value)
	{
		setDateExit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.departaments</code> attribute.
	 * @return the departaments
	 */
	public List<Reparto> getDepartaments(final SessionContext ctx)
	{
		final List<Reparto> items = getLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2DEPARTMENTRELATION,
			"Reparto",
			null,
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_TGT_ORDERED, true)
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.departaments</code> attribute.
	 * @return the departaments
	 */
	public List<Reparto> getDepartaments()
	{
		return getDepartaments( getSession().getSessionContext() );
	}
	
	public long getDepartamentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2DEPARTMENTRELATION,
			"Reparto",
			null
		);
	}
	
	public long getDepartamentsCount()
	{
		return getDepartamentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.departaments</code> attribute. 
	 * @param value the departaments
	 */
	public void setDepartaments(final SessionContext ctx, final List<Reparto> value)
	{
		setLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2DEPARTMENTRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(PATIENT2DEPARTMENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.departaments</code> attribute. 
	 * @param value the departaments
	 */
	public void setDepartaments(final List<Reparto> value)
	{
		setDepartaments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departaments. 
	 * @param value the item to add to departaments
	 */
	public void addToDepartaments(final SessionContext ctx, final Reparto value)
	{
		addLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2DEPARTMENTRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(PATIENT2DEPARTMENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departaments. 
	 * @param value the item to add to departaments
	 */
	public void addToDepartaments(final Reparto value)
	{
		addToDepartaments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departaments. 
	 * @param value the item to remove from departaments
	 */
	public void removeFromDepartaments(final SessionContext ctx, final Reparto value)
	{
		removeLinkedItems( 
			ctx,
			true,
			HospitalCoreConstants.Relations.PATIENT2DEPARTMENTRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_SRC_ORDERED, true),
			Utilities.getRelationOrderingOverride(PATIENT2DEPARTMENTRELATION_TGT_ORDERED, true),
			Utilities.getMarkModifiedOverride(PATIENT2DEPARTMENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departaments. 
	 * @param value the item to remove from departaments
	 */
	public void removeFromDepartaments(final Reparto value)
	{
		removeFromDepartaments( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Reparto");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PATIENT2DEPARTMENTRELATION_MARKMODIFIED);
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
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_TGT_ORDERED, true)
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
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_TGT_ORDERED, true),
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
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_TGT_ORDERED, true),
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
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_TGT_ORDERED, true),
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
