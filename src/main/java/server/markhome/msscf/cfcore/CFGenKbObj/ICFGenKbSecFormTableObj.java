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

public interface ICFGenKbSecFormTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecForm instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbSecFormObj newInstance();

	/**
	 *	Instantiate a new SecForm edition of the specified SecForm instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbSecFormEditObj newEditInstance( ICFGenKbSecFormObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecFormObj realiseSecForm( ICFGenKbSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecFormObj createSecForm( ICFGenKbSecFormObj Obj );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecFormObj readSecForm( CFGenKbSecFormPKey pkey );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbSecFormObj readSecForm( CFGenKbSecFormPKey pkey,
		boolean forceRead );

	ICFGenKbSecFormObj readCachedSecForm( CFGenKbSecFormPKey pkey );

	public void reallyDeepDisposeSecForm( ICFGenKbSecFormObj obj );

	void deepDisposeSecForm( CFGenKbSecFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecFormObj lockSecForm( CFGenKbSecFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecFormObj> readAllSecForm();

	/**
	 *	Return a sorted map of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecFormObj> readAllSecForm( boolean forceRead );

	List<ICFGenKbSecFormObj> readCachedAllSecForm();

	/**
	 *	Return a sorted map of a page of the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Get the CFGenKbSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the CFGenKbSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of CFGenKbSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of CFGenKbSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the CFGenKbSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecFormObj cached instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Get the CFGenKbSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbSecFormObj refreshed instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName,
		boolean forceRead );

	ICFGenKbSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId );

	List<ICFGenKbSecFormObj> readCachedSecFormByClusterIdx( long ClusterId );

	List<ICFGenKbSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	ICFGenKbSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	void deepDisposeSecFormByIdIdx( long ClusterId,
		int SecFormId );

	void deepDisposeSecFormByClusterIdx( long ClusterId );

	void deepDisposeSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFGenKbSecFormObj> pageSecFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecAppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFGenKbSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbSecFormObj updateSecForm( ICFGenKbSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecForm( ICFGenKbSecFormObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );
}
