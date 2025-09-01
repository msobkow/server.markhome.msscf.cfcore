// Description: Java 11 Instance Edit Object interface for CFGenKb GelConstrain.

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

public interface ICFGenKbGelConstrainEditObj
	extends ICFGenKbGelConstrainObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelConstrainObj.
	 */
	ICFGenKbGelConstrainObj getOrigAsGelConstrain();

	/**
	 *	Get the optional Long attribute HardConstraint.
	 *
	 *	@return	The Long value of the attribute HardConstraint.
	 */
	Long getOptionalHardConstraint();

	/**
	 *	Set the optional Long attribute HardConstraint.
	 *
	 *	@param	value	the Long value of the attribute HardConstraint.
	 */
	void setOptionalHardConstraint( Long value );

	/**
	 *	Get the optional String attribute ConstrainingName.
	 *
	 *	@return	The String value of the attribute ConstrainingName.
	 */
	String getOptionalConstrainingName();

	/**
	 *	Set the optional String attribute ConstrainingName.
	 *
	 *	@param	value	the String value of the attribute ConstrainingName.
	 */
	void setOptionalConstrainingName( String value );

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
