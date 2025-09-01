
// Description: Java 11 DbIO interface for RuleType.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

/*
 *	CFGenKbRuleTypeTable database interface for RuleType
 */
public interface ICFGenKbRuleTypeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRuleType( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRuleType( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRuleType( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypeBuff Buff );
	/**
	 *	Delete the RuleType instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 */
	void deleteRuleTypeByIdIdx( CFGenKbAuthorization Authorization,
		short argId );

	/**
	 *	Delete the RuleType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRuleTypeByIdIdx( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypePKey argKey );
	/**
	 *	Delete the RuleType instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 */
	void deleteRuleTypeByNameIdx( CFGenKbAuthorization Authorization,
		String argName );

	/**
	 *	Delete the RuleType instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRuleTypeByNameIdx( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypeByNameIdxKey argKey );


	/**
	 *	Read the derived RuleType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleTypeBuff readDerived( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypePKey PKey );

	/**
	 *	Lock the derived RuleType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleTypeBuff lockDerived( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypePKey PKey );

	/**
	 *	Read all RuleType instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFGenKbRuleTypeBuff[] readAllDerived( CFGenKbAuthorization Authorization );

	/**
	 *	Read the derived RuleType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleTypeBuff readDerivedByIdIdx( CFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the derived RuleType buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleTypeBuff readDerivedByNameIdx( CFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific RuleType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleTypeBuff readBuff( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypePKey PKey );

	/**
	 *	Lock the specific RuleType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleTypeBuff lockBuff( CFGenKbAuthorization Authorization,
		CFGenKbRuleTypePKey PKey );

	/**
	 *	Read all the specific RuleType buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RuleType instances in the database accessible for the Authorization.
	 */
	CFGenKbRuleTypeBuff[] readAllBuff( CFGenKbAuthorization Authorization );

	/**
	 *	Read the specific RuleType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argId	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleTypeBuff readBuffByIdIdx( CFGenKbAuthorization Authorization,
		short Id );

	/**
	 *	Read the specific RuleType buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The RuleType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleTypeBuff readBuffByNameIdx( CFGenKbAuthorization Authorization,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
