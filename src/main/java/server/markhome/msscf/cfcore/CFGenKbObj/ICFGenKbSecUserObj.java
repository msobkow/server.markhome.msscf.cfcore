// Description: Java 11 Object interface for CFGenKb SecUser.

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

public interface ICFGenKbSecUserObj
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
	 *	Realise this instance of a SecUser.
	 *
	 *	@return	CFGenKbSecUserObj instance which should be subsequently referenced.
	 */
	ICFGenKbSecUserObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecUserObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecUserObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbSecUserObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbSecUserObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecUser instance.
	 *
	 *	@return	The newly locked ICFGenKbSecUserEditObj edition of this instance.
	 */
	ICFGenKbSecUserEditObj beginEdit();

	/**
	 *	End this edition of this SecUser instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecUser instance.
	 *
	 *	@return	The ICFGenKbSecUserEditObj edition of this instance.
	 */
	ICFGenKbSecUserEditObj getEdit();

	/**
	 *	Get the current edition of this SecUser instance as a ICFGenKbSecUserEditObj.
	 *
	 *	@return	The ICFGenKbSecUserEditObj edition of this instance.
	 */
	ICFGenKbSecUserEditObj getEditAsSecUser();

	/**
	 *	Get the ICFGenKbSecUserTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbSecUserTableObj table cache which manages this instance.
	 */
	ICFGenKbSecUserTableObj getSecUserTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecUserBuff instance which currently backs this object.
	 */
	CFGenKbSecUserBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbSecUserBuff value );

	/**
	 *	Get the CFGenKbSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbSecUserBuff instance which currently backs this object.
	 */
	CFGenKbSecUserBuff getSecUserBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbSecUserPKey primary key for this instance.
	 */
	CFGenKbSecUserPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbSecUserPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbSecUserPKey value );

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
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The required String attribute LoginId.
	 */
	String getRequiredLoginId();

	/**
	 *	Get the required String attribute EMailAddress.
	 *
	 *	@return	The required String attribute EMailAddress.
	 */
	String getRequiredEMailAddress();

	/**
	 *	Get the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@return	The optional UUID attribute EMailConfirmUuid.
	 */
	UUID getOptionalEMailConfirmUuid();

	/**
	 *	Get the optional UUID attribute DfltDevUserId.
	 *
	 *	@return	The optional UUID attribute DfltDevUserId.
	 */
	UUID getOptionalDfltDevUserId();

	/**
	 *	Get the optional String attribute DfltDevName.
	 *
	 *	@return	The optional String attribute DfltDevName.
	 */
	String getOptionalDfltDevName();

	/**
	 *	Get the required String attribute PasswordHash.
	 *
	 *	@return	The required String attribute PasswordHash.
	 */
	String getRequiredPasswordHash();

	/**
	 *	Get the optional UUID attribute PasswordResetUuid.
	 *
	 *	@return	The optional UUID attribute PasswordResetUuid.
	 */
	UUID getOptionalPasswordResetUuid();

	/**
	 *	Get the array of optional ICFGenKbSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional ICFGenKbSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<ICFGenKbSecDeviceObj> getOptionalComponentsSecDev();

	/**
	 *	Get the array of optional ICFGenKbSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional ICFGenKbSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<ICFGenKbSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead );

	/**
	 *	Get the optional ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 */
	ICFGenKbSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Get the optional ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 */
	ICFGenKbSecDeviceObj getOptionalLookupDefDev( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional ICFGenKbSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<ICFGenKbSecSessionObj> getOptionalComponentsSecSess();

	/**
	 *	Get the array of optional ICFGenKbSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional ICFGenKbSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<ICFGenKbSecSessionObj> getOptionalComponentsSecSess( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional ICFGenKbSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<ICFGenKbSecSessionObj> getOptionalChildrenSecProxy();

	/**
	 *	Get the array of optional ICFGenKbSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional ICFGenKbSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<ICFGenKbSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional ICFGenKbSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<ICFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb();

	/**
	 *	Get the array of optional ICFGenKbSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional ICFGenKbSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<ICFGenKbSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional ICFGenKbTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<ICFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb();

	/**
	 *	Get the array of optional ICFGenKbTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional ICFGenKbTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<ICFGenKbTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
