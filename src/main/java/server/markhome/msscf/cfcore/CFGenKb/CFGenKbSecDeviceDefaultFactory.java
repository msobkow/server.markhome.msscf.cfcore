
// Description: Java 11 Default Factory implementation for SecDevice.

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

	/*
	 *	CFGenKbSecDeviceFactory implementation for SecDevice
	 */
public class CFGenKbSecDeviceDefaultFactory
	implements ICFGenKbSecDeviceFactory
{
	public CFGenKbSecDeviceDefaultFactory() {
	}

	public CFGenKbSecDevicePKey newPKey() {
		CFGenKbSecDevicePKey pkey =
			new CFGenKbSecDevicePKey();
		return( pkey );
	}

	public CFGenKbSecDeviceByNameIdxKey newNameIdxKey() {
		CFGenKbSecDeviceByNameIdxKey key =
			new CFGenKbSecDeviceByNameIdxKey();
		return( key );
	}

	public CFGenKbSecDeviceByUserIdxKey newUserIdxKey() {
		CFGenKbSecDeviceByUserIdxKey key =
			new CFGenKbSecDeviceByUserIdxKey();
		return( key );
	}

	public CFGenKbSecDeviceBuff newBuff() {
		CFGenKbSecDeviceBuff buff =
			new CFGenKbSecDeviceBuff();
		return( buff );
	}
}
