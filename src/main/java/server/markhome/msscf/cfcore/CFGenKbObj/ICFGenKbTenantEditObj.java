// Description: Java 11 Instance Edit Object interface for CFGenKb Tenant.

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

public interface ICFGenKbTenantEditObj
	extends ICFGenKbTenantObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbTenantObj.
	 */
	ICFGenKbTenantObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbTenantObj.
	 */
	ICFGenKbTenantObj getOrigAsTenant();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbTenantObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbTenantEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbTenantEditObj deleteInstance();

	/**
	 *	Get the required String attribute TenantName.
	 *
	 *	@return	The String value of the attribute TenantName.
	 */
	String getRequiredTenantName();

	/**
	 *	Set the required String attribute TenantName.
	 *
	 *	@param	value	the String value of the attribute TenantName.
	 */
	void setRequiredTenantName( String value );

	/**
	 *	Get the ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ICFGenKbClusterObj instance referenced by the Cluster key.
	 */
	ICFGenKbClusterObj getRequiredContainerCluster();

	/**
	 *	Set the ICFGenKbClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ICFGenKbClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredContainerCluster( ICFGenKbClusterObj value );

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
