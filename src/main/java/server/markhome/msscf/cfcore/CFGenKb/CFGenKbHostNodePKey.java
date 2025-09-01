// Description: Java 11 implementation of a HostNode primary key object.

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
 *	CFGenKbHostNodePKey Primary Key for HostNode

 *		requiredClusterId	Required object attribute ClusterId.
 *		requiredHostNodeId	Required object attribute HostNodeId. */
public class CFGenKbHostNodePKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredClusterId;
	protected long requiredHostNodeId;
	public CFGenKbHostNodePKey() {
		requiredClusterId = CFGenKbHostNodeBuff.CLUSTERID_INIT_VALUE;
		requiredHostNodeId = CFGenKbHostNodeBuff.HOSTNODEID_INIT_VALUE;
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

	public long getRequiredHostNodeId() {
		return( requiredHostNodeId );
	}

	public void setRequiredHostNodeId( long value ) {
		if( value < CFGenKbHostNodeBuff.HOSTNODEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredHostNodeId",
				1,
				"value",
				value,
				CFGenKbHostNodeBuff.HOSTNODEID_MIN_VALUE );
		}
		requiredHostNodeId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbHostNodePKey ) {
			CFGenKbHostNodePKey rhs = (CFGenKbHostNodePKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbHostNodeBuff ) {
			CFGenKbHostNodeBuff rhs = (CFGenKbHostNodeBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
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
		hashCode = hashCode + (int)( getRequiredHostNodeId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbHostNodePKey ) {
			CFGenKbHostNodePKey rhs = (CFGenKbHostNodePKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredHostNodeId() < rhs.getRequiredHostNodeId() ) {
				return( -1 );
			}
			else if( getRequiredHostNodeId() > rhs.getRequiredHostNodeId() ) {
				return( 1 );
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
			if( getRequiredHostNodeId() < rhs.getRequiredHostNodeId() ) {
				return( -1 );
			}
			else if( getRequiredHostNodeId() > rhs.getRequiredHostNodeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFGenKbHostNodePKey, CFGenKbHostNodeBuff" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbHostNodePKey"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredHostNodeId=" + "\"" + Long.toString( getRequiredHostNodeId() ) + "\""
			+ "/>";
		return( ret );
	}
}
