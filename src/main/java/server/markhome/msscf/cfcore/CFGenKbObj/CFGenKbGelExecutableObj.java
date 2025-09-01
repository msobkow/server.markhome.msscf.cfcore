// Description: Java 11 base object instance implementation for CFGenKb GelExecutable.

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

public class CFGenKbGelExecutableObj
	extends CFGenKbGelSequenceObj
	implements ICFGenKbGelExecutableObj
{
	public final static String CLASS_CODE = "a92e";

	public CFGenKbGelExecutableObj() {
		super();
	}

	public CFGenKbGelExecutableObj( ICFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelExecutable" );
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
		ICFGenKbGelExecutableObj retobj = ((ICFGenKbSchemaObj)schema).getGelExecutableTableObj().realiseGelExecutable(
			(ICFGenKbGelExecutableObj)this );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGelExecutableTableObj().reallyDeepDisposeGelExecutable( (ICFGenKbGelExecutableObj)this );
	}

	public ICFGenKbGelInstructionObj read() {
		ICFGenKbGelExecutableObj retobj = ((ICFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelInstructionObj read( boolean forceRead ) {
		ICFGenKbGelExecutableObj retobj = ((ICFGenKbSchemaObj)schema).getGelExecutableTableObj().readGelExecutableByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelExecutableTableObj getGelExecutableTable() {
		return( ((ICFGenKbSchemaObj)schema).getGelExecutableTableObj() );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelExecutable().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelExecutable().readDerivedByPIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGelExecutableBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGelExecutableBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public CFGenKbGelExecutableBuff getGelExecutableBuff() {
		return( (CFGenKbGelExecutableBuff)getBuff() );
	}

	public ICFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGelExecutableObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGelExecutableObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGelExecutableTableObj().lockGelExecutable( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGelExecutableTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGelInstructionEditObj)edit );
	}

	public ICFGenKbGelExecutableEditObj getEditAsGelExecutable() {
		return( (ICFGenKbGelExecutableEditObj)edit );
	}

	public long getRequiredGenItemId() {
		return( getGelExecutableBuff().getRequiredGenItemId() );
	}

	public void addCalledInstruction( ICFGenKbGelCacheObj gelCache, ICFGenKbGelInstructionObj calledInstruction ) {
		ICFGenKbGelCallObj newCallObj = schema.getGelCallTableObj().newInstance();
		ICFGenKbGelCallEditObj editNewCall = (ICFGenKbGelCallEditObj)( newCallObj.beginEdit() );
		editNewCall.setRequiredOwnerTenant( getRequiredOwnerTenant() );
		editNewCall.setRequiredContainerGelCache( getRequiredContainerGelCache() );
		editNewCall.setOptionalParentSeqInst( this );
		editNewCall.setOptionalLookupCallInst( calledInstruction );
		editNewCall.setOptionalLookupNextInst( null );
		ICFGenKbGelCallObj lastObj = getOptionalLookupLastInst();
		editNewCall.setOptionalLookupPrevInst( lastObj );
		newCallObj = (ICFGenKbGelCallObj)( editNewCall.create() );
		editNewCall = null;
		ICFGenKbGelSequenceEditObj editMe = (ICFGenKbGelSequenceEditObj)beginEdit();
		if( lastObj != null ) {
			ICFGenKbGelCallEditObj editLast = (ICFGenKbGelCallEditObj)( lastObj.beginEdit() );
			editLast.setOptionalLookupNextInst( newCallObj );
			editLast.update();
			editLast = null;
		}
		else {
			editMe.setOptionalLookupFirstInst( newCallObj );
		}
		editMe.setOptionalLookupLastInst( newCallObj );
		editMe.update();
		editMe = null;
	}

	public String expand( MssCFGenContext genContext ) {
		final String S_ProcName = "expand";
		final String S_GenContext = "genContext";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(), S_ProcName, 1, S_GenContext );
		}

		StringBuffer expansion = new StringBuffer();
		String subExpansion;

		// Preload the instructions to avoid a read storm
		genContext.getGenEngine().getGelCallTableObj().readGelCallBySeqIdx( getRequiredTenantId(), getRequiredGelCacheId(), getRequiredGelInstId() );

		ICFGenKbGelInstructionObj nextCalled;
		ICFGenKbGelCallObj nextCall = getOptionalLookupFirstInst();
		while( nextCall != null ) {
			nextCalled = nextCall.getOptionalLookupCallInst();
			if( nextCalled != null ) {
				subExpansion = nextCalled.expand( genContext );
				if( subExpansion == null ) {
					subExpansion = "$" + nextCalled.getRequiredSourceText() + "$";
				}
				expansion.append( subExpansion );
			}
			nextCall = nextCall.getOptionalLookupNextInst();
		}

		return( expansion.toString() );
	}
}
