// Description: Java 11 implementation of a GelSequence by FirstInstIdx index key object.

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

public class CFGenKbGelSequenceByFirstInstIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalFirstInstTenantId;
	protected Long optionalFirstInstGelCacheId;
	protected Long optionalFirstInstId;
	public CFGenKbGelSequenceByFirstInstIdxKey() {
		optionalFirstInstTenantId = null;
		optionalFirstInstGelCacheId = null;
		optionalFirstInstId = null;
	}

	public Long getOptionalFirstInstTenantId() {
		return( optionalFirstInstTenantId );
	}

	public void setOptionalFirstInstTenantId( Long value ) {
		if( value == null ) {
			optionalFirstInstTenantId = null;
		}
		else if( value < CFGenKbGelSequenceBuff.FIRSTINSTTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalFirstInstTenantId",
				1,
				"value",
				value,
				CFGenKbGelSequenceBuff.FIRSTINSTTENANTID_MIN_VALUE );
		}
		else {
			optionalFirstInstTenantId = value;
		}
	}

	public Long getOptionalFirstInstGelCacheId() {
		return( optionalFirstInstGelCacheId );
	}

	public void setOptionalFirstInstGelCacheId( Long value ) {
		if( value == null ) {
			optionalFirstInstGelCacheId = null;
		}
		else if( value < CFGenKbGelSequenceBuff.FIRSTINSTGELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalFirstInstGelCacheId",
				1,
				"value",
				value,
				CFGenKbGelSequenceBuff.FIRSTINSTGELCACHEID_MIN_VALUE );
		}
		else {
			optionalFirstInstGelCacheId = value;
		}
	}

	public Long getOptionalFirstInstId() {
		return( optionalFirstInstId );
	}

	public void setOptionalFirstInstId( Long value ) {
		if( value == null ) {
			optionalFirstInstId = null;
		}
		else if( value < CFGenKbGelSequenceBuff.FIRSTINSTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalFirstInstId",
				1,
				"value",
				value,
				CFGenKbGelSequenceBuff.FIRSTINSTID_MIN_VALUE );
		}
		else {
			optionalFirstInstId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelSequenceByFirstInstIdxKey ) {
			CFGenKbGelSequenceByFirstInstIdxKey rhs = (CFGenKbGelSequenceByFirstInstIdxKey)obj;
			if( getOptionalFirstInstTenantId() != null ) {
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					if( ! getOptionalFirstInstTenantId().equals( rhs.getOptionalFirstInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalFirstInstGelCacheId() != null ) {
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					if( ! getOptionalFirstInstGelCacheId().equals( rhs.getOptionalFirstInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalFirstInstId() != null ) {
				if( rhs.getOptionalFirstInstId() != null ) {
					if( ! getOptionalFirstInstId().equals( rhs.getOptionalFirstInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFirstInstId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelSequenceBuff ) {
			CFGenKbGelSequenceBuff rhs = (CFGenKbGelSequenceBuff)obj;
			if( getOptionalFirstInstTenantId() != null ) {
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					if( ! getOptionalFirstInstTenantId().equals( rhs.getOptionalFirstInstTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalFirstInstGelCacheId() != null ) {
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					if( ! getOptionalFirstInstGelCacheId().equals( rhs.getOptionalFirstInstGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalFirstInstId() != null ) {
				if( rhs.getOptionalFirstInstId() != null ) {
					if( ! getOptionalFirstInstId().equals( rhs.getOptionalFirstInstId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalFirstInstId() != null ) {
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
		if( getOptionalFirstInstTenantId() != null ) {
			hashCode = hashCode + getOptionalFirstInstTenantId().hashCode();
		}
		if( getOptionalFirstInstGelCacheId() != null ) {
			hashCode = hashCode + getOptionalFirstInstGelCacheId().hashCode();
		}
		if( getOptionalFirstInstId() != null ) {
			hashCode = hashCode + getOptionalFirstInstId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGelSequenceByFirstInstIdxKey ) {
			CFGenKbGelSequenceByFirstInstIdxKey rhs = (CFGenKbGelSequenceByFirstInstIdxKey)obj;
			if( getOptionalFirstInstTenantId() != null ) {
				Long lhsFirstInstTenantId = getOptionalFirstInstTenantId();
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					Long rhsFirstInstTenantId = rhs.getOptionalFirstInstTenantId();
					int cmp = lhsFirstInstTenantId.compareTo( rhsFirstInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFirstInstGelCacheId() != null ) {
				Long lhsFirstInstGelCacheId = getOptionalFirstInstGelCacheId();
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					Long rhsFirstInstGelCacheId = rhs.getOptionalFirstInstGelCacheId();
					int cmp = lhsFirstInstGelCacheId.compareTo( rhsFirstInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFirstInstId() != null ) {
				Long lhsFirstInstId = getOptionalFirstInstId();
				if( rhs.getOptionalFirstInstId() != null ) {
					Long rhsFirstInstId = rhs.getOptionalFirstInstId();
					int cmp = lhsFirstInstId.compareTo( rhsFirstInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFirstInstId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelSequenceBuff ) {
			CFGenKbGelSequenceBuff rhs = (CFGenKbGelSequenceBuff)obj;
			if( getOptionalFirstInstTenantId() != null ) {
				Long lhsFirstInstTenantId = getOptionalFirstInstTenantId();
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					Long rhsFirstInstTenantId = rhs.getOptionalFirstInstTenantId();
					int cmp = lhsFirstInstTenantId.compareTo( rhsFirstInstTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFirstInstTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFirstInstGelCacheId() != null ) {
				Long lhsFirstInstGelCacheId = getOptionalFirstInstGelCacheId();
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					Long rhsFirstInstGelCacheId = rhs.getOptionalFirstInstGelCacheId();
					int cmp = lhsFirstInstGelCacheId.compareTo( rhsFirstInstGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFirstInstGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalFirstInstId() != null ) {
				Long lhsFirstInstId = getOptionalFirstInstId();
				if( rhs.getOptionalFirstInstId() != null ) {
					Long rhsFirstInstId = rhs.getOptionalFirstInstId();
					int cmp = lhsFirstInstId.compareTo( rhsFirstInstId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalFirstInstId() != null ) {
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
		String ret = "<CFGenKbGelSequenceByFirstInstIdx"
			+ " OptionalFirstInstTenantId=" + ( ( getOptionalFirstInstTenantId() == null ) ? "null" : "\"" + getOptionalFirstInstTenantId().toString() + "\"" )
			+ " OptionalFirstInstGelCacheId=" + ( ( getOptionalFirstInstGelCacheId() == null ) ? "null" : "\"" + getOptionalFirstInstGelCacheId().toString() + "\"" )
			+ " OptionalFirstInstId=" + ( ( getOptionalFirstInstId() == null ) ? "null" : "\"" + getOptionalFirstInstId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
