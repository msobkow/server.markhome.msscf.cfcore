
// Description: Java 11 Default Factory implementation for HostNode.

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
	 *	CFGenKbHostNodeFactory implementation for HostNode
	 */
public class CFGenKbHostNodeDefaultFactory
	implements ICFGenKbHostNodeFactory
{
	public CFGenKbHostNodeDefaultFactory() {
	}

	public CFGenKbHostNodePKey newPKey() {
		CFGenKbHostNodePKey pkey =
			new CFGenKbHostNodePKey();
		return( pkey );
	}

	public CFGenKbHostNodeByClusterIdxKey newClusterIdxKey() {
		CFGenKbHostNodeByClusterIdxKey key =
			new CFGenKbHostNodeByClusterIdxKey();
		return( key );
	}

	public CFGenKbHostNodeByUDescrIdxKey newUDescrIdxKey() {
		CFGenKbHostNodeByUDescrIdxKey key =
			new CFGenKbHostNodeByUDescrIdxKey();
		return( key );
	}

	public CFGenKbHostNodeByHostNameIdxKey newHostNameIdxKey() {
		CFGenKbHostNodeByHostNameIdxKey key =
			new CFGenKbHostNodeByHostNameIdxKey();
		return( key );
	}

	public CFGenKbHostNodeBuff newBuff() {
		CFGenKbHostNodeBuff buff =
			new CFGenKbHostNodeBuff();
		return( buff );
	}
}
