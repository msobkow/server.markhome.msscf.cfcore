// Description: Java 11 implementation of a Tool by ReplacesIdx index key object.

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

public class CFGenKbToolByReplacesIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalReplacesId;
	public CFGenKbToolByReplacesIdxKey() {
		optionalReplacesId = null;
	}

	public Short getOptionalReplacesId() {
		return( optionalReplacesId );
	}

	public void setOptionalReplacesId( Short value ) {
		if( value == null ) {
			optionalReplacesId = null;
		}
		else if( value < CFGenKbToolBuff.REPLACESID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalReplacesId",
				1,
				"value",
				value,
				CFGenKbToolBuff.REPLACESID_MIN_VALUE );
		}
		else if( value > CFGenKbToolBuff.REPLACESID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalReplacesId",
				1,
				"value",
				value,
				CFGenKbToolBuff.REPLACESID_MAX_VALUE );
		}
		else {
			optionalReplacesId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbToolByReplacesIdxKey ) {
			CFGenKbToolByReplacesIdxKey rhs = (CFGenKbToolByReplacesIdxKey)obj;
			if( getOptionalReplacesId() != null ) {
				if( rhs.getOptionalReplacesId() != null ) {
					if( ! getOptionalReplacesId().equals( rhs.getOptionalReplacesId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbToolBuff ) {
			CFGenKbToolBuff rhs = (CFGenKbToolBuff)obj;
			if( getOptionalReplacesId() != null ) {
				if( rhs.getOptionalReplacesId() != null ) {
					if( ! getOptionalReplacesId().equals( rhs.getOptionalReplacesId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
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
		if( getOptionalReplacesId() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalReplacesId();
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
		else if( obj instanceof CFGenKbToolByReplacesIdxKey ) {
			CFGenKbToolByReplacesIdxKey rhs = (CFGenKbToolByReplacesIdxKey)obj;
			if( getOptionalReplacesId() != null ) {
				Short lhsReplacesId = getOptionalReplacesId();
				if( rhs.getOptionalReplacesId() != null ) {
					Short rhsReplacesId = rhs.getOptionalReplacesId();
					int cmp = lhsReplacesId.compareTo( rhsReplacesId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbToolBuff ) {
			CFGenKbToolBuff rhs = (CFGenKbToolBuff)obj;
			if( getOptionalReplacesId() != null ) {
				Short lhsReplacesId = getOptionalReplacesId();
				if( rhs.getOptionalReplacesId() != null ) {
					Short rhsReplacesId = rhs.getOptionalReplacesId();
					int cmp = lhsReplacesId.compareTo( rhsReplacesId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalReplacesId() != null ) {
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
		String ret = "<CFGenKbToolByReplacesIdx"
			+ " OptionalReplacesId=" + ( ( getOptionalReplacesId() == null ) ? "null" : "\"" + getOptionalReplacesId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
