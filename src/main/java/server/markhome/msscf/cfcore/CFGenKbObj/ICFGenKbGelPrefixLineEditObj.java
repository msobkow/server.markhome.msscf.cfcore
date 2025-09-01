// Description: Java 11 Instance Edit Object interface for CFGenKb GelPrefixLine.

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

public interface ICFGenKbGelPrefixLineEditObj
	extends ICFGenKbGelPrefixLineObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelPrefixLineObj.
	 */
	ICFGenKbGelPrefixLineObj getOrigAsGelPrefixLine();

	/**
	 *	Get the required String attribute PrefixName.
	 *
	 *	@return	The String value of the attribute PrefixName.
	 */
	String getRequiredPrefixName();

	/**
	 *	Set the required String attribute PrefixName.
	 *
	 *	@param	value	the String value of the attribute PrefixName.
	 */
	void setRequiredPrefixName( String value );

	/**
	 *	Get the ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@return	The ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 */
	ICFGenKbGelInstructionObj getOptionalLookupRemainder();

	/**
	 *	Set the ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@param	value	the ICFGenKbGelInstructionObj instance to be referenced by the Remainder key.
	 */
	void setOptionalLookupRemainder( ICFGenKbGelInstructionObj value );
}
