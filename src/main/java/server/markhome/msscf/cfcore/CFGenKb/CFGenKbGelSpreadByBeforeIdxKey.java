// Description: Java 11 implementation of a GelSpread by BeforeIdx index key object.

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

public class CFGenKbGelSpreadByBeforeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String optionalExpandBefore;
	public CFGenKbGelSpreadByBeforeIdxKey() {
		optionalExpandBefore = null;
	}

	public String getOptionalExpandBefore() {
		return( optionalExpandBefore );
	}

	public void setOptionalExpandBefore( String value ) {
		if( value == null ) {
			optionalExpandBefore = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandBefore",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandBefore = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelSpreadByBeforeIdxKey ) {
			CFGenKbGelSpreadByBeforeIdxKey rhs = (CFGenKbGelSpreadByBeforeIdxKey)obj;
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					if( ! getOptionalExpandBefore().equals( rhs.getOptionalExpandBefore() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelSpreadBuff ) {
			CFGenKbGelSpreadBuff rhs = (CFGenKbGelSpreadBuff)obj;
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					if( ! getOptionalExpandBefore().equals( rhs.getOptionalExpandBefore() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
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
		if( getOptionalExpandBefore() != null ) {
			hashCode = hashCode + getOptionalExpandBefore().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelSpreadByBeforeIdxKey ) {
			CFGenKbGelSpreadByBeforeIdxKey rhs = (CFGenKbGelSpreadByBeforeIdxKey)obj;
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					int cmp = getOptionalExpandBefore().compareTo( rhs.getOptionalExpandBefore() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelSpreadBuff ) {
			CFGenKbGelSpreadBuff rhs = (CFGenKbGelSpreadBuff)obj;
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					int cmp = getOptionalExpandBefore().compareTo( rhs.getOptionalExpandBefore() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
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
		String ret = "<CFGenKbGelSpreadByBeforeIdx"
			+ " OptionalExpandBefore=" + ( ( getOptionalExpandBefore() == null ) ? "null" : "\"" + CFGenKbSchema.xmlEncodeString( getOptionalExpandBefore() ) + "\"" )
			+ "/>";
		return( ret );
	}
}
