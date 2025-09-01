
// Description: Java 11 Default Factory implementation for GelModifier.

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
	 *	CFGenKbGelModifierFactory implementation for GelModifier
	 */
public class CFGenKbGelModifierDefaultFactory
	implements ICFGenKbGelModifierFactory
{
	public CFGenKbGelModifierDefaultFactory() {
	}

	public CFGenKbGelModifierByRemainderIdxKey newRemainderIdxKey() {
		CFGenKbGelModifierByRemainderIdxKey key =
			new CFGenKbGelModifierByRemainderIdxKey();
		return( key );
	}

	public CFGenKbGelModifierBuff newBuff() {
		CFGenKbGelModifierBuff buff =
			new CFGenKbGelModifierBuff();
		return( buff );
	}
}
