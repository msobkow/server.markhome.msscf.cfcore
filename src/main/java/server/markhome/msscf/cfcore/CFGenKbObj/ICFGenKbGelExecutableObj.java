// Description: Java 11 Object interface for CFGenKb GelExecutable.

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

public interface ICFGenKbGelExecutableObj
	extends ICFGenKbGelSequenceObj
{
	/**
	 *	Get the current edition of this GelExecutable instance as a ICFGenKbGelExecutableEditObj.
	 *
	 *	@return	The ICFGenKbGelExecutableEditObj edition of this instance.
	 */
	ICFGenKbGelExecutableEditObj getEditAsGelExecutable();

	/**
	 *	Get the ICFGenKbGelExecutableTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelExecutableTableObj table cache which manages this instance.
	 */
	ICFGenKbGelExecutableTableObj getGelExecutableTable();

	/**
	 *	Get the CFGenKbGelExecutableBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelExecutableBuff instance which currently backs this object.
	 */
	CFGenKbGelExecutableBuff getGelExecutableBuff();

	/**
	 *	Get the required long attribute GenItemId.
	 *
	 *	@return	The required long attribute GenItemId.
	 */
	long getRequiredGenItemId();

	public void addCalledInstruction( ICFGenKbGelCacheObj gelCache, ICFGenKbGelInstructionObj calledInstruction );
	public String expand( MssCFGenContext genContext );
}
