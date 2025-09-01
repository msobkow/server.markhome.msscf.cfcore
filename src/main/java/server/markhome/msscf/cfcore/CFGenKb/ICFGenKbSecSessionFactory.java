
// Description: Java 11 Factory interface for SecSession.

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
 *	CFGenKbSecSessionFactory interface for SecSession
 */
public interface ICFGenKbSecSessionFactory
{

	/**
	 *	Allocate a primary key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionPKey newPKey();

	/**
	 *	Allocate a SecUserIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionBySecUserIdxKey newSecUserIdxKey();

	/**
	 *	Allocate a SecDevIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionBySecDevIdxKey newSecDevIdxKey();

	/**
	 *	Allocate a StartIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionByStartIdxKey newStartIdxKey();

	/**
	 *	Allocate a FinishIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionByFinishIdxKey newFinishIdxKey();

	/**
	 *	Allocate a SecProxyIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionBySecProxyIdxKey newSecProxyIdxKey();

	/**
	 *	Allocate a SecSession instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecSessionBuff newBuff();

}
