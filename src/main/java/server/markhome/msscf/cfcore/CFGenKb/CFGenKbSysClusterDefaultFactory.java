
// Description: Java 11 Default Factory implementation for SysCluster.

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
	 *	CFGenKbSysClusterFactory implementation for SysCluster
	 */
public class CFGenKbSysClusterDefaultFactory
	implements ICFGenKbSysClusterFactory
{
	public CFGenKbSysClusterDefaultFactory() {
	}

	public CFGenKbSysClusterPKey newPKey() {
		CFGenKbSysClusterPKey pkey =
			new CFGenKbSysClusterPKey();
		return( pkey );
	}

	public CFGenKbSysClusterByClusterIdxKey newClusterIdxKey() {
		CFGenKbSysClusterByClusterIdxKey key =
			new CFGenKbSysClusterByClusterIdxKey();
		return( key );
	}

	public CFGenKbSysClusterBuff newBuff() {
		CFGenKbSysClusterBuff buff =
			new CFGenKbSysClusterBuff();
		return( buff );
	}
}
