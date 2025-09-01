// Description: Java 11 implementation of a SecSession primary key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.apache.commons.codec.binary.Base64;

/*
 *	CFGenKbSecSessionPKey Primary Key for SecSession

 *		requiredSecSessionId	Required object attribute SecSessionId. */
public class CFGenKbSecSessionPKey
	implements Comparable<Object>,
		Serializable
{

	protected UUID requiredSecSessionId;
	public CFGenKbSecSessionPKey() {
		requiredSecSessionId = UUID.fromString( CFGenKbSecSessionBuff.SECSESSIONID_INIT_VALUE.toString() );
	}

	public UUID getRequiredSecSessionId() {
		return( requiredSecSessionId );
	}

	public void setRequiredSecSessionId( UUID value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredSecSessionId",
				1,
				"value" );
		}
		requiredSecSessionId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbSecSessionPKey ) {
			CFGenKbSecSessionPKey rhs = (CFGenKbSecSessionPKey)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbSecSessionBuff ) {
			CFGenKbSecSessionBuff rhs = (CFGenKbSecSessionBuff)obj;
			if( ! getRequiredSecSessionId().equals( rhs.getRequiredSecSessionId() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredSecSessionId().hashCode();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbSecSessionPKey ) {
			CFGenKbSecSessionPKey rhs = (CFGenKbSecSessionPKey)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbSecSessionBuff ) {
			CFGenKbSecSessionBuff rhs = (CFGenKbSecSessionBuff)obj;
			{
				int cmp = getRequiredSecSessionId().compareTo( rhs.getRequiredSecSessionId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFGenKbSecSessionPKey, CFGenKbSecSessionBuff" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbSecSessionPKey"
			+ " RequiredSecSessionId=" + "\"" + getRequiredSecSessionId().toString() + "\""
			+ "/>";
		return( ret );
	}
}
