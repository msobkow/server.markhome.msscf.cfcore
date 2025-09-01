// Description: Java 11 implementation of a GelIterator by EachIdx index key object.

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

public class CFGenKbGelIteratorByEachIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredExpandEach;
	public CFGenKbGelIteratorByEachIdxKey() {
		requiredExpandEach = new String( CFGenKbGelIteratorBuff.EXPANDEACH_INIT_VALUE );
	}

	public String getRequiredExpandEach() {
		return( requiredExpandEach );
	}

	public void setRequiredExpandEach( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredExpandEach",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredExpandEach",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredExpandEach = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelIteratorByEachIdxKey ) {
			CFGenKbGelIteratorByEachIdxKey rhs = (CFGenKbGelIteratorByEachIdxKey)obj;
			if( ! getRequiredExpandEach().equals( rhs.getRequiredExpandEach() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorBuff ) {
			CFGenKbGelIteratorBuff rhs = (CFGenKbGelIteratorBuff)obj;
			if( ! getRequiredExpandEach().equals( rhs.getRequiredExpandEach() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getRequiredExpandEach() != null ) {
			hashCode = hashCode + getRequiredExpandEach().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelIteratorByEachIdxKey ) {
			CFGenKbGelIteratorByEachIdxKey rhs = (CFGenKbGelIteratorByEachIdxKey)obj;
			{
				int cmp = getRequiredExpandEach().compareTo( rhs.getRequiredExpandEach() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorBuff ) {
			CFGenKbGelIteratorBuff rhs = (CFGenKbGelIteratorBuff)obj;
			{
				int cmp = getRequiredExpandEach().compareTo( rhs.getRequiredExpandEach() );
				if( cmp != 0 ) {
					return( cmp );
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
		String ret = "<CFGenKbGelIteratorByEachIdx"
			+ " RequiredExpandEach=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredExpandEach() ) + "\""
			+ "/>";
		return( ret );
	}
}
