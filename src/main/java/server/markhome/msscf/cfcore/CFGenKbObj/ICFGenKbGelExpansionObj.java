// Description: Java 11 Object interface for CFGenKb GelExpansion.

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

public interface ICFGenKbGelExpansionObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelExpansion instance as a ICFGenKbGelExpansionEditObj.
	 *
	 *	@return	The ICFGenKbGelExpansionEditObj edition of this instance.
	 */
	ICFGenKbGelExpansionEditObj getEditAsGelExpansion();

	/**
	 *	Get the ICFGenKbGelExpansionTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelExpansionTableObj table cache which manages this instance.
	 */
	ICFGenKbGelExpansionTableObj getGelExpansionTable();

	/**
	 *	Get the CFGenKbGelExpansionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelExpansionBuff instance which currently backs this object.
	 */
	CFGenKbGelExpansionBuff getGelExpansionBuff();

	/**
	 *	Get the required String attribute MacroName.
	 *
	 *	@return	The required String attribute MacroName.
	 */
	String getRequiredMacroName();

}
