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

public interface ICFGenKbDefClassTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new DefClass instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbDefClassObj newInstance();

	/**
	 *	Instantiate a new DefClass edition of the specified DefClass instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbDefClassEditObj newEditInstance( ICFGenKbDefClassObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbDefClassObj realiseDefClass( ICFGenKbDefClassObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbDefClassObj createDefClass( ICFGenKbDefClassObj Obj );

	/**
	 *	Read a DefClass-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DefClass-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbDefClassObj readDefClass( CFGenKbDefClassPKey pkey );

	/**
	 *	Read a DefClass-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DefClass-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbDefClassObj readDefClass( CFGenKbDefClassPKey pkey,
		boolean forceRead );

	ICFGenKbDefClassObj readCachedDefClass( CFGenKbDefClassPKey pkey );

	public void reallyDeepDisposeDefClass( ICFGenKbDefClassObj obj );

	void deepDisposeDefClass( CFGenKbDefClassPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbDefClassObj lockDefClass( CFGenKbDefClassPKey pkey );

	/**
	 *	Return a sorted list of all the DefClass-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbDefClassObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbDefClassObj> readAllDefClass();

	/**
	 *	Return a sorted map of all the DefClass-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbDefClassObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbDefClassObj> readAllDefClass( boolean forceRead );

	List<ICFGenKbDefClassObj> readCachedAllDefClass();

	/**
	 *	Get the CFGenKbDefClassObj instance for the primary key attributes.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbDefClassObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbDefClassObj readDefClassByIdIdx( short Id );

	/**
	 *	Get the CFGenKbDefClassObj instance for the primary key attributes.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbDefClassObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbDefClassObj readDefClassByIdIdx( short Id,
		boolean forceRead );

	/**
	 *	Get the CFGenKbDefClassObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbDefClassObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbDefClassObj readDefClassByNameIdx(String Name );

	/**
	 *	Get the CFGenKbDefClassObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbDefClassObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbDefClassObj readDefClassByNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbDefClassObj instances sorted by their primary keys for the duplicate BaseIdx key.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbDefClassObj cached instances sorted by their primary keys for the duplicate BaseIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId );

	/**
	 *	Get the map of CFGenKbDefClassObj instances sorted by their primary keys for the duplicate BaseIdx key.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbDefClassObj cached instances sorted by their primary keys for the duplicate BaseIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbDefClassObj> readDefClassByBaseIdx( Short BaseId,
		boolean forceRead );

	ICFGenKbDefClassObj readCachedDefClassByIdIdx( short Id );

	ICFGenKbDefClassObj readCachedDefClassByNameIdx( String Name );

	List<ICFGenKbDefClassObj> readCachedDefClassByBaseIdx( Short BaseId );

	void deepDisposeDefClassByIdIdx( short Id );

	void deepDisposeDefClassByNameIdx( String Name );

	void deepDisposeDefClassByBaseIdx( Short BaseId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbDefClassObj updateDefClass( ICFGenKbDefClassObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDefClass( ICFGenKbDefClassObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByIdIdx( short Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argBaseId	The DefClass key attribute of the instance generating the id.
	 */
	void deleteDefClassByBaseIdx( Short BaseId );
}
