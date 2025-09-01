// Description: Java 11 edit object instance implementation for CFGenKb RuleType.

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

public class CFGenKbRuleTypeEditObj
	implements ICFGenKbRuleTypeEditObj
{
	protected ICFGenKbRuleTypeObj orig;
	protected CFGenKbRuleTypeBuff buff;

	public CFGenKbRuleTypeEditObj( ICFGenKbRuleTypeObj argOrig ) {
		orig = argOrig;
		getBuff();
		CFGenKbRuleTypeBuff origBuff = orig.getBuff();
		buff.set( origBuff );
	}

	public String getClassCode() {
		return( CFGenKbRuleTypeObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbRuleTypeObj retobj = getSchema().getRuleTypeTableObj().realiseRuleType( (ICFGenKbRuleTypeObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsRuleType().forget();
	}

	public ICFGenKbRuleTypeObj read() {
		ICFGenKbRuleTypeObj retval = getOrigAsRuleType().read();
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFGenKbRuleTypeObj read( boolean forceRead ) {
		ICFGenKbRuleTypeObj retval = getOrigAsRuleType().read( forceRead );
		if( retval != orig ) {
			throw new CFLibUsageException( getClass(),
				"read",
				"retval != orig" );
		}
		copyOrigToBuff();
		return( retval );
	}

	public ICFGenKbRuleTypeObj create() {
		copyBuffToOrig();
		ICFGenKbRuleTypeObj retobj = ((ICFGenKbSchemaObj)getOrigAsRuleType().getSchema()).getRuleTypeTableObj().createRuleType( getOrigAsRuleType() );
		if( retobj == getOrigAsRuleType() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbRuleTypeEditObj update() {
		getSchema().getRuleTypeTableObj().updateRuleType( (ICFGenKbRuleTypeObj)this );
		return( null );
	}

	public CFGenKbRuleTypeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getRuleTypeTableObj().deleteRuleType( getOrigAsRuleType() );
		return( null );
	}

	public ICFGenKbRuleTypeTableObj getRuleTypeTable() {
		return( orig.getSchema().getRuleTypeTableObj() );
	}

	public ICFGenKbRuleTypeEditObj getEdit() {
		return( (ICFGenKbRuleTypeEditObj)this );
	}

	public ICFGenKbRuleTypeEditObj getEditAsRuleType() {
		return( (ICFGenKbRuleTypeEditObj)this );
	}

	public ICFGenKbRuleTypeEditObj beginEdit() {
		throw new CFLibUsageException( getClass(), "beginEdit", "Cannot edit an edition" );
	}

	public void endEdit() {
		orig.endEdit();
	}

	public ICFGenKbRuleTypeObj getOrig() {
		return( orig );
	}

	public ICFGenKbRuleTypeObj getOrigAsRuleType() {
		return( (ICFGenKbRuleTypeObj)orig );
	}

	public ICFGenKbSchemaObj getSchema() {
		return( orig.getSchema() );
	}

	public CFGenKbRuleTypeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsRuleType().getSchema().getBackingStore()).getFactoryRuleType().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbRuleTypeBuff value ) {
		if( buff != value ) {
			buff = value;
		}
	}

	public CFGenKbRuleTypeBuff getRuleTypeBuff() {
		return( (CFGenKbRuleTypeBuff)getBuff() );
	}

	public CFGenKbRuleTypePKey getPKey() {
		return( orig.getPKey() );
	}

	public void setPKey( CFGenKbRuleTypePKey value ) {
		orig.setPKey( value );
		copyPKeyToBuff();
	}

	public boolean getIsNew() {
		return( orig.getIsNew() );
	}

	public void setIsNew( boolean value ) {
		orig.setIsNew( value );
	}

	public short getRequiredId() {
		return( getPKey().getRequiredId() );
	}

	public String getRequiredName() {
		return( getRuleTypeBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getRuleTypeBuff().getRequiredName() != value ) {
			getRuleTypeBuff().setRequiredName( value );
		}
	}

	public void copyPKeyToBuff() {
		buff.setRequiredId( getPKey().getRequiredId() );
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredId( buff.getRequiredId() );
	}

	public void copyBuffToOrig() {
		CFGenKbRuleTypeBuff origBuff = getOrigAsRuleType().getRuleTypeBuff();
		CFGenKbRuleTypeBuff myBuff = getRuleTypeBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbRuleTypeBuff origBuff = getOrigAsRuleType().getRuleTypeBuff();
		CFGenKbRuleTypeBuff myBuff = getRuleTypeBuff();
		myBuff.set( origBuff );
	}
}
