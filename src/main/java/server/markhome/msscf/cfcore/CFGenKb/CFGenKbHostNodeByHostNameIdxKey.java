// Description: Java 11 implementation of a HostNode by HostNameIdx index key object.

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

public class CFGenKbHostNodeByHostNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	protected String requiredHostName;
	public CFGenKbHostNodeByHostNameIdxKey() {
		requiredClusterId = CFGenKbHostNodeBuff.CLUSTERID_INIT_VALUE;
		requiredHostName = new String( CFGenKbHostNodeBuff.HOSTNAME_INIT_VALUE );
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFGenKbHostNodeBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFGenKbHostNodeBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public String getRequiredHostName() {
		return( requiredHostName );
	}

	public void setRequiredHostName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredHostName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredHostName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredHostName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbHostNodeByHostNameIdxKey ) {
			CFGenKbHostNodeByHostNameIdxKey rhs = (CFGenKbHostNodeByHostNameIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( ! getRequiredHostName().equals( rhs.getRequiredHostName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbHostNodeBuff ) {
			CFGenKbHostNodeBuff rhs = (CFGenKbHostNodeBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( ! getRequiredHostName().equals( rhs.getRequiredHostName() ) ) {
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
		hashCode = hashCode + (int)( getRequiredClusterId() );
		if( getRequiredHostName() != null ) {
			hashCode = hashCode + getRequiredHostName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbHostNodeByHostNameIdxKey ) {
			CFGenKbHostNodeByHostNameIdxKey rhs = (CFGenKbHostNodeByHostNameIdxKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredHostName().compareTo( rhs.getRequiredHostName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbHostNodeBuff ) {
			CFGenKbHostNodeBuff rhs = (CFGenKbHostNodeBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredHostName().compareTo( rhs.getRequiredHostName() );
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
		String ret = "<CFGenKbHostNodeByHostNameIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredHostName=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredHostName() ) + "\""
			+ "/>";
		return( ret );
	}
}
