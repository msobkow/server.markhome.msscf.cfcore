
// Description: Java 11 Default Factory implementation for DefClass.

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
	 *	CFGenKbDefClassFactory implementation for DefClass
	 */
public class CFGenKbDefClassDefaultFactory
	implements ICFGenKbDefClassFactory
{
	public CFGenKbDefClassDefaultFactory() {
	}

	public CFGenKbDefClassPKey newPKey() {
		CFGenKbDefClassPKey pkey =
			new CFGenKbDefClassPKey();
		return( pkey );
	}

	public CFGenKbDefClassByNameIdxKey newNameIdxKey() {
		CFGenKbDefClassByNameIdxKey key =
			new CFGenKbDefClassByNameIdxKey();
		return( key );
	}

	public CFGenKbDefClassByBaseIdxKey newBaseIdxKey() {
		CFGenKbDefClassByBaseIdxKey key =
			new CFGenKbDefClassByBaseIdxKey();
		return( key );
	}

	public CFGenKbDefClassBuff newBuff() {
		CFGenKbDefClassBuff buff =
			new CFGenKbDefClassBuff();
		return( buff );
	}
}
