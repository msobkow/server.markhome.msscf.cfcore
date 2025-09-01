// Description: Java 11 edit object instance implementation for CFGenKb SysCluster.

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

public class CFGenKbSysClusterEditObj
	implements ICFGenKbSysClusterEditObj
{
	protected ICFGenKbSysClusterObj orig;
	protected CFGenKbSysClusterBuff buff;
	protected ICFGenKbClusterObj requiredContainerCluster;

	public CFGenKbSysClusterEditObj( ICFGenKbSysClusterObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFGenKbSysClusterBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredContainerCluster = null;
	}

	public String getClassCode() {
		return( CFGenKbSysClusterObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "SysCluster" );
	}

	public ICFLibAnyObj getScope() {
		ICFGenKbClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFGenKbClusterObj scope = getRequiredContainerCluster();
		return( scope );
	}

	public String getObjName() {
		String objName;
		int val = getRequiredSingletonId();
		objName = Integer.toString( val );
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

	public ICFGenKbSysClusterObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbSysClusterObj retobj = getSchema().getSysClusterTableObj().realiseSysCluster( (ICFGenKbSysClusterObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsSysCluster().forget();
	}

	public ICFGenKbSysClusterObj read() {
		ICFGenKbSysClusterObj retval = getOrigAsSysCluster().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFGenKbSysClusterObj read( boolean forceRead ) {
		ICFGenKbSysClusterObj retval = getOrigAsSysCluster().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFGenKbSysClusterObj create() {
		copyBuffToOrig();
		ICFGenKbSysClusterObj retobj = ((ICFGenKbSchemaObj)getOrigAsSysCluster().getSchema()).getSysClusterTableObj().createSysCluster( getOrigAsSysCluster() );
		if( retobj == getOrigAsSysCluster() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbSysClusterEditObj update() {
		getSchema().getSysClusterTableObj().updateSysCluster( (ICFGenKbSysClusterObj)this );
		return( null );
	}

	public CFGenKbSysClusterEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getSysClusterTableObj().deleteSysCluster( getOrigAsSysCluster() );
		return( null );
	}

	public ICFGenKbSysClusterTableObj getSysClusterTable() {
		return( orig.getSchema().getSysClusterTableObj() );
	}

	public ICFGenKbSysClusterEditObj getEdit() {
		return( (ICFGenKbSysClusterEditObj)this );
	}

	public ICFGenKbSysClusterEditObj getEditAsSysCluster() {
		return( (ICFGenKbSysClusterEditObj)this );
	}

	public ICFGenKbSysClusterEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFGenKbSysClusterObj getOrig() {
		return( orig );
	}

	public ICFGenKbSysClusterObj getOrigAsSysCluster() {
		return( (ICFGenKbSysClusterObj)orig );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFGenKbSysClusterBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsSysCluster().getSchema().getBackingStore()).getFactorySysCluster().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbSysClusterBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredContainerCluster = null;
		}
	}

	public CFGenKbSysClusterBuff getSysClusterBuff() {
		return( (CFGenKbSysClusterBuff)getBuff() );
	}

	public CFGenKbSysClusterPKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFGenKbSysClusterPKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public int getRequiredSingletonId() {
		return( getPKey().getRequiredSingletonId() );
	}

	public void setRequiredSingletonId( int value ) {
		if( getPKey().getRequiredSingletonId() != value ) {
			getPKey().setRequiredSingletonId( value );
		}
		if( getSysClusterBuff().getRequiredSingletonId() != value ) {
			getSysClusterBuff().setRequiredSingletonId( value );
		}
	}

	public long getRequiredClusterId() {
		return( getSysClusterBuff().getRequiredClusterId() );
	}

	public ICFGenKbClusterObj getRequiredContainerCluster() {
		return( getRequiredContainerCluster( false ) );
	}

	public ICFGenKbClusterObj getRequiredContainerCluster( boolean forceRead ) {
		if( forceRead || ( requiredContainerCluster == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFGenKbClusterObj obj = ((ICFGenKbSchemaObj)getOrigAsSysCluster().getSchema()).getClusterTableObj().readClusterByIdIdx( getSysClusterBuff().getRequiredClusterId() );
				requiredContainerCluster = obj;
				if( obj != null ) {
					getSysClusterBuff().setRequiredClusterId( obj.getRequiredId() );
					requiredContainerCluster = obj;
				}
			}
		}
		return( requiredContainerCluster );
	}

	public void setRequiredContainerCluster( ICFGenKbClusterObj value ) {
			if( buff == null ) {
				getSysClusterBuff();
			}
			if( value != null ) {
				getSysClusterBuff().setRequiredClusterId( value.getRequiredId() );
			}
			requiredContainerCluster = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredSingletonId( getPKey().getRequiredSingletonId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredSingletonId( buff.getRequiredSingletonId() );
	}

	public void copyBuffToOrig() {
		CFGenKbSysClusterBuff origBuff = getOrigAsSysCluster().getSysClusterBuff();
		CFGenKbSysClusterBuff myBuff = getSysClusterBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbSysClusterBuff origBuff = getOrigAsSysCluster().getSysClusterBuff();
		CFGenKbSysClusterBuff myBuff = getSysClusterBuff();
		myBuff.set( origBuff );
	}
}
