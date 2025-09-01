// Description: Java 11 Instance Edit Object interface for CFGenKb GenRule.

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

public interface ICFGenKbGenRuleEditObj
	extends ICFGenKbGenRuleObj,
		ICFGenKbGenItemEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGenRuleObj.
	 */
	ICFGenKbGenRuleObj getOrigAsGenRule();

	/**
	 *	Get the required String attribute DefinedNear.
	 *
	 *	@return	The String value of the attribute DefinedNear.
	 */
	String getRequiredDefinedNear();

	/**
	 *	Set the required String attribute DefinedNear.
	 *
	 *	@param	value	the String value of the attribute DefinedNear.
	 */
	void setRequiredDefinedNear( String value );

	/**
	 *	Get the required String attribute Body.
	 *
	 *	@return	The String value of the attribute Body.
	 */
	String getRequiredBody();

	/**
	 *	Set the required String attribute Body.
	 *
	 *	@param	value	the String value of the attribute Body.
	 */
	void setRequiredBody( String value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsBodyGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the BodyGel key.
	 */
	void setOptionalComponentsBodyGel( ICFGenKbGelExecutableObj value );
}
