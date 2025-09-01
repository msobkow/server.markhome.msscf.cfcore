// Description: Java 11 implementation of a GenItem by ProbeIdx index key object.

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

public class CFGenKbGenItemByProbeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected Long optionalProbeTenantId;
	protected Long optionalProbeCartridgeId;
	protected Long optionalProbeGenItemId;
	public CFGenKbGenItemByProbeIdxKey() {
		optionalProbeTenantId = null;
		optionalProbeCartridgeId = null;
		optionalProbeGenItemId = null;
	}

	public Long getOptionalProbeTenantId() {
		return( optionalProbeTenantId );
	}

	public void setOptionalProbeTenantId( Long value ) {
		if( value == null ) {
			optionalProbeTenantId = null;
		}
		else if( value < CFGenKbGenItemBuff.PROBETENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalProbeTenantId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.PROBETENANTID_MIN_VALUE );
		}
		else {
			optionalProbeTenantId = value;
		}
	}

	public Long getOptionalProbeCartridgeId() {
		return( optionalProbeCartridgeId );
	}

	public void setOptionalProbeCartridgeId( Long value ) {
		if( value == null ) {
			optionalProbeCartridgeId = null;
		}
		else if( value < CFGenKbGenItemBuff.PROBECARTRIDGEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalProbeCartridgeId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.PROBECARTRIDGEID_MIN_VALUE );
		}
		else {
			optionalProbeCartridgeId = value;
		}
	}

	public Long getOptionalProbeGenItemId() {
		return( optionalProbeGenItemId );
	}

	public void setOptionalProbeGenItemId( Long value ) {
		if( value == null ) {
			optionalProbeGenItemId = null;
		}
		else if( value < CFGenKbGenItemBuff.PROBEGENITEMID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setOptionalProbeGenItemId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.PROBEGENITEMID_MIN_VALUE );
		}
		else if( value > CFGenKbGenItemBuff.PROBEGENITEMID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalProbeGenItemId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.PROBEGENITEMID_MAX_VALUE );
		}
		else {
			optionalProbeGenItemId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenItemByProbeIdxKey ) {
			CFGenKbGenItemByProbeIdxKey rhs = (CFGenKbGenItemByProbeIdxKey)obj;
			if( getOptionalProbeTenantId() != null ) {
				if( rhs.getOptionalProbeTenantId() != null ) {
					if( ! getOptionalProbeTenantId().equals( rhs.getOptionalProbeTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					if( ! getOptionalProbeCartridgeId().equals( rhs.getOptionalProbeCartridgeId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					if( ! getOptionalProbeGenItemId().equals( rhs.getOptionalProbeGenItemId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getOptionalProbeTenantId() != null ) {
				if( rhs.getOptionalProbeTenantId() != null ) {
					if( ! getOptionalProbeTenantId().equals( rhs.getOptionalProbeTenantId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					if( ! getOptionalProbeCartridgeId().equals( rhs.getOptionalProbeCartridgeId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( false );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					if( ! getOptionalProbeGenItemId().equals( rhs.getOptionalProbeGenItemId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
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
		if( getOptionalProbeTenantId() != null ) {
			hashCode = hashCode + getOptionalProbeTenantId().hashCode();
		}
		if( getOptionalProbeCartridgeId() != null ) {
			hashCode = hashCode + getOptionalProbeCartridgeId().hashCode();
		}
		if( getOptionalProbeGenItemId() != null ) {
			hashCode = hashCode + getOptionalProbeGenItemId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenItemByProbeIdxKey ) {
			CFGenKbGenItemByProbeIdxKey rhs = (CFGenKbGenItemByProbeIdxKey)obj;
			if( getOptionalProbeTenantId() != null ) {
				Long lhsProbeTenantId = getOptionalProbeTenantId();
				if( rhs.getOptionalProbeTenantId() != null ) {
					Long rhsProbeTenantId = rhs.getOptionalProbeTenantId();
					int cmp = lhsProbeTenantId.compareTo( rhsProbeTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				Long lhsProbeCartridgeId = getOptionalProbeCartridgeId();
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					Long rhsProbeCartridgeId = rhs.getOptionalProbeCartridgeId();
					int cmp = lhsProbeCartridgeId.compareTo( rhsProbeCartridgeId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				Long lhsProbeGenItemId = getOptionalProbeGenItemId();
				if( rhs.getOptionalProbeGenItemId() != null ) {
					Long rhsProbeGenItemId = rhs.getOptionalProbeGenItemId();
					int cmp = lhsProbeGenItemId.compareTo( rhsProbeGenItemId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getOptionalProbeTenantId() != null ) {
				Long lhsProbeTenantId = getOptionalProbeTenantId();
				if( rhs.getOptionalProbeTenantId() != null ) {
					Long rhsProbeTenantId = rhs.getOptionalProbeTenantId();
					int cmp = lhsProbeTenantId.compareTo( rhsProbeTenantId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeTenantId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeCartridgeId() != null ) {
				Long lhsProbeCartridgeId = getOptionalProbeCartridgeId();
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					Long rhsProbeCartridgeId = rhs.getOptionalProbeCartridgeId();
					int cmp = lhsProbeCartridgeId.compareTo( rhsProbeCartridgeId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeCartridgeId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalProbeGenItemId() != null ) {
				Long lhsProbeGenItemId = getOptionalProbeGenItemId();
				if( rhs.getOptionalProbeGenItemId() != null ) {
					Long rhsProbeGenItemId = rhs.getOptionalProbeGenItemId();
					int cmp = lhsProbeGenItemId.compareTo( rhsProbeGenItemId );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalProbeGenItemId() != null ) {
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
		String ret = "<CFGenKbGenItemByProbeIdx"
			+ " OptionalProbeTenantId=" + ( ( getOptionalProbeTenantId() == null ) ? "null" : "\"" + getOptionalProbeTenantId().toString() + "\"" )
			+ " OptionalProbeCartridgeId=" + ( ( getOptionalProbeCartridgeId() == null ) ? "null" : "\"" + getOptionalProbeCartridgeId().toString() + "\"" )
			+ " OptionalProbeGenItemId=" + ( ( getOptionalProbeGenItemId() == null ) ? "null" : "\"" + getOptionalProbeGenItemId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
