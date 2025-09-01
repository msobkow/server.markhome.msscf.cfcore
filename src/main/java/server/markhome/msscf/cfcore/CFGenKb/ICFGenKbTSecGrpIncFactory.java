
// Description: Java 11 Factory interface for TSecGrpInc.

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
 *	CFGenKbTSecGrpIncFactory interface for TSecGrpInc
 */
public interface ICFGenKbTSecGrpIncFactory
{

	/**
	 *	Allocate a primary key for TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGrpIncPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGrpIncByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a GroupIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGrpIncByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a IncludeIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGrpIncByIncludeIdxKey newIncludeIdxKey();

	/**
	 *	Allocate a UIncludeIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGrpIncByUIncludeIdxKey newUIncludeIdxKey();

	/**
	 *	Allocate a TSecGrpInc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbTSecGrpIncBuff newBuff();

}
