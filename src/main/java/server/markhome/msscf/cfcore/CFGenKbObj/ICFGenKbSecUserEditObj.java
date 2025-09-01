// Description: Java 11 Instance Edit Object interface for CFGenKb SecUser.

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
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

public interface ICFGenKbSecUserEditObj
	extends ICFGenKbSecUserObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbSecUserObj.
	 */
	ICFGenKbSecUserObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbSecUserObj.
	 */
	ICFGenKbSecUserObj getOrigAsSecUser();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbSecUserObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbSecUserEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbSecUserEditObj deleteInstance();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The String value of the attribute LoginId.
	 */
	String getRequiredLoginId();

	/**
	 *	Set the required String attribute LoginId.
	 *
	 *	@param	value	the String value of the attribute LoginId.
	 */
	void setRequiredLoginId( String value );

	/**
	 *	Get the required String attribute EMailAddress.
	 *
	 *	@return	The String value of the attribute EMailAddress.
	 */
	String getRequiredEMailAddress();

	/**
	 *	Set the required String attribute EMailAddress.
	 *
	 *	@param	value	the String value of the attribute EMailAddress.
	 */
	void setRequiredEMailAddress( String value );

	/**
	 *	Get the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@return	The UUID value of the attribute EMailConfirmUuid.
	 */
	UUID getOptionalEMailConfirmUuid();

	/**
	 *	Set the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@param	value	the UUID value of the attribute EMailConfirmUuid.
	 */
	void setOptionalEMailConfirmUuid( UUID value );

	/**
	 *	Get the required String attribute PasswordHash.
	 *
	 *	@return	The String value of the attribute PasswordHash.
	 */
	String getRequiredPasswordHash();

	/**
	 *	Set the required String attribute PasswordHash.
	 *
	 *	@param	value	the String value of the attribute PasswordHash.
	 */
	void setRequiredPasswordHash( String value );

	/**
	 *	Get the optional UUID attribute PasswordResetUuid.
	 *
	 *	@return	The UUID value of the attribute PasswordResetUuid.
	 */
	UUID getOptionalPasswordResetUuid();

	/**
	 *	Set the optional UUID attribute PasswordResetUuid.
	 *
	 *	@param	value	the UUID value of the attribute PasswordResetUuid.
	 */
	void setOptionalPasswordResetUuid( UUID value );

	/**
	 *	Get the ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 */
	ICFGenKbSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Set the ICFGenKbSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@param	value	the ICFGenKbSecDeviceObj instance to be referenced by the DefDev key.
	 */
	void setOptionalLookupDefDev( ICFGenKbSecDeviceObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFGenKbSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFGenKbSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
