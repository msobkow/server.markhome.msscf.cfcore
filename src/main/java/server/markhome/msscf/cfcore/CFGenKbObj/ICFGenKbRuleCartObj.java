// Description: Java 11 Object interface for CFGenKb RuleCart.

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

public interface ICFGenKbRuleCartObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a RuleCart.
	 *
	 *	@return	CFGenKbRuleCartObj instance which should be subsequently referenced.
	 */
	ICFGenKbRuleCartObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbRuleCartObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbRuleCartObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFGenKbRuleCartObj the reference to the cached or read (realised) instance.
	 */
	ICFGenKbRuleCartObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this RuleCart instance.
	 *
	 *	@return	The newly locked ICFGenKbRuleCartEditObj edition of this instance.
	 */
	ICFGenKbRuleCartEditObj beginEdit();

	/**
	 *	End this edition of this RuleCart instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this RuleCart instance.
	 *
	 *	@return	The ICFGenKbRuleCartEditObj edition of this instance.
	 */
	ICFGenKbRuleCartEditObj getEdit();

	/**
	 *	Get the current edition of this RuleCart instance as a ICFGenKbRuleCartEditObj.
	 *
	 *	@return	The ICFGenKbRuleCartEditObj edition of this instance.
	 */
	ICFGenKbRuleCartEditObj getEditAsRuleCart();

	/**
	 *	Get the ICFGenKbRuleCartTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbRuleCartTableObj table cache which manages this instance.
	 */
	ICFGenKbRuleCartTableObj getRuleCartTable();

	/**
	 *	Get the ICFGenKbSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFGenKbSchemaObj schema cache which manages this instance.
	 */
	ICFGenKbSchemaObj getSchema();

	/**
	 *	Get the CFGenKbRuleCartBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbRuleCartBuff instance which currently backs this object.
	 */
	CFGenKbRuleCartBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFGenKbRuleCartBuff value );

	/**
	 *	Get the CFGenKbRuleCartBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbRuleCartBuff instance which currently backs this object.
	 */
	CFGenKbRuleCartBuff getRuleCartBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFGenKbRuleCartPKey primary key for this instance.
	 */
	CFGenKbRuleCartPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFGenKbRuleCartPKey primary key value for this instance.
	 */
	void setPKey( CFGenKbRuleCartPKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the optional String attribute Descr.
	 *
	 *	@return	The optional String attribute Descr.
	 */
	String getOptionalDescr();

	/**
	 *	Get the optional String attribute RevisionString.
	 *
	 *	@return	The optional String attribute RevisionString.
	 */
	String getOptionalRevisionString();

	/**
	 *	Get the required ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFGenKbTenantObj instance referenced by the Tenant key.
	 */
	ICFGenKbTenantObj getRequiredContainerTenant();

	/**
	 *	Get the required ICFGenKbTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFGenKbTenantObj instance referenced by the Tenant key.
	 */
	ICFGenKbTenantObj getRequiredContainerTenant( boolean forceRead );

	/**
	 *	Get the array of optional ICFGenKbGenItemObj array of instances referenced by the Rule key.
	 *
	 *	@return	The optional ICFGenKbGenItemObj[] array of instances referenced by the Rule key.
	 */
	List<ICFGenKbGenItemObj> getOptionalComponentsRule();

	/**
	 *	Get the array of optional ICFGenKbGenItemObj array of instances referenced by the Rule key.
	 *
	 *	@return	The optional ICFGenKbGenItemObj[] array of instances referenced by the Rule key.
	 */
	List<ICFGenKbGenItemObj> getOptionalComponentsRule( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
