// Description: Java 11 edit object instance implementation for CFGenKb GelConstrain.

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

public class CFGenKbGelConstrainEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelConstrainEditObj
{
	protected ICFGenKbGelInstructionObj optionalLookupRemainder;

	public CFGenKbGelConstrainEditObj( ICFGenKbGelConstrainObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CFGenKbGelConstrainObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelConstrain" );
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
		ICFGenKbGelConstrainObj retobj = getSchema().getGelConstrainTableObj().realiseGelConstrain( (ICFGenKbGelConstrainObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelConstrain().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelConstrainObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelConstrain().getSchema()).getGelConstrainTableObj().createGelConstrain( getOrigAsGelConstrain() );
		if( retobj == getOrigAsGelConstrain() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelConstrainTableObj().updateGelConstrain( (ICFGenKbGelConstrainObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelConstrainTableObj().deleteGelConstrain( getOrigAsGelConstrain() );
		return( null );
	}

	public ICFGenKbGelConstrainTableObj getGelConstrainTable() {
		return( orig.getSchema().getGelConstrainTableObj() );
	}

	public ICFGenKbGelConstrainEditObj getEditAsGelConstrain() {
		return( (ICFGenKbGelConstrainEditObj)this );
	}

	public ICFGenKbGelConstrainObj getOrigAsGelConstrain() {
		return( (ICFGenKbGelConstrainObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelConstrain().getSchema().getBackingStore()).getFactoryGelConstrain().newBuff();
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

	public CFGenKbGelConstrainBuff getGelConstrainBuff() {
		return( (CFGenKbGelConstrainBuff)getBuff() );
	}

	public Long getOptionalHardConstraint() {
		return( getGelConstrainBuff().getOptionalHardConstraint() );
	}

	public void setOptionalHardConstraint( Long value ) {
		if( getGelConstrainBuff().getOptionalHardConstraint() != value ) {
			getGelConstrainBuff().setOptionalHardConstraint( value );
		}
	}

	public String getOptionalConstrainingName() {
		return( getGelConstrainBuff().getOptionalConstrainingName() );
	}

	public void setOptionalConstrainingName( String value ) {
		if( getGelConstrainBuff().getOptionalConstrainingName() != value ) {
			getGelConstrainBuff().setOptionalConstrainingName( value );
		}
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelConstrainBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelConstrainBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelConstrainBuff().getOptionalRemainderInstId() );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelConstrainBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelConstrainBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelInstructionObj obj = ((ICFGenKbSchemaObj)getOrigAsGelConstrain().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelConstrainBuff().getOptionalRemainderTenantId(),
					getGelConstrainBuff().getRequiredRemainderGelCacheId(),
					getGelConstrainBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( ICFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelConstrainBuff();
			}
			if( value != null ) {
				getGelConstrainBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelConstrainBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelConstrainBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelConstrainBuff().setOptionalRemainderTenantId( null );
				getGelConstrainBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGelConstrainBuff origBuff = getOrigAsGelConstrain().getGelConstrainBuff();
		CFGenKbGelConstrainBuff myBuff = getGelConstrainBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelConstrainBuff origBuff = getOrigAsGelConstrain().getGelConstrainBuff();
		CFGenKbGelConstrainBuff myBuff = getGelConstrainBuff();
		myBuff.set( origBuff );
	}
}
