
// Description: Java 11 Factory interface for SysCluster.

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
 *	CFGenKbSysClusterFactory interface for SysCluster
 */
public interface ICFGenKbSysClusterFactory
{

	/**
	 *	Allocate a primary key for SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSysClusterPKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSysClusterByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a SysCluster instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSysClusterBuff newBuff();

}
