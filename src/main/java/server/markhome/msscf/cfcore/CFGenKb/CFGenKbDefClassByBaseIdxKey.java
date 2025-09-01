// Description: Java 11 implementation of a DefClass by BaseIdx index key object.

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

public class CFGenKbDefClassByBaseIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalBaseId;
	public CFGenKbDefClassByBaseIdxKey() {
		optionalBaseId = null;
	}

	public Short getOptionalBaseId() {
		return( optionalBaseId );
	}

	public void setOptionalBaseId( Short value ) {
		if( value == null ) {
			optionalBaseId = null;
		}
		else if( value < CFGenKbDefClassBuff.BASEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalBaseId",
				1,
				"value",
				value,
				CFGenKbDefClassBuff.BASEID_MIN_VALUE );
		}
		else if( value > CFGenKbDefClassBuff.BASEID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalBaseId",
				1,
				"value",
				value,
				CFGenKbDefClassBuff.BASEID_MAX_VALUE );
		}
		else {
			optionalBaseId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbDefClassByBaseIdxKey ) {
			CFGenKbDefClassByBaseIdxKey rhs = (CFGenKbDefClassByBaseIdxKey)obj;
			if( getOptionalBaseId() != null ) {
				if( rhs.getOptionalBaseId() != null ) {
					if( ! getOptionalBaseId().equals( rhs.getOptionalBaseId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBaseId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbDefClassBuff ) {
			CFGenKbDefClassBuff rhs = (CFGenKbDefClassBuff)obj;
			if( getOptionalBaseId() != null ) {
				if( rhs.getOptionalBaseId() != null ) {
					if( ! getOptionalBaseId().equals( rhs.getOptionalBaseId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBaseId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalBaseId() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalBaseId();
		}
		else {
			hashCode = (hashCode * 0x10000 );
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbDefClassByBaseIdxKey ) {
			CFGenKbDefClassByBaseIdxKey rhs = (CFGenKbDefClassByBaseIdxKey)obj;
			if( getOptionalBaseId() != null ) {
				Short lhsBaseId = getOptionalBaseId();
				if( rhs.getOptionalBaseId() != null ) {
					Short rhsBaseId = rhs.getOptionalBaseId();
					int cmp = lhsBaseId.compareTo( rhsBaseId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBaseId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbDefClassBuff ) {
			CFGenKbDefClassBuff rhs = (CFGenKbDefClassBuff)obj;
			if( getOptionalBaseId() != null ) {
				Short lhsBaseId = getOptionalBaseId();
				if( rhs.getOptionalBaseId() != null ) {
					Short rhsBaseId = rhs.getOptionalBaseId();
					int cmp = lhsBaseId.compareTo( rhsBaseId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBaseId() != null ) {
					return( -1 );
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
		String ret = "<CFGenKbDefClassByBaseIdx"
			+ " OptionalBaseId=" + ( ( getOptionalBaseId() == null ) ? "null" : "\"" + getOptionalBaseId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
