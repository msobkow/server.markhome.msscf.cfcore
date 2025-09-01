// Description: Java 11 implementation of a SysCluster primary key object.

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
 *	CFGenKbSysClusterPKey Primary Key for SysCluster

 *		requiredSingletonId	Required object attribute SingletonId. */
public class CFGenKbSysClusterPKey
	implements Comparable<Object>,
		Serializable
{

	protected int requiredSingletonId;
	public CFGenKbSysClusterPKey() {
		requiredSingletonId = CFGenKbSysClusterBuff.SINGLETONID_INIT_VALUE;
	}

	public int getRequiredSingletonId() {
		return( requiredSingletonId );
	}

	public void setRequiredSingletonId( int value ) {
		if( value < CFGenKbSysClusterBuff.SINGLETONID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				CFGenKbSysClusterBuff.SINGLETONID_MIN_VALUE );
		}
		if( value > CFGenKbSysClusterBuff.SINGLETONID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				CFGenKbSysClusterBuff.SINGLETONID_MAX_VALUE );
		}
		requiredSingletonId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbSysClusterPKey ) {
			CFGenKbSysClusterPKey rhs = (CFGenKbSysClusterPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbSysClusterBuff ) {
			CFGenKbSysClusterBuff rhs = (CFGenKbSysClusterBuff)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
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
		hashCode = hashCode + getRequiredSingletonId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbSysClusterPKey ) {
			CFGenKbSysClusterPKey rhs = (CFGenKbSysClusterPKey)obj;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbSysClusterBuff ) {
			CFGenKbSysClusterBuff rhs = (CFGenKbSysClusterBuff)obj;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFGenKbSysClusterPKey, CFGenKbSysClusterBuff" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbSysClusterPKey"
			+ " RequiredSingletonId=" + "\"" + Integer.toString( getRequiredSingletonId() ) + "\""
			+ "/>";
		return( ret );
	}
}
