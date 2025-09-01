// Description: Java 11 Object interface for CFGenKb GelIterator.

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
import com.github.msobkow.cfcore.MssCF.*;

public interface ICFGenKbGelIteratorObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelIterator instance as a ICFGenKbGelIteratorEditObj.
	 *
	 *	@return	The ICFGenKbGelIteratorEditObj edition of this instance.
	 */
	ICFGenKbGelIteratorEditObj getEditAsGelIterator();

	/**
	 *	Get the ICFGenKbGelIteratorTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelIteratorTableObj table cache which manages this instance.
	 */
	ICFGenKbGelIteratorTableObj getGelIteratorTable();

	/**
	 *	Get the CFGenKbGelIteratorBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelIteratorBuff instance which currently backs this object.
	 */
	CFGenKbGelIteratorBuff getGelIteratorBuff();

	/**
	 *	Get the required String attribute IteratorName.
	 *
	 *	@return	The required String attribute IteratorName.
	 */
	String getRequiredIteratorName();

	/**
	 *	Get the optional String attribute ExpandBefore.
	 *
	 *	@return	The optional String attribute ExpandBefore.
	 */
	String getOptionalExpandBefore();

	/**
	 *	Get the optional String attribute ExpandFirst.
	 *
	 *	@return	The optional String attribute ExpandFirst.
	 */
	String getOptionalExpandFirst();

	/**
	 *	Get the required String attribute ExpandEach.
	 *
	 *	@return	The required String attribute ExpandEach.
	 */
	String getRequiredExpandEach();

	/**
	 *	Get the optional String attribute ExpandLast.
	 *
	 *	@return	The optional String attribute ExpandLast.
	 */
	String getOptionalExpandLast();

	/**
	 *	Get the optional String attribute ExpandLone.
	 *
	 *	@return	The optional String attribute ExpandLone.
	 */
	String getOptionalExpandLone();

	/**
	 *	Get the optional String attribute ExpandEmpty.
	 *
	 *	@return	The optional String attribute ExpandEmpty.
	 */
	String getOptionalExpandEmpty();

	/**
	 *	Get the optional String attribute ExpandAfter.
	 *
	 *	@return	The optional String attribute ExpandAfter.
	 */
	String getOptionalExpandAfter();

}
