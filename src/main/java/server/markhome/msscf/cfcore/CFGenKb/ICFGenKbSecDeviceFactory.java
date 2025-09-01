
// Description: Java 11 Factory interface for SecDevice.

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
 *	CFGenKbSecDeviceFactory interface for SecDevice
 */
public interface ICFGenKbSecDeviceFactory
{

	/**
	 *	Allocate a primary key for SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecDevicePKey newPKey();

	/**
	 *	Allocate a NameIdx key over SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecDeviceByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a UserIdx key over SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecDeviceByUserIdxKey newUserIdxKey();

	/**
	 *	Allocate a SecDevice instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbSecDeviceBuff newBuff();

}
