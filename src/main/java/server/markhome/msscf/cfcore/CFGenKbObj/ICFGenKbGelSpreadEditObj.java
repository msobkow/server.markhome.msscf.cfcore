// Description: Java 11 Instance Edit Object interface for CFGenKb GelSpread.

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

public interface ICFGenKbGelSpreadEditObj
	extends ICFGenKbGelSpreadObj,
		ICFGenKbGelInstructionEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGelSpreadObj.
	 */
	ICFGenKbGelSpreadObj getOrigAsGelSpread();

	/**
	 *	Get the required String attribute IteratorName.
	 *
	 *	@return	The String value of the attribute IteratorName.
	 */
	String getRequiredIteratorName();

	/**
	 *	Set the required String attribute IteratorName.
	 *
	 *	@param	value	the String value of the attribute IteratorName.
	 */
	void setRequiredIteratorName( String value );

	/**
	 *	Get the optional String attribute ExpandBetween.
	 *
	 *	@return	The String value of the attribute ExpandBetween.
	 */
	String getOptionalExpandBetween();

	/**
	 *	Set the optional String attribute ExpandBetween.
	 *
	 *	@param	value	the String value of the attribute ExpandBetween.
	 */
	void setOptionalExpandBetween( String value );

	/**
	 *	Get the optional String attribute ExpandBefore.
	 *
	 *	@return	The String value of the attribute ExpandBefore.
	 */
	String getOptionalExpandBefore();

	/**
	 *	Set the optional String attribute ExpandBefore.
	 *
	 *	@param	value	the String value of the attribute ExpandBefore.
	 */
	void setOptionalExpandBefore( String value );

	/**
	 *	Get the optional String attribute ExpandFirst.
	 *
	 *	@return	The String value of the attribute ExpandFirst.
	 */
	String getOptionalExpandFirst();

	/**
	 *	Set the optional String attribute ExpandFirst.
	 *
	 *	@param	value	the String value of the attribute ExpandFirst.
	 */
	void setOptionalExpandFirst( String value );

	/**
	 *	Get the required String attribute ExpandEach.
	 *
	 *	@return	The String value of the attribute ExpandEach.
	 */
	String getRequiredExpandEach();

	/**
	 *	Set the required String attribute ExpandEach.
	 *
	 *	@param	value	the String value of the attribute ExpandEach.
	 */
	void setRequiredExpandEach( String value );

	/**
	 *	Get the optional String attribute ExpandLast.
	 *
	 *	@return	The String value of the attribute ExpandLast.
	 */
	String getOptionalExpandLast();

	/**
	 *	Set the optional String attribute ExpandLast.
	 *
	 *	@param	value	the String value of the attribute ExpandLast.
	 */
	void setOptionalExpandLast( String value );

	/**
	 *	Get the optional String attribute ExpandLone.
	 *
	 *	@return	The String value of the attribute ExpandLone.
	 */
	String getOptionalExpandLone();

	/**
	 *	Set the optional String attribute ExpandLone.
	 *
	 *	@param	value	the String value of the attribute ExpandLone.
	 */
	void setOptionalExpandLone( String value );

	/**
	 *	Get the optional String attribute ExpandEmpty.
	 *
	 *	@return	The String value of the attribute ExpandEmpty.
	 */
	String getOptionalExpandEmpty();

	/**
	 *	Set the optional String attribute ExpandEmpty.
	 *
	 *	@param	value	the String value of the attribute ExpandEmpty.
	 */
	void setOptionalExpandEmpty( String value );

	/**
	 *	Get the optional String attribute ExpandAfter.
	 *
	 *	@return	The String value of the attribute ExpandAfter.
	 */
	String getOptionalExpandAfter();

	/**
	 *	Set the optional String attribute ExpandAfter.
	 *
	 *	@param	value	the String value of the attribute ExpandAfter.
	 */
	void setOptionalExpandAfter( String value );
}
