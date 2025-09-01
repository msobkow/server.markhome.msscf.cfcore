
// Description: Java 11 Factory interface for GelSwitchLimb.

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
 *	CFGenKbGelSwitchLimbFactory interface for GelSwitchLimb
 */
public interface ICFGenKbGelSwitchLimbFactory
{

	/**
	 *	Allocate a primary key for GelSwitchLimb instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSwitchLimbPKey newPKey();

	/**
	 *	Allocate a TenantIdx key over GelSwitchLimb instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSwitchLimbByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a SwitchIdx key over GelSwitchLimb instances.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSwitchLimbBySwitchIdxKey newSwitchIdxKey();

	/**
	 *	Allocate a GelSwitchLimb instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFGenKbGelSwitchLimbBuff newBuff();

}
