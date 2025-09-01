// Description: Java 11 Object interface for CFGenKb GenBind.

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

public interface ICFGenKbGenBindObj
	extends ICFGenKbGenItemObj
{
	/**
	 *	Get the current edition of this GenBind instance as a ICFGenKbGenBindEditObj.
	 *
	 *	@return	The ICFGenKbGenBindEditObj edition of this instance.
	 */
	ICFGenKbGenBindEditObj getEditAsGenBind();

	/**
	 *	Get the ICFGenKbGenBindTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGenBindTableObj table cache which manages this instance.
	 */
	ICFGenKbGenBindTableObj getGenBindTable();

	/**
	 *	Get the CFGenKbGenBindBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGenBindBuff instance which currently backs this object.
	 */
	CFGenKbGenBindBuff getGenBindBuff();

}
