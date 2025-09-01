// Description: Java 11 implementation of a GenFile by XExpKeyName index key object.

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

public class CFGenKbGenFileByXExpKeyNameKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalExpansionKeyNameTenantId;
	protected Long optionalExpansionKeyNameGelCacheId;
	protected Long optionalExpansionKeyNameGelId;
	public CFGenKbGenFileByXExpKeyNameKey() {
		optionalExpansionKeyNameTenantId = null;
		optionalExpansionKeyNameGelCacheId = null;
		optionalExpansionKeyNameGelId = null;
	}

	public Long getOptionalExpansionKeyNameTenantId() {
		return( optionalExpansionKeyNameTenantId );
	}

	public void setOptionalExpansionKeyNameTenantId( Long value ) {
		if( value == null ) {
			optionalExpansionKeyNameTenantId = null;
		}
		else if( value < CFGenKbGenFileBuff.EXPANSIONKEYNAMETENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalExpansionKeyNameTenantId",
				1,
				"value",
				value,
				CFGenKbGenFileBuff.EXPANSIONKEYNAMETENANTID_MIN_VALUE );
		}
		else {
			optionalExpansionKeyNameTenantId = value;
		}
	}

	public Long getOptionalExpansionKeyNameGelCacheId() {
		return( optionalExpansionKeyNameGelCacheId );
	}

	public void setOptionalExpansionKeyNameGelCacheId( Long value ) {
		if( value == null ) {
			optionalExpansionKeyNameGelCacheId = null;
		}
		else if( value < CFGenKbGenFileBuff.EXPANSIONKEYNAMEGELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalExpansionKeyNameGelCacheId",
				1,
				"value",
				value,
				CFGenKbGenFileBuff.EXPANSIONKEYNAMEGELCACHEID_MIN_VALUE );
		}
		else {
			optionalExpansionKeyNameGelCacheId = value;
		}
	}

	public Long getOptionalExpansionKeyNameGelId() {
		return( optionalExpansionKeyNameGelId );
	}

	public void setOptionalExpansionKeyNameGelId( Long value ) {
		if( value == null ) {
			optionalExpansionKeyNameGelId = null;
		}
		else if( value < CFGenKbGenFileBuff.EXPANSIONKEYNAMEGELID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalExpansionKeyNameGelId",
				1,
				"value",
				value,
				CFGenKbGenFileBuff.EXPANSIONKEYNAMEGELID_MIN_VALUE );
		}
		else {
			optionalExpansionKeyNameGelId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenFileByXExpKeyNameKey ) {
			CFGenKbGenFileByXExpKeyNameKey rhs = (CFGenKbGenFileByXExpKeyNameKey)obj;
			if( getOptionalExpansionKeyNameTenantId() != null ) {
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					if( ! getOptionalExpansionKeyNameTenantId().equals( rhs.getOptionalExpansionKeyNameTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalExpansionKeyNameGelCacheId() != null ) {
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					if( ! getOptionalExpansionKeyNameGelCacheId().equals( rhs.getOptionalExpansionKeyNameGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalExpansionKeyNameGelId() != null ) {
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
					if( ! getOptionalExpansionKeyNameGelId().equals( rhs.getOptionalExpansionKeyNameGelId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenFileBuff ) {
			CFGenKbGenFileBuff rhs = (CFGenKbGenFileBuff)obj;
			if( getOptionalExpansionKeyNameTenantId() != null ) {
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					if( ! getOptionalExpansionKeyNameTenantId().equals( rhs.getOptionalExpansionKeyNameTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalExpansionKeyNameGelCacheId() != null ) {
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					if( ! getOptionalExpansionKeyNameGelCacheId().equals( rhs.getOptionalExpansionKeyNameGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalExpansionKeyNameGelId() != null ) {
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
					if( ! getOptionalExpansionKeyNameGelId().equals( rhs.getOptionalExpansionKeyNameGelId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
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
		if( getOptionalExpansionKeyNameTenantId() != null ) {
			hashCode = hashCode + getOptionalExpansionKeyNameTenantId().hashCode();
		}
		if( getOptionalExpansionKeyNameGelCacheId() != null ) {
			hashCode = hashCode + getOptionalExpansionKeyNameGelCacheId().hashCode();
		}
		if( getOptionalExpansionKeyNameGelId() != null ) {
			hashCode = hashCode + getOptionalExpansionKeyNameGelId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenFileByXExpKeyNameKey ) {
			CFGenKbGenFileByXExpKeyNameKey rhs = (CFGenKbGenFileByXExpKeyNameKey)obj;
			if( getOptionalExpansionKeyNameTenantId() != null ) {
				Long lhsExpansionKeyNameTenantId = getOptionalExpansionKeyNameTenantId();
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					Long rhsExpansionKeyNameTenantId = rhs.getOptionalExpansionKeyNameTenantId();
					int cmp = lhsExpansionKeyNameTenantId.compareTo( rhsExpansionKeyNameTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpansionKeyNameGelCacheId() != null ) {
				Long lhsExpansionKeyNameGelCacheId = getOptionalExpansionKeyNameGelCacheId();
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					Long rhsExpansionKeyNameGelCacheId = rhs.getOptionalExpansionKeyNameGelCacheId();
					int cmp = lhsExpansionKeyNameGelCacheId.compareTo( rhsExpansionKeyNameGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpansionKeyNameGelId() != null ) {
				Long lhsExpansionKeyNameGelId = getOptionalExpansionKeyNameGelId();
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
					Long rhsExpansionKeyNameGelId = rhs.getOptionalExpansionKeyNameGelId();
					int cmp = lhsExpansionKeyNameGelId.compareTo( rhsExpansionKeyNameGelId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenFileBuff ) {
			CFGenKbGenFileBuff rhs = (CFGenKbGenFileBuff)obj;
			if( getOptionalExpansionKeyNameTenantId() != null ) {
				Long lhsExpansionKeyNameTenantId = getOptionalExpansionKeyNameTenantId();
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					Long rhsExpansionKeyNameTenantId = rhs.getOptionalExpansionKeyNameTenantId();
					int cmp = lhsExpansionKeyNameTenantId.compareTo( rhsExpansionKeyNameTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpansionKeyNameGelCacheId() != null ) {
				Long lhsExpansionKeyNameGelCacheId = getOptionalExpansionKeyNameGelCacheId();
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					Long rhsExpansionKeyNameGelCacheId = rhs.getOptionalExpansionKeyNameGelCacheId();
					int cmp = lhsExpansionKeyNameGelCacheId.compareTo( rhsExpansionKeyNameGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpansionKeyNameGelId() != null ) {
				Long lhsExpansionKeyNameGelId = getOptionalExpansionKeyNameGelId();
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
					Long rhsExpansionKeyNameGelId = rhs.getOptionalExpansionKeyNameGelId();
					int cmp = lhsExpansionKeyNameGelId.compareTo( rhsExpansionKeyNameGelId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpansionKeyNameGelId() != null ) {
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
		String ret = "<CFGenKbGenFileByXExpKeyName"
			+ " OptionalExpansionKeyNameTenantId=" + ( ( getOptionalExpansionKeyNameTenantId() == null ) ? "null" : "\"" + getOptionalExpansionKeyNameTenantId().toString() + "\"" )
			+ " OptionalExpansionKeyNameGelCacheId=" + ( ( getOptionalExpansionKeyNameGelCacheId() == null ) ? "null" : "\"" + getOptionalExpansionKeyNameGelCacheId().toString() + "\"" )
			+ " OptionalExpansionKeyNameGelId=" + ( ( getOptionalExpansionKeyNameGelId() == null ) ? "null" : "\"" + getOptionalExpansionKeyNameGelId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
