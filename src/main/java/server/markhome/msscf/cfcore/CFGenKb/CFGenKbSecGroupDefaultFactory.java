
// Description: Java 11 Default Factory implementation for SecGroup.

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
	 *	CFGenKbSecGroupFactory implementation for SecGroup
	 */
public class CFGenKbSecGroupDefaultFactory
	implements ICFGenKbSecGroupFactory
{
	public CFGenKbSecGroupDefaultFactory() {
	}

	public CFGenKbSecGroupPKey newPKey() {
		CFGenKbSecGroupPKey pkey =
			new CFGenKbSecGroupPKey();
		return( pkey );
	}

	public CFGenKbSecGroupByClusterIdxKey newClusterIdxKey() {
		CFGenKbSecGroupByClusterIdxKey key =
			new CFGenKbSecGroupByClusterIdxKey();
		return( key );
	}

	public CFGenKbSecGroupByClusterVisIdxKey newClusterVisIdxKey() {
		CFGenKbSecGroupByClusterVisIdxKey key =
			new CFGenKbSecGroupByClusterVisIdxKey();
		return( key );
	}

	public CFGenKbSecGroupByUNameIdxKey newUNameIdxKey() {
		CFGenKbSecGroupByUNameIdxKey key =
			new CFGenKbSecGroupByUNameIdxKey();
		return( key );
	}

	public CFGenKbSecGroupBuff newBuff() {
		CFGenKbSecGroupBuff buff =
			new CFGenKbSecGroupBuff();
		return( buff );
	}
}
