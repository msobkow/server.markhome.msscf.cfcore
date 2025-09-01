// Description: Java 11 implementation of a GelIterator buffer object.

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

public class CFGenKbGelIteratorBuff
	extends CFGenKbGelInstructionBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a917";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long GELCACHEID_INIT_VALUE = 0L;
	public static final long GELINSTID_INIT_VALUE = 0L;
	public static final String ITERATORNAME_INIT_VALUE = new String( "" );
	public static final String EXPANDBEFORE_INIT_VALUE = new String( "" );
	public static final String EXPANDFIRST_INIT_VALUE = new String( "" );
	public static final String EXPANDEACH_INIT_VALUE = new String( "" );
	public static final String EXPANDLAST_INIT_VALUE = new String( "" );
	public static final String EXPANDLONE_INIT_VALUE = new String( "" );
	public static final String EXPANDEMPTY_INIT_VALUE = new String( "" );
	public static final String EXPANDAFTER_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long GELCACHEID_MIN_VALUE = 0L;
	public static final long GELINSTID_MIN_VALUE = 0L;
	protected String requiredIteratorName;
	protected String optionalExpandBefore;
	protected String optionalExpandFirst;
	protected String requiredExpandEach;
	protected String optionalExpandLast;
	protected String optionalExpandLone;
	protected String optionalExpandEmpty;
	protected String optionalExpandAfter;
	public CFGenKbGelIteratorBuff() {
		super();
		requiredIteratorName = new String( CFGenKbGelIteratorBuff.ITERATORNAME_INIT_VALUE );
		optionalExpandBefore = null;
		optionalExpandFirst = null;
		requiredExpandEach = new String( CFGenKbGelIteratorBuff.EXPANDEACH_INIT_VALUE );
		optionalExpandLast = null;
		optionalExpandLone = null;
		optionalExpandEmpty = null;
		optionalExpandAfter = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getRequiredIteratorName() {
		return( requiredIteratorName );
	}

	public void setRequiredIteratorName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredIteratorName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredIteratorName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredIteratorName = value;
	}

	public String getOptionalExpandBefore() {
		return( optionalExpandBefore );
	}

	public void setOptionalExpandBefore( String value ) {
		if( value == null ) {
			optionalExpandBefore = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandBefore",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandBefore = value;
		}
	}

	public String getOptionalExpandFirst() {
		return( optionalExpandFirst );
	}

	public void setOptionalExpandFirst( String value ) {
		if( value == null ) {
			optionalExpandFirst = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandFirst",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandFirst = value;
		}
	}

	public String getRequiredExpandEach() {
		return( requiredExpandEach );
	}

	public void setRequiredExpandEach( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredExpandEach",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredExpandEach",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredExpandEach = value;
	}

	public String getOptionalExpandLast() {
		return( optionalExpandLast );
	}

	public void setOptionalExpandLast( String value ) {
		if( value == null ) {
			optionalExpandLast = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandLast",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandLast = value;
		}
	}

	public String getOptionalExpandLone() {
		return( optionalExpandLone );
	}

	public void setOptionalExpandLone( String value ) {
		if( value == null ) {
			optionalExpandLone = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandLone",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandLone = value;
		}
	}

	public String getOptionalExpandEmpty() {
		return( optionalExpandEmpty );
	}

	public void setOptionalExpandEmpty( String value ) {
		if( value == null ) {
			optionalExpandEmpty = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandEmpty",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandEmpty = value;
		}
	}

	public String getOptionalExpandAfter() {
		return( optionalExpandAfter );
	}

	public void setOptionalExpandAfter( String value ) {
		if( value == null ) {
			optionalExpandAfter = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalExpandAfter",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalExpandAfter = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFGenKbGelIteratorBuff ) {
			CFGenKbGelIteratorBuff rhs = (CFGenKbGelIteratorBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			if( ! getRequiredIteratorName().equals( rhs.getRequiredIteratorName() ) ) {
				return( false );
			}
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					if( ! getOptionalExpandBefore().equals( rhs.getOptionalExpandBefore() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
					return( false );
				}
			}
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					if( ! getOptionalExpandFirst().equals( rhs.getOptionalExpandFirst() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
					return( false );
				}
			}
			if( ! getRequiredExpandEach().equals( rhs.getRequiredExpandEach() ) ) {
				return( false );
			}
			if( getOptionalExpandLast() != null ) {
				if( rhs.getOptionalExpandLast() != null ) {
					if( ! getOptionalExpandLast().equals( rhs.getOptionalExpandLast() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandLast() != null ) {
					return( false );
				}
			}
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					if( ! getOptionalExpandLone().equals( rhs.getOptionalExpandLone() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
					return( false );
				}
			}
			if( getOptionalExpandEmpty() != null ) {
				if( rhs.getOptionalExpandEmpty() != null ) {
					if( ! getOptionalExpandEmpty().equals( rhs.getOptionalExpandEmpty() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandEmpty() != null ) {
					return( false );
				}
			}
			if( getOptionalExpandAfter() != null ) {
				if( rhs.getOptionalExpandAfter() != null ) {
					if( ! getOptionalExpandAfter().equals( rhs.getOptionalExpandAfter() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandAfter() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelInstructionPKey ) {
			CFGenKbGelInstructionPKey rhs = (CFGenKbGelInstructionPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredGelCacheId() != rhs.getRequiredGelCacheId() ) {
				return( false );
			}
			if( getRequiredGelInstId() != rhs.getRequiredGelInstId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorByBeforeIdxKey ) {
			CFGenKbGelIteratorByBeforeIdxKey rhs = (CFGenKbGelIteratorByBeforeIdxKey)obj;
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					if( ! getOptionalExpandBefore().equals( rhs.getOptionalExpandBefore() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorByFirstIdxKey ) {
			CFGenKbGelIteratorByFirstIdxKey rhs = (CFGenKbGelIteratorByFirstIdxKey)obj;
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					if( ! getOptionalExpandFirst().equals( rhs.getOptionalExpandFirst() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorByEachIdxKey ) {
			CFGenKbGelIteratorByEachIdxKey rhs = (CFGenKbGelIteratorByEachIdxKey)obj;
			if( ! getRequiredExpandEach().equals( rhs.getRequiredExpandEach() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorByLastIdxKey ) {
			CFGenKbGelIteratorByLastIdxKey rhs = (CFGenKbGelIteratorByLastIdxKey)obj;
			if( getOptionalExpandLast() != null ) {
				if( rhs.getOptionalExpandLast() != null ) {
					if( ! getOptionalExpandLast().equals( rhs.getOptionalExpandLast() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandLast() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorByLoneIdxKey ) {
			CFGenKbGelIteratorByLoneIdxKey rhs = (CFGenKbGelIteratorByLoneIdxKey)obj;
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					if( ! getOptionalExpandLone().equals( rhs.getOptionalExpandLone() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFGenKbGelIteratorByEmptyIdxKey ) {
			CFGenKbGelIteratorByEmptyIdxKey rhs = (CFGenKbGelIteratorByEmptyIdxKey)obj;
			if( getOptionalExpandEmpty() != null ) {
				if( rhs.getOptionalExpandEmpty() != null ) {
					if( ! getOptionalExpandEmpty().equals( rhs.getOptionalExpandEmpty() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalExpandEmpty() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		if( getRequiredIteratorName() != null ) {
			hashCode = hashCode + getRequiredIteratorName().hashCode();
		}
		if( getOptionalExpandBefore() != null ) {
			hashCode = hashCode + getOptionalExpandBefore().hashCode();
		}
		if( getOptionalExpandFirst() != null ) {
			hashCode = hashCode + getOptionalExpandFirst().hashCode();
		}
		if( getRequiredExpandEach() != null ) {
			hashCode = hashCode + getRequiredExpandEach().hashCode();
		}
		if( getOptionalExpandLast() != null ) {
			hashCode = hashCode + getOptionalExpandLast().hashCode();
		}
		if( getOptionalExpandLone() != null ) {
			hashCode = hashCode + getOptionalExpandLone().hashCode();
		}
		if( getOptionalExpandEmpty() != null ) {
			hashCode = hashCode + getOptionalExpandEmpty().hashCode();
		}
		if( getOptionalExpandAfter() != null ) {
			hashCode = hashCode + getOptionalExpandAfter().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFGenKbGelIteratorBuff ) {
			CFGenKbGelIteratorBuff rhs = (CFGenKbGelIteratorBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			{
				int cmp = getRequiredIteratorName().compareTo( rhs.getRequiredIteratorName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					int cmp = getOptionalExpandBefore().compareTo( rhs.getOptionalExpandBefore() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					int cmp = getOptionalExpandFirst().compareTo( rhs.getOptionalExpandFirst() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
					return( -1 );
				}
			}
			{
				int cmp = getRequiredExpandEach().compareTo( rhs.getRequiredExpandEach() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			if( getOptionalExpandLast() != null ) {
				if( rhs.getOptionalExpandLast() != null ) {
					int cmp = getOptionalExpandLast().compareTo( rhs.getOptionalExpandLast() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandLast() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					int cmp = getOptionalExpandLone().compareTo( rhs.getOptionalExpandLone() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpandEmpty() != null ) {
				if( rhs.getOptionalExpandEmpty() != null ) {
					int cmp = getOptionalExpandEmpty().compareTo( rhs.getOptionalExpandEmpty() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandEmpty() != null ) {
					return( -1 );
				}
			}
			if( getOptionalExpandAfter() != null ) {
				if( rhs.getOptionalExpandAfter() != null ) {
					int cmp = getOptionalExpandAfter().compareTo( rhs.getOptionalExpandAfter() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandAfter() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelInstructionPKey ) {
			CFGenKbGelInstructionPKey rhs = (CFGenKbGelInstructionPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredGelCacheId() < rhs.getRequiredGelCacheId() ) {
				return( -1 );
			}
			else if( getRequiredGelCacheId() > rhs.getRequiredGelCacheId() ) {
				return( 1 );
			}
			if( getRequiredGelInstId() < rhs.getRequiredGelInstId() ) {
				return( -1 );
			}
			else if( getRequiredGelInstId() > rhs.getRequiredGelInstId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorByBeforeIdxKey ) {
			CFGenKbGelIteratorByBeforeIdxKey rhs = (CFGenKbGelIteratorByBeforeIdxKey)obj;

			if( getOptionalExpandBefore() != null ) {
				if( rhs.getOptionalExpandBefore() != null ) {
					int cmp = getOptionalExpandBefore().compareTo( rhs.getOptionalExpandBefore() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandBefore() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorByFirstIdxKey ) {
			CFGenKbGelIteratorByFirstIdxKey rhs = (CFGenKbGelIteratorByFirstIdxKey)obj;

			if( getOptionalExpandFirst() != null ) {
				if( rhs.getOptionalExpandFirst() != null ) {
					int cmp = getOptionalExpandFirst().compareTo( rhs.getOptionalExpandFirst() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandFirst() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorByEachIdxKey ) {
			CFGenKbGelIteratorByEachIdxKey rhs = (CFGenKbGelIteratorByEachIdxKey)obj;

			{
				int cmp = getRequiredExpandEach().compareTo( rhs.getRequiredExpandEach() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorByLastIdxKey ) {
			CFGenKbGelIteratorByLastIdxKey rhs = (CFGenKbGelIteratorByLastIdxKey)obj;

			if( getOptionalExpandLast() != null ) {
				if( rhs.getOptionalExpandLast() != null ) {
					int cmp = getOptionalExpandLast().compareTo( rhs.getOptionalExpandLast() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandLast() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorByLoneIdxKey ) {
			CFGenKbGelIteratorByLoneIdxKey rhs = (CFGenKbGelIteratorByLoneIdxKey)obj;

			if( getOptionalExpandLone() != null ) {
				if( rhs.getOptionalExpandLone() != null ) {
					int cmp = getOptionalExpandLone().compareTo( rhs.getOptionalExpandLone() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandLone() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else if( obj instanceof CFGenKbGelIteratorByEmptyIdxKey ) {
			CFGenKbGelIteratorByEmptyIdxKey rhs = (CFGenKbGelIteratorByEmptyIdxKey)obj;

			if( getOptionalExpandEmpty() != null ) {
				if( rhs.getOptionalExpandEmpty() != null ) {
					int cmp = getOptionalExpandEmpty().compareTo( rhs.getOptionalExpandEmpty() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalExpandEmpty() != null ) {
					return( -1 );
				}
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFGenKbGelInstructionBuff src ) {
		if( src instanceof CFGenKbGelIteratorBuff ) {
			setGelIteratorBuff( (CFGenKbGelIteratorBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFGenKbGelIteratorBuff" );
		}
	}

	public void setGelIteratorBuff( CFGenKbGelIteratorBuff src ) {
		super.setGelInstructionBuff( src );
		setRequiredIteratorName( src.getRequiredIteratorName() );
		setOptionalExpandBefore( src.getOptionalExpandBefore() );
		setOptionalExpandFirst( src.getOptionalExpandFirst() );
		setRequiredExpandEach( src.getRequiredExpandEach() );
		setOptionalExpandLast( src.getOptionalExpandLast() );
		setOptionalExpandLone( src.getOptionalExpandLone() );
		setOptionalExpandEmpty( src.getOptionalExpandEmpty() );
		setOptionalExpandAfter( src.getOptionalExpandAfter() );
	}
}
