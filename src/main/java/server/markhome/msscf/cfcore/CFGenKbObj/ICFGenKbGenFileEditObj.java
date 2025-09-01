// Description: Java 11 Instance Edit Object interface for CFGenKb GenFile.

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

public interface ICFGenKbGenFileEditObj
	extends ICFGenKbGenFileObj,
		ICFGenKbGenRuleEditObj
{
	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFGenKbGenFileObj.
	 */
	ICFGenKbGenFileObj getOrigAsGenFile();

	/**
	 *	Get the optional String attribute GenerateOnce.
	 *
	 *	@return	The String value of the attribute GenerateOnce.
	 */
	String getOptionalGenerateOnce();

	/**
	 *	Set the optional String attribute GenerateOnce.
	 *
	 *	@param	value	the String value of the attribute GenerateOnce.
	 */
	void setOptionalGenerateOnce( String value );

	/**
	 *	Get the optional String attribute SourceBundle.
	 *
	 *	@return	The String value of the attribute SourceBundle.
	 */
	String getOptionalSourceBundle();

	/**
	 *	Set the optional String attribute SourceBundle.
	 *
	 *	@param	value	the String value of the attribute SourceBundle.
	 */
	void setOptionalSourceBundle( String value );

	/**
	 *	Get the optional String attribute ModuleName.
	 *
	 *	@return	The String value of the attribute ModuleName.
	 */
	String getOptionalModuleName();

	/**
	 *	Set the optional String attribute ModuleName.
	 *
	 *	@param	value	the String value of the attribute ModuleName.
	 */
	void setOptionalModuleName( String value );

	/**
	 *	Get the optional String attribute BasePackageName.
	 *
	 *	@return	The String value of the attribute BasePackageName.
	 */
	String getOptionalBasePackageName();

	/**
	 *	Set the optional String attribute BasePackageName.
	 *
	 *	@param	value	the String value of the attribute BasePackageName.
	 */
	void setOptionalBasePackageName( String value );

	/**
	 *	Get the optional String attribute SubPackageName.
	 *
	 *	@return	The String value of the attribute SubPackageName.
	 */
	String getOptionalSubPackageName();

	/**
	 *	Set the optional String attribute SubPackageName.
	 *
	 *	@param	value	the String value of the attribute SubPackageName.
	 */
	void setOptionalSubPackageName( String value );

	/**
	 *	Get the optional String attribute ExpansionClassName.
	 *
	 *	@return	The String value of the attribute ExpansionClassName.
	 */
	String getOptionalExpansionClassName();

	/**
	 *	Set the optional String attribute ExpansionClassName.
	 *
	 *	@param	value	the String value of the attribute ExpansionClassName.
	 */
	void setOptionalExpansionClassName( String value );

	/**
	 *	Get the optional String attribute ExpansionKeyName.
	 *
	 *	@return	The String value of the attribute ExpansionKeyName.
	 */
	String getOptionalExpansionKeyName();

	/**
	 *	Set the optional String attribute ExpansionKeyName.
	 *
	 *	@param	value	the String value of the attribute ExpansionKeyName.
	 */
	void setOptionalExpansionKeyName( String value );

	/**
	 *	Get the optional String attribute ExpansionFileName.
	 *
	 *	@return	The String value of the attribute ExpansionFileName.
	 */
	String getOptionalExpansionFileName();

	/**
	 *	Set the optional String attribute ExpansionFileName.
	 *
	 *	@param	value	the String value of the attribute ExpansionFileName.
	 */
	void setOptionalExpansionFileName( String value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsSrcBundleGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the SrcBundleGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the SrcBundleGel key.
	 */
	void setOptionalComponentsSrcBundleGel( ICFGenKbGelExecutableObj value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsBasePackageGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the BasePackageGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the BasePackageGel key.
	 */
	void setOptionalComponentsBasePackageGel( ICFGenKbGelExecutableObj value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsModuleNameGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the ModuleNameGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the ModuleNameGel key.
	 */
	void setOptionalComponentsModuleNameGel( ICFGenKbGelExecutableObj value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsSubPackageGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the SubPackageGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the SubPackageGel key.
	 */
	void setOptionalComponentsSubPackageGel( ICFGenKbGelExecutableObj value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsExpClassGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the ExpClassGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the ExpClassGel key.
	 */
	void setOptionalComponentsExpClassGel( ICFGenKbGelExecutableObj value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsExpKeyNameGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the ExpKeyNameGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the ExpKeyNameGel key.
	 */
	void setOptionalComponentsExpKeyNameGel( ICFGenKbGelExecutableObj value );

	/**
	 *	Get the ICFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 *
	 *	@return	The ICFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 */
	ICFGenKbGelExecutableObj getOptionalComponentsExpFileNameGel();

	/**
	 *	Set the ICFGenKbGelExecutableObj instance referenced by the ExpFileNameGel key.
	 *
	 *	@param	value	the ICFGenKbGelExecutableObj instance to be referenced by the ExpFileNameGel key.
	 */
	void setOptionalComponentsExpFileNameGel( ICFGenKbGelExecutableObj value );
}
