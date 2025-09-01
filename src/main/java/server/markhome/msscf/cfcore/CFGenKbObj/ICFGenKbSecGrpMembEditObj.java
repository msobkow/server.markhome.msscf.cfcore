// Description: Java 11 Instance Edit Object interface for CFGenKb SecGrpMemb.

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

public interface ICFGenKbSecGrpMembEditObj
	extends ICFGenKbSecGrpMembObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbSecGrpMembObj.
	 */
	ICFGenKbSecGrpMembObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbSecGrpMembObj.
	 */
	ICFGenKbSecGrpMembObj getOrigAsSecGrpMemb();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbSecGrpMembObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbSecGrpMembEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbSecGrpMembEditObj deleteInstance();

	/**
	 *	Get the ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ICFGenKbClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( ICFGenKbClusterObj value );

	/**
	 *	Get the ICFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFGenKbSecGroupObj instance referenced by the Group key.
	 */
	ICFGenKbSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFGenKbSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFGenKbSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFGenKbSecGroupObj value );

	/**
	 *	Get the ICFGenKbSecUserObj instance referenced by the User key.
	 *
	 *	@return	The ICFGenKbSecUserObj instance referenced by the User key.
	 */
	ICFGenKbSecUserObj getRequiredParentUser();

	/**
	 *	Set the ICFGenKbSecUserObj instance referenced by the User key.
	 *
	 *	@param	value	the ICFGenKbSecUserObj instance to be referenced by the User key.
	 */
	void setRequiredParentUser( ICFGenKbSecUserObj value );

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
