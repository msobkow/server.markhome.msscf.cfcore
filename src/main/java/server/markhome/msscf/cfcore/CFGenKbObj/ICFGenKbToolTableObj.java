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

public interface ICFGenKbToolTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Tool instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbToolObj newInstance();

	/**
	 *	Instantiate a new Tool edition of the specified Tool instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbToolEditObj newEditInstance( ICFGenKbToolObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbToolObj realiseTool( ICFGenKbToolObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbToolObj createTool( ICFGenKbToolObj Obj );

	/**
	 *	Read a Tool-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tool-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbToolObj readTool( CFGenKbToolPKey pkey );

	/**
	 *	Read a Tool-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tool-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbToolObj readTool( CFGenKbToolPKey pkey,
		boolean forceRead );

	ICFGenKbToolObj readCachedTool( CFGenKbToolPKey pkey );

	public void reallyDeepDisposeTool( ICFGenKbToolObj obj );

	void deepDisposeTool( CFGenKbToolPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbToolObj lockTool( CFGenKbToolPKey pkey );

	/**
	 *	Return a sorted list of all the Tool-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbToolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbToolObj> readAllTool();

	/**
	 *	Return a sorted map of all the Tool-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbToolObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbToolObj> readAllTool( boolean forceRead );

	List<ICFGenKbToolObj> readCachedAllTool();

	/**
	 *	Get the CFGenKbToolObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbToolObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbToolObj readToolByIdIdx( short Id );

	/**
	 *	Get the CFGenKbToolObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbToolObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbToolObj readToolByIdIdx( short Id,
		boolean forceRead );

	/**
	 *	Get the CFGenKbToolObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbToolObj cached instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbToolObj readToolByNameIdx(String Name );

	/**
	 *	Get the CFGenKbToolObj instance for the unique NameIdx key.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbToolObj refreshed instance for the unique NameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbToolObj readToolByNameIdx(String Name,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbToolObj instances sorted by their primary keys for the duplicate ReplacesIdx key.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbToolObj cached instances sorted by their primary keys for the duplicate ReplacesIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId );

	/**
	 *	Get the map of CFGenKbToolObj instances sorted by their primary keys for the duplicate ReplacesIdx key.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbToolObj cached instances sorted by their primary keys for the duplicate ReplacesIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId,
		boolean forceRead );

	ICFGenKbToolObj readCachedToolByIdIdx( short Id );

	ICFGenKbToolObj readCachedToolByNameIdx( String Name );

	List<ICFGenKbToolObj> readCachedToolByReplacesIdx( Short ReplacesId );

	void deepDisposeToolByIdIdx( short Id );

	void deepDisposeToolByNameIdx( String Name );

	void deepDisposeToolByReplacesIdx( Short ReplacesId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbToolObj updateTool( ICFGenKbToolObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTool( ICFGenKbToolObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByIdIdx( short Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByNameIdx(String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	argReplacesId	The Tool key attribute of the instance generating the id.
	 */
	void deleteToolByReplacesIdx( Short ReplacesId );
}
