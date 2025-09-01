
// Description: Java 11 Default Factory implementation for GelReference.

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
	 *	CFGenKbGelReferenceFactory implementation for GelReference
	 */
public class CFGenKbGelReferenceDefaultFactory
	implements ICFGenKbGelReferenceFactory
{
	public CFGenKbGelReferenceDefaultFactory() {
	}

	public CFGenKbGelReferenceByRemainderIdxKey newRemainderIdxKey() {
		CFGenKbGelReferenceByRemainderIdxKey key =
			new CFGenKbGelReferenceByRemainderIdxKey();
		return( key );
	}

	public CFGenKbGelReferenceBuff newBuff() {
		CFGenKbGelReferenceBuff buff =
			new CFGenKbGelReferenceBuff();
		return( buff );
	}
}
