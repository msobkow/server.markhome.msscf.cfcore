
// Description: Java 11 Default Factory implementation for GelPrefixLine.

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
	 *	CFGenKbGelPrefixLineFactory implementation for GelPrefixLine
	 */
public class CFGenKbGelPrefixLineDefaultFactory
	implements ICFGenKbGelPrefixLineFactory
{
	public CFGenKbGelPrefixLineDefaultFactory() {
	}

	public CFGenKbGelPrefixLineByRemainderIdxKey newRemainderIdxKey() {
		CFGenKbGelPrefixLineByRemainderIdxKey key =
			new CFGenKbGelPrefixLineByRemainderIdxKey();
		return( key );
	}

	public CFGenKbGelPrefixLineBuff newBuff() {
		CFGenKbGelPrefixLineBuff buff =
			new CFGenKbGelPrefixLineBuff();
		return( buff );
	}
}
