
// Description: Java 11 Default Factory implementation for SecUser.

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
	 *	CFGenKbSecUserFactory implementation for SecUser
	 */
public class CFGenKbSecUserDefaultFactory
	implements ICFGenKbSecUserFactory
{
	public CFGenKbSecUserDefaultFactory() {
	}

	public CFGenKbSecUserPKey newPKey() {
		CFGenKbSecUserPKey pkey =
			new CFGenKbSecUserPKey();
		return( pkey );
	}

	public CFGenKbSecUserByULoginIdxKey newULoginIdxKey() {
		CFGenKbSecUserByULoginIdxKey key =
			new CFGenKbSecUserByULoginIdxKey();
		return( key );
	}

	public CFGenKbSecUserByEMConfIdxKey newEMConfIdxKey() {
		CFGenKbSecUserByEMConfIdxKey key =
			new CFGenKbSecUserByEMConfIdxKey();
		return( key );
	}

	public CFGenKbSecUserByPwdResetIdxKey newPwdResetIdxKey() {
		CFGenKbSecUserByPwdResetIdxKey key =
			new CFGenKbSecUserByPwdResetIdxKey();
		return( key );
	}

	public CFGenKbSecUserByDefDevIdxKey newDefDevIdxKey() {
		CFGenKbSecUserByDefDevIdxKey key =
			new CFGenKbSecUserByDefDevIdxKey();
		return( key );
	}

	public CFGenKbSecUserBuff newBuff() {
		CFGenKbSecUserBuff buff =
			new CFGenKbSecUserBuff();
		return( buff );
	}
}
