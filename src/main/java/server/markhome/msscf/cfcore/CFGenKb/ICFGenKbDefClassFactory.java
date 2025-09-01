
// Description: Java 11 Factory interface for DefClass.

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
 *	CFGenKbDefClassFactory interface for DefClass
 */
public interface ICFGenKbDefClassFactory
{

	/**
	 *	Allocate a primary key for DefClass instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbDefClassPKey newPKey();

	/**
	 *	Allocate a NameIdx key over DefClass instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbDefClassByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a BaseIdx key over DefClass instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbDefClassByBaseIdxKey newBaseIdxKey();

	/**
	 *	Allocate a DefClass instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbDefClassBuff newBuff();

}
