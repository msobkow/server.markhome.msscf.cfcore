// Description: Java 11 Object interface for CFGenKb GenReference.

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

public interface ICFGenKbGenReferenceObj
	extends ICFGenKbGenItemObj
{
	/**
	 *	Get the current edition of this GenReference instance as a ICFGenKbGenReferenceEditObj.
	 *
	 *	@return	The ICFGenKbGenReferenceEditObj edition of this instance.
	 */
	ICFGenKbGenReferenceEditObj getEditAsGenReference();

	/**
	 *	Get the ICFGenKbGenReferenceTableObj table cache which manages this instance.
	 *
	 *	@return	ICFGenKbGenReferenceTableObj table cache which manages this instance.
	 */
	ICFGenKbGenReferenceTableObj getGenReferenceTable();

	/**
	 *	Get the CFGenKbGenReferenceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFGenKbGenReferenceBuff instance which currently backs this object.
	 */
	CFGenKbGenReferenceBuff getGenReferenceBuff();

}
