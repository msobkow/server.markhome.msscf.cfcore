// Description: Java 11 CFGenKb Authorization Interface.

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
import java.io.*;
import java.net.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfcore.CFGenKbObj.ICFGenKbClusterObj;
import server.markhome.msscf.cfcore.CFGenKbObj.ICFGenKbTenantObj;
import server.markhome.msscf.cfcore.CFGenKbObj.ICFGenKbSecSessionObj;

/*
 *	A CFGenKbAuthorization is an authorization ticket
 *	for the system providing services.  For example, a
 *	database layer implements an Authorization that
 *	resolves a database connection (which may be under the
 *	control of an active cursor).
 */
public class CFGenKbAuthorization
	implements Serializable
{
	protected UUID authUUID;
	protected String authUUIDStr;

	protected long secClusterId = 0L;
	protected long secTenantId = 0L;
	protected UUID secSessionId = UUID.randomUUID();
	protected UUID secUserId = UUID.randomUUID();

	public CFGenKbAuthorization() {
		authUUID = UUID.randomUUID();
		authUUIDStr = authUUID.toString();
	}

	public UUID getAuthUUID() {
		return( authUUID );
	}

	public void setAuthUUID( UUID value ) {
		authUUID = value;
		authUUIDStr = authUUID.toString();
	}

	public String getAuthUUIDStr() {
		return( authUUIDStr );
	}

	public long getSecClusterId() {
		return( secClusterId );
	}

	public void setSecClusterId( long clusterId ) {
		secClusterId = clusterId;
	}

	public void setSecCluster( ICFGenKbClusterObj value ) {
		// The cluster id is never cleared to 0 after it's been set
		if( value != null ) {
			secClusterId = value.getRequiredId();
		}
	}

	public long getSecTenantId() {
		return( secTenantId );
	}

	public void setSecTenantId( long tenantId ) {
		secTenantId = tenantId;
	}

	public void setSecTenant( ICFGenKbTenantObj value ) {
		// The tenant id is never cleared to 0 after it's been set
		if( value != null ) {
			secTenantId = value.getRequiredId();
		}
	}

	public UUID getSecSessionId() {
		return( secSessionId );
	}

	public void setSecSessionId( UUID sessionId ) {
		secSessionId = sessionId;
	}

	public void setSecSession( ICFGenKbSecSessionObj value )
	{
		// The session and user id are never cleared after they've been set
		if( value != null ) {
			secSessionId = value.getRequiredSecSessionId();
			secUserId = value.getRequiredSecUserId();
		}
	}

	public UUID getSecUserId() {
		return( secUserId );
	}

	public void setSecUserId( UUID userId ) {
		secUserId = userId;
	}
}
