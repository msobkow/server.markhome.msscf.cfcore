
// Description: Java 11 Default Factory implementation for TSecGroup.

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
	 *	CFGenKbTSecGroupFactory implementation for TSecGroup
	 */
public class CFGenKbTSecGroupDefaultFactory
	implements ICFGenKbTSecGroupFactory
{
	public CFGenKbTSecGroupDefaultFactory() {
	}

	public CFGenKbTSecGroupPKey newPKey() {
		CFGenKbTSecGroupPKey pkey =
			new CFGenKbTSecGroupPKey();
		return( pkey );
	}

	public CFGenKbTSecGroupByTenantIdxKey newTenantIdxKey() {
		CFGenKbTSecGroupByTenantIdxKey key =
			new CFGenKbTSecGroupByTenantIdxKey();
		return( key );
	}

	public CFGenKbTSecGroupByTenantVisIdxKey newTenantVisIdxKey() {
		CFGenKbTSecGroupByTenantVisIdxKey key =
			new CFGenKbTSecGroupByTenantVisIdxKey();
		return( key );
	}

	public CFGenKbTSecGroupByUNameIdxKey newUNameIdxKey() {
		CFGenKbTSecGroupByUNameIdxKey key =
			new CFGenKbTSecGroupByUNameIdxKey();
		return( key );
	}

	public CFGenKbTSecGroupBuff newBuff() {
		CFGenKbTSecGroupBuff buff =
			new CFGenKbTSecGroupBuff();
		return( buff );
	}
}
