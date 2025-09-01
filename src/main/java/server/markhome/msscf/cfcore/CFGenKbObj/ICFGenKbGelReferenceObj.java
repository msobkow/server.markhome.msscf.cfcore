// Description: Java 11 Object interface for CFGenKb GelReference.

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

public interface ICFGenKbGelReferenceObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelReference instance as a ICFGenKbGelReferenceEditObj.
	 *
	 *	@return	The ICFGenKbGelReferenceEditObj edition of this instance.
	 */
	ICFGenKbGelReferenceEditObj getEditAsGelReference();

	/**
	 *	Get the ICFGenKbGelReferenceTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelReferenceTableObj table cache which manages this instance.
	 */
	ICFGenKbGelReferenceTableObj getGelReferenceTable();

	/**
	 *	Get the CFGenKbGelReferenceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelReferenceBuff instance which currently backs this object.
	 */
	CFGenKbGelReferenceBuff getGelReferenceBuff();

	/**
	 *	Get the required String attribute ReferenceName.
	 *
	 *	@return	The required String attribute ReferenceName.
	 */
	String getRequiredReferenceName();

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
