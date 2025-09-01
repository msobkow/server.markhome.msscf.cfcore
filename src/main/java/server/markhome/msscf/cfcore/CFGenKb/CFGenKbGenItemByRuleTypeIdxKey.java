// Description: Java 11 implementation of a GenItem by RuleTypeIdx index key object.

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

public class CFGenKbGenItemByRuleTypeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected short requiredRuleTypeId;
	public CFGenKbGenItemByRuleTypeIdxKey() {
		requiredRuleTypeId = CFGenKbGenItemBuff.RULETYPEID_INIT_VALUE;
	}

	public short getRequiredRuleTypeId() {
		return( requiredRuleTypeId );
	}

	public void setRequiredRuleTypeId( short value ) {
		if( value < CFGenKbGenItemBuff.RULETYPEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredRuleTypeId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.RULETYPEID_MIN_VALUE );
		}
		if( value > CFGenKbGenItemBuff.RULETYPEID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredRuleTypeId",
				1,
				"value",
				value,
				CFGenKbGenItemBuff.RULETYPEID_MAX_VALUE );
		}
		requiredRuleTypeId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGenItemByRuleTypeIdxKey ) {
			CFGenKbGenItemByRuleTypeIdxKey rhs = (CFGenKbGenItemByRuleTypeIdxKey)obj;
			if( getRequiredRuleTypeId() != rhs.getRequiredRuleTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredRuleTypeId() != rhs.getRequiredRuleTypeId() ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredRuleTypeId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFGenKbGenItemByRuleTypeIdxKey ) {
			CFGenKbGenItemByRuleTypeIdxKey rhs = (CFGenKbGenItemByRuleTypeIdxKey)obj;
			if( getRequiredRuleTypeId() < rhs.getRequiredRuleTypeId() ) {
				return( -1 );
			}
			else if( getRequiredRuleTypeId() > rhs.getRequiredRuleTypeId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGenItemBuff ) {
			CFGenKbGenItemBuff rhs = (CFGenKbGenItemBuff)obj;
			if( getRequiredRuleTypeId() < rhs.getRequiredRuleTypeId() ) {
				return( -1 );
			}
			else if( getRequiredRuleTypeId() > rhs.getRequiredRuleTypeId() ) {
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
		String ret = "<CFGenKbGenItemByRuleTypeIdx"
			+ " RequiredRuleTypeId=" + "\"" + Short.toString( getRequiredRuleTypeId() ) + "\""
			+ "/>";
		return( ret );
	}
}
