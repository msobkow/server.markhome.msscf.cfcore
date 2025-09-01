// Description: Java 11 edit object instance implementation for CFGenKb GenBind.

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

public class CFGenKbGenBindEditObj
	extends CFGenKbGenItemEditObj

	implements ICFGenKbGenBindEditObj
{

	public CFGenKbGenBindEditObj( ICFGenKbGenBindObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGenBindObj.CLASS_CODE );
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
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGenBindObj retobj = getSchema().getGenBindTableObj().realiseGenBind( (ICFGenKbGenBindObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGenBind().forget();
	}

	public ICFGenKbGenItemObj create() {
		copyBuffToOrig();
		ICFGenKbGenBindObj retobj = ((ICFGenKbSchemaObj)getOrigAsGenBind().getSchema()).getGenBindTableObj().createGenBind( getOrigAsGenBind() );
		if( retobj == getOrigAsGenBind() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGenItemEditObj update() {
		getSchema().getGenBindTableObj().updateGenBind( (ICFGenKbGenBindObj)this );
		return( null );
	}

	public CFGenKbGenItemEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGenBindTableObj().deleteGenBind( getOrigAsGenBind() );
		return( null );
	}

	public ICFGenKbGenBindTableObj getGenBindTable() {
		return( orig.getSchema().getGenBindTableObj() );
	}

	public ICFGenKbGenBindEditObj getEditAsGenBind() {
		return( (ICFGenKbGenBindEditObj)this );
	}

	public ICFGenKbGenBindObj getOrigAsGenBind() {
		return( (ICFGenKbGenBindObj)orig );
	}

	public CFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGenBind().getSchema().getBackingStore()).getFactoryGenBind().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGenItemBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGenBindBuff getGenBindBuff() {
		return( (CFGenKbGenBindBuff)getBuff() );
	}

	public void copyBuffToOrig() {
		CFGenKbGenBindBuff origBuff = getOrigAsGenBind().getGenBindBuff();
		CFGenKbGenBindBuff myBuff = getGenBindBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGenBindBuff origBuff = getOrigAsGenBind().getGenBindBuff();
		CFGenKbGenBindBuff myBuff = getGenBindBuff();
		myBuff.set( origBuff );
	}
}
