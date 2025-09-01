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

public interface ICFGenKbGelPopTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelPop instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelPopObj newInstance();

	/**
	 *	Instantiate a new GelPop edition of the specified GelPop instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelPopEditObj newEditInstance( ICFGenKbGelPopObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopObj realiseGelPop( ICFGenKbGelPopObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopObj createGelPop( ICFGenKbGelPopObj Obj );

	/**
	 *	Read a GelPop-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPop-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPopObj readGelPop( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelPop-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPop-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPopObj readGelPop( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelPopObj readCachedGelPop( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelPop( ICFGenKbGelPopObj obj );

	void deepDisposeGelPop( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopObj lockGelPop( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelPop-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPopObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPopObj> readAllGelPop();

	/**
	 *	Return a sorted map of all the GelPop-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPopObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPopObj> readAllGelPop( boolean forceRead );

	List<ICFGenKbGelPopObj> readCachedAllGelPop();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPopObj readGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPopObj readGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelPopObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelPopObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelPopObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelPopObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of CFGenKbGelPopObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopObj> readGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	ICFGenKbGelPopObj readCachedGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelPopObj> readCachedGelPopByTenantIdx( long TenantId );

	List<ICFGenKbGelPopObj> readCachedGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelPopObj> readCachedGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelPopObj> readCachedGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelPopByTenantIdx( long TenantId );

	void deepDisposeGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopObj updateGelPop( ICFGenKbGelPopObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelPop( ICFGenKbGelPopObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPop key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPop key attribute of the instance generating the id.
	 */
	void deleteGelPopByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
