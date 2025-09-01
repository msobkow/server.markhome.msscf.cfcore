// Description: Java 11 Object interface for CFGenKb GelPrefixLine.

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

public interface ICFGenKbGelPrefixLineObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelPrefixLine instance as a ICFGenKbGelPrefixLineEditObj.
	 *
	 *	@return	The ICFGenKbGelPrefixLineEditObj edition of this instance.
	 */
	ICFGenKbGelPrefixLineEditObj getEditAsGelPrefixLine();

	/**
	 *	Get the ICFGenKbGelPrefixLineTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelPrefixLineTableObj table cache which manages this instance.
	 */
	ICFGenKbGelPrefixLineTableObj getGelPrefixLineTable();

	/**
	 *	Get the CFGenKbGelPrefixLineBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelPrefixLineBuff instance which currently backs this object.
	 */
	CFGenKbGelPrefixLineBuff getGelPrefixLineBuff();

	/**
	 *	Get the required String attribute PrefixName.
	 *
	 *	@return	The required String attribute PrefixName.
	 */
	String getRequiredPrefixName();

	/**
	 *	Get the optional Long attribute RemainderTenantId.
	 *
	 *	@return	The optional Long attribute RemainderTenantId.
	 */
	Long getOptionalRemainderTenantId();

	/**
	 *	Get the required long attribute RemainderGelCacheId.
	 *
	 *	@return	The required long attribute RemainderGelCacheId.
	 */
	long getRequiredRemainderGelCacheId();

	/**
	 *	Get the optional Long attribute RemainderInstId.
	 *
	 *	@return	The optional Long attribute RemainderInstId.
	 */
	Long getOptionalRemainderInstId();

	/**
	 *	Get the optional ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@return	The optional ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 */
	ICFGenKbGelInstructionObj getOptionalLookupRemainder();

	/**
	 *	Get the optional ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 *
	 *	@return	The optional ICFGenKbGelInstructionObj instance referenced by the Remainder key.
	 */
	ICFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead );

}
