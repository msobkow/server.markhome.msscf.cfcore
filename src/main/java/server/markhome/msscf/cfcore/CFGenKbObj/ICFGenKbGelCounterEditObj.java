// Description: Java 11 Instance Edit Object interface for CFGenKb GelCounter.

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

public interface ICFGenKbGelCounterEditObj
	extends ICFGenKbGelCounterObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelCounterObj.
	 */
	ICFGenKbGelCounterObj getOrigAsGelCounter();

	/**
	 *	Get the required String attribute CounterName.
	 *
	 *	@return	The String value of the attribute CounterName.
	 */
	String getRequiredCounterName();

	/**
	 *	Set the required String attribute CounterName.
	 *
	 *	@param	value	the String value of the attribute CounterName.
	 */
	void setRequiredCounterName( String value );
}
