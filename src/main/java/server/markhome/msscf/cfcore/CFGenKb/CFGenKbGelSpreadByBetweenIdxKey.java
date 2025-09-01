// Description: Java 11 implementation of a GelSpread by BetweenIdx index key object.

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

public class CFGenKbGelSpreadByBetweenIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String optionalExpandBetween;
	public CFGenKbGelSpreadByBetweenIdxKey() {
		optionalExpandBetween = null;
	}

	public String getOptionalExpandBetween() {
		return( optionalExpandBetween );
	}

	public void setOptionalExpandBetween( String value ) {
		if( value == null ) {
			optionalExpandBetween = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandBetween",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandBetween = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelSpreadByBetweenIdxKey ) {
			CFGenKbGelSpreadByBetweenIdxKey rhs = (CFGenKbGelSpreadByBetweenIdxKey)obj;
			if( getOptionalExpandBetween() != null ) {
				if( rhs.getOptionalExpandBetween() != null ) {
					if( ! getOptionalExpandBetween().equals( rhs.getOptionalExpandBetween() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandBetween() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelSpreadBuff ) {
			CFGenKbGelSpreadBuff rhs = (CFGenKbGelSpreadBuff)obj;
			if( getOptionalExpandBetween() != null ) {
				if( rhs.getOptionalExpandBetween() != null ) {
					if( ! getOptionalExpandBetween().equals( rhs.getOptionalExpandBetween() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandBetween() != null ) {
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
		if( getOptionalExpandBetween() != null ) {
			hashCode = hashCode + getOptionalExpandBetween().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelSpreadByBetweenIdxKey ) {
			CFGenKbGelSpreadByBetweenIdxKey rhs = (CFGenKbGelSpreadByBetweenIdxKey)obj;
			if( getOptionalExpandBetween() != null ) {
				if( rhs.getOptionalExpandBetween() != null ) {
					int cmp = getOptionalExpandBetween().compareTo( rhs.getOptionalExpandBetween() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandBetween() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelSpreadBuff ) {
			CFGenKbGelSpreadBuff rhs = (CFGenKbGelSpreadBuff)obj;
			if( getOptionalExpandBetween() != null ) {
				if( rhs.getOptionalExpandBetween() != null ) {
					int cmp = getOptionalExpandBetween().compareTo( rhs.getOptionalExpandBetween() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandBetween() != null ) {
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
		String ret = "<CFGenKbGelSpreadByBetweenIdx"
			+ " OptionalExpandBetween=" + ( ( getOptionalExpandBetween() == null ) ? "null" : "\"" + CFGenKbSchema.xmlEncodeString( getOptionalExpandBetween() ) + "\"" )
			+ "/>";
		return( ret );
	}
}
