// Description: Java 11 Object interface for CFGenKb GelSwitch.

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
import server.markhome.msscf.cfcore.CFGenKb.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKb.*;
import com.github.msobkow.cfcore.MssCF.*;

public interface ICFGenKbGelSwitchObj
	extends ICFGenKbGelInstructionObj
{
	/**
	 *	Get the current edition of this GelSwitch instance as a ICFGenKbGelSwitchEditObj.
	 *
	 *	@return	The ICFGenKbGelSwitchEditObj edition of this instance.
	 */
	ICFGenKbGelSwitchEditObj getEditAsGelSwitch();

	/**
	 *	Get the ICFGenKbGelSwitchTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGelSwitchTableObj table cache which manages this instance.
	 */
	ICFGenKbGelSwitchTableObj getGelSwitchTable();

	/**
	 *	Get the CFGenKbGelSwitchBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGelSwitchBuff instance which currently backs this object.
	 */
	CFGenKbGelSwitchBuff getGelSwitchBuff();

	/**
	 *	Get the required String attribute ValueExpansion.
	 *
	 *	@return	The required String attribute ValueExpansion.
	 */
	String getRequiredValueExpansion();

	/**
	 *	Get the optional String attribute NilExpansion.
	 *
	 *	@return	The optional String attribute NilExpansion.
	 */
	String getOptionalNilExpansion();

	/**
	 *	Get the optional String attribute EmptyExpansion.
	 *
	 *	@return	The optional String attribute EmptyExpansion.
	 */
	String getOptionalEmptyExpansion();

	/**
	 *	Get the required String attribute DefaultExpansion.
	 *
	 *	@return	The required String attribute DefaultExpansion.
	 */
	String getRequiredDefaultExpansion();

	/**
	 *	Get the array of optional ICFGenKbGelSwitchLimbObj array of instances referenced by the SwitchLimb key.
	 *
	 *	@return	The optional ICFGenKbGelSwitchLimbObj[] array of instances referenced by the SwitchLimb key.
	 */
	List<ICFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb();

	/**
	 *	Get the array of optional ICFGenKbGelSwitchLimbObj array of instances referenced by the SwitchLimb key.
	 *
	 *	@return	The optional ICFGenKbGelSwitchLimbObj[] array of instances referenced by the SwitchLimb key.
	 */
	List<ICFGenKbGelSwitchLimbObj> getOptionalChildrenSwitchLimb( boolean forceRead );

}
