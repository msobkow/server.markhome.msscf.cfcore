// Description: Java 11 Instance Edit Object interface for CFGenKb Tool.

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

public interface ICFGenKbToolEditObj
	extends ICFGenKbToolObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbToolObj.
	 */
	ICFGenKbToolObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbToolObj.
	 */
	ICFGenKbToolObj getOrigAsTool();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbToolObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbToolEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbToolEditObj deleteInstance();

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
	 *	Get the required boolean attribute IsSupported.
	 *
	 *	@return	The boolean value of the attribute IsSupported.
	 */
	boolean getRequiredIsSupported();

	/**
	 *	Set the required boolean attribute IsSupported.
	 *
	 *	@param	value	the boolean value of the attribute IsSupported.
	 */
	void setRequiredIsSupported( boolean value );

	/**
	 *	Get the ICFGenKbToolObj instance referenced by the Replaces key.
	 *
	 *	@return	The ICFGenKbToolObj instance referenced by the Replaces key.
	 */
	ICFGenKbToolObj getOptionalLookupReplaces();

	/**
	 *	Set the ICFGenKbToolObj instance referenced by the Replaces key.
	 *
	 *	@param	value	the ICFGenKbToolObj instance to be referenced by the Replaces key.
	 */
	void setOptionalLookupReplaces( ICFGenKbToolObj value );
}
