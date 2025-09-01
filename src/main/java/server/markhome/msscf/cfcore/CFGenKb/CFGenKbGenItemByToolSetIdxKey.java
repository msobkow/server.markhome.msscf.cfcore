// Description: Java 11 implementation of a GenItem by ToolSetIdx index key object.

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

public class CFGenKbGenItemByToolSetIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected short requiredToolSetId;
	public CFGenKbGenItemByToolSetIdxKey() {
		requiredToolSetId = CFGenKbGenItemBuff.TOOLSETID_INIT_VALUE;
	}

	public short getRequiredToolSetId() {
		return( requiredToolSetId );
	}

	public void setRequiredToolSetId( short value ) {
		if( value < CFGenKbGenItemBuff.TOOLSETID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredToolSetId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.TOOLSETID_MIN_VALUE );
		}
		if( value > CFGenKbGenItemBuff.TOOLSETID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredToolSetId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.TOOLSETID_MAX_VALUE );
		}
		requiredToolSetId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenItemByToolSetIdxKey ) {
			CFGenKbGenItemByToolSetIdxKey rhs = (CFGenKbGenItemByToolSetIdxKey)obj;
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredToolSetId() != rhs.getRequiredToolSetId() ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredToolSetId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenItemByToolSetIdxKey ) {
			CFGenKbGenItemByToolSetIdxKey rhs = (CFGenKbGenItemByToolSetIdxKey)obj;
			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredToolSetId() < rhs.getRequiredToolSetId() ) {
				return( -1 );
			}
			else if( getRequiredToolSetId() > rhs.getRequiredToolSetId() ) {
				return( 1 );
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
		String ret = "<CFGenKbGenItemByToolSetIdx"
			+ " RequiredToolSetId=" + "\"" + Short.toString( getRequiredToolSetId() ) + "\""
			+ "/>";
		return( ret );
	}
}
