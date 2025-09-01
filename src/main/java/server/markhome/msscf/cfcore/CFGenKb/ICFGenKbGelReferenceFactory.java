
// Description: Java 11 Factory interface for GelReference.

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
 *	CFGenKbGelReferenceFactory interface for GelReference
 */
public interface ICFGenKbGelReferenceFactory
{

	/**
	 *	Allocate a RemainderIdx key over GelReference instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelReferenceByRemainderIdxKey newRemainderIdxKey();

	/**
	 *	Allocate a GelReference instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelReferenceBuff newBuff();

}
