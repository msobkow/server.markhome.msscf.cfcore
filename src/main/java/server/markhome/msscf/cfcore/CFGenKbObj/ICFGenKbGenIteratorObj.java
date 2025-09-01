// Description: Java 11 Object interface for CFGenKb GenIterator.

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

public interface ICFGenKbGenIteratorObj
	extends ICFGenKbGenItemObj
{
	/**
	 *	Get the current edition of this GenIterator instance as a ICFGenKbGenIteratorEditObj.
	 *
	 *	@return	The ICFGenKbGenIteratorEditObj edition of this instance.
	 */
	ICFGenKbGenIteratorEditObj getEditAsGenIterator();

	/**
	 *	Get the ICFGenKbGenIteratorTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGenIteratorTableObj table cache which manages this instance.
	 */
	ICFGenKbGenIteratorTableObj getGenIteratorTable();

	/**
	 *	Get the CFGenKbGenIteratorBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGenIteratorBuff instance which currently backs this object.
	 */
	CFGenKbGenIteratorBuff getGenIteratorBuff();

}
