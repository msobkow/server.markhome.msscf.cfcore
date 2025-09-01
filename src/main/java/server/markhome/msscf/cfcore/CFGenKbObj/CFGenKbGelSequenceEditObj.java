// Description: Java 11 edit object instance implementation for CFGenKb GelSequence.

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

public class CFGenKbGelSequenceEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelSequenceEditObj
{
	protected ICFGenKbGelCallObj optionalLookupFirstInst;
	protected ICFGenKbGelCallObj optionalLookupLastInst;

	public CFGenKbGelSequenceEditObj( ICFGenKbGelSequenceObj argOrig ) {
		super( argOrig );
		optionalLookupFirstInst = null;
		optionalLookupLastInst = null;
	}

	public String getClassCode() {
		return( CFGenKbGelSequenceObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSequence" );
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGelSequenceObj retobj = getSchema().getGelSequenceTableObj().realiseGelSequence( (ICFGenKbGelSequenceObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelSequence().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelSequenceObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelSequenceTableObj().createGelSequence( getOrigAsGelSequence() );
		if( retobj == getOrigAsGelSequence() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelSequenceTableObj().updateGelSequence( (ICFGenKbGelSequenceObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelSequenceTableObj().deleteGelSequence( getOrigAsGelSequence() );
		return( null );
	}

	public ICFGenKbGelSequenceTableObj getGelSequenceTable() {
		return( orig.getSchema().getGelSequenceTableObj() );
	}

	public ICFGenKbGelSequenceEditObj getEditAsGelSequence() {
		return( (ICFGenKbGelSequenceEditObj)this );
	}

	public ICFGenKbGelSequenceObj getOrigAsGelSequence() {
		return( (ICFGenKbGelSequenceObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelSequence().getSchema().getBackingStore()).getFactoryGelSequence().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupFirstInst = null;
			optionalLookupLastInst = null;
		}
	}

	public CFGenKbGelSequenceBuff getGelSequenceBuff() {
		return( (CFGenKbGelSequenceBuff)getBuff() );
	}

	public Long getOptionalFirstInstTenantId() {
		return( getGelSequenceBuff().getOptionalFirstInstTenantId() );
	}

	public Long getOptionalFirstInstGelCacheId() {
		return( getGelSequenceBuff().getOptionalFirstInstGelCacheId() );
	}

	public Long getOptionalFirstInstId() {
		return( getGelSequenceBuff().getOptionalFirstInstId() );
	}

	public Long getOptionalLastInstTenantId() {
		return( getGelSequenceBuff().getOptionalLastInstTenantId() );
	}

	public Long getOptionalLastInstGelCacheId() {
		return( getGelSequenceBuff().getOptionalLastInstGelCacheId() );
	}

	public Long getOptionalLastInstId() {
		return( getGelSequenceBuff().getOptionalLastInstId() );
	}

	public List<ICFGenKbGelCallObj> getOptionalChildrenCalls() {
		List<ICFGenKbGelCallObj> retval;
		retval = ((ICFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallBySeqIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			false );
		return( retval );
	}

	public List<ICFGenKbGelCallObj> getOptionalChildrenCalls( boolean forceRead ) {
		List<ICFGenKbGelCallObj> retval;
		retval = ((ICFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallBySeqIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			forceRead );
		return( retval );
	}

	public ICFGenKbGelCallObj getOptionalLookupFirstInst() {
		return( getOptionalLookupFirstInst( false ) );
	}

	public ICFGenKbGelCallObj getOptionalLookupFirstInst( boolean forceRead ) {
		if( forceRead || ( optionalLookupFirstInst == null ) ) {
			boolean anyMissing = false;
			if( getGelSequenceBuff().getOptionalFirstInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalFirstInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalFirstInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelCallObj obj = ((ICFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallByPIdx( getGelSequenceBuff().getOptionalFirstInstTenantId(),
					getGelSequenceBuff().getOptionalFirstInstGelCacheId(),
					getGelSequenceBuff().getOptionalFirstInstId() );
				optionalLookupFirstInst = obj;
			}
		}
		return( optionalLookupFirstInst );
	}

	public void setOptionalLookupFirstInst( ICFGenKbGelCallObj value ) {
			if( buff == null ) {
				getGelSequenceBuff();
			}
			if( value != null ) {
				getGelSequenceBuff().setOptionalFirstInstTenantId( value.getRequiredTenantId() );
				getGelSequenceBuff().setOptionalFirstInstGelCacheId( value.getRequiredGelCacheId() );
				getGelSequenceBuff().setOptionalFirstInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelSequenceBuff().setOptionalFirstInstTenantId( null );
				getGelSequenceBuff().setOptionalFirstInstGelCacheId( null );
				getGelSequenceBuff().setOptionalFirstInstId( null );
			}
			optionalLookupFirstInst = value;
	}

	public ICFGenKbGelCallObj getOptionalLookupLastInst() {
		return( getOptionalLookupLastInst( false ) );
	}

	public ICFGenKbGelCallObj getOptionalLookupLastInst( boolean forceRead ) {
		if( forceRead || ( optionalLookupLastInst == null ) ) {
			boolean anyMissing = false;
			if( getGelSequenceBuff().getOptionalLastInstTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalLastInstGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGelSequenceBuff().getOptionalLastInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelCallObj obj = ((ICFGenKbSchemaObj)getOrigAsGelSequence().getSchema()).getGelCallTableObj().readGelCallByPIdx( getGelSequenceBuff().getOptionalLastInstTenantId(),
					getGelSequenceBuff().getOptionalLastInstGelCacheId(),
					getGelSequenceBuff().getOptionalLastInstId() );
				optionalLookupLastInst = obj;
			}
		}
		return( optionalLookupLastInst );
	}

	public void setOptionalLookupLastInst( ICFGenKbGelCallObj value ) {
			if( buff == null ) {
				getGelSequenceBuff();
			}
			if( value != null ) {
				getGelSequenceBuff().setOptionalLastInstTenantId( value.getRequiredTenantId() );
				getGelSequenceBuff().setOptionalLastInstGelCacheId( value.getRequiredGelCacheId() );
				getGelSequenceBuff().setOptionalLastInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelSequenceBuff().setOptionalLastInstTenantId( null );
				getGelSequenceBuff().setOptionalLastInstGelCacheId( null );
				getGelSequenceBuff().setOptionalLastInstId( null );
			}
			optionalLookupLastInst = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGelSequenceBuff origBuff = getOrigAsGelSequence().getGelSequenceBuff();
		CFGenKbGelSequenceBuff myBuff = getGelSequenceBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelSequenceBuff origBuff = getOrigAsGelSequence().getGelSequenceBuff();
		CFGenKbGelSequenceBuff myBuff = getGelSequenceBuff();
		myBuff.set( origBuff );
	}
}
