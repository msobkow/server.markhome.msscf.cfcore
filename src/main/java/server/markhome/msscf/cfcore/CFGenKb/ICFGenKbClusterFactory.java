
// Description: Java 11 Factory interface for Cluster.

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
 *	CFGenKbClusterFactory interface for Cluster
 */
public interface ICFGenKbClusterFactory
{

	/**
	 *	Allocate a primary key for Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbClusterPKey newPKey();

	/**
	 *	Allocate a UDomNameIdx key over Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbClusterByUDomNameIdxKey newUDomNameIdxKey();

	/**
	 *	Allocate a UDescrIdx key over Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbClusterByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a Cluster instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbClusterBuff newBuff();

}
