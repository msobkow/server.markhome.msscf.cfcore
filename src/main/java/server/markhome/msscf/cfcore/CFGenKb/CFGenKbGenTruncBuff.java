// Description: Java 11 implementation of a GenTrunc buffer object.

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

public class CFGenKbGenTruncBuff
	extends CFGenKbGenRuleBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a924";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long CARTRIDGEID_INIT_VALUE = 0L;
	public static final long ITEMID_INIT_VALUE = 0L;
	public static final int TRUNCATEAT_INIT_VALUE = 0;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long CARTRIDGEID_MIN_VALUE = 0L;
	public static final long ITEMID_MIN_VALUE = 0L;
	public static final int TRUNCATEAT_MIN_VALUE = 0;
	public static final long ITEMID_MAX_VALUE = 2147483647L;
	public static final int TRUNCATEAT_MAX_VALUE = 2147483647;
	protected int requiredTruncateAt;
	public CFGenKbGenTruncBuff() {
		super();
		requiredTruncateAt = CFGenKbGenTruncBuff.TRUNCATEAT_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public int getRequiredTruncateAt() {
		return( requiredTruncateAt );
	}

	public void setRequiredTruncateAt( int value ) {
		if( value < CFGenKbGenTruncBuff.TRUNCATEAT_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTruncateAt",
				1,
				"value",
				value,
				CFGenKbGenTruncBuff.TRUNCATEAT_MIN_VALUE );
		}
		if( value > CFGenKbGenTruncBuff.TRUNCATEAT_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredTruncateAt",
				1,
				"value",
				value,
				CFGenKbGenTruncBuff.TRUNCATEAT_MAX_VALUE );
		}
		requiredTruncateAt = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenTruncBuff ) {
			CFGenKbGenTruncBuff rhs = (CFGenKbGenTruncBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredCartridgeId() != rhs.getRequiredCartridgeId() ) {
				return( false );
			}
			if( getRequiredItemId() != rhs.getRequiredItemId() ) {
				return( false );
			}
			if( getRequiredTruncateAt() != rhs.getRequiredTruncateAt() ) {
				return( false );
			}
			return( true );
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
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredTruncateAt();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbGenTruncBuff ) {
			CFGenKbGenTruncBuff rhs = (CFGenKbGenTruncBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredTruncateAt() < rhs.getRequiredTruncateAt() ) {
				return( -1 );
			}
			else if( getRequiredTruncateAt() > rhs.getRequiredTruncateAt() ) {
				return( 1 );
			}
			return( 0 );
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
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFGenKbGenItemBuff src ) {
		if( src instanceof CFGenKbGenTruncBuff ) {
			setGenTruncBuff( (CFGenKbGenTruncBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFGenKbGenTruncBuff" );
		}
	}

	public void setGenTruncBuff( CFGenKbGenTruncBuff src ) {
		super.setGenRuleBuff( src );
		setRequiredTruncateAt( src.getRequiredTruncateAt() );
	}
}
