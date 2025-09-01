
// Description: Java 11 Factory interface for HostNode.

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
 *	CFGenKbHostNodeFactory interface for HostNode
 */
public interface ICFGenKbHostNodeFactory
{

	/**
	 *	Allocate a primary key for HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbHostNodePKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbHostNodeByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UDescrIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbHostNodeByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a HostNameIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbHostNodeByHostNameIdxKey newHostNameIdxKey();

	/**
	 *	Allocate a HostNode instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbHostNodeBuff newBuff();

}
