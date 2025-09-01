
// Description: Java 11 Factory interface for GelCall.

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
 *	CFGenKbGelCallFactory interface for GelCall
 */
public interface ICFGenKbGelCallFactory
{

	/**
	 *	Allocate a CacheIdx key over GelCall instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCallByCacheIdxKey newCacheIdxKey();

	/**
	 *	Allocate a SeqIdx key over GelCall instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCallBySeqIdxKey newSeqIdxKey();

	/**
	 *	Allocate a CallInstIdx key over GelCall instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCallByCallInstIdxKey newCallInstIdxKey();

	/**
	 *	Allocate a PrevInstIdx key over GelCall instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCallByPrevInstIdxKey newPrevInstIdxKey();

	/**
	 *	Allocate a NextInstIdx key over GelCall instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCallByNextInstIdxKey newNextInstIdxKey();

	/**
	 *	Allocate a GelCall instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelCallBuff newBuff();

}
