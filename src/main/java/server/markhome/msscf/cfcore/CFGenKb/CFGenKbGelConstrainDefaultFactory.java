
// Description: Java 11 Default Factory implementation for GelConstrain.

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
	 *	CFGenKbGelConstrainFactory implementation for GelConstrain
	 */
public class CFGenKbGelConstrainDefaultFactory
	implements ICFGenKbGelConstrainFactory
{
	public CFGenKbGelConstrainDefaultFactory() {
	}

	public CFGenKbGelConstrainByRemainderIdxKey newRemainderIdxKey() {
		CFGenKbGelConstrainByRemainderIdxKey key =
			new CFGenKbGelConstrainByRemainderIdxKey();
		return( key );
	}

	public CFGenKbGelConstrainBuff newBuff() {
		CFGenKbGelConstrainBuff buff =
			new CFGenKbGelConstrainBuff();
		return( buff );
	}
}
