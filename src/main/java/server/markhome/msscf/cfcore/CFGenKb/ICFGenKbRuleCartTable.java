
// Description: Java 11 DbIO interface for RuleCart.

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
 *	CFGenKbRuleCartTable database interface for RuleCart
 */
public interface ICFGenKbRuleCartTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createRuleCart( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateRuleCart( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteRuleCart( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartBuff Buff );
	/**
	 *	Delete the RuleCart instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByIdIdx( CFGenKbAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the RuleCart instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRuleCartByIdIdx( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartPKey argKey );
	/**
	 *	Delete the RuleCart instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByTenantIdx( CFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the RuleCart instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRuleCartByTenantIdx( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartByTenantIdxKey argKey );
	/**
	 *	Delete the RuleCart instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 */
	void deleteRuleCartByNameIdx( CFGenKbAuthorization Authorization,
		long argTenantId,
		String argName );

	/**
	 *	Delete the RuleCart instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRuleCartByNameIdx( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartByNameIdxKey argKey );


	/**
	 *	Read the derived RuleCart buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleCartBuff readDerived( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartPKey PKey );

	/**
	 *	Lock the derived RuleCart buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleCartBuff lockDerived( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartPKey PKey );

	/**
	 *	Read all RuleCart instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFGenKbRuleCartBuff[] readAllDerived( CFGenKbAuthorization Authorization );

	/**
	 *	Read the derived RuleCart buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleCartBuff readDerivedByIdIdx( CFGenKbAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived RuleCart buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFGenKbRuleCartBuff[] readDerivedByTenantIdx( CFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read the derived RuleCart buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFGenKbRuleCartBuff readDerivedByNameIdx( CFGenKbAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Read the specific RuleCart buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleCartBuff readBuff( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartPKey PKey );

	/**
	 *	Lock the specific RuleCart buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RuleCart instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleCartBuff lockBuff( CFGenKbAuthorization Authorization,
		CFGenKbRuleCartPKey PKey );

	/**
	 *	Read all the specific RuleCart buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RuleCart instances in the database accessible for the Authorization.
	 */
	CFGenKbRuleCartBuff[] readAllBuff( CFGenKbAuthorization Authorization );

	/**
	 *	Read the specific RuleCart buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleCartBuff readBuffByIdIdx( CFGenKbAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific RuleCart buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleCartBuff[] readBuffByTenantIdx( CFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read the specific RuleCart buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@param	argName	The RuleCart key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFGenKbRuleCartBuff readBuffByNameIdx( CFGenKbAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
