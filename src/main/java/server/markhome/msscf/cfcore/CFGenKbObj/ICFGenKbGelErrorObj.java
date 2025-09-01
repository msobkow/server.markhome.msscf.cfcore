// Description: Java 11 Object interface for CFGenKb GelError.

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

public interface ICFGenKbGelErrorObj
	extends ICFGenKbGelBoilerplateObj
{
	/**
	 *	Get the current edition of this GelError instance as a ICFGenKbGelErrorEditObj.
	 *
	 *	@return	The ICFGenKbGelErrorEditObj edition of this instance.
	 */
	ICFGenKbGelErrorEditObj getEditAsGelError();

	/**
	 *	Get the ICFGenKbGelErrorTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelErrorTableObj table cache which manages this instance.
	 */
	ICFGenKbGelErrorTableObj getGelErrorTable();

	/**
	 *	Get the CFGenKbGelErrorBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelErrorBuff instance which currently backs this object.
	 */
	CFGenKbGelErrorBuff getGelErrorBuff();

}
