// Description: Java 11 Instance Edit Object interface for CFGenKb GelSequence.

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

public interface ICFGenKbGelSequenceEditObj
	extends ICFGenKbGelSequenceObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelSequenceObj.
	 */
	ICFGenKbGelSequenceObj getOrigAsGelSequence();

	/**
	 *	Get the ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 *
	 *	@return	The ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupFirstInst();

	/**
	 *	Set the ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 *
	 *	@param	value	the ICFGenKbGelCallObj instance to be referenced by the FirstInst key.
	 */
	void setOptionalLookupFirstInst( ICFGenKbGelCallObj value );

	/**
	 *	Get the ICFGenKbGelCallObj instance referenced by the LastInst key.
	 *
	 *	@return	The ICFGenKbGelCallObj instance referenced by the LastInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupLastInst();

	/**
	 *	Set the ICFGenKbGelCallObj instance referenced by the LastInst key.
	 *
	 *	@param	value	the ICFGenKbGelCallObj instance to be referenced by the LastInst key.
	 */
	void setOptionalLookupLastInst( ICFGenKbGelCallObj value );
}
