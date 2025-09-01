
// Description: Java 11 Factory interface for TSecGroup.

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
 *	CFGenKbTSecGroupFactory interface for TSecGroup
 */
public interface ICFGenKbTSecGroupFactory
{

	/**
	 *	Allocate a primary key for TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGroupPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGroupByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a TenantVisIdx key over TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGroupByTenantVisIdxKey newTenantVisIdxKey();

	/**
	 *	Allocate a UNameIdx key over TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGroupByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a TSecGroup instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGroupBuff newBuff();

}
