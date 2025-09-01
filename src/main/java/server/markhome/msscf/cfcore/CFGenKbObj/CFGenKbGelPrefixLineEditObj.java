// Description: Java 11 edit object instance implementation for CFGenKb GelPrefixLine.

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

public class CFGenKbGelPrefixLineEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelPrefixLineEditObj
{
	protected ICFGenKbGelInstructionObj optionalLookupRemainder;

	public CFGenKbGelPrefixLineEditObj( ICFGenKbGelPrefixLineObj argOrig ) {
		super( argOrig );
		optionalLookupRemainder = null;
	}

	public String getClassCode() {
		return( CFGenKbGelPrefixLineObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelPrefixLine" );
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
		ICFGenKbGelPrefixLineObj retobj = getSchema().getGelPrefixLineTableObj().realiseGelPrefixLine( (ICFGenKbGelPrefixLineObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelPrefixLine().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelPrefixLineObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelPrefixLine().getSchema()).getGelPrefixLineTableObj().createGelPrefixLine( getOrigAsGelPrefixLine() );
		if( retobj == getOrigAsGelPrefixLine() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelPrefixLineTableObj().updateGelPrefixLine( (ICFGenKbGelPrefixLineObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelPrefixLineTableObj().deleteGelPrefixLine( getOrigAsGelPrefixLine() );
		return( null );
	}

	public ICFGenKbGelPrefixLineTableObj getGelPrefixLineTable() {
		return( orig.getSchema().getGelPrefixLineTableObj() );
	}

	public ICFGenKbGelPrefixLineEditObj getEditAsGelPrefixLine() {
		return( (ICFGenKbGelPrefixLineEditObj)this );
	}

	public ICFGenKbGelPrefixLineObj getOrigAsGelPrefixLine() {
		return( (ICFGenKbGelPrefixLineObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelPrefixLine().getSchema().getBackingStore()).getFactoryGelPrefixLine().newBuff();
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

	public CFGenKbGelPrefixLineBuff getGelPrefixLineBuff() {
		return( (CFGenKbGelPrefixLineBuff)getBuff() );
	}

	public String getRequiredPrefixName() {
		return( getGelPrefixLineBuff().getRequiredPrefixName() );
	}

	public void setRequiredPrefixName( String value ) {
		if( getGelPrefixLineBuff().getRequiredPrefixName() != value ) {
			getGelPrefixLineBuff().setRequiredPrefixName( value );
		}
	}

	public Long getOptionalRemainderTenantId() {
		return( getGelPrefixLineBuff().getOptionalRemainderTenantId() );
	}

	public long getRequiredRemainderGelCacheId() {
		return( getGelPrefixLineBuff().getRequiredRemainderGelCacheId() );
	}

	public Long getOptionalRemainderInstId() {
		return( getGelPrefixLineBuff().getOptionalRemainderInstId() );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder() {
		return( getOptionalLookupRemainder( false ) );
	}

	public ICFGenKbGelInstructionObj getOptionalLookupRemainder( boolean forceRead ) {
		if( forceRead || ( optionalLookupRemainder == null ) ) {
			boolean anyMissing = false;
			if( getGelPrefixLineBuff().getOptionalRemainderTenantId() == null ) {
				anyMissing = true;
			}
			if( getGelPrefixLineBuff().getOptionalRemainderInstId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelInstructionObj obj = ((ICFGenKbSchemaObj)getOrigAsGelPrefixLine().getSchema()).getGelInstructionTableObj().readGelInstructionByPIdx( getGelPrefixLineBuff().getOptionalRemainderTenantId(),
					getGelPrefixLineBuff().getRequiredRemainderGelCacheId(),
					getGelPrefixLineBuff().getOptionalRemainderInstId() );
				optionalLookupRemainder = obj;
			}
		}
		return( optionalLookupRemainder );
	}

	public void setOptionalLookupRemainder( ICFGenKbGelInstructionObj value ) {
			if( buff == null ) {
				getGelPrefixLineBuff();
			}
			if( value != null ) {
				getGelPrefixLineBuff().setOptionalRemainderTenantId( value.getRequiredTenantId() );
				getGelPrefixLineBuff().setRequiredRemainderGelCacheId( value.getRequiredGelCacheId() );
				getGelPrefixLineBuff().setOptionalRemainderInstId( value.getRequiredGelInstId() );
			}
			else {
				getGelPrefixLineBuff().setOptionalRemainderTenantId( null );
				getGelPrefixLineBuff().setOptionalRemainderInstId( null );
			}
			optionalLookupRemainder = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGelPrefixLineBuff origBuff = getOrigAsGelPrefixLine().getGelPrefixLineBuff();
		CFGenKbGelPrefixLineBuff myBuff = getGelPrefixLineBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelPrefixLineBuff origBuff = getOrigAsGelPrefixLine().getGelPrefixLineBuff();
		CFGenKbGelPrefixLineBuff myBuff = getGelPrefixLineBuff();
		myBuff.set( origBuff );
	}
}
