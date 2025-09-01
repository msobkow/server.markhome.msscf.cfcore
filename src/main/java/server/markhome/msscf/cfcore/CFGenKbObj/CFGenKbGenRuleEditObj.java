// Description: Java 11 edit object instance implementation for CFGenKb GenRule.

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

public class CFGenKbGenRuleEditObj
	extends CFGenKbGenItemEditObj

	implements ICFGenKbGenRuleEditObj
{
	protected ICFGenKbGelExecutableObj optionalComponentsBodyGel;

	public CFGenKbGenRuleEditObj( ICFGenKbGenRuleObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGenRuleObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenRule" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
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

	public ICFGenKbGenItemObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGenRuleObj retobj = getSchema().getGenRuleTableObj().realiseGenRule( (ICFGenKbGenRuleObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGenRule().forget();
	}

	public ICFGenKbGenItemObj create() {
		copyBuffToOrig();
		ICFGenKbGenRuleObj retobj = ((ICFGenKbSchemaObj)getOrigAsGenRule().getSchema()).getGenRuleTableObj().createGenRule( getOrigAsGenRule() );
		if( retobj == getOrigAsGenRule() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGenItemEditObj update() {
		getSchema().getGenRuleTableObj().updateGenRule( (ICFGenKbGenRuleObj)this );
		return( null );
	}

	public CFGenKbGenItemEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGenRuleTableObj().deleteGenRule( getOrigAsGenRule() );
		return( null );
	}

	public ICFGenKbGenRuleTableObj getGenRuleTable() {
		return( orig.getSchema().getGenRuleTableObj() );
	}

	public ICFGenKbGenRuleEditObj getEditAsGenRule() {
		return( (ICFGenKbGenRuleEditObj)this );
	}

	public ICFGenKbGenRuleObj getOrigAsGenRule() {
		return( (ICFGenKbGenRuleObj)orig );
	}

	public CFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGenRule().getSchema().getBackingStore()).getFactoryGenRule().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGenItemBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGenRuleBuff getGenRuleBuff() {
		return( (CFGenKbGenRuleBuff)getBuff() );
	}

	public String getRequiredDefinedNear() {
		return( getGenRuleBuff().getRequiredDefinedNear() );
	}

	public void setRequiredDefinedNear( String value ) {
		if( getGenRuleBuff().getRequiredDefinedNear() != value ) {
			getGenRuleBuff().setRequiredDefinedNear( value );
		}
	}

	public String getRequiredBody() {
		return( getGenRuleBuff().getRequiredBody() );
	}

	public void setRequiredBody( String value ) {
		if( getGenRuleBuff().getRequiredBody() != value ) {
			getGenRuleBuff().setRequiredBody( value );
		}
	}

	public Long getOptionalBodyTenantId() {
		return( getGenRuleBuff().getOptionalBodyTenantId() );
	}

	public Long getOptionalBodyGelCacheId() {
		return( getGenRuleBuff().getOptionalBodyGelCacheId() );
	}

	public Long getOptionalBodyGelId() {
		return( getGenRuleBuff().getOptionalBodyGelId() );
	}

	public ICFGenKbGelExecutableObj getOptionalComponentsBodyGel() {
		return( getOptionalComponentsBodyGel( false ) );
	}

	public ICFGenKbGelExecutableObj getOptionalComponentsBodyGel( boolean forceRead ) {
		if( forceRead || ( optionalComponentsBodyGel == null ) ) {
			boolean anyMissing = false;
			if( getGenRuleBuff().getOptionalBodyTenantId() == null ) {
				anyMissing = true;
			}
			if( getGenRuleBuff().getOptionalBodyGelCacheId() == null ) {
				anyMissing = true;
			}
			if( getGenRuleBuff().getOptionalBodyGelId() == null ) {
				anyMissing = true;
			}
			if( ! anyMissing ) {
				ICFGenKbGelExecutableObj obj = ((ICFGenKbSchemaObj)getOrigAsGenRule().getSchema()).getGelExecutableTableObj().readGelExecutableByPIdx( getGenRuleBuff().getOptionalBodyTenantId(),
					getGenRuleBuff().getOptionalBodyGelCacheId(),
					getGenRuleBuff().getOptionalBodyGelId() );
				optionalComponentsBodyGel = obj;
			}
		}
		return( optionalComponentsBodyGel );
	}

	public void setOptionalComponentsBodyGel( ICFGenKbGelExecutableObj value ) {
			if( buff == null ) {
				getGenRuleBuff();
			}
			if( value != null ) {
				getGenRuleBuff().setOptionalBodyTenantId( value.getRequiredTenantId() );
				getGenRuleBuff().setOptionalBodyGelCacheId( value.getRequiredGelCacheId() );
				getGenRuleBuff().setOptionalBodyGelId( value.getRequiredGelInstId() );
			}
			else {
				getGenRuleBuff().setOptionalBodyTenantId( null );
				getGenRuleBuff().setOptionalBodyGelCacheId( null );
				getGenRuleBuff().setOptionalBodyGelId( null );
			}
			optionalComponentsBodyGel = value;
	}

	public void copyBuffToOrig() {
		CFGenKbGenRuleBuff origBuff = getOrigAsGenRule().getGenRuleBuff();
		CFGenKbGenRuleBuff myBuff = getGenRuleBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGenRuleBuff origBuff = getOrigAsGenRule().getGenRuleBuff();
		CFGenKbGenRuleBuff myBuff = getGenRuleBuff();
		myBuff.set( origBuff );
	}
}
