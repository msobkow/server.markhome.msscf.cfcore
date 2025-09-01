
// Description: Java 11 Default Factory implementation for TSecGrpInc.

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
	 *	CFGenKbTSecGrpIncFactory implementation for TSecGrpInc
	 */
public class CFGenKbTSecGrpIncDefaultFactory
	implements ICFGenKbTSecGrpIncFactory
{
	public CFGenKbTSecGrpIncDefaultFactory() {
	}

	public CFGenKbTSecGrpIncPKey newPKey() {
		CFGenKbTSecGrpIncPKey pkey =
			new CFGenKbTSecGrpIncPKey();
		return( pkey );
	}

	public CFGenKbTSecGrpIncByTenantIdxKey newTenantIdxKey() {
		CFGenKbTSecGrpIncByTenantIdxKey key =
			new CFGenKbTSecGrpIncByTenantIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpIncByGroupIdxKey newGroupIdxKey() {
		CFGenKbTSecGrpIncByGroupIdxKey key =
			new CFGenKbTSecGrpIncByGroupIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpIncByIncludeIdxKey newIncludeIdxKey() {
		CFGenKbTSecGrpIncByIncludeIdxKey key =
			new CFGenKbTSecGrpIncByIncludeIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpIncByUIncludeIdxKey newUIncludeIdxKey() {
		CFGenKbTSecGrpIncByUIncludeIdxKey key =
			new CFGenKbTSecGrpIncByUIncludeIdxKey();
		return( key );
	}

	public CFGenKbTSecGrpIncBuff newBuff() {
		CFGenKbTSecGrpIncBuff buff =
			new CFGenKbTSecGrpIncBuff();
		return( buff );
	}
}
