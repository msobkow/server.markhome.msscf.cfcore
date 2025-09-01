// Description: Java 11 Instance Edit Object interface for CFGenKb GelCall.

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

public interface ICFGenKbGelCallEditObj
	extends ICFGenKbGelCallObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelCallObj.
	 */
	ICFGenKbGelCallObj getOrigAsGelCall();

	/**
	 *	Get the ICFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 *
	 *	@return	The ICFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 */
	ICFGenKbGelSequenceObj getOptionalParentSeqInst();

	/**
	 *	Set the ICFGenKbGelSequenceObj instance referenced by the SeqInst key.
	 *
	 *	@param	value	the ICFGenKbGelSequenceObj instance to be referenced by the SeqInst key.
	 */
	void setOptionalParentSeqInst( ICFGenKbGelSequenceObj value );

	/**
	 *	Get the ICFGenKbGelInstructionObj instance referenced by the CallInst key.
	 *
	 *	@return	The ICFGenKbGelInstructionObj instance referenced by the CallInst key.
	 */
	ICFGenKbGelInstructionObj getOptionalLookupCallInst();

	/**
	 *	Set the ICFGenKbGelInstructionObj instance referenced by the CallInst key.
	 *
	 *	@param	value	the ICFGenKbGelInstructionObj instance to be referenced by the CallInst key.
	 */
	void setOptionalLookupCallInst( ICFGenKbGelInstructionObj value );

	/**
	 *	Get the ICFGenKbGelCallObj instance referenced by the PrevInst key.
	 *
	 *	@return	The ICFGenKbGelCallObj instance referenced by the PrevInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupPrevInst();

	/**
	 *	Set the ICFGenKbGelCallObj instance referenced by the PrevInst key.
	 *
	 *	@param	value	the ICFGenKbGelCallObj instance to be referenced by the PrevInst key.
	 */
	void setOptionalLookupPrevInst( ICFGenKbGelCallObj value );

	/**
	 *	Get the ICFGenKbGelCallObj instance referenced by the NextInst key.
	 *
	 *	@return	The ICFGenKbGelCallObj instance referenced by the NextInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupNextInst();

	/**
	 *	Set the ICFGenKbGelCallObj instance referenced by the NextInst key.
	 *
	 *	@param	value	the ICFGenKbGelCallObj instance to be referenced by the NextInst key.
	 */
	void setOptionalLookupNextInst( ICFGenKbGelCallObj value );
}
