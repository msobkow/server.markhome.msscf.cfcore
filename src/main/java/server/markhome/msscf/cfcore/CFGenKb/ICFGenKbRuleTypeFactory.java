
// Description: Java 11 Factory interface for RuleType.

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
 *	CFGenKbRuleTypeFactory interface for RuleType
 */
public interface ICFGenKbRuleTypeFactory
{

	/**
	 *	Allocate a primary key for RuleType instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleTypePKey newPKey();

	/**
	 *	Allocate a NameIdx key over RuleType instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleTypeByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a RuleType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbRuleTypeBuff newBuff();

}
