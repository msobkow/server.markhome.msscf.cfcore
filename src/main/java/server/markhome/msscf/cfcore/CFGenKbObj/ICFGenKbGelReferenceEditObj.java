// Description: Java 11 Instance Edit Object interface for CFGenKb GelReference.

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

public interface ICFGenKbGelReferenceEditObj
	extends ICFGenKbGelReferenceObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelReferenceObj.
	 */
	ICFGenKbGelReferenceObj getOrigAsGelReference();

	/**
	 *	Get the required String attribute ReferenceName.
	 *
	 *	@return	The String value of the attribute ReferenceName.
	 */
	String getRequiredReferenceName();

	/**
	 *	Set the required String attribute ReferenceName.
	 *
	 *	@param	value	the String value of the attribute ReferenceName.
	 */
	void setRequiredReferenceName( String value );

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
