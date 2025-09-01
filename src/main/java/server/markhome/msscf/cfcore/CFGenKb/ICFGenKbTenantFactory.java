
// Description: Java 11 Factory interface for Tenant.

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
 *	CFGenKbTenantFactory interface for Tenant
 */
public interface ICFGenKbTenantFactory
{

	/**
	 *	Allocate a primary key for Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTenantPKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTenantByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UNameIdx key over Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTenantByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a Tenant instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTenantBuff newBuff();

}
