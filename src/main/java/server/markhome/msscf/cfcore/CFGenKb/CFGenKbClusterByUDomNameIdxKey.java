// Description: Java 11 implementation of a Cluster by UDomNameIdx index key object.

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

public class CFGenKbClusterByUDomNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredFullDomName;
	public CFGenKbClusterByUDomNameIdxKey() {
		requiredFullDomName = new String( CFGenKbClusterBuff.FULLDOMNAME_INIT_VALUE );
	}

	public String getRequiredFullDomName() {
		return( requiredFullDomName );
	}

	public void setRequiredFullDomName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredFullDomName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredFullDomName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredFullDomName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbClusterByUDomNameIdxKey ) {
			CFGenKbClusterByUDomNameIdxKey rhs = (CFGenKbClusterByUDomNameIdxKey)obj;
			if( ! getRequiredFullDomName().equals( rhs.getRequiredFullDomName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbClusterBuff ) {
			CFGenKbClusterBuff rhs = (CFGenKbClusterBuff)obj;
			if( ! getRequiredFullDomName().equals( rhs.getRequiredFullDomName() ) ) {
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
		if( getRequiredFullDomName() != null ) {
			hashCode = hashCode + getRequiredFullDomName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbClusterByUDomNameIdxKey ) {
			CFGenKbClusterByUDomNameIdxKey rhs = (CFGenKbClusterByUDomNameIdxKey)obj;
			{
				int cmp = getRequiredFullDomName().compareTo( rhs.getRequiredFullDomName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbClusterBuff ) {
			CFGenKbClusterBuff rhs = (CFGenKbClusterBuff)obj;
			{
				int cmp = getRequiredFullDomName().compareTo( rhs.getRequiredFullDomName() );
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
		String ret = "<CFGenKbClusterByUDomNameIdx"
			+ " RequiredFullDomName=" + "\"" + CFGenKbSchema.xmlEncodeString( getRequiredFullDomName() ) + "\""
			+ "/>";
		return( ret );
	}
}
