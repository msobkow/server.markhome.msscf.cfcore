// Description: Java 11 edit object instance implementation for CFGenKb GelSwitch.

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

public class CFGenKbGelSwitchEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelSwitchEditObj
{

	public CFGenKbGelSwitchEditObj( ICFGenKbGelSwitchObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGelSwitchObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSwitch" );
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
		ICFGenKbGelSwitchObj retobj = getSchema().getGelSwitchTableObj().realiseGelSwitch( (ICFGenKbGelSwitchObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelSwitch().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelSwitchObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelSwitch().getSchema()).getGelSwitchTableObj().createGelSwitch( getOrigAsGelSwitch() );
		if( retobj == getOrigAsGelSwitch() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelSwitchTableObj().updateGelSwitch( (ICFGenKbGelSwitchObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelSwitchTableObj().deleteGelSwitch( getOrigAsGelSwitch() );
		return( null );
	}

	public ICFGenKbGelSwitchTableObj getGelSwitchTable() {
		return( orig.getSchema().getGelSwitchTableObj() );
	}

	public ICFGenKbGelSwitchEditObj getEditAsGelSwitch() {
		return( (ICFGenKbGelSwitchEditObj)this );
	}

	public ICFGenKbGelSwitchObj getOrigAsGelSwitch() {
		return( (ICFGenKbGelSwitchObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelSwitch().getSchema().getBackingStore()).getFactoryGelSwitch().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGelSwitchBuff getGelSwitchBuff() {
		return( (CFGenKbGelSwitchBuff)getBuff() );
	}

	public String getRequiredValueExpansion() {
		return( getGelSwitchBuff().getRequiredValueExpansion() );
	}

	public void setRequiredValueExpansion( String value ) {
		if( getGelSwitchBuff().getRequiredValueExpansion() != value ) {
			getGelSwitchBuff().setRequiredValueExpansion( value );
		}
	}

	public String getOptionalNilExpansion() {
		return( getGelSwitchBuff().getOptionalNilExpansion() );
	}

	public void setOptionalNilExpansion( String value ) {
		if( getGelSwitchBuff().getOptionalNilExpansion() != value ) {
			getGelSwitchBuff().setOptionalNilExpansion( value );
		}
	}

	public String getOptionalEmptyExpansion() {
		return( getGelSwitchBuff().getOptionalEmptyExpansion() );
	}

	public void setOptionalEmptyExpansion( String value ) {
		if( getGelSwitchBuff().getOptionalEmptyExpansion() != value ) {
			getGelSwitchBuff().setOptionalEmptyExpansion( value );
		}
	}

	public String getRequiredDefaultExpansion() {
		return( getGelSwitchBuff().getRequiredDefaultExpansion() );
	}

	public void setRequiredDefaultExpansion( String value ) {
		if( getGelSwitchBuff().getRequiredDefaultExpansion() != value ) {
			getGelSwitchBuff().setRequiredDefaultExpansion( value );
		}
	}

	public List<ICFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb() {
		List<ICFGenKbGelSwitchLimbObj> retval;
		retval = ((ICFGenKbSchemaObj)getOrigAsGelSwitch().getSchema()).getGelSwitchLimbTableObj().readGelSwitchLimbBySwitchIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			false );
		return( retval );
	}

	public List<ICFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb( boolean forceRead ) {
		List<ICFGenKbGelSwitchLimbObj> retval;
		retval = ((ICFGenKbSchemaObj)getOrigAsGelSwitch().getSchema()).getGelSwitchLimbTableObj().readGelSwitchLimbBySwitchIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		CFGenKbGelSwitchBuff origBuff = getOrigAsGelSwitch().getGelSwitchBuff();
		CFGenKbGelSwitchBuff myBuff = getGelSwitchBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelSwitchBuff origBuff = getOrigAsGelSwitch().getGelSwitchBuff();
		CFGenKbGelSwitchBuff myBuff = getGelSwitchBuff();
		myBuff.set( origBuff );
	}
}
