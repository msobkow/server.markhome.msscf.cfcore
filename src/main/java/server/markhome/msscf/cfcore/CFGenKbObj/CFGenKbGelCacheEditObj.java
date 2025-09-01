// Description: Java 11 edit object instance implementation for CFGenKb GelCache.

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

public class CFGenKbGelCacheEditObj
	implements ICFGenKbGelCacheEditObj
{
	protected ICFGenKbGelCacheObj orig;
	protected CFGenKbGelCacheBuff buff;
	protected ICFGenKbTenantObj requiredOwnerTenant;

	public CFGenKbGelCacheEditObj( ICFGenKbGelCacheObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFGenKbGelCacheBuff origBuff = orig.getBuff();
		buff.set( origBuff );
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( CFGenKbGelCacheObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelCache" );
	}

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelCacheId();
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

	public ICFGenKbGelCacheObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGelCacheObj retobj = getSchema().getGelCacheTableObj().realiseGelCache( (ICFGenKbGelCacheObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelCache().forget();
	}

	public ICFGenKbGelCacheObj read() {
		ICFGenKbGelCacheObj retval = getOrigAsGelCache().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFGenKbGelCacheObj read( boolean forceRead ) {
		ICFGenKbGelCacheObj retval = getOrigAsGelCache().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFGenKbGelCacheObj create() {
		copyBuffToOrig();
		ICFGenKbGelCacheObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelCache().getSchema()).getGelCacheTableObj().createGelCache( getOrigAsGelCache() );
		if( retobj == getOrigAsGelCache() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelCacheEditObj update() {
		getSchema().getGelCacheTableObj().updateGelCache( (ICFGenKbGelCacheObj)this );
		return( null );
	}

	public CFGenKbGelCacheEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelCacheTableObj().deleteGelCache( getOrigAsGelCache() );
		return( null );
	}

	public ICFGenKbGelCacheTableObj getGelCacheTable() {
		return( orig.getSchema().getGelCacheTableObj() );
	}

	public ICFGenKbGelCacheEditObj getEdit() {
		return( (ICFGenKbGelCacheEditObj)this );
	}

	public ICFGenKbGelCacheEditObj getEditAsGelCache() {
		return( (ICFGenKbGelCacheEditObj)this );
	}

	public ICFGenKbGelCacheEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFGenKbGelCacheObj getOrig() {
		return( orig );
	}

	public ICFGenKbGelCacheObj getOrigAsGelCache() {
		return( (ICFGenKbGelCacheObj)orig );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFGenKbGelCacheBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelCache().getSchema().getBackingStore()).getFactoryGelCache().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelCacheBuff value ) {
		if( buff != value ) {
			buff = value;
			requiredOwnerTenant = null;
		}
	}

	public CFGenKbGelCacheBuff getGelCacheBuff() {
		return( (CFGenKbGelCacheBuff)getBuff() );
	}

	public CFGenKbGelCachePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFGenKbGelCachePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredGelCacheId() {
		return( getPKey().getRequiredGelCacheId() );
	}

	public String getRequiredCacheName() {
		return( getGelCacheBuff().getRequiredCacheName() );
	}

	public void setRequiredCacheName( String value ) {
		if( getGelCacheBuff().getRequiredCacheName() != value ) {
			getGelCacheBuff().setRequiredCacheName( value );
		}
	}

	public ICFGenKbTenantObj getRequiredOwnerTenant() {
		return( getRequiredOwnerTenant( false ) );
	}

	public ICFGenKbTenantObj getRequiredOwnerTenant( boolean forceRead ) {
		if( forceRead || ( requiredOwnerTenant == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFGenKbTenantObj obj = ((ICFGenKbSchemaObj)getOrigAsGelCache().getSchema()).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId() );
				requiredOwnerTenant = obj;
			}
		}
		return( requiredOwnerTenant );
	}

	public void setRequiredOwnerTenant( ICFGenKbTenantObj value ) {
			if( buff == null ) {
				getGelCacheBuff();
			}
			if( value != null ) {
				getPKey().setRequiredTenantId( value.getRequiredId() );
				getGelCacheBuff().setRequiredTenantId( value.getRequiredId() );
			}
			requiredOwnerTenant = value;
	}

	public void copyPKeyToBuff() {
		buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
		buff.setRequiredGelCacheId( getPKey().getRequiredGelCacheId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
	}

	public void copyBuffToOrig() {
		CFGenKbGelCacheBuff origBuff = getOrigAsGelCache().getGelCacheBuff();
		CFGenKbGelCacheBuff myBuff = getGelCacheBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelCacheBuff origBuff = getOrigAsGelCache().getGelCacheBuff();
		CFGenKbGelCacheBuff myBuff = getGelCacheBuff();
		myBuff.set( origBuff );
	}

	public ICFGenKbGelInstructionObj lookupMacro( String macroBody ) {
		throw new CFLibUsageException( getClass(), "lookupMacro", "You are not allowed to manipulate macros while objects are being edited" );
	}

	public ICFGenKbGelInstructionObj rememberMacro( String macroBody, ICFGenKbGelInstructionObj gel ) {
		throw new CFLibUsageException( getClass(), "rememberMacro", "You are not allowed to manipulate macros while objects are being edited" );
	}

	public ICFGenKbGelExecutableObj lookupExecutable( String execName ) {
		throw new CFLibUsageException( getClass(), "lookupExecutable", "You are not allowed to manipulate macros while objects are being edited" );
	}

	public ICFGenKbGelExecutableObj rememberExecutable( String execName, ICFGenKbGelExecutableObj gel ) {
		throw new CFLibUsageException( getClass(), "rememberExecutable", "You are not allowed to manipulate macros while objects are being edited" );
	}
}
