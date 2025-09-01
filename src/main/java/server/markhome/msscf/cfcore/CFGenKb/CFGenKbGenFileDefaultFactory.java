
// Description: Java 11 Default Factory implementation for GenFile.

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

	/*
	 *	CFGenKbGenFileFactory implementation for GenFile
	 */
public class CFGenKbGenFileDefaultFactory
	implements ICFGenKbGenFileFactory
{
	public CFGenKbGenFileDefaultFactory() {
	}

	public CFGenKbGenFileByXSrcBundleKey newXSrcBundleKey() {
		CFGenKbGenFileByXSrcBundleKey key =
			new CFGenKbGenFileByXSrcBundleKey();
		return( key );
	}

	public CFGenKbGenFileByXModNameKey newXModNameKey() {
		CFGenKbGenFileByXModNameKey key =
			new CFGenKbGenFileByXModNameKey();
		return( key );
	}

	public CFGenKbGenFileByXBasePkgKey newXBasePkgKey() {
		CFGenKbGenFileByXBasePkgKey key =
			new CFGenKbGenFileByXBasePkgKey();
		return( key );
	}

	public CFGenKbGenFileByXSubPkgKey newXSubPkgKey() {
		CFGenKbGenFileByXSubPkgKey key =
			new CFGenKbGenFileByXSubPkgKey();
		return( key );
	}

	public CFGenKbGenFileByXExpClsNameKey newXExpClsNameKey() {
		CFGenKbGenFileByXExpClsNameKey key =
			new CFGenKbGenFileByXExpClsNameKey();
		return( key );
	}

	public CFGenKbGenFileByXExpKeyNameKey newXExpKeyNameKey() {
		CFGenKbGenFileByXExpKeyNameKey key =
			new CFGenKbGenFileByXExpKeyNameKey();
		return( key );
	}

	public CFGenKbGenFileByXExpFileNameKey newXExpFileNameKey() {
		CFGenKbGenFileByXExpFileNameKey key =
			new CFGenKbGenFileByXExpFileNameKey();
		return( key );
	}

	public CFGenKbGenFileBuff newBuff() {
		CFGenKbGenFileBuff buff =
			new CFGenKbGenFileBuff();
		return( buff );
	}
}
