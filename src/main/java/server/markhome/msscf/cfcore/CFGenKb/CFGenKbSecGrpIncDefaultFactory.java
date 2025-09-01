
// Description: Java 11 Default Factory implementation for SecGrpInc.

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
	 *	CFGenKbSecGrpIncFactory implementation for SecGrpInc
	 */
public class CFGenKbSecGrpIncDefaultFactory
	implements ICFGenKbSecGrpIncFactory
{
	public CFGenKbSecGrpIncDefaultFactory() {
	}

	public CFGenKbSecGrpIncPKey newPKey() {
		CFGenKbSecGrpIncPKey pkey =
			new CFGenKbSecGrpIncPKey();
		return( pkey );
	}

	public CFGenKbSecGrpIncByClusterIdxKey newClusterIdxKey() {
		CFGenKbSecGrpIncByClusterIdxKey key =
			new CFGenKbSecGrpIncByClusterIdxKey();
		return( key );
	}

	public CFGenKbSecGrpIncByGroupIdxKey newGroupIdxKey() {
		CFGenKbSecGrpIncByGroupIdxKey key =
			new CFGenKbSecGrpIncByGroupIdxKey();
		return( key );
	}

	public CFGenKbSecGrpIncByIncludeIdxKey newIncludeIdxKey() {
		CFGenKbSecGrpIncByIncludeIdxKey key =
			new CFGenKbSecGrpIncByIncludeIdxKey();
		return( key );
	}

	public CFGenKbSecGrpIncByUIncludeIdxKey newUIncludeIdxKey() {
		CFGenKbSecGrpIncByUIncludeIdxKey key =
			new CFGenKbSecGrpIncByUIncludeIdxKey();
		return( key );
	}

	public CFGenKbSecGrpIncBuff newBuff() {
		CFGenKbSecGrpIncBuff buff =
			new CFGenKbSecGrpIncBuff();
		return( buff );
	}
}
