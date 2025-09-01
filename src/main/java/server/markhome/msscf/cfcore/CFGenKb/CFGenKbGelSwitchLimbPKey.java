// Description: Java 11 implementation of a GelSwitchLimb primary key object.

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
 *	CFGenKbGelSwitchLimbPKey Primary Key for GelSwitchLimb

 *		requiredTenantId	Required object attribute TenantId.
 *		requiredGelCacheId	Required object attribute GelCacheId.
 *		requiredGelInstId	Required object attribute GelInstId.
 *		requiredLimbName	Required object attribute LimbName. */
public class CFGenKbGelSwitchLimbPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredTenantId;
	protected long requiredGelCacheId;
	protected long requiredGelInstId;
	protected String requiredLimbName;
	public CFGenKbGelSwitchLimbPKey() {
		requiredTenantId = CFGenKbGelSwitchLimbBuff.TENANTID_INIT_VALUE;
		requiredGelCacheId = CFGenKbGelSwitchLimbBuff.GELCACHEID_INIT_VALUE;
		requiredGelInstId = CFGenKbGelSwitchLimbBuff.GELINSTID_INIT_VALUE;
		requiredLimbName = new String( CFGenKbGelSwitchLimbBuff.LIMBNAME_INIT_VALUE );
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

	public String getRequiredLimbName() {
		return( requiredLimbName );
	}

	public void setRequiredLimbName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredLimbName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredLimbName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredLimbName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelSwitchLimbPKey ) {
			CFGenKbGelSwitchLimbPKey rhs = (CFGenKbGelSwitchLimbPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			if( ! getRequiredLimbName().equals( rhs.getRequiredLimbName() ) ) {
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
			if( ! getRequiredLimbName().equals( rhs.getRequiredLimbName() ) ) {
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
		if( getRequiredLimbName() != null ) {
			hashCode = hashCode + getRequiredLimbName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbGelSwitchLimbPKey ) {
			CFGenKbGelSwitchLimbPKey rhs = (CFGenKbGelSwitchLimbPKey)obj;
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
			{
				int cmp = getRequiredLimbName().compareTo( rhs.getRequiredLimbName() );
				if( cmp != 0 ) {
					return( cmp );
				}
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
			{
				int cmp = getRequiredLimbName().compareTo( rhs.getRequiredLimbName() );
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
				"CFGenKbGelSwitchLimbPKey, CFGenKbGelSwitchLimbBuff" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbGelSwitchLimbPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredGelCacheId=" + "\"" + Long.toString( getRequiredGelCacheId() ) + "\""
			+ " RequiredGelInstId=" + "\"" + Long.toString( getRequiredGelInstId() ) + "\""
			+ " RequiredLimbName=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredLimbName() ) + "\""
			+ "/>";
		return( ret );
	}
}
