// Description: Java 11 Object interface for CFGenKb GelSequence.

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

public interface ICFGenKbGelSequenceObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelSequence instance as a ICFGenKbGelSequenceEditObj.
	 *
	 *	@return	The ICFGenKbGelSequenceEditObj edition of this instance.
	 */
	ICFGenKbGelSequenceEditObj getEditAsGelSequence();

	/**
	 *	Get the ICFGenKbGelSequenceTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelSequenceTableObj table cache which manages this instance.
	 */
	ICFGenKbGelSequenceTableObj getGelSequenceTable();

	/**
	 *	Get the CFGenKbGelSequenceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelSequenceBuff instance which currently backs this object.
	 */
	CFGenKbGelSequenceBuff getGelSequenceBuff();

	/**
	 *	Get the optional Long attribute FirstInstTenantId.
	 *
	 *	@return	The optional Long attribute FirstInstTenantId.
	 */
	Long getOptionalFirstInstTenantId();

	/**
	 *	Get the optional Long attribute FirstInstGelCacheId.
	 *
	 *	@return	The optional Long attribute FirstInstGelCacheId.
	 */
	Long getOptionalFirstInstGelCacheId();

	/**
	 *	Get the optional Long attribute FirstInstId.
	 *
	 *	@return	The optional Long attribute FirstInstId.
	 */
	Long getOptionalFirstInstId();

	/**
	 *	Get the optional Long attribute LastInstTenantId.
	 *
	 *	@return	The optional Long attribute LastInstTenantId.
	 */
	Long getOptionalLastInstTenantId();

	/**
	 *	Get the optional Long attribute LastInstGelCacheId.
	 *
	 *	@return	The optional Long attribute LastInstGelCacheId.
	 */
	Long getOptionalLastInstGelCacheId();

	/**
	 *	Get the optional Long attribute LastInstId.
	 *
	 *	@return	The optional Long attribute LastInstId.
	 */
	Long getOptionalLastInstId();

	/**
	 *	Get the array of optional ICFGenKbGelCallObj array of instances referenced by the Calls key.
	 *
	 *	@return	The optional ICFGenKbGelCallObj[] array of instances referenced by the Calls key.
	 */
	List<ICFGenKbGelCallObj> getOptionalChildrenCalls();

	/**
	 *	Get the array of optional ICFGenKbGelCallObj array of instances referenced by the Calls key.
	 *
	 *	@return	The optional ICFGenKbGelCallObj[] array of instances referenced by the Calls key.
	 */
	List<ICFGenKbGelCallObj> getOptionalChildrenCalls( boolean forceRead );

	/**
	 *	Get the optional ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 *
	 *	@return	The optional ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupFirstInst();

	/**
	 *	Get the optional ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 *
	 *	@return	The optional ICFGenKbGelCallObj instance referenced by the FirstInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupFirstInst( boolean forceRead );

	/**
	 *	Get the optional ICFGenKbGelCallObj instance referenced by the LastInst key.
	 *
	 *	@return	The optional ICFGenKbGelCallObj instance referenced by the LastInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupLastInst();

	/**
	 *	Get the optional ICFGenKbGelCallObj instance referenced by the LastInst key.
	 *
	 *	@return	The optional ICFGenKbGelCallObj instance referenced by the LastInst key.
	 */
	ICFGenKbGelCallObj getOptionalLookupLastInst( boolean forceRead );

}
