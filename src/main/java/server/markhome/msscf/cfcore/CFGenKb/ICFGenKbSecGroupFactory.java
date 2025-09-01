
// Description: Java 11 Factory interface for SecGroup.

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
 *	CFGenKbSecGroupFactory interface for SecGroup
 */
public interface ICFGenKbSecGroupFactory
{

	/**
	 *	Allocate a primary key for SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupPKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a ClusterVisIdx key over SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupByClusterVisIdxKey newClusterVisIdxKey();

	/**
	 *	Allocate a UNameIdx key over SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a SecGroup instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupBuff newBuff();

}
