// Description: Java 11 Object interface for CFGenKb GenRule.

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
import com.github.msobkow.cfcore.MssCF.MssCFGelCompiler;
import com.github.msobkow.cfcore.MssCF.MssCFGenContext;

public interface ICFGenKbGenRuleObj
	extends ICFGenKbGenItemObj
{
	/**
	 *	Get the current edition of this GenRule instance as a ICFGenKbGenRuleEditObj.
	 *
	 *	@return	The ICFGenKbGenRuleEditObj edition of this instance.
	 */
	ICFGenKbGenRuleEditObj getEditAsGenRule();

	/**
	 *	Get the ICFGenKbGenRuleTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGenRuleTableObj table cache which manages this instance.
	 */
	ICFGenKbGenRuleTableObj getGenRuleTable();

	/**
	 *	Get the CFGenKbGenRuleBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGenRuleBuff instance which currently backs this object.
	 */
	CFGenKbGenRuleBuff getGenRuleBuff();

	/**
	 *	Get the required String attribute DefinedNear.
	 *
	 *	@return	The required String attribute DefinedNear.
	 */
	String getRequiredDefinedNear();

	/**
	 *	Get the required String attribute Body.
	 *
	 *	@return	The required String attribute Body.
	 */
	String getRequiredBody();

	/**
	 *	Get the optional Long attribute BodyTenantId.
	 *
	 *	@return	The optional Long attribute BodyTenantId.
	 */
	Long getOptionalBodyTenantId();

	/**
	 *	Get the optional Long attribute BodyGelCacheId.
	 *
	 *	@return	The optional Long attribute BodyGelCacheId.
	 */
	Long getOptionalBodyGelCacheId();

	/**
	 *	Get the optional Long attribute BodyGelId.
	 *
	 *	@return	The optional Long attribute BodyGelId.
	 */
	Long getOptionalBodyGelId();

	/**
	 *	Get the optional ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@return	The optional ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsBodyGel();

	/**
	 *	Get the optional ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 *
	 *	@return	The optional ICFGenKbGelExecutableObj instance referenced by the BodyGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsBodyGel( boolean forceRead );

}
