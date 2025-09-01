// Description: Java 11 base object instance implementation for CFGenKb GelCache.

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

public class CFGenKbGelCacheObj
	implements ICFGenKbGelCacheObj
{
	public final static String CLASS_CODE = "a915";
	protected boolean isNew;
	protected ICFGenKbGelCacheEditObj edit;
	protected ICFGenKbSchemaObj schema;
	protected CFGenKbGelCachePKey pKey;
	protected CFGenKbGelCacheBuff buff;
	protected ICFGenKbTenantObj requiredOwnerTenant;
	protected Map< String, ICFGenKbGelInstructionObj > mapMacro = new HashMap< String, ICFGenKbGelInstructionObj >();
	protected Map< String, ICFGenKbGelExecutableObj > mapExecutable = new HashMap< String, ICFGenKbGelExecutableObj >();

	public CFGenKbGelCacheObj() {
		isNew = true;
		requiredOwnerTenant = null;
	}

	public CFGenKbGelCacheObj( ICFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredOwnerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		ICFGenKbGelCacheObj retobj = ((ICFGenKbSchemaObj)schema).getGelCacheTableObj().realiseGelCache(
			(ICFGenKbGelCacheObj)this );
		return( (ICFGenKbGelCacheObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGelCacheTableObj().reallyDeepDisposeGelCache( (ICFGenKbGelCacheObj)this );
	}

	public ICFGenKbGelCacheObj read() {
		ICFGenKbGelCacheObj retobj = ((ICFGenKbSchemaObj)schema).getGelCacheTableObj().readGelCacheByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(), false );
		return( (ICFGenKbGelCacheObj)retobj );
	}

	public ICFGenKbGelCacheObj read( boolean forceRead ) {
		ICFGenKbGelCacheObj retobj = ((ICFGenKbSchemaObj)schema).getGelCacheTableObj().readGelCacheByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredGelCacheId(), forceRead );
		return( (ICFGenKbGelCacheObj)retobj );
	}

	public ICFGenKbGelCacheTableObj getGelCacheTable() {
		return( ((ICFGenKbSchemaObj)schema).getGelCacheTableObj() );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = value;
	}

	public CFGenKbGelCacheBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByIdIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredGelCacheId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelCacheBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGelCacheBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGelCacheBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
	}

	public CFGenKbGelCacheBuff getGelCacheBuff() {
		return( (CFGenKbGelCacheBuff)getBuff() );
	}

	public CFGenKbGelCachePKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFGenKbGelCachePKey value ) {
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

	public ICFGenKbGelCacheEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGelCacheObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGelCacheObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGelCacheTableObj().lockGelCache( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGelCacheTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGelCacheEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFGenKbGelCacheEditObj getEdit() {
		return( edit );
	}

	public ICFGenKbGelCacheEditObj getEditAsGelCache() {
		return( (ICFGenKbGelCacheEditObj)edit );
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
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredGelCacheId( buff.getRequiredGelCacheId() );
	}

	public ICFGenKbGelInstructionObj lookupMacro( String macroBody ) {
		ICFGenKbGelInstructionObj gel = mapMacro.get( macroBody );
		return( gel );
	}

	public ICFGenKbGelInstructionObj rememberMacro( String macroBody, ICFGenKbGelInstructionObj gel ) {
		ICFGenKbGelInstructionObj found;
		found = mapMacro.get( macroBody );
		if( found == null ) {
			mapMacro.put( macroBody, gel );
			found = gel;
		}
		return( found );
	}

	public ICFGenKbGelExecutableObj lookupExecutable( String execName ) {
		ICFGenKbGelExecutableObj gel = mapExecutable.get( execName );
		return( gel );
	}

	public ICFGenKbGelExecutableObj rememberExecutable( String execName, ICFGenKbGelExecutableObj gel ) {
		ICFGenKbGelExecutableObj found;
		found = mapExecutable.get( execName );
		if( found == null ) {
			mapExecutable.put( execName, gel );
			found = gel;
		}
		return( found );
	}
}
