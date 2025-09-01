// Description: Java 11 Instance Edit Object interface for CFGenKb GelExecutable.

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

public interface ICFGenKbGelExecutableEditObj
	extends ICFGenKbGelExecutableObj,
		ICFGenKbGelSequenceEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelExecutableObj.
	 */
	ICFGenKbGelExecutableObj getOrigAsGelExecutable();

	/**
	 *	Get the required long attribute GenItemId.
	 *
	 *	@return	The long value of the attribute GenItemId.
	 */
	long getRequiredGenItemId();

	/**
	 *	Set the required long attribute GenItemId.
	 *
	 *	@param	value	the long value of the attribute GenItemId.
	 */
	void setRequiredGenItemId( long value );
}
