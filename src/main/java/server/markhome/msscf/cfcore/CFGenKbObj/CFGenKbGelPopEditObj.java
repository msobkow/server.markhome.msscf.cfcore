// Description: Java 11 edit object instance implementation for CFGenKb GelPop.

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

public class CFGenKbGelPopEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelPopEditObj
{
	protected ICFGenKbGelInstructionObj optionalLookupRemainder;

	public CFGenKbGelPopEditObj( ICFGenKbGelPopObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CFGenKbGelPopObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPop" );
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
		ICFGenKbGelPopObj retobj = getSchema().getGelPopTableObj().realiseGelPop( (ICFGenKbGelPopObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelPop().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelPopObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelPop().getSchema()).getGelPopTableObj().createGelPop( getOrigAsGelPop() );
		if( retobj == getOrigAsGelPop() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelPopTableObj().updateGelPop( (ICFGenKbGelPopObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelPopTableObj().deleteGelPop( getOrigAsGelPop() );
		return( null );
	}

	public ICFGenKbGelPopTableObj getGelPopTable() {
		return( orig.getSchema().getGelPopTableObj() );
	}

	public ICFGenKbGelPopEditObj getEditAsGelPop() {
		return( (ICFGenKbGelPopEditObj)this );
	}

	public ICFGenKbGelPopObj getOrigAsGelPop() {
		return( (ICFGenKbGelPopObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelPop().getSchema().getBackingStore()).getFactoryGelPop().newBuff();
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

	public CFGenKbGelPopBuff getGelPopBuff() {
		return( (CFGenKbGelPopBuff)getBuff() );
	}

	public String getRequiredGoalTypeName() {
		return( getGelPopBuff().getRequiredGoalTypeName() );
	}

	public void setRequiredGoalTypeName( String value ) {
		if( getGelPopBuff().getRequiredGoalTypeName() != value ) {
			getGelPopBuff().setRequiredGoalTypeName( value );
		}
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelPopBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelPopBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelPopBuff().getOptionalRemainderInstId() );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelPopBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPopBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelInstructionObj obj = ((ICFGenKbSchemaObj)getOrigAsGelPop().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPopBuff().getOptionalRemainderTenantId(),
					getGelPopBuff().getRequiredRemainderGelCacheId(),
					getGelPopBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( ICFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelPopBuff();
			}
			if( value != null ) {
				getGelPopBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelPopBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelPopBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelPopBuff().setOptionalRemainderTenantId( null );
				getGelPopBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGelPopBuff origBuff = getOrigAsGelPop().getGelPopBuff();
		CFGenKbGelPopBuff myBuff = getGelPopBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelPopBuff origBuff = getOrigAsGelPop().getGelPopBuff();
		CFGenKbGelPopBuff myBuff = getGelPopBuff();
		myBuff.set( origBuff );
	}
}
