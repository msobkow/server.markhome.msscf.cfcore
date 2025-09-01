
// Description: Java 11 Default Factory implementation for GenRule.

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
	 *	CFGenKbGenRuleFactory implementation for GenRule
	 */
public class CFGenKbGenRuleDefaultFactory
	implements ICFGenKbGenRuleFactory
{
	public CFGenKbGenRuleDefaultFactory() {
	}

	public CFGenKbGenRuleByBodyIdxKey newBodyIdxKey() {
		CFGenKbGenRuleByBodyIdxKey key =
			new CFGenKbGenRuleByBodyIdxKey();
		return( key );
	}

	public CFGenKbGenRuleBuff newBuff() {
		CFGenKbGenRuleBuff buff =
			new CFGenKbGenRuleBuff();
		return( buff );
	}
}
