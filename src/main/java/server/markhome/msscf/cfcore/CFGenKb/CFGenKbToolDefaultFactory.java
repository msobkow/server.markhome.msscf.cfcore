
// Description: Java 11 Default Factory implementation for Tool.

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
	 *	CFGenKbToolFactory implementation for Tool
	 */
public class CFGenKbToolDefaultFactory
	implements ICFGenKbToolFactory
{
	public CFGenKbToolDefaultFactory() {
	}

	public CFGenKbToolPKey newPKey() {
		CFGenKbToolPKey pkey =
			new CFGenKbToolPKey();
		return( pkey );
	}

	public CFGenKbToolByNameIdxKey newNameIdxKey() {
		CFGenKbToolByNameIdxKey key =
			new CFGenKbToolByNameIdxKey();
		return( key );
	}

	public CFGenKbToolByReplacesIdxKey newReplacesIdxKey() {
		CFGenKbToolByReplacesIdxKey key =
			new CFGenKbToolByReplacesIdxKey();
		return( key );
	}

	public CFGenKbToolBuff newBuff() {
		CFGenKbToolBuff buff =
			new CFGenKbToolBuff();
		return( buff );
	}
}
