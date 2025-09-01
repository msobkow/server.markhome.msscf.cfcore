
// Description: Java 11 Factory interface for GenFile.

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
 *	CFGenKbGenFileFactory interface for GenFile
 */
public interface ICFGenKbGenFileFactory
{

	/**
	 *	Allocate a XSrcBundle key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXSrcBundleKey newXSrcBundleKey();

	/**
	 *	Allocate a XModName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXModNameKey newXModNameKey();

	/**
	 *	Allocate a XBasePkg key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXBasePkgKey newXBasePkgKey();

	/**
	 *	Allocate a XSubPkg key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXSubPkgKey newXSubPkgKey();

	/**
	 *	Allocate a XExpClsName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXExpClsNameKey newXExpClsNameKey();

	/**
	 *	Allocate a XExpKeyName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXExpKeyNameKey newXExpKeyNameKey();

	/**
	 *	Allocate a XExpFileName key over GenFile instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileByXExpFileNameKey newXExpFileNameKey();

	/**
	 *	Allocate a GenFile instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenFileBuff newBuff();

}
