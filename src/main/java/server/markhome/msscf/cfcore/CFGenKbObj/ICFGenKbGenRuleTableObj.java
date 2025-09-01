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

public interface ICFGenKbGenRuleTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenRule instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGenRuleObj newInstance();

	/**
	 *	Instantiate a new GenRule edition of the specified GenRule instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGenRuleEditObj newEditInstance( ICFGenKbGenRuleObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenRuleObj realiseGenRule( ICFGenKbGenRuleObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenRuleObj createGenRule( ICFGenKbGenRuleObj Obj );

	/**
	 *	Read a GenRule-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenRule-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenRuleObj readGenRule( CFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenRule-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenRule-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenRuleObj readGenRule( CFGenKbGenItemPKey pkey,
		boolean forceRead );

	ICFGenKbGenRuleObj readCachedGenRule( CFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenRule( ICFGenKbGenRuleObj obj );

	void deepDisposeGenRule( CFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenRuleObj lockGenRule( CFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenRule-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenRuleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenRuleObj> readAllGenRule();

	/**
	 *	Return a sorted map of all the GenRule-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenRuleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenRuleObj> readAllGenRule( boolean forceRead );

	List<ICFGenKbGenRuleObj> readCachedAllGenRule();

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenRuleObj readGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenRuleObj readGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenRuleObj readGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenRuleObj readGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Get the map of CFGenKbGenRuleObj instances sorted by their primary keys for the duplicate BodyIdx key.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenRuleObj cached instances sorted by their primary keys for the duplicate BodyIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenRuleObj> readGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId,
		boolean forceRead );

	ICFGenKbGenRuleObj readCachedGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByTenantIdx( long TenantId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByRuleTypeIdx( short RuleTypeId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByToolSetIdx( short ToolSetId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByScopeIdx( Short ScopeDefId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByGenDefIdx( short GenDefId );

	ICFGenKbGenRuleObj readCachedGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	List<ICFGenKbGenRuleObj> readCachedGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	void deepDisposeGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenRuleByTenantIdx( long TenantId );

	void deepDisposeGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenRuleByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenRuleByToolSetIdx( short ToolSetId );

	void deepDisposeGenRuleByScopeIdx( Short ScopeDefId );

	void deepDisposeGenRuleByGenDefIdx( short GenDefId );

	void deepDisposeGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenRuleObj updateGenRule( ICFGenKbGenRuleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenRule( ICFGenKbGenRuleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBodyTenantId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelCacheId	The GenRule key attribute of the instance generating the id.
	 *
	 *	@param	argBodyGelId	The GenRule key attribute of the instance generating the id.
	 */
	void deleteGenRuleByBodyIdx( Long BodyTenantId,
		Long BodyGelCacheId,
		Long BodyGelId );
}
