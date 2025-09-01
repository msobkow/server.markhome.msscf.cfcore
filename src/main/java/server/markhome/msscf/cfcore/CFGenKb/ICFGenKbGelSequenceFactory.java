
// Description: Java 11 Factory interface for GelSequence.

/*
 *	server.markhome.msscf.CFCore
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfcore.CFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;

/*
 *	CFGenKbGelSequenceFactory interface for GelSequence
 */
public interface ICFGenKbGelSequenceFactory
{

	/**
	 *	Allocate a FirstInstIdx key over GelSequence instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSequenceByFirstInstIdxKey newFirstInstIdxKey();

	/**
	 *	Allocate a LastInstIdx key over GelSequence instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSequenceByLastInstIdxKey newLastInstIdxKey();

	/**
	 *	Allocate a GelSequence instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSequenceBuff newBuff();

}
