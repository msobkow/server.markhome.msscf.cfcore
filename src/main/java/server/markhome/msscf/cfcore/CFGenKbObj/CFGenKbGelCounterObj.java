// Description: Java 11 base object instance implementation for CFGenKb GelCounter.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;
import com.github.msobkow.cfcore.MssCF.MssCFEngine;
import com.github.msobkow.cfcore.MssCF.MssCFGenContext;

public class CFGenKbGelCounterObj
	extends CFGenKbGelInstructionObj
	implements ICFGenKbGelCounterObj
{
	public final static String CLASS_CODE = "a92d";

	public CFGenKbGelCounterObj() {
		super();
	}

	public CFGenKbGelCounterObj( ICFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelCounter" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelInstId();
		objName = Long.toString( val );
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof ICFGenKbTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFGenKbClusterObj ) {
					break;
				}
				else if( container instanceof ICFGenKbTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFGenKbClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFGenKbTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFGenKbGelInstructionObj realise() {
		ICFGenKbGelCounterObj retobj = ((ICFGenKbSchemaObj)schema).getGelCounterTableObj().realiseGelCounter(
			(ICFGenKbGelCounterObj)this );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGelCounterTableObj().reallyDeepDisposeGelCounter( (ICFGenKbGelCounterObj)this );
	}

	public ICFGenKbGelInstructionObj read() {
		ICFGenKbGelCounterObj retobj = ((ICFGenKbSchemaObj)schema).getGelCounterTableObj().readGelCounterByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelInstructionObj read( boolean forceRead ) {
		ICFGenKbGelCounterObj retobj = ((ICFGenKbSchemaObj)schema).getGelCounterTableObj().readGelCounterByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelCounterTableObj getGelCounterTable() {
		return( ((ICFGenKbSchemaObj)schema).getGelCounterTableObj() );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCounter().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCounter().readDerivedByPIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId(),
						getPKey().getRequiredGelInstId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGelCounterBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGelCounterBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
	}

	public CFGenKbGelCounterBuff getGelCounterBuff() {
		return( (CFGenKbGelCounterBuff)getBuff() );
	}

	public ICFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGelCounterObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGelCounterObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGelCounterTableObj().lockGelCounter( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGelCounterTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGelInstructionEditObj)edit );
	}

	public ICFGenKbGelCounterEditObj getEditAsGelCounter() {
		return( (ICFGenKbGelCounterEditObj)edit );
	}

	public String getRequiredCounterName() {
		return( getGelCounterBuff().getRequiredCounterName() );
	}

	public String expand( MssCFGenContext genContext ) {
		throw new RuntimeException( "CFGenKbGelCounterObj.expand() Implemention must be overriden by counter specialization");
	}
}
