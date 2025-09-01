
// Description: Java 11 Default Factory implementation for GelInstruction.

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

	/*
	 *	CFGenKbGelInstructionFactory implementation for GelInstruction
	 */
public class CFGenKbGelInstructionDefaultFactory
	implements ICFGenKbGelInstructionFactory
{
	public CFGenKbGelInstructionDefaultFactory() {
	}

	public CFGenKbGelInstructionPKey newPKey() {
		CFGenKbGelInstructionPKey pkey =
			new CFGenKbGelInstructionPKey();
		return( pkey );
	}

	public CFGenKbGelInstructionByTenantIdxKey newTenantIdxKey() {
		CFGenKbGelInstructionByTenantIdxKey key =
			new CFGenKbGelInstructionByTenantIdxKey();
		return( key );
	}

	public CFGenKbGelInstructionByGelCacheIdxKey newGelCacheIdxKey() {
		CFGenKbGelInstructionByGelCacheIdxKey key =
			new CFGenKbGelInstructionByGelCacheIdxKey();
		return( key );
	}

	public CFGenKbGelInstructionByChainIdxKey newChainIdxKey() {
		CFGenKbGelInstructionByChainIdxKey key =
			new CFGenKbGelInstructionByChainIdxKey();
		return( key );
	}

	public CFGenKbGelInstructionBuff newBuff() {
		CFGenKbGelInstructionBuff buff =
			new CFGenKbGelInstructionBuff();
		return( buff );
	}
}
