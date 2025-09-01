
// Description: Java 11 Factory interface for GelIterator.

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
 *	CFGenKbGelIteratorFactory interface for GelIterator
 */
public interface ICFGenKbGelIteratorFactory
{

	/**
	 *	Allocate a BeforeIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorByBeforeIdxKey newBeforeIdxKey();

	/**
	 *	Allocate a FirstIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorByFirstIdxKey newFirstIdxKey();

	/**
	 *	Allocate a EachIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorByEachIdxKey newEachIdxKey();

	/**
	 *	Allocate a LastIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorByLastIdxKey newLastIdxKey();

	/**
	 *	Allocate a LoneIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorByLoneIdxKey newLoneIdxKey();

	/**
	 *	Allocate a EmptyIdx key over GelIterator instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorByEmptyIdxKey newEmptyIdxKey();

	/**
	 *	Allocate a GelIterator instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelIteratorBuff newBuff();

}
