// Description: Java 11 Instance Edit Object interface for CFGenKb Cluster.

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

public interface ICFGenKbClusterEditObj
	extends ICFGenKbClusterObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFGenKbClusterObj.
	 */
	ICFGenKbClusterObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbClusterObj.
	 */
	ICFGenKbClusterObj getOrigAsCluster();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFGenKbClusterObj create();

	/*
	 *	Update the instance.
	 */
	CFGenKbClusterEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFGenKbClusterEditObj deleteInstance();

	/**
	 *	Get the required String attribute FullDomName.
	 *
	 *	@return	The String value of the attribute FullDomName.
	 */
	String getRequiredFullDomName();

	/**
	 *	Set the required String attribute FullDomName.
	 *
	 *	@param	value	the String value of the attribute FullDomName.
	 */
	void setRequiredFullDomName( String value );

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The String value of the attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Set the required String attribute Description.
	 *
	 *	@param	value	the String value of the attribute Description.
	 */
	void setRequiredDescription( String value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFGenKbSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFGenKbSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFGenKbSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
