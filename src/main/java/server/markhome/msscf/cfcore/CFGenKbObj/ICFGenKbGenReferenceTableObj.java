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

public interface ICFGenKbGenReferenceTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GenReference instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGenReferenceObj newInstance();

	/**
	 *	Instantiate a new GenReference edition of the specified GenReference instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGenReferenceEditObj newEditInstance( ICFGenKbGenReferenceObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenReferenceObj realiseGenReference( ICFGenKbGenReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenReferenceObj createGenReference( ICFGenKbGenReferenceObj Obj );

	/**
	 *	Read a GenReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenReferenceObj readGenReference( CFGenKbGenItemPKey pkey );

	/**
	 *	Read a GenReference-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GenReference-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGenReferenceObj readGenReference( CFGenKbGenItemPKey pkey,
		boolean forceRead );

	ICFGenKbGenReferenceObj readCachedGenReference( CFGenKbGenItemPKey pkey );

	public void reallyDeepDisposeGenReference( ICFGenKbGenReferenceObj obj );

	void deepDisposeGenReference( CFGenKbGenItemPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenReferenceObj lockGenReference( CFGenKbGenItemPKey pkey );

	/**
	 *	Return a sorted list of all the GenReference-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readAllGenReference();

	/**
	 *	Return a sorted map of all the GenReference-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGenReferenceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readAllGenReference( boolean forceRead );

	List<ICFGenKbGenReferenceObj> readCachedAllGenReference();

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenReferenceObj readGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenReferenceObj readGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate CartIdx key.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate CartIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByCartIdx( long TenantId,
		long CartridgeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate RuleTypeIdx key.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate RuleTypeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByRuleTypeIdx( short RuleTypeId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByToolSetIdx( short ToolSetId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate ToolSetIdx key.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ToolSetIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByToolSetIdx( short ToolSetId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByScopeIdx( Short ScopeDefId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByScopeIdx( Short ScopeDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByGenDefIdx( short GenDefId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate GenDefIdx key.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GenDefIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByGenDefIdx( short GenDefId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj cached instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenReferenceObj readGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Get the CFGenKbGenItemObj instance for the unique AltIdx key.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGenItemObj refreshed instance for the unique AltIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGenReferenceObj readGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate GelExecIdx key.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate GelExecIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGenItemObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Get the map of CFGenKbGenReferenceObj instances sorted by their primary keys for the duplicate ProbeIdx key.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGenReferenceObj cached instances sorted by their primary keys for the duplicate ProbeIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGenReferenceObj> readGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId,
		boolean forceRead );

	ICFGenKbGenReferenceObj readCachedGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByTenantIdx( long TenantId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByRuleTypeIdx( short RuleTypeId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByToolSetIdx( short ToolSetId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByScopeIdx( Short ScopeDefId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByGenDefIdx( short GenDefId );

	ICFGenKbGenReferenceObj readCachedGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	List<ICFGenKbGenReferenceObj> readCachedGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	void deepDisposeGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	void deepDisposeGenReferenceByTenantIdx( long TenantId );

	void deepDisposeGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	void deepDisposeGenReferenceByRuleTypeIdx( short RuleTypeId );

	void deepDisposeGenReferenceByToolSetIdx( short ToolSetId );

	void deepDisposeGenReferenceByScopeIdx( Short ScopeDefId );

	void deepDisposeGenReferenceByGenDefIdx( short GenDefId );

	void deepDisposeGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	void deepDisposeGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	void deepDisposeGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGenReferenceObj updateGenReference( ICFGenKbGenReferenceObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGenReference( ICFGenKbGenReferenceObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argItemId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByItemIdIdx( long TenantId,
		long CartridgeId,
		long ItemId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argCartridgeId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByCartIdx( long TenantId,
		long CartridgeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRuleTypeId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByRuleTypeIdx( short RuleTypeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByToolSetIdx( short ToolSetId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByScopeIdx( Short ScopeDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByGenDefIdx( short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argToolSetId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argScopeDefId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGenDefId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByAltIdx( String Name,
		short ToolSetId,
		Short ScopeDefId,
		short GenDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argGelExecutableTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableGelCacheId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argGelExecutableId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByGelExecIdx( Long GelExecutableTenantId,
		Long GelExecutableGelCacheId,
		Long GelExecutableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argProbeTenantId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeCartridgeId	The GenReference key attribute of the instance generating the id.
	 *
	 *	@param	argProbeGenItemId	The GenReference key attribute of the instance generating the id.
	 */
	void deleteGenReferenceByProbeIdx( Long ProbeTenantId,
		Long ProbeCartridgeId,
		Long ProbeGenItemId );
}
