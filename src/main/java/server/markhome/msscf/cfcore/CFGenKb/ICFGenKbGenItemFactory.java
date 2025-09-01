
// Description: Java 11 Factory interface for GenItem.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

/*
 *	CFGenKbGenItemFactory interface for GenItem
 */
public interface ICFGenKbGenItemFactory
{

	/**
	 *	Allocate a primary key for GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a CartIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByCartIdxKey newCartIdxKey();

	/**
	 *	Allocate a RuleTypeIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByRuleTypeIdxKey newRuleTypeIdxKey();

	/**
	 *	Allocate a ToolSetIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByToolSetIdxKey newToolSetIdxKey();

	/**
	 *	Allocate a ScopeIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByScopeIdxKey newScopeIdxKey();

	/**
	 *	Allocate a GenDefIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByGenDefIdxKey newGenDefIdxKey();

	/**
	 *	Allocate a AltIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByAltIdxKey newAltIdxKey();

	/**
	 *	Allocate a GelExecIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByGelExecIdxKey newGelExecIdxKey();

	/**
	 *	Allocate a ProbeIdx key over GenItem instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemByProbeIdxKey newProbeIdxKey();

	/**
	 *	Allocate a GenItem instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenItemBuff newBuff();

}
