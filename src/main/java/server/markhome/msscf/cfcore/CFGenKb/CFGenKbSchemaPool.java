// Description: Java 11 implementation of a CFGenKb schema pool.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKb;

import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;

public class CFGenKbSchemaPool
{

	protected volatile static CFGenKbSchemaPool schemaPool = null;
	protected String jndiName = null;
	protected CFGenKbConfigurationFile configFile = null;
	protected LinkedList<ICFGenKbSchema> instances = new LinkedList<ICFGenKbSchema>();
	public CFGenKbSchemaPool() {
	}

	public static CFGenKbSchemaPool getSchemaPool() {
		return( schemaPool );
	}

	public static void setSchemaPool( CFGenKbSchemaPool pool ) {
		if( schemaPool == null ) {
			schemaPool = pool;
		}

	}

	public CFGenKbConfigurationFile getConfigurationFile() {
		return( configFile );
	}

	public void setConfigurationFile( CFGenKbConfigurationFile value ) {
		
		configFile = value;
	}


	/**
	 *	Retrieve an entry from the pool with a previously
	 *	established database connection.
	 */
	public synchronized ICFGenKbSchema getInstance() {
		ICFGenKbSchema retInst = null;
		if( instances != null ) {
			if( instances.isEmpty() ) {
				retInst = newInstance();
				retInst.setConfigurationFile( (CFGenKbConfigurationFile)getConfigurationFile() );
				retInst.setJndiName( getJndiName() );
				retInst.connect();
			}
			else {
				retInst = instances.removeFirst();
			}
		}
		else {
			retInst = null;
		}
		return( retInst );
	}

	/**
	 *	Return an entry to the pool.
	 */
	public synchronized void releaseInstance( ICFGenKbSchema inst ) {
		if( inst == null ) {
			return;
		}
		inst.rollback();
		if( instances != null ) {
			if( ! instances.contains( inst ) ) {
				instances.addFirst( inst );
			}
		}
	}

	/**
	 *	You need to overload the implementation of newInstance() to return
	 *	connected instances of your backing store.
	 */
	public ICFGenKbSchema newInstance() {
		ICFGenKbSchema retInst = new CFGenKbSchema();
		return( retInst );
	}

	/**
	 *	Overload disposeInstance().
	 */
	public void disposeInstance( ICFGenKbSchema inst ) {
		try {
			inst.disconnect( false );
		}
		catch( RuntimeException e ) {
		}
		if( instances != null ) {
			if( ! instances.contains( inst ) ) {
				instances.addFirst( inst );
			}
		}
	}

	public String getJndiName() {
		return( jndiName );
	}

	public void setJndiName( String value ) {
		jndiName = value;
		if( ( jndiName != null ) && ( jndiName.length() > 0 ) ) {
			configFile = null;
		}
	}

}
