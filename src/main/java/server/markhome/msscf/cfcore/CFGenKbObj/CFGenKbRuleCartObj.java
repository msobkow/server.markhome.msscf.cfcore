// Description: Java 11 base object instance implementation for CFGenKb RuleCart.

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

public class CFGenKbRuleCartObj
	implements ICFGenKbRuleCartObj
{
	public final static String CLASS_CODE = "a925";
	protected boolean isNew;
	protected ICFGenKbRuleCartEditObj edit;
	protected ICFGenKbSchemaObj schema;
	protected CFGenKbRuleCartPKey pKey;
	protected CFGenKbRuleCartBuff buff;
	protected ICFGenKbTenantObj requiredContainerTenant;

	public CFGenKbRuleCartObj() {
		isNew = true;
		requiredContainerTenant = null;
	}

	public CFGenKbRuleCartObj( ICFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
		requiredContainerTenant = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RuleCart" );
	}

	public ICFLibAnyObj getScope() {
		ICFGenKbTenantObj scope = getRequiredContainerTenant();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFGenKbTenantObj scope = getRequiredContainerTenant();
		return( scope );
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

	public ICFGenKbRuleCartObj realise() {
		ICFGenKbRuleCartObj retobj = ((ICFGenKbSchemaObj)schema).getRuleCartTableObj().realiseRuleCart(
			(ICFGenKbRuleCartObj)this );
		return( (ICFGenKbRuleCartObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getRuleCartTableObj().reallyDeepDisposeRuleCart( (ICFGenKbRuleCartObj)this );
	}

	public ICFGenKbRuleCartObj read() {
		ICFGenKbRuleCartObj retobj = ((ICFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), false );
		return( (ICFGenKbRuleCartObj)retobj );
	}

	public ICFGenKbRuleCartObj read( boolean forceRead ) {
		ICFGenKbRuleCartObj retobj = ((ICFGenKbSchemaObj)schema).getRuleCartTableObj().readRuleCartByIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredId(), forceRead );
		return( (ICFGenKbRuleCartObj)retobj );
	}

	public ICFGenKbRuleCartTableObj getRuleCartTable() {
		return( ((ICFGenKbSchemaObj)schema).getRuleCartTableObj() );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = value;
	}

	public CFGenKbRuleCartBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByIdIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFGenKbRuleCartBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFGenKbRuleCartBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbRuleCartBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredContainerTenant = null;
	}

	public CFGenKbRuleCartBuff getRuleCartBuff() {
		return( (CFGenKbRuleCartBuff)getBuff() );
	}

	public CFGenKbRuleCartPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFGenKbRuleCartPKey value ) {
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

	public ICFGenKbRuleCartEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbRuleCartObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbRuleCartObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getRuleCartTableObj().lockRuleCart( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getRuleCartTableObj().newEditInstance( lockobj );
		return( (ICFGenKbRuleCartEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFGenKbRuleCartEditObj getEdit() {
		return( edit );
	}

	public ICFGenKbRuleCartEditObj getEditAsRuleCart() {
		return( (ICFGenKbRuleCartEditObj)edit );
	}

	public long getRequiredTenantId() {
		return( getPKey().getRequiredTenantId() );
	}

	public long getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getRuleCartBuff().getRequiredName() );
	}

	public String getOptionalDescr() {
		return( getRuleCartBuff().getOptionalDescr() );
	}

	public String getOptionalRevisionString() {
		return( getRuleCartBuff().getOptionalRevisionString() );
	}

	public ICFGenKbTenantObj getRequiredContainerTenant() {
		return( getRequiredContainerTenant( false ) );
	}

	public ICFGenKbTenantObj getRequiredContainerTenant( boolean forceRead ) {
		if( ( requiredContainerTenant == null ) || forceRead ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				requiredContainerTenant = ((ICFGenKbSchemaObj)schema).getTenantTableObj().readTenantByIdIdx( getPKey().getRequiredTenantId(), forceRead );
			}
		}
		return( requiredContainerTenant );
	}

	public List<ICFGenKbGenItemObj> getOptionalComponentsRule() {
		List<ICFGenKbGenItemObj> retval;
		retval = ((ICFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByCartIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFGenKbGenItemObj> getOptionalComponentsRule( boolean forceRead ) {
		List<ICFGenKbGenItemObj> retval;
		retval = ((ICFGenKbSchemaObj)schema).getGenItemTableObj().readGenItemByCartIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredTenantId( getPKey().getRequiredTenantId() );
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredTenantId( buff.getRequiredTenantId() );
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}
