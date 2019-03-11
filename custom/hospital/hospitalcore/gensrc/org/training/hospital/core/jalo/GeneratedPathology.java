/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-mar-2019 10.26.05                        ---
 * ----------------------------------------------------------------
 */
package org.training.hospital.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.hospital.core.constants.HospitalCoreConstants;
import org.training.hospital.core.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Pathology}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPathology extends GenericItem
{
	/** Qualifier of the <code>Pathology.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Pathology.patients</code> attribute **/
	public static final String PATIENTS = "patients";
	/** Relation ordering override parameter constants for Patient2PathologyRelation from ((hospitalcore))*/
	protected static String PATIENT2PATHOLOGYRELATION_SRC_ORDERED = "relation.Patient2PathologyRelation.source.ordered";
	protected static String PATIENT2PATHOLOGYRELATION_TGT_ORDERED = "relation.Patient2PathologyRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Patient2PathologyRelation from ((hospitalcore))*/
	protected static String PATIENT2PATHOLOGYRELATION_MARKMODIFIED = "relation.Patient2PathologyRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Patient");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Pathology.name</code> attribute.
	 * @return the name - Pathology Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Pathology.name</code> attribute.
	 * @return the name - Pathology Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Pathology.name</code> attribute. 
	 * @param value the name - Pathology Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Pathology.name</code> attribute. 
	 * @param value the name - Pathology Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Pathology.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients(final SessionContext ctx)
	{
		final List<Patient> items = getLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			"Patient",
			null,
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Pathology.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients()
	{
		return getPatients( getSession().getSessionContext() );
	}
	
	public long getPatientsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			"Patient",
			null
		);
	}
	
	public long getPatientsCount()
	{
		return getPatientsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Pathology.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final SessionContext ctx, final Collection<Patient> value)
	{
		setLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Pathology.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final Collection<Patient> value)
	{
		setPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final SessionContext ctx, final Patient value)
	{
		addLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final Patient value)
	{
		addToPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final SessionContext ctx, final Patient value)
	{
		removeLinkedItems( 
			ctx,
			false,
			HospitalCoreConstants.Relations.PATIENT2PATHOLOGYRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(PATIENT2PATHOLOGYRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(PATIENT2PATHOLOGYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final Patient value)
	{
		removeFromPatients( getSession().getSessionContext(), value );
	}
	
}
