
// Description: Java 11 Default Factory implementation for GelPop.

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
	 *	CFGenKbGelPopFactory implementation for GelPop
	 */
public class CFGenKbGelPopDefaultFactory
	implements ICFGenKbGelPopFactory
{
	public CFGenKbGelPopDefaultFactory() {
	}

	public CFGenKbGelPopByRemainderIdxKey newRemainderIdxKey() {
		CFGenKbGelPopByRemainderIdxKey key =
			new CFGenKbGelPopByRemainderIdxKey();
		return( key );
	}

	public CFGenKbGelPopBuff newBuff() {
		CFGenKbGelPopBuff buff =
			new CFGenKbGelPopBuff();
		return( buff );
	}
}
