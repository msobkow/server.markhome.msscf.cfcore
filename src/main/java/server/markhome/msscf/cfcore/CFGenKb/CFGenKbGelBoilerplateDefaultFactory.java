
// Description: Java 11 Default Factory implementation for GelBoilerplate.

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
	 *	CFGenKbGelBoilerplateFactory implementation for GelBoilerplate
	 */
public class CFGenKbGelBoilerplateDefaultFactory
	implements ICFGenKbGelBoilerplateFactory
{
	public CFGenKbGelBoilerplateDefaultFactory() {
	}

	public CFGenKbGelBoilerplateBuff newBuff() {
		CFGenKbGelBoilerplateBuff buff =
			new CFGenKbGelBoilerplateBuff();
		return( buff );
	}
}
