
// Description: Java 11 Default Factory implementation for ToolSet.

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
	 *	CFGenKbToolSetFactory implementation for ToolSet
	 */
public class CFGenKbToolSetDefaultFactory
	implements ICFGenKbToolSetFactory
{
	public CFGenKbToolSetDefaultFactory() {
	}

	public CFGenKbToolSetPKey newPKey() {
		CFGenKbToolSetPKey pkey =
			new CFGenKbToolSetPKey();
		return( pkey );
	}

	public CFGenKbToolSetByNameIdxKey newNameIdxKey() {
		CFGenKbToolSetByNameIdxKey key =
			new CFGenKbToolSetByNameIdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool0IdxKey newTool0IdxKey() {
		CFGenKbToolSetByTool0IdxKey key =
			new CFGenKbToolSetByTool0IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool1IdxKey newTool1IdxKey() {
		CFGenKbToolSetByTool1IdxKey key =
			new CFGenKbToolSetByTool1IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool2IdxKey newTool2IdxKey() {
		CFGenKbToolSetByTool2IdxKey key =
			new CFGenKbToolSetByTool2IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool3IdxKey newTool3IdxKey() {
		CFGenKbToolSetByTool3IdxKey key =
			new CFGenKbToolSetByTool3IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool4IdxKey newTool4IdxKey() {
		CFGenKbToolSetByTool4IdxKey key =
			new CFGenKbToolSetByTool4IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool5IdxKey newTool5IdxKey() {
		CFGenKbToolSetByTool5IdxKey key =
			new CFGenKbToolSetByTool5IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool6IdxKey newTool6IdxKey() {
		CFGenKbToolSetByTool6IdxKey key =
			new CFGenKbToolSetByTool6IdxKey();
		return( key );
	}

	public CFGenKbToolSetByTool7IdxKey newTool7IdxKey() {
		CFGenKbToolSetByTool7IdxKey key =
			new CFGenKbToolSetByTool7IdxKey();
		return( key );
	}

	public CFGenKbToolSetBuff newBuff() {
		CFGenKbToolSetBuff buff =
			new CFGenKbToolSetBuff();
		return( buff );
	}
}
