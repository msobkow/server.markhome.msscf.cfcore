// Description: Java 11 implementation of a GelPrefixLine by RemainderIdx index key object.

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

public class CFGenKbGelPrefixLineByRemainderIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalRemainderTenantId;
	protected long requiredRemainderGelCacheId;
	protected Long optionalRemainderInstId;
	public CFGenKbGelPrefixLineByRemainderIdxKey() {
		optionalRemainderTenantId = null;
		requiredRemainderGelCacheId = CFGenKbGelPrefixLineBuff.REMAINDERGELCACHEID_INIT_VALUE;
		optionalRemainderInstId = null;
	}

	public Long getOptionalRemainderTenantId() {
		return( optionalRemainderTenantId );
	}

	public void setOptionalRemainderTenantId( Long value ) {
		if( value == null ) {
			optionalRemainderTenantId = null;
		}
		else if( value < CFGenKbGelPrefixLineBuff.REMAINDERTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRemainderTenantId",
				1,
				"value",
				value,
				CFGenKbGelPrefixLineBuff.REMAINDERTENANTID_MIN_VALUE );
		}
		else {
			optionalRemainderTenantId = value;
		}
	}

	public long getRequiredRemainderGelCacheId() {
		return( requiredRemainderGelCacheId );
	}

	public void setRequiredRemainderGelCacheId( long value ) {
		if( value < CFGenKbGelPrefixLineBuff.REMAINDERGELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredRemainderGelCacheId",
				1,
				"value",
				value,
				CFGenKbGelPrefixLineBuff.REMAINDERGELCACHEID_MIN_VALUE );
		}
		requiredRemainderGelCacheId = value;
	}

	public Long getOptionalRemainderInstId() {
		return( optionalRemainderInstId );
	}

	public void setOptionalRemainderInstId( Long value ) {
		if( value == null ) {
			optionalRemainderInstId = null;
		}
		else if( value < CFGenKbGelPrefixLineBuff.REMAINDERINSTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalRemainderInstId",
				1,
				"value",
				value,
				CFGenKbGelPrefixLineBuff.REMAINDERINSTID_MIN_VALUE );
		}
		else {
			optionalRemainderInstId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelPrefixLineByRemainderIdxKey ) {
			CFGenKbGelPrefixLineByRemainderIdxKey rhs = (CFGenKbGelPrefixLineByRemainderIdxKey)obj;
			if( getOptionalRemainderTenantId() != null ) {
				if( rhs.getOptionalRemainderTenantId() != null ) {
					if( ! getOptionalRemainderTenantId().equals( rhs.getOptionalRemainderTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRemainderTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredRemainderGelCacheId() != rhs.getRequiredRemainderGelCacheId() ) {
				return( false );
			}
			if( getOptionalRemainderInstId() != null ) {
				if( rhs.getOptionalRemainderInstId() != null ) {
					if( ! getOptionalRemainderInstId().equals( rhs.getOptionalRemainderInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRemainderInstId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelPrefixLineBuff ) {
			CFGenKbGelPrefixLineBuff rhs = (CFGenKbGelPrefixLineBuff)obj;
			if( getOptionalRemainderTenantId() != null ) {
				if( rhs.getOptionalRemainderTenantId() != null ) {
					if( ! getOptionalRemainderTenantId().equals( rhs.getOptionalRemainderTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRemainderTenantId() != null ) {
					return( false );
				}
			}
			if( getRequiredRemainderGelCacheId() != rhs.getRequiredRemainderGelCacheId() ) {
				return( false );
			}
			if( getOptionalRemainderInstId() != null ) {
				if( rhs.getOptionalRemainderInstId() != null ) {
					if( ! getOptionalRemainderInstId().equals( rhs.getOptionalRemainderInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalRemainderInstId() != null ) {
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
		if( getOptionalRemainderTenantId() != null ) {
			hashCode = hashCode + getOptionalRemainderTenantId().hashCode();
		}
		hashCode = hashCode + (int)( getRequiredRemainderGelCacheId() );
		if( getOptionalRemainderInstId() != null ) {
			hashCode = hashCode + getOptionalRemainderInstId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelPrefixLineByRemainderIdxKey ) {
			CFGenKbGelPrefixLineByRemainderIdxKey rhs = (CFGenKbGelPrefixLineByRemainderIdxKey)obj;
			if( getOptionalRemainderTenantId() != null ) {
				Long lhsRemainderTenantId = getOptionalRemainderTenantId();
				if( rhs.getOptionalRemainderTenantId() != null ) {
					Long rhsRemainderTenantId = rhs.getOptionalRemainderTenantId();
					int cmp = lhsRemainderTenantId.compareTo( rhsRemainderTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRemainderTenantId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredRemainderGelCacheId() < rhs.getRequiredRemainderGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredRemainderGelCacheId() > rhs.getRequiredRemainderGelCacheId() ) {
				return( 1 );
			}
			if( getOptionalRemainderInstId() != null ) {
				Long lhsRemainderInstId = getOptionalRemainderInstId();
				if( rhs.getOptionalRemainderInstId() != null ) {
					Long rhsRemainderInstId = rhs.getOptionalRemainderInstId();
					int cmp = lhsRemainderInstId.compareTo( rhsRemainderInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRemainderInstId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelPrefixLineBuff ) {
			CFGenKbGelPrefixLineBuff rhs = (CFGenKbGelPrefixLineBuff)obj;
			if( getOptionalRemainderTenantId() != null ) {
				Long lhsRemainderTenantId = getOptionalRemainderTenantId();
				if( rhs.getOptionalRemainderTenantId() != null ) {
					Long rhsRemainderTenantId = rhs.getOptionalRemainderTenantId();
					int cmp = lhsRemainderTenantId.compareTo( rhsRemainderTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRemainderTenantId() != null ) {
					return( -1 );
				}
			}
			if( getRequiredRemainderGelCacheId() < rhs.getRequiredRemainderGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredRemainderGelCacheId() > rhs.getRequiredRemainderGelCacheId() ) {
				return( 1 );
			}
			if( getOptionalRemainderInstId() != null ) {
				Long lhsRemainderInstId = getOptionalRemainderInstId();
				if( rhs.getOptionalRemainderInstId() != null ) {
					Long rhsRemainderInstId = rhs.getOptionalRemainderInstId();
					int cmp = lhsRemainderInstId.compareTo( rhsRemainderInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalRemainderInstId() != null ) {
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
		String ret = "<CFGenKbGelPrefixLineByRemainderIdx"
			+ " OptionalRemainderTenantId=" + ( ( getOptionalRemainderTenantId() == null ) ? "null" : "\"" + getOptionalRemainderTenantId().toString() + "\"" )
			+ " RequiredRemainderGelCacheId=" + "\"" + Long.toString( getRequiredRemainderGelCacheId() ) + "\""
			+ " OptionalRemainderInstId=" + ( ( getOptionalRemainderInstId() == null ) ? "null" : "\"" + getOptionalRemainderInstId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
