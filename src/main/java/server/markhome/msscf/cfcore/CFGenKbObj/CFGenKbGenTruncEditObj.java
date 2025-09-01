// Description: Java 11 edit object instance implementation for CFGenKb GenTrunc.

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

public class CFGenKbGenTruncEditObj
	extends CFGenKbGenRuleEditObj

	implements ICFGenKbGenTruncEditObj
{

	public CFGenKbGenTruncEditObj( ICFGenKbGenTruncObj argOrig ) {
		super( argOrig );
	}

	public String getClassCode() {
		return( CFGenKbGenTruncObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "GenTrunc" );
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
		ICFGenKbGenTruncObj retobj = getSchema().getGenTruncTableObj().realiseGenTrunc( (ICFGenKbGenTruncObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsGenTrunc().forget();
	}

	public ICFGenKbGenItemObj create() {
		copyBuffToOrig();
		ICFGenKbGenTruncObj retobj = ((ICFGenKbSchemaObj)getOrigAsGenTrunc().getSchema()).getGenTruncTableObj().createGenTrunc( getOrigAsGenTrunc() );
		if( retobj == getOrigAsGenTrunc() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFGenKbGenItemEditObj update() {
		getSchema().getGenTruncTableObj().updateGenTrunc( (ICFGenKbGenTruncObj)this );
		return( null );
	}

	public CFGenKbGenItemEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getGenTruncTableObj().deleteGenTrunc( getOrigAsGenTrunc() );
		return( null );
	}

	public ICFGenKbGenTruncTableObj getGenTruncTable() {
		return( orig.getSchema().getGenTruncTableObj() );
	}

	public ICFGenKbGenTruncEditObj getEditAsGenTrunc() {
		return( (ICFGenKbGenTruncEditObj)this );
	}

	public ICFGenKbGenTruncObj getOrigAsGenTrunc() {
		return( (ICFGenKbGenTruncObj)orig );
	}

	public CFGenKbGenItemBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFGenKbSchema)getOrigAsGenTrunc().getSchema().getBackingStore()).getFactoryGenTrunc().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFGenKbGenItemBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
		}
	}

	public CFGenKbGenTruncBuff getGenTruncBuff() {
		return( (CFGenKbGenTruncBuff)getBuff() );
	}

	public int getRequiredTruncateAt() {
		return( getGenTruncBuff().getRequiredTruncateAt() );
	}

	public void setRequiredTruncateAt( int value ) {
		if( getGenTruncBuff().getRequiredTruncateAt() != value ) {
			getGenTruncBuff().setRequiredTruncateAt( value );
		}
	}

	public void copyBuffToOrig() {
		CFGenKbGenTruncBuff origBuff = getOrigAsGenTrunc().getGenTruncBuff();
		CFGenKbGenTruncBuff myBuff = getGenTruncBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFGenKbGenTruncBuff origBuff = getOrigAsGenTrunc().getGenTruncBuff();
		CFGenKbGenTruncBuff myBuff = getGenTruncBuff();
		myBuff.set( origBuff );
	}
}
