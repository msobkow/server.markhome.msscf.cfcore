// Description: Java 11 implementation of a GelSwitchLimb by SwitchIdx index key object.

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

public class CFGenKbGelSwitchLimbBySwitchIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredGelCacheId;
	protected long requiredGelInstId;
	public CFGenKbGelSwitchLimbBySwitchIdxKey() {
		requiredTenantId = CFGenKbGelSwitchLimbBuff.TENANTID_INIT_VALUE;
		requiredGelCacheId = CFGenKbGelSwitchLimbBuff.GELCACHEID_INIT_VALUE;
		requiredGelInstId = CFGenKbGelSwitchLimbBuff.GELINSTID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFGenKbGelSwitchLimbBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFGenKbGelSwitchLimbBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredGelCacheId() {
		return( requiredGelCacheId );
	}

	public void setRequiredGelCacheId( long value ) {
		if( value < CFGenKbGelSwitchLimbBuff.GELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredGelCacheId",
				1,
				"value",
				value,
				CFGenKbGelSwitchLimbBuff.GELCACHEID_MIN_VALUE );
		}
		requiredGelCacheId = value;
	}

	public long getRequiredGelInstId() {
		return( requiredGelInstId );
	}

	public void setRequiredGelInstId( long value ) {
		if( value < CFGenKbGelSwitchLimbBuff.GELINSTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredGelInstId",
				1,
				"value",
				value,
				CFGenKbGelSwitchLimbBuff.GELINSTID_MIN_VALUE );
		}
		requiredGelInstId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelSwitchLimbBySwitchIdxKey ) {
			CFGenKbGelSwitchLimbBySwitchIdxKey rhs = (CFGenKbGelSwitchLimbBySwitchIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelSwitchLimbBuff ) {
			CFGenKbGelSwitchLimbBuff rhs = (CFGenKbGelSwitchLimbBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
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
		hashCode = hashCode + (int)( getRequiredGelCacheId() );
		hashCode = hashCode + (int)( getRequiredGelInstId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelSwitchLimbBySwitchIdxKey ) {
			CFGenKbGelSwitchLimbBySwitchIdxKey rhs = (CFGenKbGelSwitchLimbBySwitchIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredGelCacheId() < rhs.getRequiredGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredGelCacheId() > rhs.getRequiredGelCacheId() ) {
				return( 1 );
			}
			if( getRequiredGelInstId() < rhs.getRequiredGelInstId() ) {
				return( -1 );
			}
			else if( getRequiredGelInstId() > rhs.getRequiredGelInstId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelSwitchLimbBuff ) {
			CFGenKbGelSwitchLimbBuff rhs = (CFGenKbGelSwitchLimbBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredGelCacheId() < rhs.getRequiredGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredGelCacheId() > rhs.getRequiredGelCacheId() ) {
				return( 1 );
			}
			if( getRequiredGelInstId() < rhs.getRequiredGelInstId() ) {
				return( -1 );
			}
			else if( getRequiredGelInstId() > rhs.getRequiredGelInstId() ) {
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
		String ret = "<CFGenKbGelSwitchLimbBySwitchIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredGelCacheId=" + "\"" + Long.toString( getRequiredGelCacheId() ) + "\""
			+ " RequiredGelInstId=" + "\"" + Long.toString( getRequiredGelInstId() ) + "\""
			+ "/>";
		return( ret );
	}
}
