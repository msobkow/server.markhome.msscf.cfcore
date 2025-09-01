// Description: Java 11 Object interface for CFGenKb SecGroup.

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

public interface ICFGenKbSecGroupObj
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
	 *	Realise this instance of a SecGroup.
	 *
	 *	@return	CFGenKbSecGroupObj instance which should be subsequently referenced.
	 */
	ICFGenKbSecGroupObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecGroupObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecGroupObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecGroupObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecGroupObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGroup instance.
	 *
	 *	@return	The newly locked ICFGenKbSecGroupEditObj edition of this instance.
	 */
	ICFGenKbSecGroupEditObj beginEdit();

	/**
	 *	End this edition of this SecGroup instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGroup instance.
	 *
	 *	@return	The ICFGenKbSecGroupEditObj edition of this instance.
	 */
	ICFGenKbSecGroupEditObj getEdit();

	/**
	 *	Get the current edition of this SecGroup instance as a ICFGenKbSecGroupEditObj.
	 *
	 *	@return	The ICFGenKbSecGroupEditObj edition of this instance.
	 */
	ICFGenKbSecGroupEditObj getEditAsSecGroup();

	/**
	 *	Get the ICFGenKbSecGroupTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbSecGroupTableObj table cache which manages this instance.
	 */
	ICFGenKbSecGroupTableObj getSecGroupTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecGroupBuff instance which currently backs this object.
	 */
	CFGenKbSecGroupBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbSecGroupBuff value );

	/**
	 *	Get the CFGenKbSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecGroupBuff instance which currently backs this object.
	 */
	CFGenKbSecGroupBuff getSecGroupBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbSecGroupPKey primary key for this instance.
	 */
	CFGenKbSecGroupPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbSecGroupPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbSecGroupPKey value );

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
	 *	Get the required int attribute SecGroupId.
	 *
	 *	@return	The required int attribute SecGroupId.
	 */
	int getRequiredSecGroupId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required boolean attribute IsVisible.
	 *
	 *	@return	The required boolean attribute IsVisible.
	 */
	boolean getRequiredIsVisible();

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
	 *	Get the array of optional ICFGenKbSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional ICFGenKbSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<ICFGenKbSecGrpIncObj> getOptionalComponentsInclude();

	/**
	 *	Get the array of optional ICFGenKbSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional ICFGenKbSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<ICFGenKbSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional ICFGenKbSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<ICFGenKbSecGrpMembObj> getOptionalComponentsMember();

	/**
	 *	Get the array of optional ICFGenKbSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional ICFGenKbSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<ICFGenKbSecGrpMembObj> getOptionalComponentsMember( boolean forceRead );

	/**
	 *	Get the array of required ICFGenKbSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required ICFGenKbSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<ICFGenKbSecGrpIncObj> getRequiredChildrenIncByGroup();

	/**
	 *	Get the array of required ICFGenKbSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required ICFGenKbSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<ICFGenKbSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbSecGroupFormObj array of instances referenced by the Form key.
	 *
	 *	@return	The optional ICFGenKbSecGroupFormObj[] array of instances referenced by the Form key.
	 */
	List<ICFGenKbSecGroupFormObj> getOptionalComponentsForm();

	/**
	 *	Get the array of optional ICFGenKbSecGroupFormObj array of instances referenced by the Form key.
	 *
	 *	@return	The optional ICFGenKbSecGroupFormObj[] array of instances referenced by the Form key.
	 */
	List<ICFGenKbSecGroupFormObj> getOptionalComponentsForm( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
