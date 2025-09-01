
// Description: Java 11 Factory interface for GelSpread.

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
 *	CFGenKbGelSpreadFactory interface for GelSpread
 */
public interface ICFGenKbGelSpreadFactory
{

	/**
	 *	Allocate a BetweenIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByBetweenIdxKey newBetweenIdxKey();

	/**
	 *	Allocate a BeforeIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByBeforeIdxKey newBeforeIdxKey();

	/**
	 *	Allocate a FirstIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByFirstIdxKey newFirstIdxKey();

	/**
	 *	Allocate a EachIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByEachIdxKey newEachIdxKey();

	/**
	 *	Allocate a LastIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByLastIdxKey newLastIdxKey();

	/**
	 *	Allocate a LoneIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByLoneIdxKey newLoneIdxKey();

	/**
	 *	Allocate a EmptyIdx key over GelSpread instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadByEmptyIdxKey newEmptyIdxKey();

	/**
	 *	Allocate a GelSpread instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSpreadBuff newBuff();

}
