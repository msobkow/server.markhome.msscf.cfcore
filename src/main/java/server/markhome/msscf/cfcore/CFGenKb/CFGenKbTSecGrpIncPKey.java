// Description: Java 11 implementation of a TSecGrpInc primary key object.

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
 *	CFGenKbTSecGrpIncPKey Primary Key for TSecGrpInc

 *		requiredTenantId	Required object attribute TenantId.
 *		requiredTSecGrpIncId	Required object attribute TSecGrpIncId. */
public class CFGenKbTSecGrpIncPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredTenantId;
	protected long requiredTSecGrpIncId;
	public CFGenKbTSecGrpIncPKey() {
		requiredTenantId = CFGenKbTSecGrpIncBuff.TENANTID_INIT_VALUE;
		requiredTSecGrpIncId = CFGenKbTSecGrpIncBuff.TSECGRPINCID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFGenKbTSecGrpIncBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFGenKbTSecGrpIncBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredTSecGrpIncId() {
		return( requiredTSecGrpIncId );
	}

	public void setRequiredTSecGrpIncId( long value ) {
		if( value < CFGenKbTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGrpIncId",
				1,
				"value",
				value,
				CFGenKbTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE );
		}
		requiredTSecGrpIncId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbTSecGrpIncPKey ) {
			CFGenKbTSecGrpIncPKey rhs = (CFGenKbTSecGrpIncPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbTSecGrpIncBuff ) {
			CFGenKbTSecGrpIncBuff rhs = (CFGenKbTSecGrpIncBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
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
		hashCode = hashCode + (int)( getRequiredTSecGrpIncId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbTSecGrpIncPKey ) {
			CFGenKbTSecGrpIncPKey rhs = (CFGenKbTSecGrpIncPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbTSecGrpIncBuff ) {
			CFGenKbTSecGrpIncBuff rhs = (CFGenKbTSecGrpIncBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFGenKbTSecGrpIncPKey, CFGenKbTSecGrpIncBuff" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbTSecGrpIncPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredTSecGrpIncId=" + "\"" + Long.toString( getRequiredTSecGrpIncId() ) + "\""
			+ "/>";
		return( ret );
	}
}
