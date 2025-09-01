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

public interface ICFGenKbGelIteratorTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelIterator instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelIteratorObj newInstance();

	/**
	 *	Instantiate a new GelIterator edition of the specified GelIterator instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelIteratorEditObj newEditInstance( ICFGenKbGelIteratorObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelIteratorObj realiseGelIterator( ICFGenKbGelIteratorObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelIteratorObj createGelIterator( ICFGenKbGelIteratorObj Obj );

	/**
	 *	Read a GelIterator-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelIterator-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelIteratorObj readGelIterator( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelIterator-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelIterator-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelIteratorObj readGelIterator( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelIteratorObj readCachedGelIterator( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelIterator( ICFGenKbGelIteratorObj obj );

	void deepDisposeGelIterator( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelIteratorObj lockGelIterator( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelIterator-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelIteratorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readAllGelIterator();

	/**
	 *	Return a sorted map of all the GelIterator-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelIteratorObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readAllGelIterator( boolean forceRead );

	List<ICFGenKbGelIteratorObj> readCachedAllGelIterator();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate BeforeIdx key.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate BeforeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate BeforeIdx key.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate BeforeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate FirstIdx key.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate FirstIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate FirstIdx key.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate FirstIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EachIdx key.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EachIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EachIdx key.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EachIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LastIdx key.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LastIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LastIdx key.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LastIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LoneIdx key.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LoneIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate LoneIdx key.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate LoneIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EmptyIdx key.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EmptyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty );

	/**
	 *	Get the map of CFGenKbGelIteratorObj instances sorted by their primary keys for the duplicate EmptyIdx key.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelIteratorObj cached instances sorted by their primary keys for the duplicate EmptyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty,
		boolean forceRead );

	ICFGenKbGelIteratorObj readCachedGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByTenantIdx( long TenantId );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByBeforeIdx( String ExpandBefore );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByFirstIdx( String ExpandFirst );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByEachIdx( String ExpandEach );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByLastIdx( String ExpandLast );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByLoneIdx( String ExpandLone );

	List<ICFGenKbGelIteratorObj> readCachedGelIteratorByEmptyIdx( String ExpandEmpty );

	void deepDisposeGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelIteratorByTenantIdx( long TenantId );

	void deepDisposeGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelIteratorByBeforeIdx( String ExpandBefore );

	void deepDisposeGelIteratorByFirstIdx( String ExpandFirst );

	void deepDisposeGelIteratorByEachIdx( String ExpandEach );

	void deepDisposeGelIteratorByLastIdx( String ExpandLast );

	void deepDisposeGelIteratorByLoneIdx( String ExpandLone );

	void deepDisposeGelIteratorByEmptyIdx( String ExpandEmpty );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelIteratorObj updateGelIterator( ICFGenKbGelIteratorObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelIterator( ICFGenKbGelIteratorObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByBeforeIdx( String ExpandBefore );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByFirstIdx( String ExpandFirst );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByEachIdx( String ExpandEach );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByLastIdx( String ExpandLast );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByLoneIdx( String ExpandLone );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByEmptyIdx( String ExpandEmpty );
}
