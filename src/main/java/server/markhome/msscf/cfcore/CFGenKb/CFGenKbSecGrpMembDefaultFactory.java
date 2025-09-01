
// Description: Java 11 Default Factory implementation for SecGrpMemb.

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
	 *	CFGenKbSecGrpMembFactory implementation for SecGrpMemb
	 */
public class CFGenKbSecGrpMembDefaultFactory
	implements ICFGenKbSecGrpMembFactory
{
	public CFGenKbSecGrpMembDefaultFactory() {
	}

	public CFGenKbSecGrpMembPKey newPKey() {
		CFGenKbSecGrpMembPKey pkey =
			new CFGenKbSecGrpMembPKey();
		return( pkey );
	}

	public CFGenKbSecGrpMembByClusterIdxKey newClusterIdxKey() {
		CFGenKbSecGrpMembByClusterIdxKey key =
			new CFGenKbSecGrpMembByClusterIdxKey();
		return( key );
	}

	public CFGenKbSecGrpMembByGroupIdxKey newGroupIdxKey() {
		CFGenKbSecGrpMembByGroupIdxKey key =
			new CFGenKbSecGrpMembByGroupIdxKey();
		return( key );
	}

	public CFGenKbSecGrpMembByUserIdxKey newUserIdxKey() {
		CFGenKbSecGrpMembByUserIdxKey key =
			new CFGenKbSecGrpMembByUserIdxKey();
		return( key );
	}

	public CFGenKbSecGrpMembByUUserIdxKey newUUserIdxKey() {
		CFGenKbSecGrpMembByUUserIdxKey key =
			new CFGenKbSecGrpMembByUUserIdxKey();
		return( key );
	}

	public CFGenKbSecGrpMembBuff newBuff() {
		CFGenKbSecGrpMembBuff buff =
			new CFGenKbSecGrpMembBuff();
		return( buff );
	}
}
