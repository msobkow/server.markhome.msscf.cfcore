// Description: Java 11 Object interface for CFGenKb GelCounter.

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
import com.github.msobkow.cfcore.MssCF.MssCFEngine;
import com.github.msobkow.cfcore.MssCF.MssCFGenContext;

public interface ICFGenKbGelCounterObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelCounter instance as a ICFGenKbGelCounterEditObj.
	 *
	 *	@return	The ICFGenKbGelCounterEditObj edition of this instance.
	 */
	ICFGenKbGelCounterEditObj getEditAsGelCounter();

	/**
	 *	Get the ICFGenKbGelCounterTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelCounterTableObj table cache which manages this instance.
	 */
	ICFGenKbGelCounterTableObj getGelCounterTable();

	/**
	 *	Get the CFGenKbGelCounterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelCounterBuff instance which currently backs this object.
	 */
	CFGenKbGelCounterBuff getGelCounterBuff();

	/**
	 *	Get the required String attribute CounterName.
	 *
	 *	@return	The required String attribute CounterName.
	 */
	String getRequiredCounterName();

}
