// Description: Java 11 edit object instance implementation for CFGenKb GelSpread.

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

public class CFGenKbGelSpreadEditObj
	extends CFGenKbGelInstructionEditObj

	implements ICFGenKbGelSpreadEditObj
{

	public CFGenKbGelSpreadEditObj( ICFGenKbGelSpreadObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGelSpreadObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelSpread" );
	}

	public ICFLibAnyObj getScope() {
		return( super.getScope() );
	}

	public ICFLibAnyObj getObjScope() {
		return( super.getObjScope() );
	}

	public String getObjName() {
		String objName;
		long val = getRequiredGelInstId();
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

	public ICFGenKbGelInstructionObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFGenKbGelSpreadObj retobj = getSchema().getGelSpreadTableObj().realiseGelSpread( (ICFGenKbGelSpreadObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelSpread().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelSpreadObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelSpread().getSchema()).getGelSpreadTableObj().createGelSpread( getOrigAsGelSpread() );
		if( retobj == getOrigAsGelSpread() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelSpreadTableObj().updateGelSpread( (ICFGenKbGelSpreadObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelSpreadTableObj().deleteGelSpread( getOrigAsGelSpread() );
		return( null );
	}

	public ICFGenKbGelSpreadTableObj getGelSpreadTable() {
		return( orig.getSchema().getGelSpreadTableObj() );
	}

	public ICFGenKbGelSpreadEditObj getEditAsGelSpread() {
		return( (ICFGenKbGelSpreadEditObj)this );
	}

	public ICFGenKbGelSpreadObj getOrigAsGelSpread() {
		return( (ICFGenKbGelSpreadObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelSpread().getSchema().getBackingStore()).getFactoryGelSpread().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGelSpreadBuff getGelSpreadBuff() {
		return( (CFGenKbGelSpreadBuff)getBuff() );
	}

	public String getRequiredIteratorName() {
		return( getGelSpreadBuff().getRequiredIteratorName() );
	}

	public void setRequiredIteratorName( String value ) {
		if( getGelSpreadBuff().getRequiredIteratorName() != value ) {
			getGelSpreadBuff().setRequiredIteratorName( value );
		}
	}

	public String getOptionalExpandBetween() {
		return( getGelSpreadBuff().getOptionalExpandBetween() );
	}

	public void setOptionalExpandBetween( String value ) {
		if( getGelSpreadBuff().getOptionalExpandBetween() != value ) {
			getGelSpreadBuff().setOptionalExpandBetween( value );
		}
	}

	public String getOptionalExpandBefore() {
		return( getGelSpreadBuff().getOptionalExpandBefore() );
	}

	public void setOptionalExpandBefore( String value ) {
		if( getGelSpreadBuff().getOptionalExpandBefore() != value ) {
			getGelSpreadBuff().setOptionalExpandBefore( value );
		}
	}

	public String getOptionalExpandFirst() {
		return( getGelSpreadBuff().getOptionalExpandFirst() );
	}

	public void setOptionalExpandFirst( String value ) {
		if( getGelSpreadBuff().getOptionalExpandFirst() != value ) {
			getGelSpreadBuff().setOptionalExpandFirst( value );
		}
	}

	public String getRequiredExpandEach() {
		return( getGelSpreadBuff().getRequiredExpandEach() );
	}

	public void setRequiredExpandEach( String value ) {
		if( getGelSpreadBuff().getRequiredExpandEach() != value ) {
			getGelSpreadBuff().setRequiredExpandEach( value );
		}
	}

	public String getOptionalExpandLast() {
		return( getGelSpreadBuff().getOptionalExpandLast() );
	}

	public void setOptionalExpandLast( String value ) {
		if( getGelSpreadBuff().getOptionalExpandLast() != value ) {
			getGelSpreadBuff().setOptionalExpandLast( value );
		}
	}

	public String getOptionalExpandLone() {
		return( getGelSpreadBuff().getOptionalExpandLone() );
	}

	public void setOptionalExpandLone( String value ) {
		if( getGelSpreadBuff().getOptionalExpandLone() != value ) {
			getGelSpreadBuff().setOptionalExpandLone( value );
		}
	}

	public String getOptionalExpandEmpty() {
		return( getGelSpreadBuff().getOptionalExpandEmpty() );
	}

	public void setOptionalExpandEmpty( String value ) {
		if( getGelSpreadBuff().getOptionalExpandEmpty() != value ) {
			getGelSpreadBuff().setOptionalExpandEmpty( value );
		}
	}

	public String getOptionalExpandAfter() {
		return( getGelSpreadBuff().getOptionalExpandAfter() );
	}

	public void setOptionalExpandAfter( String value ) {
		if( getGelSpreadBuff().getOptionalExpandAfter() != value ) {
			getGelSpreadBuff().setOptionalExpandAfter( value );
		}
	}

	public void copyBuffToOrig() {
		CFGenKbGelSpreadBuff origBuff = getOrigAsGelSpread().getGelSpreadBuff();
		CFGenKbGelSpreadBuff myBuff = getGelSpreadBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelSpreadBuff origBuff = getOrigAsGelSpread().getGelSpreadBuff();
		CFGenKbGelSpreadBuff myBuff = getGelSpreadBuff();
		myBuff.set( origBuff );
	}
}
