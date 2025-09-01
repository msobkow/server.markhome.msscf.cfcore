// Description: Java 11 implementation of a ToolSet by Tool1Idx index key object.

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

public class CFGenKbToolSetByTool1IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Short optionalToolId1;
	public CFGenKbToolSetByTool1IdxKey() {
		optionalToolId1 = null;
	}

	public Short getOptionalToolId1() {
		return( optionalToolId1 );
	}

	public void setOptionalToolId1( Short value ) {
		if( value == null ) {
			optionalToolId1 = null;
		}
		else if( value < CFGenKbToolSetBuff.TOOLID1_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalToolId1",
				1,
				"value",
				value,
				CFGenKbToolSetBuff.TOOLID1_MIN_VALUE );
		}
		else if( value > CFGenKbToolSetBuff.TOOLID1_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalToolId1",
				1,
				"value",
				value,
				CFGenKbToolSetBuff.TOOLID1_MAX_VALUE );
		}
		else {
			optionalToolId1 = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbToolSetByTool1IdxKey ) {
			CFGenKbToolSetByTool1IdxKey rhs = (CFGenKbToolSetByTool1IdxKey)obj;
			if( getOptionalToolId1() != null ) {
				if( rhs.getOptionalToolId1() != null ) {
					if( ! getOptionalToolId1().equals( rhs.getOptionalToolId1() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId1() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbToolSetBuff ) {
			CFGenKbToolSetBuff rhs = (CFGenKbToolSetBuff)obj;
			if( getOptionalToolId1() != null ) {
				if( rhs.getOptionalToolId1() != null ) {
					if( ! getOptionalToolId1().equals( rhs.getOptionalToolId1() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalToolId1() != null ) {
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
		if( getOptionalToolId1() != null ) {
			hashCode = ( hashCode * 0x10000 ) + getOptionalToolId1();
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
		else if( obj instanceof CFGenKbToolSetByTool1IdxKey ) {
			CFGenKbToolSetByTool1IdxKey rhs = (CFGenKbToolSetByTool1IdxKey)obj;
			if( getOptionalToolId1() != null ) {
				Short lhsToolId1 = getOptionalToolId1();
				if( rhs.getOptionalToolId1() != null ) {
					Short rhsToolId1 = rhs.getOptionalToolId1();
					int cmp = lhsToolId1.compareTo( rhsToolId1 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId1() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbToolSetBuff ) {
			CFGenKbToolSetBuff rhs = (CFGenKbToolSetBuff)obj;
			if( getOptionalToolId1() != null ) {
				Short lhsToolId1 = getOptionalToolId1();
				if( rhs.getOptionalToolId1() != null ) {
					Short rhsToolId1 = rhs.getOptionalToolId1();
					int cmp = lhsToolId1.compareTo( rhsToolId1 );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalToolId1() != null ) {
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
		String ret = "<CFGenKbToolSetByTool1Idx"
			+ " OptionalToolId1=" + ( ( getOptionalToolId1() == null ) ? "null" : "\"" + getOptionalToolId1().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
