// Description: Java 11 base object instance implementation for CFGenKb GenBind.

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

public class CFGenKbGenBindObj
	extends CFGenKbGenItemObj
	implements ICFGenKbGenBindObj
{
	public final static String CLASS_CODE = "a931";

	public CFGenKbGenBindObj() {
		super();
	}

	public CFGenKbGenBindObj( ICFGenKbSchemaObj argSchema ) {
		super( argSchema );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenBind" );
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
		ICFGenKbGenBindObj retobj = ((ICFGenKbSchemaObj)schema).getGenBindTableObj().realiseGenBind(
			(ICFGenKbGenBindObj)this );
		return( (ICFGenKbGenItemObj)retobj );
	}

	public void forget() {
		((ICFGenKbSchemaObj)schema).getGenBindTableObj().reallyDeepDisposeGenBind( (ICFGenKbGenBindObj)this );
	}

	public ICFGenKbGenItemObj read() {
		ICFGenKbGenBindObj retobj = ((ICFGenKbSchemaObj)schema).getGenBindTableObj().readGenBindByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), false );
		return( (ICFGenKbGenItemObj)retobj );
	}

	public ICFGenKbGenItemObj read( boolean forceRead ) {
		ICFGenKbGenBindObj retobj = ((ICFGenKbSchemaObj)schema).getGenBindTableObj().readGenBindByItemIdIdx( getPKey().getRequiredTenantId(),
			getPKey().getRequiredCartridgeId(),
			getPKey().getRequiredItemId(), forceRead );
		return( (ICFGenKbGenItemObj)retobj );
	}

	public ICFGenKbGenBindTableObj getGenBindTable() {
		return( ((ICFGenKbSchemaObj)schema).getGenBindTableObj() );
	}

	public CFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGenBind().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGenBind().readDerivedByItemIdIdx( ((ICFGenKbSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredTenantId(),
						getPKey().getRequiredCartridgeId(),
						getPKey().getRequiredItemId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFGenKbGenItemBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFGenKbGenBindBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFGenKbGenBindBuff" );
		}
		buff = value;
		copyBuffToPKey();
		requiredOwnerTenant = null;
		requiredContainerCartridge = null;
		requiredLookupRuleType = null;
		requiredLookupToolSet = null;
		optionalLookupScopeDef = null;
		requiredLookupGenDef = null;
		optionalLookupProbe = null;
	}

	public CFGenKbGenBindBuff getGenBindBuff() {
		return( (CFGenKbGenBindBuff)getBuff() );
	}

	public ICFGenKbGenItemEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFGenKbGenBindObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFGenKbGenBindObj)this;
		}
		else {
			lockobj = ((ICFGenKbSchemaObj)schema).getGenBindTableObj().lockGenBind( getPKey() );
		}
		edit = ((ICFGenKbSchemaObj)schema).getGenBindTableObj().newEditInstance( lockobj );
		return( (ICFGenKbGenItemEditObj)edit );
	}

	public ICFGenKbGenBindEditObj getEditAsGenBind() {
		return( (ICFGenKbGenBindEditObj)edit );
	}
}
