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

public interface ICFGenKbGelCounterTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelCounter instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelCounterObj newInstance();

	/**
	 *	Instantiate a new GelCounter edition of the specified GelCounter instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelCounterEditObj newEditInstance( ICFGenKbGelCounterObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCounterObj realiseGelCounter( ICFGenKbGelCounterObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCounterObj createGelCounter( ICFGenKbGelCounterObj Obj );

	/**
	 *	Read a GelCounter-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCounter-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelCounterObj readGelCounter( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelCounter-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelCounter-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelCounterObj readGelCounter( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelCounterObj readCachedGelCounter( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelCounter( ICFGenKbGelCounterObj obj );

	void deepDisposeGelCounter( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCounterObj lockGelCounter( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelCounter-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelCounterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelCounterObj> readAllGelCounter();

	/**
	 *	Return a sorted map of all the GelCounter-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelCounterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelCounterObj> readAllGelCounter( boolean forceRead );

	List<ICFGenKbGelCounterObj> readCachedAllGelCounter();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelCounterObj readGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelCounterObj readGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCounterObj> readGelCounterByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelCounterObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCounterObj> readGelCounterByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCounterObj> readGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelCounterObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCounterObj> readGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCounterObj> readGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelCounterObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelCounterObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelCounterObj> readGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	ICFGenKbGelCounterObj readCachedGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelCounterObj> readCachedGelCounterByTenantIdx( long TenantId );

	List<ICFGenKbGelCounterObj> readCachedGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelCounterObj> readCachedGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelCounterByTenantIdx( long TenantId );

	void deepDisposeGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelCounterObj updateGelCounter( ICFGenKbGelCounterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelCounter( ICFGenKbGelCounterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCounter key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCounter key attribute of the instance generating the id.
	 */
	void deleteGelCounterByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
