// Description: Java 11 base object instance implementation for CFGenKb GelCall.

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

public class CFGenKbGelCallObj
	extends CFGenKbGelInstructionObj
	implements ICFGenKbGelCallObj
{
	public final static String CLASS_CODE = "a91c";
	protected ICFGenKbGelSequenceObj optionalParentSeqInst;
	protected ICFGenKbGelInstructionObj optionalLookupCallInst;
	protected ICFGenKbGelCallObj optionalLookupPrevInst;
	protected ICFGenKbGelCallObj optionalLookupNextInst;

	public CFGenKbGelCallObj() {
		super();
		optionalParentSeqInst = null;
		optionalLookupCallInst = null;
		optionalLookupPrevInst = null;
		optionalLookupNextInst = null;
	}

	public CFGenKbGelCallObj( ICFGenKbSchemaObj argSchema ) {
		super( argSchema );
		optionalParentSeqInst = null;
		optionalLookupCallInst = null;
		optionalLookupPrevInst = null;
		optionalLookupNextInst = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelCall" );
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
		ICFGenKbGelCallObj retobj = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().realiseGelCall(
			(ICFGenKbGelCallObj)this );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGelCallTableObj().reallyDeepDisposeGelCall( (ICFGenKbGelCallObj)this );
	}

	public ICFGenKbGelInstructionObj read() {
		ICFGenKbGelCallObj retobj = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), false );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelInstructionObj read( boolean forceRead ) {
		ICFGenKbGelCallObj retobj = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(), forceRead );
		return( (ICFGenKbGelInstructionObj)retobj );
	}

	public ICFGenKbGelCallTableObj getGelCallTable() {
		return( ((ICFGenKbSchemaObj)schema).getGelCallTableObj() );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCall().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCall().readDerivedByPIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
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
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGelCallBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGelCallBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerGelCache = null;
		optionalLookupChainInst = null;
		optionalParentSeqInst = null;
		optionalLookupCallInst = null;
		optionalLookupPrevInst = null;
		optionalLookupNextInst = null;
	}

	public CFGenKbGelCallBuff getGelCallBuff() {
		return( (CFGenKbGelCallBuff)getBuff() );
	}

	public ICFGenKbGelInstructionEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGelCallObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGelCallObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().lockGelCall( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGelInstructionEditObj)edit );
	}

	public ICFGenKbGelCallEditObj getEditAsGelCall() {
		return( (ICFGenKbGelCallEditObj)edit );
	}

	public Long getOptionalSeqInstTenantId() {
		return( getGelCallBuff().getOptionalSeqInstTenantId() );
	}

	public Long getOptionalSeqInstGelCacheId() {
		return( getGelCallBuff().getOptionalSeqInstGelCacheId() );
	}

	public Long getOptionalSeqInstId() {
		return( getGelCallBuff().getOptionalSeqInstId() );
	}

	public Long getOptionalCallInstTenantId() {
		return( getGelCallBuff().getOptionalCallInstTenantId() );
	}

	public Long getOptionalCallInstGelCacheId() {
		return( getGelCallBuff().getOptionalCallInstGelCacheId() );
	}

	public Long getOptionalCallInstId() {
		return( getGelCallBuff().getOptionalCallInstId() );
	}

	public Long getOptionalPrevInstTenantId() {
		return( getGelCallBuff().getOptionalPrevInstTenantId() );
	}

	public Long getOptionalPrevInstGelCacheId() {
		return( getGelCallBuff().getOptionalPrevInstGelCacheId() );
	}

	public Long getOptionalPrevInstGelInstId() {
		return( getGelCallBuff().getOptionalPrevInstGelInstId() );
	}

	public Long getOptionalNextInstTenantId() {
		return( getGelCallBuff().getOptionalNextInstTenantId() );
	}

	public Long getOptionalNextInstGelCacheId() {
		return( getGelCallBuff().getOptionalNextInstGelCacheId() );
	}

	public Long getOptionalNextInstGelInstId() {
		return( getGelCallBuff().getOptionalNextInstGelInstId() );
	}

	public ICFGenKbGelSequenceObj getOptionalParentSeqInst() {
		return( getOptionalParentSeqInst( false ) );
	}

	public ICFGenKbGelSequenceObj getOptionalParentSeqInst( boolean forceRead ) {
		if( ( optionalParentSeqInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalSeqInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalSeqInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalSeqInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalParentSeqInst = ((ICFGenKbSchemaObj)schema).getGelSequenceTableObj().readGelSequenceByPIdx( getGelCallBuff().getOptionalSeqInstTenantId(),
					getGelCallBuff().getOptionalSeqInstGelCacheId(),
					getGelCallBuff().getOptionalSeqInstId(), forceRead );
			}
		}
		return( optionalParentSeqInst );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupCallInst() {
		return( getOptionalLookupCallInst( false ) );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupCallInst( boolean forceRead ) {
		if( ( optionalLookupCallInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalCallInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalCallInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalCallInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupCallInst = ((ICFGenKbSchemaObj)schema).getGelInstructionTableObj().readGelInstructionByPIdx( getGelCallBuff().getOptionalCallInstTenantId(),
					getGelCallBuff().getOptionalCallInstGelCacheId(),
					getGelCallBuff().getOptionalCallInstId(), forceRead );
			}
		}
		return( optionalLookupCallInst );
	}

	public ICFGenKbGelCallObj getOptionalLookupPrevInst() {
		return( getOptionalLookupPrevInst( false ) );
	}

	public ICFGenKbGelCallObj getOptionalLookupPrevInst( boolean forceRead ) {
		if( ( optionalLookupPrevInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalPrevInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalPrevInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalPrevInstGelInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupPrevInst = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getGelCallBuff().getOptionalPrevInstTenantId(),
					getGelCallBuff().getOptionalPrevInstGelCacheId(),
					getGelCallBuff().getOptionalPrevInstGelInstId(), forceRead );
			}
		}
		return( optionalLookupPrevInst );
	}

	public ICFGenKbGelCallObj getOptionalLookupNextInst() {
		return( getOptionalLookupNextInst( false ) );
	}

	public ICFGenKbGelCallObj getOptionalLookupNextInst( boolean forceRead ) {
		if( ( optionalLookupNextInst == null ) || forceRead ) {
			boolean anyMissing = false;
			if( getGelCallBuff().getOptionalNextInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalNextInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelCallBuff().getOptionalNextInstGelInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				optionalLookupNextInst = ((ICFGenKbSchemaObj)schema).getGelCallTableObj().readGelCallByPIdx( getGelCallBuff().getOptionalNextInstTenantId(),
					getGelCallBuff().getOptionalNextInstGelCacheId(),
					getGelCallBuff().getOptionalNextInstGelInstId(), forceRead );
			}
		}
		return( optionalLookupNextInst );
	}

	public String expand( MssCFGenContext genContext ) {
		final String S_ProcName = "expand";
		final String S_GenContext = "genContext";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(), S_ProcName, 1, S_GenContext );
		}

		String subExpansion;

		ICFGenKbGelInstructionObj called = getOptionalLookupCallInst();
		if( called != null ) {
			subExpansion = called.expand( genContext );
			if( subExpansion == null ) {
				subExpansion = "$" + called.getRequiredSourceText() + "$";
			}
		}
		else {
			subExpansion = "$" + getRequiredSourceText() + "$";
		}

		return( subExpansion );
	}
}
