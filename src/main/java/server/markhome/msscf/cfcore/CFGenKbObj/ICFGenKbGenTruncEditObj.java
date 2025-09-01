// Description: Java 11 Instance Edit Object interface for CFGenKb GenTrunc.

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

public interface ICFGenKbGenTruncEditObj
	extends ICFGenKbGenTruncObj,
		ICFGenKbGenRuleEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGenTruncObj.
	 */
	ICFGenKbGenTruncObj getOrigAsGenTrunc();

	/**
	 *	Get the required int attribute TruncateAt.
	 *
	 *	@return	The int value of the attribute TruncateAt.
	 */
	int getRequiredTruncateAt();

	/**
	 *	Set the required int attribute TruncateAt.
	 *
	 *	@param	value	the int value of the attribute TruncateAt.
	 */
	void setRequiredTruncateAt( int value );
}
