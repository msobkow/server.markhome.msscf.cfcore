
// Description: Java 11 Factory interface for Tool.

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
 *	CFGenKbToolFactory interface for Tool
 */
public interface ICFGenKbToolFactory
{

	/**
	 *	Allocate a primary key for Tool instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolPKey newPKey();

	/**
	 *	Allocate a NameIdx key over Tool instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a ReplacesIdx key over Tool instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolByReplacesIdxKey newReplacesIdxKey();

	/**
	 *	Allocate a Tool instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolBuff newBuff();

}
