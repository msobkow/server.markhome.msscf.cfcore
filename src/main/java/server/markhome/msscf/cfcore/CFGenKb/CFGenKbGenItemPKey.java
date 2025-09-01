// Description: Java 11 implementation of a GenItem primary key object.

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
 *	CFGenKbGenItemPKey Primary Key for GenItem

 *		classCode	Required class code.
 *		requiredTenantId	Required object attribute TenantId.
 *		requiredCartridgeId	Required object attribute CartridgeId.
 *		requiredItemId	Required object attribute ItemId. */
public class CFGenKbGenItemPKey
	implements Comparable<Object>,
		Serializable
{
	protected String classCode;

	protected long requiredTenantId;
	protected long requiredCartridgeId;
	protected long requiredItemId;
	public CFGenKbGenItemPKey() {
		requiredTenantId = CFGenKbGenItemBuff.TENANTID_INIT_VALUE;
		requiredCartridgeId = CFGenKbGenItemBuff.CARTRIDGEID_INIT_VALUE;
		requiredItemId = CFGenKbGenItemBuff.ITEMID_INIT_VALUE;
	}

	public String getClassCode() {
		return( classCode );
	}

	public void setClassCode( String value ) {
		classCode = value;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFGenKbGenItemBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredCartridgeId() {
		return( requiredCartridgeId );
	}

	public void setRequiredCartridgeId( long value ) {
		if( value < CFGenKbGenItemBuff.CARTRIDGEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredCartridgeId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.CARTRIDGEID_MIN_VALUE );
		}
		requiredCartridgeId = value;
	}

	public long getRequiredItemId() {
		return( requiredItemId );
	}

	public void setRequiredItemId( long value ) {
		if( value < CFGenKbGenItemBuff.ITEMID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredItemId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.ITEMID_MIN_VALUE );
		}
		if( value > CFGenKbGenItemBuff.ITEMID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredItemId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.ITEMID_MAX_VALUE );
		}
		requiredItemId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenItemPKey ) {
			CFGenKbGenItemPKey rhs = (CFGenKbGenItemPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
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
		hashCode = hashCode + (int)( getRequiredCartridgeId() );
		hashCode = hashCode + (int)( getRequiredItemId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbGenItemPKey ) {
			CFGenKbGenItemPKey rhs = (CFGenKbGenItemPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}
			if( getRequiredItemId() < rhs.getRequiredItemId() ) {
				return( -1 );
			}
			else if( getRequiredItemId() > rhs.getRequiredItemId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredCartridgeId() < rhs.getRequiredCartridgeId() ) {
				return( -1 );
			}
			else if( getRequiredCartridgeId() > rhs.getRequiredCartridgeId() ) {
				return( 1 );
			}
			if( getRequiredItemId() < rhs.getRequiredItemId() ) {
				return( -1 );
			}
			else if( getRequiredItemId() > rhs.getRequiredItemId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFGenKbGenItemPKey, CFGenKbGenItemBuff" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbGenItemPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredCartridgeId=" + "\"" + Long.toString( getRequiredCartridgeId() ) + "\""
			+ " RequiredItemId=" + "\"" + Long.toString( getRequiredItemId() ) + "\""
			+ "/>";
		return( ret );
	}
}
