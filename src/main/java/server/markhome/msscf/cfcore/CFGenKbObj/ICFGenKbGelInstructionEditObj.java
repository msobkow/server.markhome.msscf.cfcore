// Description: Java 11 Instance Edit Object interface for CFGenKb GelInstruction.

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

public interface ICFGenKbGelInstructionEditObj
	extends ICFGenKbGelInstructionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbGelInstructionObj.
	 */
	ICFGenKbGelInstructionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelInstructionObj.
	 */
	ICFGenKbGelInstructionObj getOrigAsGelInstruction();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbGelInstructionObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbGelInstructionEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbGelInstructionEditObj deleteInstance();

	/**
	 *	Get the required String attribute SourceText.
	 *
	 *	@return	The String value of the attribute SourceText.
	 */
	String getRequiredSourceText();

	/**
	 *	Set the required String attribute SourceText.
	 *
	 *	@param	value	the String value of the attribute SourceText.
	 */
	void setRequiredSourceText( String value );

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
	 *	Get the ICFGenKbGelCacheObj instance referenced by the GelCache key.
	 *
	 *	@return	The ICFGenKbGelCacheObj instance referenced by the GelCache key.
	 */
	ICFGenKbGelCacheObj getRequiredContainerGelCache();

	/**
	 *	Set the ICFGenKbGelCacheObj instance referenced by the GelCache key.
	 *
	 *	@param	value	the ICFGenKbGelCacheObj instance to be referenced by the GelCache key.
	 */
	void setRequiredContainerGelCache( ICFGenKbGelCacheObj value );

	/**
	 *	Get the ICFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 *
	 *	@return	The ICFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 */
	ICFGenKbGelInstructionObj getOptionalLookupChainInst();

	/**
	 *	Set the ICFGenKbGelInstructionObj instance referenced by the ChainInst key.
	 *
	 *	@param	value	the ICFGenKbGelInstructionObj instance to be referenced by the ChainInst key.
	 */
	void setOptionalLookupChainInst( ICFGenKbGelInstructionObj value );
}
