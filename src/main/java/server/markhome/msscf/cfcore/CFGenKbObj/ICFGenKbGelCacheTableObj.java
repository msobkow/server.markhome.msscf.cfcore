// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

public interface ICFGenKbGelCacheTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelCache instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelCacheObj newInstance();

	/**
	 *	Instantiate a new GelCache edition of the specified GelCache instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelCacheEditObj newEditInstance( ICFGenKbGelCacheObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCacheObj realiseGelCache( ICFGenKbGelCacheObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCacheObj createGelCache( ICFGenKbGelCacheObj Obj );

	/**
	 *	Read a GelCache-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCache-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelCacheObj readGelCache( CFGenKbGelCachePKey pkey );

	/**
	 *	Read a GelCache-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCache-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelCacheObj readGelCache( CFGenKbGelCachePKey pkey,
		boolean forceRead );

	ICFGenKbGelCacheObj readCachedGelCache( CFGenKbGelCachePKey pkey );

	public void reallyDeepDisposeGelCache( ICFGenKbGelCacheObj obj );

	void deepDisposeGelCache( CFGenKbGelCachePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCacheObj lockGelCache( CFGenKbGelCachePKey pkey );

	/**
	 *	Return a sorted list of all the GelCache-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelCacheObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelCacheObj> readAllGelCache();

	/**
	 *	Return a sorted map of all the GelCache-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelCacheObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelCacheObj> readAllGelCache( boolean forceRead );

	List<ICFGenKbGelCacheObj> readCachedAllGelCache();

	/**
	 *	Get the CFGenKbGelCacheObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelCacheObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the CFGenKbGelCacheObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelCacheObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelCacheObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCacheObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelCacheObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCacheObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbGelCacheObj instance for the unique AltIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argCacheName	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelCacheObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelCacheObj readGelCacheByAltIdx(long TenantId,
		String CacheName );

	/**
	 *	Get the CFGenKbGelCacheObj instance for the unique AltIdx key.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argCacheName	The GelCache key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelCacheObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelCacheObj readGelCacheByAltIdx(long TenantId,
		String CacheName,
		boolean forceRead );

	ICFGenKbGelCacheObj readCachedGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelCacheObj> readCachedGelCacheByTenantIdx( long TenantId );

	ICFGenKbGelCacheObj readCachedGelCacheByAltIdx( long TenantId,
		String CacheName );

	void deepDisposeGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelCacheByTenantIdx( long TenantId );

	void deepDisposeGelCacheByAltIdx( long TenantId,
		String CacheName );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCacheObj updateGelCache( ICFGenKbGelCacheObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelCache( ICFGenKbGelCacheObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCache key attribute of the instance generating the id.
	 */
	void deleteGelCacheByIdIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 */
	void deleteGelCacheByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCache key attribute of the instance generating the id.
	 *
	 *	@param	argCacheName	The GelCache key attribute of the instance generating the id.
	 */
	void deleteGelCacheByAltIdx(long TenantId,
		String CacheName );
}
