
// Description: Java 11 Default Factory implementation for GelSpread.

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
	 *	CFGenKbGelSpreadFactory implementation for GelSpread
	 */
public class CFGenKbGelSpreadDefaultFactory
	implements ICFGenKbGelSpreadFactory
{
	public CFGenKbGelSpreadDefaultFactory() {
	}

	public CFGenKbGelSpreadByBetweenIdxKey newBetweenIdxKey() {
		CFGenKbGelSpreadByBetweenIdxKey key =
			new CFGenKbGelSpreadByBetweenIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadByBeforeIdxKey newBeforeIdxKey() {
		CFGenKbGelSpreadByBeforeIdxKey key =
			new CFGenKbGelSpreadByBeforeIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadByFirstIdxKey newFirstIdxKey() {
		CFGenKbGelSpreadByFirstIdxKey key =
			new CFGenKbGelSpreadByFirstIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadByEachIdxKey newEachIdxKey() {
		CFGenKbGelSpreadByEachIdxKey key =
			new CFGenKbGelSpreadByEachIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadByLastIdxKey newLastIdxKey() {
		CFGenKbGelSpreadByLastIdxKey key =
			new CFGenKbGelSpreadByLastIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadByLoneIdxKey newLoneIdxKey() {
		CFGenKbGelSpreadByLoneIdxKey key =
			new CFGenKbGelSpreadByLoneIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadByEmptyIdxKey newEmptyIdxKey() {
		CFGenKbGelSpreadByEmptyIdxKey key =
			new CFGenKbGelSpreadByEmptyIdxKey();
		return( key );
	}

	public CFGenKbGelSpreadBuff newBuff() {
		CFGenKbGelSpreadBuff buff =
			new CFGenKbGelSpreadBuff();
		return( buff );
	}
}
