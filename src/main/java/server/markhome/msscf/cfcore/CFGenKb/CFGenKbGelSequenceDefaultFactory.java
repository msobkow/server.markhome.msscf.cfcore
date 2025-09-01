
// Description: Java 11 Default Factory implementation for GelSequence.

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
	 *	CFGenKbGelSequenceFactory implementation for GelSequence
	 */
public class CFGenKbGelSequenceDefaultFactory
	implements ICFGenKbGelSequenceFactory
{
	public CFGenKbGelSequenceDefaultFactory() {
	}

	public CFGenKbGelSequenceByFirstInstIdxKey newFirstInstIdxKey() {
		CFGenKbGelSequenceByFirstInstIdxKey key =
			new CFGenKbGelSequenceByFirstInstIdxKey();
		return( key );
	}

	public CFGenKbGelSequenceByLastInstIdxKey newLastInstIdxKey() {
		CFGenKbGelSequenceByLastInstIdxKey key =
			new CFGenKbGelSequenceByLastInstIdxKey();
		return( key );
	}

	public CFGenKbGelSequenceBuff newBuff() {
		CFGenKbGelSequenceBuff buff =
			new CFGenKbGelSequenceBuff();
		return( buff );
	}
}
