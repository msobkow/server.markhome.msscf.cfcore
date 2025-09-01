
// Description: Java 11 Factory interface for SecApp.

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
 *	CFGenKbSecAppFactory interface for SecApp
 */
public interface ICFGenKbSecAppFactory
{

	/**
	 *	Allocate a primary key for SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecAppPKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecAppByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UJEEMountIdx key over SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecAppByUJEEMountIdxKey newUJEEMountIdxKey();

	/**
	 *	Allocate a SecApp instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecAppBuff newBuff();

}
