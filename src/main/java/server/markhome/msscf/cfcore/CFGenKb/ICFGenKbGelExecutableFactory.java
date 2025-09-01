
// Description: Java 11 Factory interface for GelExecutable.

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
 *	CFGenKbGelExecutableFactory interface for GelExecutable
 */
public interface ICFGenKbGelExecutableFactory
{

	/**
	 *	Allocate a GenItemIdx key over GelExecutable instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelExecutableByGenItemIdxKey newGenItemIdxKey();

	/**
	 *	Allocate a GelExecutable instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelExecutableBuff newBuff();

}
