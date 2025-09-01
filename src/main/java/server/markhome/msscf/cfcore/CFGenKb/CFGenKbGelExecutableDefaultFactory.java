
// Description: Java 11 Default Factory implementation for GelExecutable.

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
	 *	CFGenKbGelExecutableFactory implementation for GelExecutable
	 */
public class CFGenKbGelExecutableDefaultFactory
	implements ICFGenKbGelExecutableFactory
{
	public CFGenKbGelExecutableDefaultFactory() {
	}

	public CFGenKbGelExecutableByGenItemIdxKey newGenItemIdxKey() {
		CFGenKbGelExecutableByGenItemIdxKey key =
			new CFGenKbGelExecutableByGenItemIdxKey();
		return( key );
	}

	public CFGenKbGelExecutableBuff newBuff() {
		CFGenKbGelExecutableBuff buff =
			new CFGenKbGelExecutableBuff();
		return( buff );
	}
}
