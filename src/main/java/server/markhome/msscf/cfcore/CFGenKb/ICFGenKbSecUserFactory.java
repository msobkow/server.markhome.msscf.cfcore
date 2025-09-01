
// Description: Java 11 Factory interface for SecUser.

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
 *	CFGenKbSecUserFactory interface for SecUser
 */
public interface ICFGenKbSecUserFactory
{

	/**
	 *	Allocate a primary key for SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserPKey newPKey();

	/**
	 *	Allocate a ULoginIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByULoginIdxKey newULoginIdxKey();

	/**
	 *	Allocate a EMConfIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByEMConfIdxKey newEMConfIdxKey();

	/**
	 *	Allocate a PwdResetIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByPwdResetIdxKey newPwdResetIdxKey();

	/**
	 *	Allocate a DefDevIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserByDefDevIdxKey newDefDevIdxKey();

	/**
	 *	Allocate a SecUser instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecUserBuff newBuff();

}
