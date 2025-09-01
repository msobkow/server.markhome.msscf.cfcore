// Description: Java 11 Instance Edit Object interface for CFGenKb RuleCart.

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

public interface ICFGenKbRuleCartEditObj
	extends ICFGenKbRuleCartObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbRuleCartObj.
	 */
	ICFGenKbRuleCartObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbRuleCartObj.
	 */
	ICFGenKbRuleCartObj getOrigAsRuleCart();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbRuleCartObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbRuleCartEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbRuleCartEditObj deleteInstance();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

	/**
	 *	Get the optional String attribute Descr.
	 *
	 *	@return	The String value of the attribute Descr.
	 */
	String getOptionalDescr();

	/**
	 *	Set the optional String attribute Descr.
	 *
	 *	@param	value	the String value of the attribute Descr.
	 */
	void setOptionalDescr( String value );

	/**
	 *	Get the optional String attribute RevisionString.
	 *
	 *	@return	The String value of the attribute RevisionString.
	 */
	String getOptionalRevisionString();

	/**
	 *	Set the optional String attribute RevisionString.
	 *
	 *	@param	value	the String value of the attribute RevisionString.
	 */
	void setOptionalRevisionString( String value );

	/**
	 *	Get the ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The ICFGenKbTenantObj instance referenced by the Tenant key.
	 */
	ICFGenKbTenantObj getRequiredContainerTenant();

	/**
	 *	Set the ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@param	value	the ICFGenKbTenantObj instance to be referenced by the Tenant key.
	 */
	void setRequiredContainerTenant( ICFGenKbTenantObj value );
}
