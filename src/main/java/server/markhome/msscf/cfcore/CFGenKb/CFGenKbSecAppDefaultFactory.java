
// Description: Java 11 Default Factory implementation for SecApp.

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
	 *	CFGenKbSecAppFactory implementation for SecApp
	 */
public class CFGenKbSecAppDefaultFactory
	implements ICFGenKbSecAppFactory
{
	public CFGenKbSecAppDefaultFactory() {
	}

	public CFGenKbSecAppPKey newPKey() {
		CFGenKbSecAppPKey pkey =
			new CFGenKbSecAppPKey();
		return( pkey );
	}

	public CFGenKbSecAppByClusterIdxKey newClusterIdxKey() {
		CFGenKbSecAppByClusterIdxKey key =
			new CFGenKbSecAppByClusterIdxKey();
		return( key );
	}

	public CFGenKbSecAppByUJEEMountIdxKey newUJEEMountIdxKey() {
		CFGenKbSecAppByUJEEMountIdxKey key =
			new CFGenKbSecAppByUJEEMountIdxKey();
		return( key );
	}

	public CFGenKbSecAppBuff newBuff() {
		CFGenKbSecAppBuff buff =
			new CFGenKbSecAppBuff();
		return( buff );
	}
}
