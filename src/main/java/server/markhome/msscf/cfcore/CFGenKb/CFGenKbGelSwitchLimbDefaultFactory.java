
// Description: Java 11 Default Factory implementation for GelSwitchLimb.

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
	 *	CFGenKbGelSwitchLimbFactory implementation for GelSwitchLimb
	 */
public class CFGenKbGelSwitchLimbDefaultFactory
	implements ICFGenKbGelSwitchLimbFactory
{
	public CFGenKbGelSwitchLimbDefaultFactory() {
	}

	public CFGenKbGelSwitchLimbPKey newPKey() {
		CFGenKbGelSwitchLimbPKey pkey =
			new CFGenKbGelSwitchLimbPKey();
		return( pkey );
	}

	public CFGenKbGelSwitchLimbByTenantIdxKey newTenantIdxKey() {
		CFGenKbGelSwitchLimbByTenantIdxKey key =
			new CFGenKbGelSwitchLimbByTenantIdxKey();
		return( key );
	}

	public CFGenKbGelSwitchLimbBySwitchIdxKey newSwitchIdxKey() {
		CFGenKbGelSwitchLimbBySwitchIdxKey key =
			new CFGenKbGelSwitchLimbBySwitchIdxKey();
		return( key );
	}

	public CFGenKbGelSwitchLimbBuff newBuff() {
		CFGenKbGelSwitchLimbBuff buff =
			new CFGenKbGelSwitchLimbBuff();
		return( buff );
	}
}
