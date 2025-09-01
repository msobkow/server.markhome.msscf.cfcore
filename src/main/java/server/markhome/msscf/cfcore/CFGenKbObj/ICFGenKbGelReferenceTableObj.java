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

public interface ICFGenKbGelReferenceTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelReference instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelReferenceObj newInstance();

	/**
	 *	Instantiate a new GelReference edition of the specified GelReference instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelReferenceEditObj newEditInstance( ICFGenKbGelReferenceObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelReferenceObj realiseGelReference( ICFGenKbGelReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelReferenceObj createGelReference( ICFGenKbGelReferenceObj Obj );

	/**
	 *	Read a GelReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelReferenceObj readGelReference( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelReferenceObj readGelReference( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelReferenceObj readCachedGelReference( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelReference( ICFGenKbGelReferenceObj obj );

	void deepDisposeGelReference( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelReferenceObj lockGelReference( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelReference-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readAllGelReference();

	/**
	 *	Return a sorted map of all the GelReference-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readAllGelReference( boolean forceRead );

	List<ICFGenKbGelReferenceObj> readCachedAllGelReference();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelReferenceObj readGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelReferenceObj readGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of CFGenKbGelReferenceObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelReferenceObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelReferenceObj> readGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	ICFGenKbGelReferenceObj readCachedGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelReferenceObj> readCachedGelReferenceByTenantIdx( long TenantId );

	List<ICFGenKbGelReferenceObj> readCachedGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelReferenceObj> readCachedGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelReferenceObj> readCachedGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelReferenceByTenantIdx( long TenantId );

	void deepDisposeGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelReferenceObj updateGelReference( ICFGenKbGelReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelReference( ICFGenKbGelReferenceObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelReference key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelReference key attribute of the instance generating the id.
	 */
	void deleteGelReferenceByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
