
// Description: Java 11 Default Factory implementation for SecGroupForm.

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
	 *	CFGenKbSecGroupFormFactory implementation for SecGroupForm
	 */
public class CFGenKbSecGroupFormDefaultFactory
	implements ICFGenKbSecGroupFormFactory
{
	public CFGenKbSecGroupFormDefaultFactory() {
	}

	public CFGenKbSecGroupFormPKey newPKey() {
		CFGenKbSecGroupFormPKey pkey =
			new CFGenKbSecGroupFormPKey();
		return( pkey );
	}

	public CFGenKbSecGroupFormByClusterIdxKey newClusterIdxKey() {
		CFGenKbSecGroupFormByClusterIdxKey key =
			new CFGenKbSecGroupFormByClusterIdxKey();
		return( key );
	}

	public CFGenKbSecGroupFormByGroupIdxKey newGroupIdxKey() {
		CFGenKbSecGroupFormByGroupIdxKey key =
			new CFGenKbSecGroupFormByGroupIdxKey();
		return( key );
	}

	public CFGenKbSecGroupFormByAppIdxKey newAppIdxKey() {
		CFGenKbSecGroupFormByAppIdxKey key =
			new CFGenKbSecGroupFormByAppIdxKey();
		return( key );
	}

	public CFGenKbSecGroupFormByFormIdxKey newFormIdxKey() {
		CFGenKbSecGroupFormByFormIdxKey key =
			new CFGenKbSecGroupFormByFormIdxKey();
		return( key );
	}

	public CFGenKbSecGroupFormByUFormIdxKey newUFormIdxKey() {
		CFGenKbSecGroupFormByUFormIdxKey key =
			new CFGenKbSecGroupFormByUFormIdxKey();
		return( key );
	}

	public CFGenKbSecGroupFormBuff newBuff() {
		CFGenKbSecGroupFormBuff buff =
			new CFGenKbSecGroupFormBuff();
		return( buff );
	}
}
