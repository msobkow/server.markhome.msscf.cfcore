// Description: Java 11 implementation of a GelCall by CallInstIdx index key object.

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

public class CFGenKbGelCallByCallInstIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalCallInstTenantId;
	protected Long optionalCallInstGelCacheId;
	protected Long optionalCallInstId;
	public CFGenKbGelCallByCallInstIdxKey() {
		optionalCallInstTenantId = null;
		optionalCallInstGelCacheId = null;
		optionalCallInstId = null;
	}

	public Long getOptionalCallInstTenantId() {
		return( optionalCallInstTenantId );
	}

	public void setOptionalCallInstTenantId( Long value ) {
		if( value == null ) {
			optionalCallInstTenantId = null;
		}
		else if( value < CFGenKbGelCallBuff.CALLINSTTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalCallInstTenantId",
				1,
				"value",
				value,
				CFGenKbGelCallBuff.CALLINSTTENANTID_MIN_VALUE );
		}
		else {
			optionalCallInstTenantId = value;
		}
	}

	public Long getOptionalCallInstGelCacheId() {
		return( optionalCallInstGelCacheId );
	}

	public void setOptionalCallInstGelCacheId( Long value ) {
		if( value == null ) {
			optionalCallInstGelCacheId = null;
		}
		else if( value < CFGenKbGelCallBuff.CALLINSTGELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalCallInstGelCacheId",
				1,
				"value",
				value,
				CFGenKbGelCallBuff.CALLINSTGELCACHEID_MIN_VALUE );
		}
		else {
			optionalCallInstGelCacheId = value;
		}
	}

	public Long getOptionalCallInstId() {
		return( optionalCallInstId );
	}

	public void setOptionalCallInstId( Long value ) {
		if( value == null ) {
			optionalCallInstId = null;
		}
		else if( value < CFGenKbGelCallBuff.CALLINSTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalCallInstId",
				1,
				"value",
				value,
				CFGenKbGelCallBuff.CALLINSTID_MIN_VALUE );
		}
		else {
			optionalCallInstId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelCallByCallInstIdxKey ) {
			CFGenKbGelCallByCallInstIdxKey rhs = (CFGenKbGelCallByCallInstIdxKey)obj;
			if( getOptionalCallInstTenantId() != null ) {
				if( rhs.getOptionalCallInstTenantId() != null ) {
					if( ! getOptionalCallInstTenantId().equals( rhs.getOptionalCallInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalCallInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalCallInstGelCacheId() != null ) {
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					if( ! getOptionalCallInstGelCacheId().equals( rhs.getOptionalCallInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalCallInstId() != null ) {
				if( rhs.getOptionalCallInstId() != null ) {
					if( ! getOptionalCallInstId().equals( rhs.getOptionalCallInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalCallInstId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelCallBuff ) {
			CFGenKbGelCallBuff rhs = (CFGenKbGelCallBuff)obj;
			if( getOptionalCallInstTenantId() != null ) {
				if( rhs.getOptionalCallInstTenantId() != null ) {
					if( ! getOptionalCallInstTenantId().equals( rhs.getOptionalCallInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalCallInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalCallInstGelCacheId() != null ) {
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					if( ! getOptionalCallInstGelCacheId().equals( rhs.getOptionalCallInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalCallInstId() != null ) {
				if( rhs.getOptionalCallInstId() != null ) {
					if( ! getOptionalCallInstId().equals( rhs.getOptionalCallInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalCallInstId() != null ) {
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
		if( getOptionalCallInstTenantId() != null ) {
			hashCode = hashCode + getOptionalCallInstTenantId().hashCode();
		}
		if( getOptionalCallInstGelCacheId() != null ) {
			hashCode = hashCode + getOptionalCallInstGelCacheId().hashCode();
		}
		if( getOptionalCallInstId() != null ) {
			hashCode = hashCode + getOptionalCallInstId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelCallByCallInstIdxKey ) {
			CFGenKbGelCallByCallInstIdxKey rhs = (CFGenKbGelCallByCallInstIdxKey)obj;
			if( getOptionalCallInstTenantId() != null ) {
				Long lhsCallInstTenantId = getOptionalCallInstTenantId();
				if( rhs.getOptionalCallInstTenantId() != null ) {
					Long rhsCallInstTenantId = rhs.getOptionalCallInstTenantId();
					int cmp = lhsCallInstTenantId.compareTo( rhsCallInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalCallInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalCallInstGelCacheId() != null ) {
				Long lhsCallInstGelCacheId = getOptionalCallInstGelCacheId();
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					Long rhsCallInstGelCacheId = rhs.getOptionalCallInstGelCacheId();
					int cmp = lhsCallInstGelCacheId.compareTo( rhsCallInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalCallInstId() != null ) {
				Long lhsCallInstId = getOptionalCallInstId();
				if( rhs.getOptionalCallInstId() != null ) {
					Long rhsCallInstId = rhs.getOptionalCallInstId();
					int cmp = lhsCallInstId.compareTo( rhsCallInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalCallInstId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelCallBuff ) {
			CFGenKbGelCallBuff rhs = (CFGenKbGelCallBuff)obj;
			if( getOptionalCallInstTenantId() != null ) {
				Long lhsCallInstTenantId = getOptionalCallInstTenantId();
				if( rhs.getOptionalCallInstTenantId() != null ) {
					Long rhsCallInstTenantId = rhs.getOptionalCallInstTenantId();
					int cmp = lhsCallInstTenantId.compareTo( rhsCallInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalCallInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalCallInstGelCacheId() != null ) {
				Long lhsCallInstGelCacheId = getOptionalCallInstGelCacheId();
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					Long rhsCallInstGelCacheId = rhs.getOptionalCallInstGelCacheId();
					int cmp = lhsCallInstGelCacheId.compareTo( rhsCallInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalCallInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalCallInstId() != null ) {
				Long lhsCallInstId = getOptionalCallInstId();
				if( rhs.getOptionalCallInstId() != null ) {
					Long rhsCallInstId = rhs.getOptionalCallInstId();
					int cmp = lhsCallInstId.compareTo( rhsCallInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalCallInstId() != null ) {
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
		String ret = "<CFGenKbGelCallByCallInstIdx"
			+ " OptionalCallInstTenantId=" + ( ( getOptionalCallInstTenantId() == null ) ? "null" : "\"" + getOptionalCallInstTenantId().toString() + "\"" )
			+ " OptionalCallInstGelCacheId=" + ( ( getOptionalCallInstGelCacheId() == null ) ? "null" : "\"" + getOptionalCallInstGelCacheId().toString() + "\"" )
			+ " OptionalCallInstId=" + ( ( getOptionalCallInstId() == null ) ? "null" : "\"" + getOptionalCallInstId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
