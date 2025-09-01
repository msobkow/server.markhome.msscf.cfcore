// Description: Java 11 implementation of a GelSpread by FirstIdx index key object.

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

public class CFGenKbGelSpreadByFirstIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String optionalExpandFirst;
	public CFGenKbGelSpreadByFirstIdxKey() {
		optionalExpandFirst = null;
	}

	public String getOptionalExpandFirst() {
		return( optionalExpandFirst );
	}

	public void setOptionalExpandFirst( String value ) {
		if( value == null ) {
			optionalExpandFirst = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandFirst",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandFirst = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelSpreadByFirstIdxKey ) {
			CFGenKbGelSpreadByFirstIdxKey rhs = (CFGenKbGelSpreadByFirstIdxKey)obj;
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					if( ! getOptionalExpandFirst().equals( rhs.getOptionalExpandFirst() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelSpreadBuff ) {
			CFGenKbGelSpreadBuff rhs = (CFGenKbGelSpreadBuff)obj;
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					if( ! getOptionalExpandFirst().equals( rhs.getOptionalExpandFirst() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
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
		if( getOptionalExpandFirst() != null ) {
			hashCode = hashCode + getOptionalExpandFirst().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelSpreadByFirstIdxKey ) {
			CFGenKbGelSpreadByFirstIdxKey rhs = (CFGenKbGelSpreadByFirstIdxKey)obj;
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					int cmp = getOptionalExpandFirst().compareTo( rhs.getOptionalExpandFirst() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelSpreadBuff ) {
			CFGenKbGelSpreadBuff rhs = (CFGenKbGelSpreadBuff)obj;
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					int cmp = getOptionalExpandFirst().compareTo( rhs.getOptionalExpandFirst() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
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
		String ret = "<CFGenKbGelSpreadByFirstIdx"
			+ " OptionalExpandFirst=" + ( ( getOptionalExpandFirst() == null ) ? "null" : "\"" + CFGenKbSchema.xmlEncodeString( getOptionalExpandFirst() ) + "\"" )
			+ "/>";
		return( ret );
	}
}
