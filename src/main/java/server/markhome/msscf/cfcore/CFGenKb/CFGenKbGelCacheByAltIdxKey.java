// Description: Java 11 implementation of a GelCache by AltIdx index key object.

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

public class CFGenKbGelCacheByAltIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected String requiredCacheName;
	public CFGenKbGelCacheByAltIdxKey() {
		requiredTenantId = CFGenKbGelCacheBuff.TENANTID_INIT_VALUE;
		requiredCacheName = new String( CFGenKbGelCacheBuff.CACHENAME_INIT_VALUE );
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFGenKbGelCacheBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFGenKbGelCacheBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public String getRequiredCacheName() {
		return( requiredCacheName );
	}

	public void setRequiredCacheName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredCacheName",
				1,
				"value" );
		}
		if( value.length() > 511 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredCacheName",
				1,
				"value.length()",
				value.length(),
				511 );
		}
		requiredCacheName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelCacheByAltIdxKey ) {
			CFGenKbGelCacheByAltIdxKey rhs = (CFGenKbGelCacheByAltIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( ! getRequiredCacheName().equals( rhs.getRequiredCacheName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelCacheBuff ) {
			CFGenKbGelCacheBuff rhs = (CFGenKbGelCacheBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( ! getRequiredCacheName().equals( rhs.getRequiredCacheName() ) ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		if( getRequiredCacheName() != null ) {
			hashCode = hashCode + getRequiredCacheName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelCacheByAltIdxKey ) {
			CFGenKbGelCacheByAltIdxKey rhs = (CFGenKbGelCacheByAltIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredCacheName().compareTo( rhs.getRequiredCacheName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelCacheBuff ) {
			CFGenKbGelCacheBuff rhs = (CFGenKbGelCacheBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredCacheName().compareTo( rhs.getRequiredCacheName() );
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
		String ret = "<CFGenKbGelCacheByAltIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredCacheName=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredCacheName() ) + "\""
			+ "/>";
		return( ret );
	}
}
