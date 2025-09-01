// Description: Java 11 implementation of a GenItem by GelExecIdx index key object.

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

public class CFGenKbGenItemByGelExecIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalGelExecutableTenantId;
	protected Long optionalGelExecutableGelCacheId;
	protected Long optionalGelExecutableId;
	public CFGenKbGenItemByGelExecIdxKey() {
		optionalGelExecutableTenantId = null;
		optionalGelExecutableGelCacheId = null;
		optionalGelExecutableId = null;
	}

	public Long getOptionalGelExecutableTenantId() {
		return( optionalGelExecutableTenantId );
	}

	public void setOptionalGelExecutableTenantId( Long value ) {
		if( value == null ) {
			optionalGelExecutableTenantId = null;
		}
		else if( value < CFGenKbGenItemBuff.GELEXECUTABLETENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableTenantId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.GELEXECUTABLETENANTID_MIN_VALUE );
		}
		else {
			optionalGelExecutableTenantId = value;
		}
	}

	public Long getOptionalGelExecutableGelCacheId() {
		return( optionalGelExecutableGelCacheId );
	}

	public void setOptionalGelExecutableGelCacheId( Long value ) {
		if( value == null ) {
			optionalGelExecutableGelCacheId = null;
		}
		else if( value < CFGenKbGenItemBuff.GELEXECUTABLEGELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableGelCacheId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.GELEXECUTABLEGELCACHEID_MIN_VALUE );
		}
		else {
			optionalGelExecutableGelCacheId = value;
		}
	}

	public Long getOptionalGelExecutableId() {
		return( optionalGelExecutableId );
	}

	public void setOptionalGelExecutableId( Long value ) {
		if( value == null ) {
			optionalGelExecutableId = null;
		}
		else if( value < CFGenKbGenItemBuff.GELEXECUTABLEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalGelExecutableId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.GELEXECUTABLEID_MIN_VALUE );
		}
		else {
			optionalGelExecutableId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenItemByGelExecIdxKey ) {
			CFGenKbGenItemByGelExecIdxKey rhs = (CFGenKbGenItemByGelExecIdxKey)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					if( ! getOptionalGelExecutableTenantId().equals( rhs.getOptionalGelExecutableTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					if( ! getOptionalGelExecutableGelCacheId().equals( rhs.getOptionalGelExecutableGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				if( rhs.getOptionalGelExecutableId() != null ) {
					if( ! getOptionalGelExecutableId().equals( rhs.getOptionalGelExecutableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					if( ! getOptionalGelExecutableTenantId().equals( rhs.getOptionalGelExecutableTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					if( ! getOptionalGelExecutableGelCacheId().equals( rhs.getOptionalGelExecutableGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				if( rhs.getOptionalGelExecutableId() != null ) {
					if( ! getOptionalGelExecutableId().equals( rhs.getOptionalGelExecutableId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
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
		if( getOptionalGelExecutableTenantId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableTenantId().hashCode();
		}
		if( getOptionalGelExecutableGelCacheId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableGelCacheId().hashCode();
		}
		if( getOptionalGelExecutableId() != null ) {
			hashCode = hashCode + getOptionalGelExecutableId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenItemByGelExecIdxKey ) {
			CFGenKbGenItemByGelExecIdxKey rhs = (CFGenKbGenItemByGelExecIdxKey)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				Long lhsGelExecutableTenantId = getOptionalGelExecutableTenantId();
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					Long rhsGelExecutableTenantId = rhs.getOptionalGelExecutableTenantId();
					int cmp = lhsGelExecutableTenantId.compareTo( rhsGelExecutableTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				Long lhsGelExecutableGelCacheId = getOptionalGelExecutableGelCacheId();
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					Long rhsGelExecutableGelCacheId = rhs.getOptionalGelExecutableGelCacheId();
					int cmp = lhsGelExecutableGelCacheId.compareTo( rhsGelExecutableGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				Long lhsGelExecutableId = getOptionalGelExecutableId();
				if( rhs.getOptionalGelExecutableId() != null ) {
					Long rhsGelExecutableId = rhs.getOptionalGelExecutableId();
					int cmp = lhsGelExecutableId.compareTo( rhsGelExecutableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getOptionalGelExecutableTenantId() != null ) {
				Long lhsGelExecutableTenantId = getOptionalGelExecutableTenantId();
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					Long rhsGelExecutableTenantId = rhs.getOptionalGelExecutableTenantId();
					int cmp = lhsGelExecutableTenantId.compareTo( rhsGelExecutableTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableGelCacheId() != null ) {
				Long lhsGelExecutableGelCacheId = getOptionalGelExecutableGelCacheId();
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					Long rhsGelExecutableGelCacheId = rhs.getOptionalGelExecutableGelCacheId();
					int cmp = lhsGelExecutableGelCacheId.compareTo( rhsGelExecutableGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalGelExecutableId() != null ) {
				Long lhsGelExecutableId = getOptionalGelExecutableId();
				if( rhs.getOptionalGelExecutableId() != null ) {
					Long rhsGelExecutableId = rhs.getOptionalGelExecutableId();
					int cmp = lhsGelExecutableId.compareTo( rhsGelExecutableId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalGelExecutableId() != null ) {
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
		String ret = "<CFGenKbGenItemByGelExecIdx"
			+ " OptionalGelExecutableTenantId=" + ( ( getOptionalGelExecutableTenantId() == null ) ? "null" : "\"" + getOptionalGelExecutableTenantId().toString() + "\"" )
			+ " OptionalGelExecutableGelCacheId=" + ( ( getOptionalGelExecutableGelCacheId() == null ) ? "null" : "\"" + getOptionalGelExecutableGelCacheId().toString() + "\"" )
			+ " OptionalGelExecutableId=" + ( ( getOptionalGelExecutableId() == null ) ? "null" : "\"" + getOptionalGelExecutableId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
