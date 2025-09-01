// Description: Java 11 implementation of a SecGrpInc by ClusterIdx index key object.

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

public class CFGenKbSecGrpIncByClusterIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	public CFGenKbSecGrpIncByClusterIdxKey() {
		requiredClusterId = CFGenKbSecGrpIncBuff.CLUSTERID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFGenKbSecGrpIncBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFGenKbSecGrpIncBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbSecGrpIncByClusterIdxKey ) {
			CFGenKbSecGrpIncByClusterIdxKey rhs = (CFGenKbSecGrpIncByClusterIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbSecGrpIncBuff ) {
			CFGenKbSecGrpIncBuff rhs = (CFGenKbSecGrpIncBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
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
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbSecGrpIncByClusterIdxKey ) {
			CFGenKbSecGrpIncByClusterIdxKey rhs = (CFGenKbSecGrpIncByClusterIdxKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbSecGrpIncBuff ) {
			CFGenKbSecGrpIncBuff rhs = (CFGenKbSecGrpIncBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
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
		String ret = "<CFGenKbSecGrpIncByClusterIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ "/>";
		return( ret );
	}
}
