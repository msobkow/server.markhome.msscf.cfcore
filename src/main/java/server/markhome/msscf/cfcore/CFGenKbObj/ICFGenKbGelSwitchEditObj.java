// Description: Java 11 Instance Edit Object interface for CFGenKb GelSwitch.

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

public interface ICFGenKbGelSwitchEditObj
	extends ICFGenKbGelSwitchObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelSwitchObj.
	 */
	ICFGenKbGelSwitchObj getOrigAsGelSwitch();

	/**
	 *	Get the required String attribute ValueExpansion.
	 *
	 *	@return	The String value of the attribute ValueExpansion.
	 */
	String getRequiredValueExpansion();

	/**
	 *	Set the required String attribute ValueExpansion.
	 *
	 *	@param	value	the String value of the attribute ValueExpansion.
	 */
	void setRequiredValueExpansion( String value );

	/**
	 *	Get the optional String attribute NilExpansion.
	 *
	 *	@return	The String value of the attribute NilExpansion.
	 */
	String getOptionalNilExpansion();

	/**
	 *	Set the optional String attribute NilExpansion.
	 *
	 *	@param	value	the String value of the attribute NilExpansion.
	 */
	void setOptionalNilExpansion( String value );

	/**
	 *	Get the optional String attribute EmptyExpansion.
	 *
	 *	@return	The String value of the attribute EmptyExpansion.
	 */
	String getOptionalEmptyExpansion();

	/**
	 *	Set the optional String attribute EmptyExpansion.
	 *
	 *	@param	value	the String value of the attribute EmptyExpansion.
	 */
	void setOptionalEmptyExpansion( String value );

	/**
	 *	Get the required String attribute DefaultExpansion.
	 *
	 *	@return	The String value of the attribute DefaultExpansion.
	 */
	String getRequiredDefaultExpansion();

	/**
	 *	Set the required String attribute DefaultExpansion.
	 *
	 *	@param	value	the String value of the attribute DefaultExpansion.
	 */
	void setRequiredDefaultExpansion( String value );
}
