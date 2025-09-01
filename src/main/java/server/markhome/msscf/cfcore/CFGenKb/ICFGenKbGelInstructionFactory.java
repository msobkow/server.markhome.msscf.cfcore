
// Description: Java 11 Factory interface for GelInstruction.

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
 *	CFGenKbGelInstructionFactory interface for GelInstruction
 */
public interface ICFGenKbGelInstructionFactory
{

	/**
	 *	Allocate a primary key for GelInstruction instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelInstructionPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over GelInstruction instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelInstructionByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a GelCacheIdx key over GelInstruction instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelInstructionByGelCacheIdxKey newGelCacheIdxKey();

	/**
	 *	Allocate a ChainIdx key over GelInstruction instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelInstructionByChainIdxKey newChainIdxKey();

	/**
	 *	Allocate a GelInstruction instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelInstructionBuff newBuff();

}
