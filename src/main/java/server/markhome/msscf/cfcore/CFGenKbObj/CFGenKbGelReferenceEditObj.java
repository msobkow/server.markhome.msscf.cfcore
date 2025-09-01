// Description: Java 11 edit object instance implementation for CFGenKb GelReference.

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

public class CFGenKbGelReferenceEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelReferenceEditObj
{
	protected ICFGenKbGelInstructionObj optionalLookupRemainder;

	public CFGenKbGelReferenceEditObj( ICFGenKbGelReferenceObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CFGenKbGelReferenceObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGelReferenceObj retobj = getSchema().getGelReferenceTableObj().realiseGelReference( (ICFGenKbGelReferenceObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelReference().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelReferenceObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelReference().getSchema()).getGelReferenceTableObj().createGelReference( getOrigAsGelReference() );
		if( retobj == getOrigAsGelReference() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelReferenceTableObj().updateGelReference( (ICFGenKbGelReferenceObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelReferenceTableObj().deleteGelReference( getOrigAsGelReference() );
		return( null );
	}

	public ICFGenKbGelReferenceTableObj getGelReferenceTable() {
		return( orig.getSchema().getGelReferenceTableObj() );
	}

	public ICFGenKbGelReferenceEditObj getEditAsGelReference() {
		return( (ICFGenKbGelReferenceEditObj)this );
	}

	public ICFGenKbGelReferenceObj getOrigAsGelReference() {
		return( (ICFGenKbGelReferenceObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelReference().getSchema().getBackingStore()).getFactoryGelReference().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			optionalLookupRemainder = null;
		}
	}

	public CFGenKbGelReferenceBuff getGelReferenceBuff() {
		return( (CFGenKbGelReferenceBuff)getBuff() );
	}

	public String getRequiredReferenceName() {
		return( getGelReferenceBuff().getRequiredReferenceName() );
	}

	public void setRequiredReferenceName( String value ) {
		if( getGelReferenceBuff().getRequiredReferenceName() != value ) {
			getGelReferenceBuff().setRequiredReferenceName( value );
		}
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
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelReferenceBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelReferenceBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelInstructionObj obj = ((ICFGenKbSchemaObj)getOrigAsGelReference().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelReferenceBuff().getOptionalRemainderTenantId(),
					getGelReferenceBuff().getRequiredRemainderGelCacheId(),
					getGelReferenceBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( ICFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelReferenceBuff();
			}
			if( value != null ) {
				getGelReferenceBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelReferenceBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelReferenceBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelReferenceBuff().setOptionalRemainderTenantId( null );
				getGelReferenceBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGelReferenceBuff origBuff = getOrigAsGelReference().getGelReferenceBuff();
		CFGenKbGelReferenceBuff myBuff = getGelReferenceBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelReferenceBuff origBuff = getOrigAsGelReference().getGelReferenceBuff();
		CFGenKbGelReferenceBuff myBuff = getGelReferenceBuff();
		myBuff.set( origBuff );
	}
}
