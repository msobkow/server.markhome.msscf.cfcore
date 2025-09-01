// Description: Java 11 Object interface for CFGenKb Tenant.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import server.markhome.msscf.cfcore.CFGenKb.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

public interface ICFGenKbTenantObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFGenKbSecUserObj instance who created this instance.
	 */
	ICFGenKbSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFGenKbSecUserObj instance who updated this instance.
	 */
	ICFGenKbSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a Tenant.
	 *
	 *	@return	CFGenKbTenantObj instance which should be subsequently referenced.
	 */
	ICFGenKbTenantObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbTenantObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbTenantObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbTenantObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbTenantObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tenant instance.
	 *
	 *	@return	The newly locked ICFGenKbTenantEditObj edition of this instance.
	 */
	ICFGenKbTenantEditObj beginEdit();

	/**
	 *	End this edition of this Tenant instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tenant instance.
	 *
	 *	@return	The ICFGenKbTenantEditObj edition of this instance.
	 */
	ICFGenKbTenantEditObj getEdit();

	/**
	 *	Get the current edition of this Tenant instance as a ICFGenKbTenantEditObj.
	 *
	 *	@return	The ICFGenKbTenantEditObj edition of this instance.
	 */
	ICFGenKbTenantEditObj getEditAsTenant();

	/**
	 *	Get the ICFGenKbTenantTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbTenantTableObj table cache which manages this instance.
	 */
	ICFGenKbTenantTableObj getTenantTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbTenantBuff instance which currently backs this object.
	 */
	CFGenKbTenantBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbTenantBuff value );

	/**
	 *	Get the CFGenKbTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbTenantBuff instance which currently backs this object.
	 */
	CFGenKbTenantBuff getTenantBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbTenantPKey primary key for this instance.
	 */
	CFGenKbTenantPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbTenantPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbTenantPKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

	/**
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required String attribute TenantName.
	 *
	 *	@return	The required String attribute TenantName.
	 */
	String getRequiredTenantName();

	/**
	 *	Get the required ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional ICFGenKbTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<ICFGenKbTSecGroupObj> getOptionalComponentsTSecGroup();

	/**
	 *	Get the array of optional ICFGenKbTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional ICFGenKbTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<ICFGenKbTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbRuleCartObj array of instances referenced by the RuleCart key.
	 *
	 *	@return	The optional ICFGenKbRuleCartObj[] array of instances referenced by the RuleCart key.
	 */
	List<ICFGenKbRuleCartObj> getOptionalComponentsRuleCart();

	/**
	 *	Get the array of optional ICFGenKbRuleCartObj array of instances referenced by the RuleCart key.
	 *
	 *	@return	The optional ICFGenKbRuleCartObj[] array of instances referenced by the RuleCart key.
	 */
	List<ICFGenKbRuleCartObj> getOptionalComponentsRuleCart( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
