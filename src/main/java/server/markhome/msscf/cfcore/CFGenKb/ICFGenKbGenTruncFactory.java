
// Description: Java 11 Factory interface for GenTrunc.

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
 *	CFGenKbGenTruncFactory interface for GenTrunc
 */
public interface ICFGenKbGenTruncFactory
{

	/**
	 *	Allocate a GenTrunc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGenTruncBuff newBuff();

}
