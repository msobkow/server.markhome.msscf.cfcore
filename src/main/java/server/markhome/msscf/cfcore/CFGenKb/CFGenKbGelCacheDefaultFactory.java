
// Description: Java 11 Default Factory implementation for GelCache.

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
	 *	CFGenKbGelCacheFactory implementation for GelCache
	 */
public class CFGenKbGelCacheDefaultFactory
	implements ICFGenKbGelCacheFactory
{
	public CFGenKbGelCacheDefaultFactory() {
	}

	public CFGenKbGelCachePKey newPKey() {
		CFGenKbGelCachePKey pkey =
			new CFGenKbGelCachePKey();
		return( pkey );
	}

	public CFGenKbGelCacheByTenantIdxKey newTenantIdxKey() {
		CFGenKbGelCacheByTenantIdxKey key =
			new CFGenKbGelCacheByTenantIdxKey();
		return( key );
	}

	public CFGenKbGelCacheByAltIdxKey newAltIdxKey() {
		CFGenKbGelCacheByAltIdxKey key =
			new CFGenKbGelCacheByAltIdxKey();
		return( key );
	}

	public CFGenKbGelCacheBuff newBuff() {
		CFGenKbGelCacheBuff buff =
			new CFGenKbGelCacheBuff();
		return( buff );
	}
}
