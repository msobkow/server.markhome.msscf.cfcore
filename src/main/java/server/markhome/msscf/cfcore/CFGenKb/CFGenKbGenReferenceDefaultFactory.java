
// Description: Java 11 Default Factory implementation for GenReference.

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
	 *	CFGenKbGenReferenceFactory implementation for GenReference
	 */
public class CFGenKbGenReferenceDefaultFactory
	implements ICFGenKbGenReferenceFactory
{
	public CFGenKbGenReferenceDefaultFactory() {
	}

	public CFGenKbGenReferenceBuff newBuff() {
		CFGenKbGenReferenceBuff buff =
			new CFGenKbGenReferenceBuff();
		return( buff );
	}
}
