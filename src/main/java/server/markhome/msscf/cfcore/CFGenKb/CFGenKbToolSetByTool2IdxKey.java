// Description: Java 11 implementation of a ToolSet by Tool2Idx index key object.

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

public class CFGenKbToolSetByTool2IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalToolId2;
	public CFGenKbToolSetByTool2IdxKey() {
		optionalToolId2 = null;
	}

	public Short getOptionalToolId2() {
		return( optionalToolId2 );
	}

	public void setOptionalToolId2( Short value ) {
		if( value == null ) {
			optionalToolId2 = null;
		}
		else if( value < CFGenKbToolSetBuff.TOOLID2_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalToolId2",
				1,
				"value",
				value,
				CFGenKbToolSetBuff.TOOLID2_MIN_VALUE );
		}
		else if( value > CFGenKbToolSetBuff.TOOLID2_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalToolId2",
				1,
				"value",
				value,
				CFGenKbToolSetBuff.TOOLID2_MAX_VALUE );
		}
		else {
			optionalToolId2 = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbToolSetByTool2IdxKey ) {
			CFGenKbToolSetByTool2IdxKey rhs = (CFGenKbToolSetByTool2IdxKey)obj;
			if( getOptionalToolId2() != null ) {
				if( rhs.getOptionalToolId2() != null ) {
					if( ! getOptionalToolId2().equals( rhs.getOptionalToolId2() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId2() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbToolSetBuff ) {
			CFGenKbToolSetBuff rhs = (CFGenKbToolSetBuff)obj;
			if( getOptionalToolId2() != null ) {
				if( rhs.getOptionalToolId2() != null ) {
					if( ! getOptionalToolId2().equals( rhs.getOptionalToolId2() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId2() != null ) {
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
		if( getOptionalToolId2() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalToolId2();
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
		else if( obj instanceof CFGenKbToolSetByTool2IdxKey ) {
			CFGenKbToolSetByTool2IdxKey rhs = (CFGenKbToolSetByTool2IdxKey)obj;
			if( getOptionalToolId2() != null ) {
				Short lhsToolId2 = getOptionalToolId2();
				if( rhs.getOptionalToolId2() != null ) {
					Short rhsToolId2 = rhs.getOptionalToolId2();
					int cmp = lhsToolId2.compareTo( rhsToolId2 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId2() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbToolSetBuff ) {
			CFGenKbToolSetBuff rhs = (CFGenKbToolSetBuff)obj;
			if( getOptionalToolId2() != null ) {
				Short lhsToolId2 = getOptionalToolId2();
				if( rhs.getOptionalToolId2() != null ) {
					Short rhsToolId2 = rhs.getOptionalToolId2();
					int cmp = lhsToolId2.compareTo( rhsToolId2 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId2() != null ) {
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
		String ret = "<CFGenKbToolSetByTool2Idx"
			+ " OptionalToolId2=" + ( ( getOptionalToolId2() == null ) ? "null" : "\"" + getOptionalToolId2().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
