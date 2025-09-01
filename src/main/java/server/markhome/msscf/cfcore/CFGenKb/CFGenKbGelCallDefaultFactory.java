
// Description: Java 11 Default Factory implementation for GelCall.

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
	 *	CFGenKbGelCallFactory implementation for GelCall
	 */
public class CFGenKbGelCallDefaultFactory
	implements ICFGenKbGelCallFactory
{
	public CFGenKbGelCallDefaultFactory() {
	}

	public CFGenKbGelCallByCacheIdxKey newCacheIdxKey() {
		CFGenKbGelCallByCacheIdxKey key =
			new CFGenKbGelCallByCacheIdxKey();
		return( key );
	}

	public CFGenKbGelCallBySeqIdxKey newSeqIdxKey() {
		CFGenKbGelCallBySeqIdxKey key =
			new CFGenKbGelCallBySeqIdxKey();
		return( key );
	}

	public CFGenKbGelCallByCallInstIdxKey newCallInstIdxKey() {
		CFGenKbGelCallByCallInstIdxKey key =
			new CFGenKbGelCallByCallInstIdxKey();
		return( key );
	}

	public CFGenKbGelCallByPrevInstIdxKey newPrevInstIdxKey() {
		CFGenKbGelCallByPrevInstIdxKey key =
			new CFGenKbGelCallByPrevInstIdxKey();
		return( key );
	}

	public CFGenKbGelCallByNextInstIdxKey newNextInstIdxKey() {
		CFGenKbGelCallByNextInstIdxKey key =
			new CFGenKbGelCallByNextInstIdxKey();
		return( key );
	}

	public CFGenKbGelCallBuff newBuff() {
		CFGenKbGelCallBuff buff =
			new CFGenKbGelCallBuff();
		return( buff );
	}
}
