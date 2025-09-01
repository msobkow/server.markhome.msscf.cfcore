
// Description: Java 11 Factory interface for RuleCart.

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
 *	CFGenKbRuleCartFactory interface for RuleCart
 */
public interface ICFGenKbRuleCartFactory
{

	/**
	 *	Allocate a primary key for RuleCart instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleCartPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over RuleCart instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleCartByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a NameIdx key over RuleCart instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleCartByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a RuleCart instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleCartBuff newBuff();

}
