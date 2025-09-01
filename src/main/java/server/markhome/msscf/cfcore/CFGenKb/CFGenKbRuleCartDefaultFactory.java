
// Description: Java 11 Default Factory implementation for RuleCart.

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
	 *	CFGenKbRuleCartFactory implementation for RuleCart
	 */
public class CFGenKbRuleCartDefaultFactory
	implements ICFGenKbRuleCartFactory
{
	public CFGenKbRuleCartDefaultFactory() {
	}

	public CFGenKbRuleCartPKey newPKey() {
		CFGenKbRuleCartPKey pkey =
			new CFGenKbRuleCartPKey();
		return( pkey );
	}

	public CFGenKbRuleCartByTenantIdxKey newTenantIdxKey() {
		CFGenKbRuleCartByTenantIdxKey key =
			new CFGenKbRuleCartByTenantIdxKey();
		return( key );
	}

	public CFGenKbRuleCartByNameIdxKey newNameIdxKey() {
		CFGenKbRuleCartByNameIdxKey key =
			new CFGenKbRuleCartByNameIdxKey();
		return( key );
	}

	public CFGenKbRuleCartBuff newBuff() {
		CFGenKbRuleCartBuff buff =
			new CFGenKbRuleCartBuff();
		return( buff );
	}
}
