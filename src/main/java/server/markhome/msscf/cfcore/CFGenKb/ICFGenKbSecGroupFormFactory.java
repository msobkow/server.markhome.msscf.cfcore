
// Description: Java 11 Factory interface for SecGroupForm.

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
 *	CFGenKbSecGroupFormFactory interface for SecGroupForm
 */
public interface ICFGenKbSecGroupFormFactory
{

	/**
	 *	Allocate a primary key for SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormPKey newPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a GroupIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a AppIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormByAppIdxKey newAppIdxKey();

	/**
	 *	Allocate a FormIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormByFormIdxKey newFormIdxKey();

	/**
	 *	Allocate a UFormIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormByUFormIdxKey newUFormIdxKey();

	/**
	 *	Allocate a SecGroupForm instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecGroupFormBuff newBuff();

}
