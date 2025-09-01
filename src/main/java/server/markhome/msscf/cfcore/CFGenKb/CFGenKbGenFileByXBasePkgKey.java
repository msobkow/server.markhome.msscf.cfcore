// Description: Java 11 implementation of a GenFile by XBasePkg index key object.

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

public class CFGenKbGenFileByXBasePkgKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalBasePackageTenantId;
	protected Long optionalBasePackageGelCacheId;
	protected Long optionalBasePackageGelId;
	public CFGenKbGenFileByXBasePkgKey() {
		optionalBasePackageTenantId = null;
		optionalBasePackageGelCacheId = null;
		optionalBasePackageGelId = null;
	}

	public Long getOptionalBasePackageTenantId() {
		return( optionalBasePackageTenantId );
	}

	public void setOptionalBasePackageTenantId( Long value ) {
		if( value == null ) {
			optionalBasePackageTenantId = null;
		}
		else if( value < CFGenKbGenFileBuff.BASEPACKAGETENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalBasePackageTenantId",
				1,
				"value",
				value,
				CFGenKbGenFileBuff.BASEPACKAGETENANTID_MIN_VALUE );
		}
		else {
			optionalBasePackageTenantId = value;
		}
	}

	public Long getOptionalBasePackageGelCacheId() {
		return( optionalBasePackageGelCacheId );
	}

	public void setOptionalBasePackageGelCacheId( Long value ) {
		if( value == null ) {
			optionalBasePackageGelCacheId = null;
		}
		else if( value < CFGenKbGenFileBuff.BASEPACKAGEGELCACHEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalBasePackageGelCacheId",
				1,
				"value",
				value,
				CFGenKbGenFileBuff.BASEPACKAGEGELCACHEID_MIN_VALUE );
		}
		else {
			optionalBasePackageGelCacheId = value;
		}
	}

	public Long getOptionalBasePackageGelId() {
		return( optionalBasePackageGelId );
	}

	public void setOptionalBasePackageGelId( Long value ) {
		if( value == null ) {
			optionalBasePackageGelId = null;
		}
		else if( value < CFGenKbGenFileBuff.BASEPACKAGEGELID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalBasePackageGelId",
				1,
				"value",
				value,
				CFGenKbGenFileBuff.BASEPACKAGEGELID_MIN_VALUE );
		}
		else {
			optionalBasePackageGelId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenFileByXBasePkgKey ) {
			CFGenKbGenFileByXBasePkgKey rhs = (CFGenKbGenFileByXBasePkgKey)obj;
			if( getOptionalBasePackageTenantId() != null ) {
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					if( ! getOptionalBasePackageTenantId().equals( rhs.getOptionalBasePackageTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalBasePackageGelCacheId() != null ) {
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					if( ! getOptionalBasePackageGelCacheId().equals( rhs.getOptionalBasePackageGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalBasePackageGelId() != null ) {
				if( rhs.getOptionalBasePackageGelId() != null ) {
					if( ! getOptionalBasePackageGelId().equals( rhs.getOptionalBasePackageGelId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenFileBuff ) {
			CFGenKbGenFileBuff rhs = (CFGenKbGenFileBuff)obj;
			if( getOptionalBasePackageTenantId() != null ) {
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					if( ! getOptionalBasePackageTenantId().equals( rhs.getOptionalBasePackageTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalBasePackageGelCacheId() != null ) {
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					if( ! getOptionalBasePackageGelCacheId().equals( rhs.getOptionalBasePackageGelCacheId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					return( false );
				}
			}
			if( getOptionalBasePackageGelId() != null ) {
				if( rhs.getOptionalBasePackageGelId() != null ) {
					if( ! getOptionalBasePackageGelId().equals( rhs.getOptionalBasePackageGelId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelId() != null ) {
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
		if( getOptionalBasePackageTenantId() != null ) {
			hashCode = hashCode + getOptionalBasePackageTenantId().hashCode();
		}
		if( getOptionalBasePackageGelCacheId() != null ) {
			hashCode = hashCode + getOptionalBasePackageGelCacheId().hashCode();
		}
		if( getOptionalBasePackageGelId() != null ) {
			hashCode = hashCode + getOptionalBasePackageGelId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenFileByXBasePkgKey ) {
			CFGenKbGenFileByXBasePkgKey rhs = (CFGenKbGenFileByXBasePkgKey)obj;
			if( getOptionalBasePackageTenantId() != null ) {
				Long lhsBasePackageTenantId = getOptionalBasePackageTenantId();
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					Long rhsBasePackageTenantId = rhs.getOptionalBasePackageTenantId();
					int cmp = lhsBasePackageTenantId.compareTo( rhsBasePackageTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalBasePackageGelCacheId() != null ) {
				Long lhsBasePackageGelCacheId = getOptionalBasePackageGelCacheId();
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					Long rhsBasePackageGelCacheId = rhs.getOptionalBasePackageGelCacheId();
					int cmp = lhsBasePackageGelCacheId.compareTo( rhsBasePackageGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalBasePackageGelId() != null ) {
				Long lhsBasePackageGelId = getOptionalBasePackageGelId();
				if( rhs.getOptionalBasePackageGelId() != null ) {
					Long rhsBasePackageGelId = rhs.getOptionalBasePackageGelId();
					int cmp = lhsBasePackageGelId.compareTo( rhsBasePackageGelId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenFileBuff ) {
			CFGenKbGenFileBuff rhs = (CFGenKbGenFileBuff)obj;
			if( getOptionalBasePackageTenantId() != null ) {
				Long lhsBasePackageTenantId = getOptionalBasePackageTenantId();
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					Long rhsBasePackageTenantId = rhs.getOptionalBasePackageTenantId();
					int cmp = lhsBasePackageTenantId.compareTo( rhsBasePackageTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBasePackageTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalBasePackageGelCacheId() != null ) {
				Long lhsBasePackageGelCacheId = getOptionalBasePackageGelCacheId();
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					Long rhsBasePackageGelCacheId = rhs.getOptionalBasePackageGelCacheId();
					int cmp = lhsBasePackageGelCacheId.compareTo( rhsBasePackageGelCacheId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelCacheId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalBasePackageGelId() != null ) {
				Long lhsBasePackageGelId = getOptionalBasePackageGelId();
				if( rhs.getOptionalBasePackageGelId() != null ) {
					Long rhsBasePackageGelId = rhs.getOptionalBasePackageGelId();
					int cmp = lhsBasePackageGelId.compareTo( rhsBasePackageGelId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalBasePackageGelId() != null ) {
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
		String ret = "<CFGenKbGenFileByXBasePkg"
			+ " OptionalBasePackageTenantId=" + ( ( getOptionalBasePackageTenantId() == null ) ? "null" : "\"" + getOptionalBasePackageTenantId().toString() + "\"" )
			+ " OptionalBasePackageGelCacheId=" + ( ( getOptionalBasePackageGelCacheId() == null ) ? "null" : "\"" + getOptionalBasePackageGelCacheId().toString() + "\"" )
			+ " OptionalBasePackageGelId=" + ( ( getOptionalBasePackageGelId() == null ) ? "null" : "\"" + getOptionalBasePackageGelId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
