// Description: Java 11 implementation of a ToolSet by Tool3Idx index key object.

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

public class CFGenKbToolSetByTool3IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalToolId3;
	public CFGenKbToolSetByTool3IdxKey() {
		optionalToolId3 = null;
	}

	public Short getOptionalToolId3() {
		return( optionalToolId3 );
	}

	public void setOptionalToolId3( Short value ) {
		if( value == null ) {
			optionalToolId3 = null;
		}
		else if( value < CFGenKbToolSetBuff.TOOLID3_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalToolId3",
				1,
				"value",
				value,
				CFGenKbToolSetBuff.TOOLID3_MIN_VALUE );
		}
		else if( value > CFGenKbToolSetBuff.TOOLID3_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalToolId3",
				1,
				"value",
				value,
				CFGenKbToolSetBuff.TOOLID3_MAX_VALUE );
		}
		else {
			optionalToolId3 = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbToolSetByTool3IdxKey ) {
			CFGenKbToolSetByTool3IdxKey rhs = (CFGenKbToolSetByTool3IdxKey)obj;
			if( getOptionalToolId3() != null ) {
				if( rhs.getOptionalToolId3() != null ) {
					if( ! getOptionalToolId3().equals( rhs.getOptionalToolId3() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbToolSetBuff ) {
			CFGenKbToolSetBuff rhs = (CFGenKbToolSetBuff)obj;
			if( getOptionalToolId3() != null ) {
				if( rhs.getOptionalToolId3() != null ) {
					if( ! getOptionalToolId3().equals( rhs.getOptionalToolId3() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
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
		if( getOptionalToolId3() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalToolId3();
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
		else if( obj instanceof CFGenKbToolSetByTool3IdxKey ) {
			CFGenKbToolSetByTool3IdxKey rhs = (CFGenKbToolSetByTool3IdxKey)obj;
			if( getOptionalToolId3() != null ) {
				Short lhsToolId3 = getOptionalToolId3();
				if( rhs.getOptionalToolId3() != null ) {
					Short rhsToolId3 = rhs.getOptionalToolId3();
					int cmp = lhsToolId3.compareTo( rhsToolId3 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbToolSetBuff ) {
			CFGenKbToolSetBuff rhs = (CFGenKbToolSetBuff)obj;
			if( getOptionalToolId3() != null ) {
				Short lhsToolId3 = getOptionalToolId3();
				if( rhs.getOptionalToolId3() != null ) {
					Short rhsToolId3 = rhs.getOptionalToolId3();
					int cmp = lhsToolId3.compareTo( rhsToolId3 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId3() != null ) {
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
		String ret = "<CFGenKbToolSetByTool3Idx"
			+ " OptionalToolId3=" + ( ( getOptionalToolId3() == null ) ? "null" : "\"" + getOptionalToolId3().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
