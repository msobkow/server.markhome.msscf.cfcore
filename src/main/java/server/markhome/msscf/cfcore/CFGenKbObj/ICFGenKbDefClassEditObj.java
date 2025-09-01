// Description: Java 11 Instance Edit Object interface for CFGenKb DefClass.

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

public interface ICFGenKbDefClassEditObj
	extends ICFGenKbDefClassObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbDefClassObj.
	 */
	ICFGenKbDefClassObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbDefClassObj.
	 */
	ICFGenKbDefClassObj getOrigAsDefClass();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbDefClassObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbDefClassEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbDefClassEditObj deleteInstance();

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
	 *	Get the ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 *
	 *	@return	The ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 */
	ICFGenKbDefClassObj getOptionalParentBaseDefClass();

	/**
	 *	Set the ICFGenKbDefClassObj instance referenced by the BaseDefClass key.
	 *
	 *	@param	value	the ICFGenKbDefClassObj instance to be referenced by the BaseDefClass key.
	 */
	void setOptionalParentBaseDefClass( ICFGenKbDefClassObj value );
}
