
// Description: Java 11 Default Factory implementation for GenItem.

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
	 *	CFGenKbGenItemFactory implementation for GenItem
	 */
public class CFGenKbGenItemDefaultFactory
	implements ICFGenKbGenItemFactory
{
	public CFGenKbGenItemDefaultFactory() {
	}

	public CFGenKbGenItemPKey newPKey() {
		CFGenKbGenItemPKey pkey =
			new CFGenKbGenItemPKey();
		return( pkey );
	}

	public CFGenKbGenItemByTenantIdxKey newTenantIdxKey() {
		CFGenKbGenItemByTenantIdxKey key =
			new CFGenKbGenItemByTenantIdxKey();
		return( key );
	}

	public CFGenKbGenItemByCartIdxKey newCartIdxKey() {
		CFGenKbGenItemByCartIdxKey key =
			new CFGenKbGenItemByCartIdxKey();
		return( key );
	}

	public CFGenKbGenItemByRuleTypeIdxKey newRuleTypeIdxKey() {
		CFGenKbGenItemByRuleTypeIdxKey key =
			new CFGenKbGenItemByRuleTypeIdxKey();
		return( key );
	}

	public CFGenKbGenItemByToolSetIdxKey newToolSetIdxKey() {
		CFGenKbGenItemByToolSetIdxKey key =
			new CFGenKbGenItemByToolSetIdxKey();
		return( key );
	}

	public CFGenKbGenItemByScopeIdxKey newScopeIdxKey() {
		CFGenKbGenItemByScopeIdxKey key =
			new CFGenKbGenItemByScopeIdxKey();
		return( key );
	}

	public CFGenKbGenItemByGenDefIdxKey newGenDefIdxKey() {
		CFGenKbGenItemByGenDefIdxKey key =
			new CFGenKbGenItemByGenDefIdxKey();
		return( key );
	}

	public CFGenKbGenItemByAltIdxKey newAltIdxKey() {
		CFGenKbGenItemByAltIdxKey key =
			new CFGenKbGenItemByAltIdxKey();
		return( key );
	}

	public CFGenKbGenItemByGelExecIdxKey newGelExecIdxKey() {
		CFGenKbGenItemByGelExecIdxKey key =
			new CFGenKbGenItemByGelExecIdxKey();
		return( key );
	}

	public CFGenKbGenItemByProbeIdxKey newProbeIdxKey() {
		CFGenKbGenItemByProbeIdxKey key =
			new CFGenKbGenItemByProbeIdxKey();
		return( key );
	}

	public CFGenKbGenItemBuff newBuff() {
		CFGenKbGenItemBuff buff =
			new CFGenKbGenItemBuff();
		return( buff );
	}
}
