
// Description: Java 11 Default Factory implementation for RuleType.

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

	/*
	 *	CFGenKbRuleTypeFactory implementation for RuleType
	 */
public class CFGenKbRuleTypeDefaultFactory
	implements ICFGenKbRuleTypeFactory
{
	public CFGenKbRuleTypeDefaultFactory() {
	}

	public CFGenKbRuleTypePKey newPKey() {
		CFGenKbRuleTypePKey pkey =
			new CFGenKbRuleTypePKey();
		return( pkey );
	}

	public CFGenKbRuleTypeByNameIdxKey newNameIdxKey() {
		CFGenKbRuleTypeByNameIdxKey key =
			new CFGenKbRuleTypeByNameIdxKey();
		return( key );
	}

	public CFGenKbRuleTypeBuff newBuff() {
		CFGenKbRuleTypeBuff buff =
			new CFGenKbRuleTypeBuff();
		return( buff );
	}
}
