
// Description: Java 11 Factory interface for ToolSet.

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
 *	CFGenKbToolSetFactory interface for ToolSet
 */
public interface ICFGenKbToolSetFactory
{

	/**
	 *	Allocate a primary key for ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetPKey newPKey();

	/**
	 *	Allocate a NameIdx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a Tool0Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool0IdxKey newTool0IdxKey();

	/**
	 *	Allocate a Tool1Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool1IdxKey newTool1IdxKey();

	/**
	 *	Allocate a Tool2Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool2IdxKey newTool2IdxKey();

	/**
	 *	Allocate a Tool3Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool3IdxKey newTool3IdxKey();

	/**
	 *	Allocate a Tool4Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool4IdxKey newTool4IdxKey();

	/**
	 *	Allocate a Tool5Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool5IdxKey newTool5IdxKey();

	/**
	 *	Allocate a Tool6Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool6IdxKey newTool6IdxKey();

	/**
	 *	Allocate a Tool7Idx key over ToolSet instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetByTool7IdxKey newTool7IdxKey();

	/**
	 *	Allocate a ToolSet instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbToolSetBuff newBuff();

}
