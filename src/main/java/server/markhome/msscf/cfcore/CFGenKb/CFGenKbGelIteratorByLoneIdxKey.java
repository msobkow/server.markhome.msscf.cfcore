// Description: Java 11 implementation of a GelIterator by LoneIdx index key object.

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

public class CFGenKbGelIteratorByLoneIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String optionalExpandLone;
	public CFGenKbGelIteratorByLoneIdxKey() {
		optionalExpandLone = null;
	}

	public String getOptionalExpandLone() {
		return( optionalExpandLone );
	}

	public void setOptionalExpandLone( String value ) {
		if( value == null ) {
			optionalExpandLone = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandLone",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandLone = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelIteratorByLoneIdxKey ) {
			CFGenKbGelIteratorByLoneIdxKey rhs = (CFGenKbGelIteratorByLoneIdxKey)obj;
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					if( ! getOptionalExpandLone().equals( rhs.getOptionalExpandLone() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorBuff ) {
			CFGenKbGelIteratorBuff rhs = (CFGenKbGelIteratorBuff)obj;
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					if( ! getOptionalExpandLone().equals( rhs.getOptionalExpandLone() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
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
		if( getOptionalExpandLone() != null ) {
			hashCode = hashCode + getOptionalExpandLone().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelIteratorByLoneIdxKey ) {
			CFGenKbGelIteratorByLoneIdxKey rhs = (CFGenKbGelIteratorByLoneIdxKey)obj;
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					int cmp = getOptionalExpandLone().compareTo( rhs.getOptionalExpandLone() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorBuff ) {
			CFGenKbGelIteratorBuff rhs = (CFGenKbGelIteratorBuff)obj;
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					int cmp = getOptionalExpandLone().compareTo( rhs.getOptionalExpandLone() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
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
		String ret = "<CFGenKbGelIteratorByLoneIdx"
			+ " OptionalExpandLone=" + ( ( getOptionalExpandLone() == null ) ? "null" : "\"" + CFGenKbSchema.xmlEncodeString( getOptionalExpandLone() ) + "\"" )
			+ "/>";
		return( ret );
	}
}
