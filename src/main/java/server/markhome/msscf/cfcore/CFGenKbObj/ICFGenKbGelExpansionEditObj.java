// Description: Java 11 Instance Edit Object interface for CFGenKb GelExpansion.

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

public interface ICFGenKbGelExpansionEditObj
	extends ICFGenKbGelExpansionObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelExpansionObj.
	 */
	ICFGenKbGelExpansionObj getOrigAsGelExpansion();

	/**
	 *	Get the required String attribute MacroName.
	 *
	 *	@return	The String value of the attribute MacroName.
	 */
	String getRequiredMacroName();

	/**
	 *	Set the required String attribute MacroName.
	 *
	 *	@param	value	the String value of the attribute MacroName.
	 */
	void setRequiredMacroName( String value );
}
