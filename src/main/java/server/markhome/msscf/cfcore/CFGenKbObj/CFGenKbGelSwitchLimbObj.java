// Description: Java 11 base object instance implementation for CFGenKb GelSwitchLimb.

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

public class CFGenKbGelSwitchLimbObj
	implements ICFGenKbGelSwitchLimbObj
{
	public final static String CLASS_CODE = "a91f";
	protected boolean isNew;
	protected ICFGenKbGelSwitchLimbEditObj edit;
	protected ICFGenKbSchemaObj schema;
	protected CFGenKbGelSwitchLimbPKey pKey;
	protected CFGenKbGelSwitchLimbBuff buff;
	protected ICFGenKbGelSwitchObj requiredParentSwitch;
	protected ICFGenKbTenantObj requiredOwnerTenant;

	public CFGenKbGelSwitchLimbObj() {
		isNew = true;
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public CFGenKbGelSwitchLimbObj( ICFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSwitchLimb" );
	}

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredLimbName();
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

	public ICFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
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

	public String getObjFullName() {
		String fullName = getObjName();
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
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public ICFGenKbGelSwitchLimbObj realise() {
		ICFGenKbGelSwitchLimbObj retobj = ((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().realiseGelSwitchLimb(
			(ICFGenKbGelSwitchLimbObj)this );
		return( (ICFGenKbGelSwitchLimbObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().reallyDeepDisposeGelSwitchLimb( (ICFGenKbGelSwitchLimbObj)this );
	}

	public ICFGenKbGelSwitchLimbObj read() {
		ICFGenKbGelSwitchLimbObj retobj = ((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().readGelSwitchLimbByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(),
			getPKey().getRequiredLimbName(), false );
		return( (ICFGenKbGelSwitchLimbObj)retobj );
	}

	public ICFGenKbGelSwitchLimbObj read( boolean forceRead ) {
		ICFGenKbGelSwitchLimbObj retobj = ((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().readGelSwitchLimbByPIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(),
			getPKey().getRequiredGelInstId(),
			getPKey().getRequiredLimbName(), forceRead );
		return( (ICFGenKbGelSwitchLimbObj)retobj );
	}

	public ICFGenKbGelSwitchLimbTableObj getGelSwitchLimbTable() {
		return( ((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj() );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = value;
	}

	public CFGenKbGelSwitchLimbBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelSwitchLimb().readDerivedByPIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId(),
						getPKey().getRequiredGelInstId(),
						getPKey().getRequiredLimbName() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelSwitchLimbBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGelSwitchLimbBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGelSwitchLimbBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredParentSwitch = null;
		requiredOwnerTenant = null;
	}

	public CFGenKbGelSwitchLimbBuff getGelSwitchLimbBuff() {
		return( (CFGenKbGelSwitchLimbBuff)getBuff() );
	}

	public CFGenKbGelSwitchLimbPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelSwitchLimb().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFGenKbGelSwitchLimbPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public ICFGenKbGelSwitchLimbEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGelSwitchLimbObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGelSwitchLimbObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().lockGelSwitchLimb( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGelSwitchLimbTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGelSwitchLimbEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFGenKbGelSwitchLimbEditObj getEdit() {
		return( edit );
	}

	public ICFGenKbGelSwitchLimbEditObj getEditAsGelSwitchLimb() {
		return( (ICFGenKbGelSwitchLimbEditObj)edit );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredGelCacheId() {
		return( getPKey().getRequiredGelCacheId() );
	}

	public long getRequiredGelInstId() {
		return( getPKey().getRequiredGelInstId() );
	}

	public String getRequiredLimbName() {
		return( getPKey().getRequiredLimbName() );
	}

	public String getRequiredLimbExpansion() {
		return( getGelSwitchLimbBuff().getRequiredLimbExpansion() );
	}

	public ICFGenKbGelSwitchObj getRequiredParentSwitch() {
		return( getRequiredParentSwitch( false ) );
	}

	public ICFGenKbGelSwitchObj getRequiredParentSwitch( boolean forceRead ) {
		if( ( requiredParentSwitch == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredParentSwitch = ((ICFGenKbSchemaObj)schema).getGelSwitchTableObj().readGelSwitchByPIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredGelCacheId(),
					getPKey().getRequiredGelInstId(), forceRead );
			}
		}
		return( requiredParentSwitch );
	}

	public ICFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( ( requiredOwnerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredOwnerTenant = ((ICFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredOwnerTenant );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
			buff.setRequiredGelInstId( getPKey().getRequiredGelInstId() );
			buff.setRequiredLimbName( getPKey().getRequiredLimbName() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
		getPKey().setRequiredGelInstId( buff.getRequiredGelInstId() );
		getPKey().setRequiredLimbName( buff.getRequiredLimbName() );
	}
}
