
// Description: Java 11 Factory interface for SecGrpInc.

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
 *	CFGenKbSecGrpIncFactory interface for SecGrpInc
 */
public interface ICFGenKbSecGrpIncFactory
{

	/**
	 *	Allocate a primary key for SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGrpIncPKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGrpIncByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a GroupIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGrpIncByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a IncludeIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGrpIncByIncludeIdxKey newIncludeIdxKey();

	/**
	 *	Allocate a UIncludeIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGrpIncByUIncludeIdxKey newUIncludeIdxKey();

	/**
	 *	Allocate a SecGrpInc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGrpIncBuff newBuff();

}
