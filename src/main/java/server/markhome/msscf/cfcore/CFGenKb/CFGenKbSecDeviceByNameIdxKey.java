// Description: Java 11 implementation of a SecDevice by NameIdx index key object.

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

public class CFGenKbSecDeviceByNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected UUID requiredSecUserId;
	protected String requiredDevName;
	public CFGenKbSecDeviceByNameIdxKey() {
		requiredSecUserId = UUID.fromString( CFGenKbSecDeviceBuff.SECUSERID_INIT_VALUE.toString() );
		requiredDevName = new String( CFGenKbSecDeviceBuff.DEVNAME_INIT_VALUE );
	}

	public UUID getRequiredSecUserId() {
		return( requiredSecUserId );
	}

	public void setRequiredSecUserId( UUID value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		requiredSecUserId = value;
	}

	public String getRequiredDevName() {
		return( requiredDevName );
	}

	public void setRequiredDevName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredDevName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredDevName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredDevName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbSecDeviceByNameIdxKey ) {
			CFGenKbSecDeviceByNameIdxKey rhs = (CFGenKbSecDeviceByNameIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbSecDeviceBuff ) {
			CFGenKbSecDeviceBuff rhs = (CFGenKbSecDeviceBuff)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
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
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredDevName() != null ) {
			hashCode = hashCode + getRequiredDevName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbSecDeviceByNameIdxKey ) {
			CFGenKbSecDeviceByNameIdxKey rhs = (CFGenKbSecDeviceByNameIdxKey)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbSecDeviceBuff ) {
			CFGenKbSecDeviceBuff rhs = (CFGenKbSecDeviceBuff)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
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
		String ret = "<CFGenKbSecDeviceByNameIdx"
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredDevName=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredDevName() ) + "\""
			+ "/>";
		return( ret );
	}
}
