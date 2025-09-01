
// Description: Java 11 Default Factory implementation for GelCounter.

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
	 *	CFGenKbGelCounterFactory implementation for GelCounter
	 */
public class CFGenKbGelCounterDefaultFactory
	implements ICFGenKbGelCounterFactory
{
	public CFGenKbGelCounterDefaultFactory() {
	}

	public CFGenKbGelCounterBuff newBuff() {
		CFGenKbGelCounterBuff buff =
			new CFGenKbGelCounterBuff();
		return( buff );
	}
}
