// Description: Java 11 base object instance implementation for CFGenKb GelReference.

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
import com.github.msobkow.cfcore.MssCF.*;

public class CFGenKbGelReferenceObj
	extends CFGenKbGelInstructionObj
	implements ICFGenKbGelReferenceObj
{
	public final static String CLASS_CODE = "a91b";
	protected ICFGenKbGelInstructionObj optionalLookupRemainder;

	public CFGenKbGelReferenceObj() {
		super();
		optionalLookupRemainder = null;
	}

	public CFGenKbGelReferenceObj( ICFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelReference" );
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
		ICFGenKbGelReferenceObj retobj = ((ICFGenKbSchemaObj)schema).getGelReferenceTableObj().realiseGelReference(
			(ICFGenKbGelReferenceObj)this );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGelReferenceTableObj().reallyDeepDisposeGelReference( (ICFGenKbGelReferenceObj)this );
	}

	public ICFGenKbGelInstructionObj read() {
		ICFGenKbGelReferenceObj retobj = ((ICFGenKbSchemaObj)schema).getGelReferenceTableObj().readGelReferenceByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelInstructionObj read( boolean forceRead ) {
		ICFGenKbGelReferenceObj retobj = ((ICFGenKbSchemaObj)schema).getGelReferenceTableObj().readGelReferenceByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelReferenceTableObj getGelReferenceTable() {
		return( ((ICFGenKbSchemaObj)schema).getGelReferenceTableObj() );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelReference().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelReference().readDerivedByPIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGelReferenceBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGelReferenceBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalLookupRemainder = null;
	}

	public CFGenKbGelReferenceBuff getGelReferenceBuff() {
		return( (CFGenKbGelReferenceBuff)getBuff() );
	}

	public ICFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGelReferenceObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGelReferenceObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGelReferenceTableObj().lockGelReference( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGelReferenceTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGelInstructionEditObj)edit );
	}

	public ICFGenKbGelReferenceEditObj getEditAsGelReference() {
		return( (ICFGenKbGelReferenceEditObj)edit );
	}

	public String getRequiredReferenceName() {
		return( getGelReferenceBuff().getRequiredReferenceName() );
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelReferenceBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelReferenceBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelReferenceBuff().getOptionalRemainderInstId() );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( ( optionalLookupRemainder == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelReferenceBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelReferenceBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupRemainder = ((ICFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelReferenceBuff().getOptionalRemainderTenantId(),
					getGelReferenceBuff().getRequiredRemainderGelCacheId(),
					getGelReferenceBuff().getOptionalRemainderInstId(), forceRead );
			}
		}
		return( optionalLookupRemainder );
	}

	public String expand( MssCFGenContext genContext ) {
		String retval;
		final String S_ProcName = "CFGenKbGelReference.expand() ";
		String referenceName = getRequiredReferenceName();

		String generatingBuild = genContext.getGeneratingBuild();

		ICFGenKbGenItemObj genItem = genContext.getGenEngine().findContextItem(genContext, referenceName );
		if( genItem == null ) {
			genContext.getGenEngine().getLog().message( "Could not resolve reference method \""
				+ referenceName
				+ "\". \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		if( ! ( genItem instanceof MssCFGenReferenceObj ) ) {
			genContext.getGenEngine().getLog().message( "Resolution of reference method \""
				+ referenceName
				+ "\" returned a "
				+ genItem.getClass().getPackage().getName() + "." + genItem.getClass().getSimpleName()
				+ ", not a MssCFGenReferenceObj. \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		MssCFGenReferenceObj reference = (MssCFGenReferenceObj)genItem;

		ICFLibAnyObj refDef = reference.dereference( genContext );
		if( refDef == null ) {
			genContext.getGenEngine().getLog().message( "Resolution of reference \""
				+ referenceName
				+ "\" returned null. \""
				+ "$" + getRequiredSourceText() + "$"
				+ "\" is invalid" );
			return( null );
		}

		MssCFGenContext refContext = genContext.buildRefContext( generatingBuild, refDef );
		if( refContext == null ) {
			throw new RuntimeException( S_ProcName +  "buildRefContext() failed" );
		}

		ICFGenKbGelInstructionObj remainder = getOptionalLookupRemainder();

		String expansion;
		if( remainder == null ) {
			expansion = "";
		}
		else {
			expansion = remainder.expand( refContext );
		}

		return( expansion );
	}
}
