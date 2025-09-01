// Description: Java 11 base object instance implementation for CFGenKb RuleType.

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

public class CFGenKbRuleTypeObj
	implements ICFGenKbRuleTypeObj
{
	public final static String CLASS_CODE = "a926";
	protected boolean isNew;
	protected ICFGenKbRuleTypeEditObj edit;
	protected ICFGenKbSchemaObj schema;
	protected CFGenKbRuleTypePKey pKey;
	protected CFGenKbRuleTypeBuff buff;

	public CFGenKbRuleTypeObj() {
		isNew = true;
	}

	public CFGenKbRuleTypeObj( ICFGenKbSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "RuleType" );
	}

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
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

	public ICFGenKbRuleTypeObj realise() {
		ICFGenKbRuleTypeObj retobj = ((ICFGenKbSchemaObj)schema).getRuleTypeTableObj().realiseRuleType(
			(ICFGenKbRuleTypeObj)this );
		return( (ICFGenKbRuleTypeObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getRuleTypeTableObj().reallyDeepDisposeRuleType( (ICFGenKbRuleTypeObj)this );
	}

	public ICFGenKbRuleTypeObj read() {
		ICFGenKbRuleTypeObj retobj = ((ICFGenKbSchemaObj)schema).getRuleTypeTableObj().readRuleTypeByIdIdx( getPKey().getRequiredId(), false );
		return( (ICFGenKbRuleTypeObj)retobj );
	}

	public ICFGenKbRuleTypeObj read( boolean forceRead ) {
		ICFGenKbRuleTypeObj retobj = ((ICFGenKbSchemaObj)schema).getRuleTypeTableObj().readRuleTypeByIdIdx( getPKey().getRequiredId(), forceRead );
		return( (ICFGenKbRuleTypeObj)retobj );
	}

	public ICFGenKbRuleTypeTableObj getRuleTypeTable() {
		return( ((ICFGenKbSchemaObj)schema).getRuleTypeTableObj() );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = value;
	}

	public CFGenKbRuleTypeBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleType().readDerivedByIdIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFGenKbRuleTypeBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFGenKbRuleTypeBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbRuleTypeBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public CFGenKbRuleTypeBuff getRuleTypeBuff() {
		return( (CFGenKbRuleTypeBuff)getBuff() );
	}

	public CFGenKbRuleTypePKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleType().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFGenKbRuleTypePKey value ) {
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

	public ICFGenKbRuleTypeEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbRuleTypeObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbRuleTypeObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getRuleTypeTableObj().lockRuleType( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getRuleTypeTableObj().newEditInstance( lockobj );
		return( (ICFGenKbRuleTypeEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFGenKbRuleTypeEditObj getEdit() {
		return( edit );
	}

	public ICFGenKbRuleTypeEditObj getEditAsRuleType() {
		return( (ICFGenKbRuleTypeEditObj)edit );
	}

	public short getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getRuleTypeBuff().getRequiredName() );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredId( getPKey().getRequiredId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}
}
