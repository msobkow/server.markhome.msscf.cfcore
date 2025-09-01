// Description: Java 11 implementation of a Cluster 64-bit RAM Id Generator object.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKbRam;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

/*
 *	CFGenKbRamClusterId64Gen RAM 64-bit Id Generator for Cluster
 */
public class CFGenKbRamClusterId64Gen
	implements Comparable<Object>,
		Serializable
{

	protected long requiredId;
	protected short sliceId = 0;
	protected long nextId = 1L;

	public CFGenKbRamClusterId64Gen() {
		requiredId = CFGenKbClusterBuff.ID_INIT_VALUE;
		sliceId = 0;
		nextId = 1L;
	}

	public long getNextId() {
		long retNext = nextId ++;
		return( retNext );
	}

	public long getRequiredId() {
		return( requiredId );
	}

	public void setRequiredId( long value ) {
		if( value < CFGenKbClusterBuff.ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredId",
				1,
				"value",
				value,
				CFGenKbClusterBuff.ID_MIN_VALUE );
		}
		requiredId = value;
	}

	public short getRequiredSliceId() {
		return( sliceId );
	}

	public void setRequiredSliceId( short value ) {
		sliceId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbRamClusterId64Gen ) {
			CFGenKbRamClusterId64Gen rhs = (CFGenKbRamClusterId64Gen)obj;
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSliceId() != rhs.getRequiredSliceId() ) {
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
		hashCode = hashCode + (int)( getRequiredId() );
		hashCode = ( hashCode * 0x10000 ) + getRequiredSliceId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbRamClusterId64Gen ) {
			CFGenKbRamClusterId64Gen rhs = (CFGenKbRamClusterId64Gen)obj;
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			{
				short lhsSliceId = getRequiredSliceId();
				short rhsSliceId = rhs.getRequiredSliceId();
				if( lhsSliceId < rhsSliceId ) {
					return( -1 );
				}
				else if( lhsSliceId > rhsSliceId ) {
					return( 1 );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFGenKbClusterId64Gen" );
		}
	}

	public String toString() {
		String ret = "<CFGenKbClusterId64Gen"
			+ " RequiredId=" + "\"" + Long.toString( getRequiredId() ) + "\""
			+ ", SliceId=\"" + Short.toString( getRequiredSliceId() ) + "\""
			+ ", NextId=\"" + Long.toString( nextId ) + "\"/>";
		return( ret );
	}
}
