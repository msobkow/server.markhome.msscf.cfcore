
// Description: Java 11 Factory interface for GelCache.

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
import server.markhome.msscf.cfcore.CFGenKb.*;

/*
 *	CFGenKbGelCacheFactory interface for GelCache
 */
public interface ICFGenKbGelCacheFactory
{

	/**
	 *	Allocate a primary key for GelCache instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCachePKey newPKey();

	/**
	 *	Allocate a TenantIdx key over GelCache instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCacheByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a AltIdx key over GelCache instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCacheByAltIdxKey newAltIdxKey();

	/**
	 *	Allocate a GelCache instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCacheBuff newBuff();

}
