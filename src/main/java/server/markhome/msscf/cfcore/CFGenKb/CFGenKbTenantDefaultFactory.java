
// Description: Java 11 Default Factory implementation for Tenant.

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
	 *	CFGenKbTenantFactory implementation for Tenant
	 */
public class CFGenKbTenantDefaultFactory
	implements ICFGenKbTenantFactory
{
	public CFGenKbTenantDefaultFactory() {
	}

	public CFGenKbTenantPKey newPKey() {
		CFGenKbTenantPKey pkey =
			new CFGenKbTenantPKey();
		return( pkey );
	}

	public CFGenKbTenantByClusterIdxKey newClusterIdxKey() {
		CFGenKbTenantByClusterIdxKey key =
			new CFGenKbTenantByClusterIdxKey();
		return( key );
	}

	public CFGenKbTenantByUNameIdxKey newUNameIdxKey() {
		CFGenKbTenantByUNameIdxKey key =
			new CFGenKbTenantByUNameIdxKey();
		return( key );
	}

	public CFGenKbTenantBuff newBuff() {
		CFGenKbTenantBuff buff =
			new CFGenKbTenantBuff();
		return( buff );
	}
}
