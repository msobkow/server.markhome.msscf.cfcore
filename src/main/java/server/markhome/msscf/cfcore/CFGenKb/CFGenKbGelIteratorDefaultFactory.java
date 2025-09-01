
// Description: Java 11 Default Factory implementation for GelIterator.

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
	 *	CFGenKbGelIteratorFactory implementation for GelIterator
	 */
public class CFGenKbGelIteratorDefaultFactory
	implements ICFGenKbGelIteratorFactory
{
	public CFGenKbGelIteratorDefaultFactory() {
	}

	public CFGenKbGelIteratorByBeforeIdxKey newBeforeIdxKey() {
		CFGenKbGelIteratorByBeforeIdxKey key =
			new CFGenKbGelIteratorByBeforeIdxKey();
		return( key );
	}

	public CFGenKbGelIteratorByFirstIdxKey newFirstIdxKey() {
		CFGenKbGelIteratorByFirstIdxKey key =
			new CFGenKbGelIteratorByFirstIdxKey();
		return( key );
	}

	public CFGenKbGelIteratorByEachIdxKey newEachIdxKey() {
		CFGenKbGelIteratorByEachIdxKey key =
			new CFGenKbGelIteratorByEachIdxKey();
		return( key );
	}

	public CFGenKbGelIteratorByLastIdxKey newLastIdxKey() {
		CFGenKbGelIteratorByLastIdxKey key =
			new CFGenKbGelIteratorByLastIdxKey();
		return( key );
	}

	public CFGenKbGelIteratorByLoneIdxKey newLoneIdxKey() {
		CFGenKbGelIteratorByLoneIdxKey key =
			new CFGenKbGelIteratorByLoneIdxKey();
		return( key );
	}

	public CFGenKbGelIteratorByEmptyIdxKey newEmptyIdxKey() {
		CFGenKbGelIteratorByEmptyIdxKey key =
			new CFGenKbGelIteratorByEmptyIdxKey();
		return( key );
	}

	public CFGenKbGelIteratorBuff newBuff() {
		CFGenKbGelIteratorBuff buff =
			new CFGenKbGelIteratorBuff();
		return( buff );
	}
}
