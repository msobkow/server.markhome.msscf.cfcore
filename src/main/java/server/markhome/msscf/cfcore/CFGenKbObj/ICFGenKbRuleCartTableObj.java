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

public interface ICFGenKbRuleCartTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new RuleCart instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbRuleCartObj newInstance();

	/**
	 *	Instantiate a new RuleCart edition of the specified RuleCart instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbRuleCartEditObj newEditInstance( ICFGenKbRuleCartObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbRuleCartObj realiseRuleCart( ICFGenKbRuleCartObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbRuleCartObj createRuleCart( ICFGenKbRuleCartObj Obj );

	/**
	 *	Read a RuleCart-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RuleCart-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbRuleCartObj readRuleCart( CFGenKbRuleCartPKey pkey );

	/**
	 *	Read a RuleCart-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RuleCart-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbRuleCartObj readRuleCart( CFGenKbRuleCartPKey pkey,
		boolean forceRead );

	ICFGenKbRuleCartObj readCachedRuleCart( CFGenKbRuleCartPKey pkey );

	public void reallyDeepDisposeRuleCart( ICFGenKbRuleCartObj obj );

	void deepDisposeRuleCart( CFGenKbRuleCartPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbRuleCartObj lockRuleCart( CFGenKbRuleCartPKey pkey );

	/**
	 *	Return a sorted list of all the RuleCart-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbRuleCartObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbRuleCartObj> readAllRuleCart();

	/**
	 *	Return a sorted map of all the RuleCart-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbRuleCartObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbRuleCartObj> readAllRuleCart( boolean forceRead );

	List<ICFGenKbRuleCartObj> readCachedAllRuleCart();

	/**
	 *	Get the CFGenKbRuleCartObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbRuleCartObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id );

	/**
	 *	Get the CFGenKbRuleCartObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbRuleCartObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbRuleCartObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbRuleCartObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbRuleCartObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbRuleCartObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbRuleCartObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbRuleCartObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbRuleCartObj readRuleCartByNameIdx(long TenantId,
		String Name );

	/**
	 *	Get the CFGenKbRuleCartObj instance for the unique NameIdx key.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbRuleCartObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbRuleCartObj readRuleCartByNameIdx(long TenantId,
		String Name,
		boolean forceRead );

	ICFGenKbRuleCartObj readCachedRuleCartByIdIdx( long TenantId,
		long Id );

	List<ICFGenKbRuleCartObj> readCachedRuleCartByTenantIdx( long TenantId );

	ICFGenKbRuleCartObj readCachedRuleCartByNameIdx( long TenantId,
		String Name );

	void deepDisposeRuleCartByIdIdx( long TenantId,
		long Id );

	void deepDisposeRuleCartByTenantIdx( long TenantId );

	void deepDisposeRuleCartByNameIdx( long TenantId,
		String Name );

	/**
	 *	Internal use only.
	 */
	ICFGenKbRuleCartObj updateRuleCart( ICFGenKbRuleCartObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRuleCart( ICFGenKbRuleCartObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByIdIdx( long TenantId,
		long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByNameIdx(long TenantId,
		String Name );
}
