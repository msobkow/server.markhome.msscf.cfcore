// Description: Java 11 edit object instance implementation for CFGenKb GenIterator.

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

public class CFGenKbGenIteratorEditObj
	extends CFGenKbGenItemEditObj

	implements ICFGenKbGenIteratorEditObj
{

	public CFGenKbGenIteratorEditObj( ICFGenKbGenIteratorObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGenIteratorObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenIterator" );
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
		ICFGenKbGenIteratorObj retobj = getSchema().getGenIteratorTableObj().realiseGenIterator( (ICFGenKbGenIteratorObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGenIterator().forget();
	}

	public ICFGenKbGenItemObj create() {
		copyBuffToOrig();
		ICFGenKbGenIteratorObj retobj = ((ICFGenKbSchemaObj)getOrigAsGenIterator().getSchema()).getGenIteratorTableObj().createGenIterator( getOrigAsGenIterator() );
		if( retobj == getOrigAsGenIterator() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGenItemEditObj update() {
		getSchema().getGenIteratorTableObj().updateGenIterator( (ICFGenKbGenIteratorObj)this );
		return( null );
	}

	public CFGenKbGenItemEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGenIteratorTableObj().deleteGenIterator( getOrigAsGenIterator() );
		return( null );
	}

	public ICFGenKbGenIteratorTableObj getGenIteratorTable() {
		return( orig.getSchema().getGenIteratorTableObj() );
	}

	public ICFGenKbGenIteratorEditObj getEditAsGenIterator() {
		return( (ICFGenKbGenIteratorEditObj)this );
	}

	public ICFGenKbGenIteratorObj getOrigAsGenIterator() {
		return( (ICFGenKbGenIteratorObj)orig );
	}

	public CFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGenIterator().getSchema().getBackingStore()).getFactoryGenIterator().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGenItemBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGenIteratorBuff getGenIteratorBuff() {
		return( (CFGenKbGenIteratorBuff)getBuff() );
	}

	public void copyBuffToOrig() {
		CFGenKbGenIteratorBuff origBuff = getOrigAsGenIterator().getGenIteratorBuff();
		CFGenKbGenIteratorBuff myBuff = getGenIteratorBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGenIteratorBuff origBuff = getOrigAsGenIterator().getGenIteratorBuff();
		CFGenKbGenIteratorBuff myBuff = getGenIteratorBuff();
		myBuff.set( origBuff );
	}
}
