
// Description: Java 11 Default Factory implementation for GelBuiltin.

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
	 *	CFGenKbGelBuiltinFactory implementation for GelBuiltin
	 */
public class CFGenKbGelBuiltinDefaultFactory
	implements ICFGenKbGelBuiltinFactory
{
	public CFGenKbGelBuiltinDefaultFactory() {
	}

	public CFGenKbGelBuiltinBuff newBuff() {
		CFGenKbGelBuiltinBuff buff =
			new CFGenKbGelBuiltinBuff();
		return( buff );
	}
}
