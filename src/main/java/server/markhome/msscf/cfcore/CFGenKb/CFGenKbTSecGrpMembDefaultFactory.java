
// Description: Java 11 Default Factory implementation for TSecGrpMemb.

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
	 *	CFGenKbTSecGrpMembFactory implementation for TSecGrpMemb
	 */
public class CFGenKbTSecGrpMembDefaultFactory
	implements ICFGenKbTSecGrpMembFactory
{
	public CFGenKbTSecGrpMembDefaultFactory() {
	}

	public CFGenKbTSecGrpMembPKey newPKey() {
		CFGenKbTSecGrpMembPKey pkey =
			new CFGenKbTSecGrpMembPKey();
		return( pkey );
	}

	public CFGenKbTSecGrpMembByTenantIdxKey newTenantIdxKey() {
		CFGenKbTSecGrpMembByTenantIdxKey key =
			new CFGenKbTSecGrpMembByTenantIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpMembByGroupIdxKey newGroupIdxKey() {
		CFGenKbTSecGrpMembByGroupIdxKey key =
			new CFGenKbTSecGrpMembByGroupIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpMembByUserIdxKey newUserIdxKey() {
		CFGenKbTSecGrpMembByUserIdxKey key =
			new CFGenKbTSecGrpMembByUserIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpMembByUUserIdxKey newUUserIdxKey() {
		CFGenKbTSecGrpMembByUUserIdxKey key =
			new CFGenKbTSecGrpMembByUUserIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpMembBuff newBuff() {
		CFGenKbTSecGrpMembBuff buff =
			new CFGenKbTSecGrpMembBuff();
		return( buff );
	}
}
