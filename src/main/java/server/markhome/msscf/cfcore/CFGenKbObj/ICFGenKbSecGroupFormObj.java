// Description: Java 11 Object interface for CFGenKb SecGroupForm.

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

public interface ICFGenKbSecGroupFormObj
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
	 *	Realise this instance of a SecGroupForm.
	 *
	 *	@return	CFGenKbSecGroupFormObj instance which should be subsequently referenced.
	 */
	ICFGenKbSecGroupFormObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecGroupFormObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecGroupFormObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGroupForm instance.
	 *
	 *	@return	The newly locked ICFGenKbSecGroupFormEditObj edition of this instance.
	 */
	ICFGenKbSecGroupFormEditObj beginEdit();

	/**
	 *	End this edition of this SecGroupForm instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance.
	 *
	 *	@return	The ICFGenKbSecGroupFormEditObj edition of this instance.
	 */
	ICFGenKbSecGroupFormEditObj getEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance as a ICFGenKbSecGroupFormEditObj.
	 *
	 *	@return	The ICFGenKbSecGroupFormEditObj edition of this instance.
	 */
	ICFGenKbSecGroupFormEditObj getEditAsSecGroupForm();

	/**
	 *	Get the ICFGenKbSecGroupFormTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbSecGroupFormTableObj table cache which manages this instance.
	 */
	ICFGenKbSecGroupFormTableObj getSecGroupFormTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecGroupFormBuff instance which currently backs this object.
	 */
	CFGenKbSecGroupFormBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbSecGroupFormBuff value );

	/**
	 *	Get the CFGenKbSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecGroupFormBuff instance which currently backs this object.
	 */
	CFGenKbSecGroupFormBuff getSecGroupFormBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbSecGroupFormPKey primary key for this instance.
	 */
	CFGenKbSecGroupFormPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbSecGroupFormPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbSecGroupFormPKey value );

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
	 *	Get the required long attribute SecGroupFormId.
	 *
	 *	@return	The required long attribute SecGroupFormId.
	 */
	long getRequiredSecGroupFormId();

	/**
	 *	Get the required int attribute SecGroupId.
	 *
	 *	@return	The required int attribute SecGroupId.
	 */
	int getRequiredSecGroupId();

	/**
	 *	Get the required int attribute SecAppId.
	 *
	 *	@return	The required int attribute SecAppId.
	 */
	int getRequiredSecAppId();

	/**
	 *	Get the required int attribute SecFormId.
	 *
	 *	@return	The required int attribute SecFormId.
	 */
	int getRequiredSecFormId();

	/**
	 *	Get the required ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Get the required ICFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFGenKbSecGroupObj instance referenced by the Group key.
	 */
	ICFGenKbSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required ICFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFGenKbSecGroupObj instance referenced by the Group key.
	 */
	ICFGenKbSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required ICFGenKbSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required ICFGenKbSecAppObj instance referenced by the App key.
	 */
	ICFGenKbSecAppObj getRequiredParentApp();

	/**
	 *	Get the required ICFGenKbSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required ICFGenKbSecAppObj instance referenced by the App key.
	 */
	ICFGenKbSecAppObj getRequiredParentApp( boolean forceRead );

	/**
	 *	Get the required ICFGenKbSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required ICFGenKbSecFormObj instance referenced by the Form key.
	 */
	ICFGenKbSecFormObj getRequiredParentForm();

	/**
	 *	Get the required ICFGenKbSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required ICFGenKbSecFormObj instance referenced by the Form key.
	 */
	ICFGenKbSecFormObj getRequiredParentForm( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
