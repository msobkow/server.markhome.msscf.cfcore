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

public interface ICFGenKbClusterTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new Cluster instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbClusterObj newInstance();

	/**
	 *	Instantiate a new Cluster edition of the specified Cluster instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbClusterEditObj newEditInstance( ICFGenKbClusterObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbClusterObj realiseCluster( ICFGenKbClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbClusterObj createCluster( ICFGenKbClusterObj Obj );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbClusterObj readCluster( CFGenKbClusterPKey pkey );

	/**
	 *	Read a Cluster-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Cluster-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbClusterObj readCluster( CFGenKbClusterPKey pkey,
		boolean forceRead );

	ICFGenKbClusterObj readCachedCluster( CFGenKbClusterPKey pkey );

	public void reallyDeepDisposeCluster( ICFGenKbClusterObj obj );

	void deepDisposeCluster( CFGenKbClusterPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbClusterObj lockCluster( CFGenKbClusterPKey pkey );

	/**
	 *	Return a sorted list of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbClusterObj> readAllCluster();

	/**
	 *	Return a sorted map of all the Cluster-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbClusterObj> readAllCluster( boolean forceRead );

	List<ICFGenKbClusterObj> readCachedAllCluster();

	/**
	 *	Return a sorted map of a page of the Cluster-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbClusterObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbClusterObj> pageAllCluster(Long priorId );

	/**
	 *	Get the CFGenKbClusterObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbClusterObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbClusterObj readClusterByIdIdx( long Id );

	/**
	 *	Get the CFGenKbClusterObj instance for the primary key attributes.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbClusterObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbClusterObj readClusterByIdIdx( long Id,
		boolean forceRead );

	/**
	 *	Get the CFGenKbClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbClusterObj cached instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbClusterObj readClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Get the CFGenKbClusterObj instance for the unique UDomNameIdx key.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbClusterObj refreshed instance for the unique UDomNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbClusterObj readClusterByUDomNameIdx(String FullDomName,
		boolean forceRead );

	/**
	 *	Get the CFGenKbClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbClusterObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbClusterObj readClusterByUDescrIdx(String Description );

	/**
	 *	Get the CFGenKbClusterObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbClusterObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbClusterObj readClusterByUDescrIdx(String Description,
		boolean forceRead );

	ICFGenKbClusterObj readCachedClusterByIdIdx( long Id );

	ICFGenKbClusterObj readCachedClusterByUDomNameIdx( String FullDomName );

	ICFGenKbClusterObj readCachedClusterByUDescrIdx( String Description );

	void deepDisposeClusterByIdIdx( long Id );

	void deepDisposeClusterByUDomNameIdx( String FullDomName );

	void deepDisposeClusterByUDescrIdx( String Description );

	/**
	 *	Internal use only.
	 */
	ICFGenKbClusterObj updateCluster( ICFGenKbClusterObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteCluster( ICFGenKbClusterObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argId	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByIdIdx( long Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	argFullDomName	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByUDomNameIdx(String FullDomName );

	/**
	 *	Internal use only.
	 *
	 *	@param	argDescription	The Cluster key attribute of the instance generating the id.
	 */
	void deleteClusterByUDescrIdx(String Description );

	ICFGenKbClusterObj getSystemCluster();
}
