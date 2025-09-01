
// Description: Java 11 Default Factory implementation for SecForm.

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
	 *	CFGenKbSecFormFactory implementation for SecForm
	 */
public class CFGenKbSecFormDefaultFactory
	implements ICFGenKbSecFormFactory
{
	public CFGenKbSecFormDefaultFactory() {
	}

	public CFGenKbSecFormPKey newPKey() {
		CFGenKbSecFormPKey pkey =
			new CFGenKbSecFormPKey();
		return( pkey );
	}

	public CFGenKbSecFormByClusterIdxKey newClusterIdxKey() {
		CFGenKbSecFormByClusterIdxKey key =
			new CFGenKbSecFormByClusterIdxKey();
		return( key );
	}

	public CFGenKbSecFormBySecAppIdxKey newSecAppIdxKey() {
		CFGenKbSecFormBySecAppIdxKey key =
			new CFGenKbSecFormBySecAppIdxKey();
		return( key );
	}

	public CFGenKbSecFormByUJEEServletIdxKey newUJEEServletIdxKey() {
		CFGenKbSecFormByUJEEServletIdxKey key =
			new CFGenKbSecFormByUJEEServletIdxKey();
		return( key );
	}

	public CFGenKbSecFormBuff newBuff() {
		CFGenKbSecFormBuff buff =
			new CFGenKbSecFormBuff();
		return( buff );
	}
}
