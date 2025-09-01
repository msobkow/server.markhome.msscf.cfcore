
// Description: Java 11 Factory interface for GenRule.

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
 *	CFGenKbGenRuleFactory interface for GenRule
 */
public interface ICFGenKbGenRuleFactory
{

	/**
	 *	Allocate a BodyIdx key over GenRule instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenRuleByBodyIdxKey newBodyIdxKey();

	/**
	 *	Allocate a GenRule instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenRuleBuff newBuff();

}
