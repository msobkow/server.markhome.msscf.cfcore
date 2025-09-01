// Description: Java 11 edit object instance implementation for CFGenKb GelError.

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

public class CFGenKbGelErrorEditObj
	extends CFGenKbGelBoilerplateEditObj

	implements ICFGenKbGelErrorEditObj
{

	public CFGenKbGelErrorEditObj( ICFGenKbGelErrorObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGelErrorObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GelError" );
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
		ICFGenKbGelErrorObj retobj = getSchema().getGelErrorTableObj().realiseGelError( (ICFGenKbGelErrorObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGelError().forget();
	}

	public ICFGenKbGelInstructionObj create() {
		copyBuffToOrig();
		ICFGenKbGelErrorObj retobj = ((ICFGenKbSchemaObj)getOrigAsGelError().getSchema()).getGelErrorTableObj().createGelError( getOrigAsGelError() );
		if( retobj == getOrigAsGelError() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGelInstructionEditObj update() {
		getSchema().getGelErrorTableObj().updateGelError( (ICFGenKbGelErrorObj)this );
		return( null );
	}

	public CFGenKbGelInstructionEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGelErrorTableObj().deleteGelError( getOrigAsGelError() );
		return( null );
	}

	public ICFGenKbGelErrorTableObj getGelErrorTable() {
		return( orig.getSchema().getGelErrorTableObj() );
	}

	public ICFGenKbGelErrorEditObj getEditAsGelError() {
		return( (ICFGenKbGelErrorEditObj)this );
	}

	public ICFGenKbGelErrorObj getOrigAsGelError() {
		return( (ICFGenKbGelErrorObj)orig );
	}

	public CFGenKbGelInstructionBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGelError().getSchema().getBackingStore()).getFactoryGelError().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGelInstructionBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGelErrorBuff getGelErrorBuff() {
		return( (CFGenKbGelErrorBuff)getBuff() );
	}

	public void copyBuffToOrig() {
		CFGenKbGelErrorBuff origBuff = getOrigAsGelError().getGelErrorBuff();
		CFGenKbGelErrorBuff myBuff = getGelErrorBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGelErrorBuff origBuff = getOrigAsGelError().getGelErrorBuff();
		CFGenKbGelErrorBuff myBuff = getGelErrorBuff();
		myBuff.set( origBuff );
	}
}
