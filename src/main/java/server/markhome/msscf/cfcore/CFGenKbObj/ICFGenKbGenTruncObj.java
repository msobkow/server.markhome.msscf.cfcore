// Description: Java 11 Object interface for CFGenKb GenTrunc.

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
import server.markhome.msscf.cfcore.CFGenKb.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

public interface ICFGenKbGenTruncObj
	extends ICFGenKbGenRuleObj
{
	/**
	 *	Get the current edition of this GenTrunc instance as a ICFGenKbGenTruncEditObj.
	 *
	 *	@return	The ICFGenKbGenTruncEditObj edition of this instance.
	 */
	ICFGenKbGenTruncEditObj getEditAsGenTrunc();

	/**
	 *	Get the ICFGenKbGenTruncTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGenTruncTableObj table cache which manages this instance.
	 */
	ICFGenKbGenTruncTableObj getGenTruncTable();

	/**
	 *	Get the CFGenKbGenTruncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGenTruncBuff instance which currently backs this object.
	 */
	CFGenKbGenTruncBuff getGenTruncBuff();

	/**
	 *	Get the required int attribute TruncateAt.
	 *
	 *	@return	The required int attribute TruncateAt.
	 */
	int getRequiredTruncateAt();

}
