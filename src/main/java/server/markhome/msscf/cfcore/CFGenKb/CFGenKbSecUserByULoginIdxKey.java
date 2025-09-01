// Description: Java 11 implementation of a SecUser by ULoginIdx index key object.

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

public class CFGenKbSecUserByULoginIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredLoginId;
	public CFGenKbSecUserByULoginIdxKey() {
		requiredLoginId = new String( CFGenKbSecUserBuff.LOGINID_INIT_VALUE );
	}

	public String getRequiredLoginId() {
		return( requiredLoginId );
	}

	public void setRequiredLoginId( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredLoginId",
				1,
				"value" );
		}
		if( value.length() > 32 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredLoginId",
				1,
				"value.length()",
				value.length(),
				32 );
		}
		requiredLoginId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbSecUserByULoginIdxKey ) {
			CFGenKbSecUserByULoginIdxKey rhs = (CFGenKbSecUserByULoginIdxKey)obj;
			if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbSecUserBuff ) {
			CFGenKbSecUserBuff rhs = (CFGenKbSecUserBuff)obj;
			if( ! getRequiredLoginId().equals( rhs.getRequiredLoginId() ) ) {
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
		if( getRequiredLoginId() != null ) {
			hashCode = hashCode + getRequiredLoginId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbSecUserByULoginIdxKey ) {
			CFGenKbSecUserByULoginIdxKey rhs = (CFGenKbSecUserByULoginIdxKey)obj;
			{
				int cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbSecUserBuff ) {
			CFGenKbSecUserBuff rhs = (CFGenKbSecUserBuff)obj;
			{
				int cmp = getRequiredLoginId().compareTo( rhs.getRequiredLoginId() );
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
				null );
		}
	}

	public String toString() {
		String ret = "<CFGenKbSecUserByULoginIdx"
			+ " RequiredLoginId=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredLoginId() ) + "\""
			+ "/>";
		return( ret );
	}
}
