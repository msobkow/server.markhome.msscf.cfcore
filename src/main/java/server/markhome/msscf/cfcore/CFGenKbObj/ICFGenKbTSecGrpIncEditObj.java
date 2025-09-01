// Description: Java 11 Instance Edit Object interface for CFGenKb TSecGrpInc.

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

public interface ICFGenKbTSecGrpIncEditObj
	extends ICFGenKbTSecGrpIncObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbTSecGrpIncObj.
	 */
	ICFGenKbTSecGrpIncObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbTSecGrpIncObj.
	 */
	ICFGenKbTSecGrpIncObj getOrigAsTSecGrpInc();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbTSecGrpIncObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbTSecGrpIncEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbTSecGrpIncEditObj deleteInstance();

	/**
	 *	Get the ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFGenKbTenantObj instance referenced by the Tenant key.
	 */
	ICFGenKbTenantObj getRequiredOwnerTenant();

	/**
	 *	Set the ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFGenKbTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredOwnerTenant( ICFGenKbTenantObj value );

	/**
	 *	Get the ICFGenKbTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFGenKbTSecGroupObj instance referenced by the Group key.
	 */
	ICFGenKbTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFGenKbTSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFGenKbTSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFGenKbTSecGroupObj value );

	/**
	 *	Get the ICFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The ICFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFGenKbTSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Set the ICFGenKbTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@param	value	the ICFGenKbTSecGroupObj instance to be referenced by the SubGroup key.
	 */
	void setRequiredParentSubGroup( ICFGenKbTSecGroupObj value );

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
