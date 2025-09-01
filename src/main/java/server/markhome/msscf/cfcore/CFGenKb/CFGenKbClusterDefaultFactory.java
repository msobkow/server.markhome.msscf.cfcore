
// Description: Java 11 Default Factory implementation for Cluster.

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
	 *	CFGenKbClusterFactory implementation for Cluster
	 */
public class CFGenKbClusterDefaultFactory
	implements ICFGenKbClusterFactory
{
	public CFGenKbClusterDefaultFactory() {
	}

	public CFGenKbClusterPKey newPKey() {
		CFGenKbClusterPKey pkey =
			new CFGenKbClusterPKey();
		return( pkey );
	}

	public CFGenKbClusterByUDomNameIdxKey newUDomNameIdxKey() {
		CFGenKbClusterByUDomNameIdxKey key =
			new CFGenKbClusterByUDomNameIdxKey();
		return( key );
	}

	public CFGenKbClusterByUDescrIdxKey newUDescrIdxKey() {
		CFGenKbClusterByUDescrIdxKey key =
			new CFGenKbClusterByUDescrIdxKey();
		return( key );
	}

	public CFGenKbClusterBuff newBuff() {
		CFGenKbClusterBuff buff =
			new CFGenKbClusterBuff();
		return( buff );
	}
}
