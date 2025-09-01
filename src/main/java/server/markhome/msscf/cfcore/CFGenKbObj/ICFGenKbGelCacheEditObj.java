// Description: Java 11 Instance Edit Object interface for CFGenKb GelCache.

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
import com.github.msobkow.cfcore.MssCF.MssCFEngine;
import com.github.msobkow.cfcore.MssCF.MssCFGenContext;

public interface ICFGenKbGelCacheEditObj
	extends ICFGenKbGelCacheObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbGelCacheObj.
	 */
	ICFGenKbGelCacheObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelCacheObj.
	 */
	ICFGenKbGelCacheObj getOrigAsGelCache();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbGelCacheObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbGelCacheEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbGelCacheEditObj deleteInstance();

	/**
	 *	Get the required String attribute CacheName.
	 *
	 *	@return	The String value of the attribute CacheName.
	 */
	String getRequiredCacheName();

	/**
	 *	Set the required String attribute CacheName.
	 *
	 *	@param	value	the String value of the attribute CacheName.
	 */
	void setRequiredCacheName( String value );

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
}
