
// Description: Java 11 Default Factory implementation for SecSession.

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
	 *	CFGenKbSecSessionFactory implementation for SecSession
	 */
public class CFGenKbSecSessionDefaultFactory
	implements ICFGenKbSecSessionFactory
{
	public CFGenKbSecSessionDefaultFactory() {
	}

	public CFGenKbSecSessionPKey newPKey() {
		CFGenKbSecSessionPKey pkey =
			new CFGenKbSecSessionPKey();
		return( pkey );
	}

	public CFGenKbSecSessionBySecUserIdxKey newSecUserIdxKey() {
		CFGenKbSecSessionBySecUserIdxKey key =
			new CFGenKbSecSessionBySecUserIdxKey();
		return( key );
	}

	public CFGenKbSecSessionBySecDevIdxKey newSecDevIdxKey() {
		CFGenKbSecSessionBySecDevIdxKey key =
			new CFGenKbSecSessionBySecDevIdxKey();
		return( key );
	}

	public CFGenKbSecSessionByStartIdxKey newStartIdxKey() {
		CFGenKbSecSessionByStartIdxKey key =
			new CFGenKbSecSessionByStartIdxKey();
		return( key );
	}

	public CFGenKbSecSessionByFinishIdxKey newFinishIdxKey() {
		CFGenKbSecSessionByFinishIdxKey key =
			new CFGenKbSecSessionByFinishIdxKey();
		return( key );
	}

	public CFGenKbSecSessionBySecProxyIdxKey newSecProxyIdxKey() {
		CFGenKbSecSessionBySecProxyIdxKey key =
			new CFGenKbSecSessionBySecProxyIdxKey();
		return( key );
	}

	public CFGenKbSecSessionBuff newBuff() {
		CFGenKbSecSessionBuff buff =
			new CFGenKbSecSessionBuff();
		return( buff );
	}
}
