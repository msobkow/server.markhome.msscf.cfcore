// Description: Java 11 Table Object implementation for CFGenKb.

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

public class CFGenKbSecUserTableObj
	implements ICFGenKbSecUserTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> members;
	private Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> allSecUser;
	private Map< CFGenKbSecUserByULoginIdxKey,
		ICFGenKbSecUserObj > indexByULoginIdx;
	private Map< CFGenKbSecUserByEMConfIdxKey,
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > > indexByEMConfIdx;
	private Map< CFGenKbSecUserByPwdResetIdxKey,
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > > indexByPwdResetIdx;
	private Map< CFGenKbSecUserByDefDevIdxKey,
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > > indexByDefDevIdx;
	public static String TABLE_NAME = "SecUser";
	public static String TABLE_DBNAME = "secuser";

	public CFGenKbSecUserTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSecUserPKey, ICFGenKbSecUserObj>();
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
	}

	public CFGenKbSecUserTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSecUserPKey, ICFGenKbSecUserObj>();
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = (ICFGenKbSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( null );
	}


	public void minimizeMemory() {
		allSecUser = null;
		indexByULoginIdx = null;
		indexByEMConfIdx = null;
		indexByPwdResetIdx = null;
		indexByDefDevIdx = null;
		List<ICFGenKbSecUserObj> toForget = new LinkedList<ICFGenKbSecUserObj>();
		ICFGenKbSecUserObj cur = null;
		Iterator<ICFGenKbSecUserObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecUserObj.
	 */
	public ICFGenKbSecUserObj newInstance() {
		ICFGenKbSecUserObj inst = new CFGenKbSecUserObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecUserObj.
	 */
	public ICFGenKbSecUserEditObj newEditInstance( ICFGenKbSecUserObj orig ) {
		ICFGenKbSecUserEditObj edit = new CFGenKbSecUserEditObj( orig );
		return( edit );
	}

	public ICFGenKbSecUserObj realiseSecUser( ICFGenKbSecUserObj Obj ) {
		ICFGenKbSecUserObj obj = Obj;
		CFGenKbSecUserPKey pkey = obj.getPKey();
		ICFGenKbSecUserObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSecUserObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByULoginIdx != null ) {
				CFGenKbSecUserByULoginIdxKey keyULoginIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.remove( keyULoginIdx );
			}

			if( indexByEMConfIdx != null ) {
				CFGenKbSecUserByEMConfIdxKey keyEMConfIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.remove( keepObj.getPKey() );
					if( mapEMConfIdx.size() <= 0 ) {
						indexByEMConfIdx.remove( keyEMConfIdx );
					}
				}
			}

			if( indexByPwdResetIdx != null ) {
				CFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.remove( keepObj.getPKey() );
					if( mapPwdResetIdx.size() <= 0 ) {
						indexByPwdResetIdx.remove( keyPwdResetIdx );
					}
				}
			}

			if( indexByDefDevIdx != null ) {
				CFGenKbSecUserByDefDevIdxKey keyDefDevIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.remove( keepObj.getPKey() );
					if( mapDefDevIdx.size() <= 0 ) {
						indexByDefDevIdx.remove( keyDefDevIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByULoginIdx != null ) {
				CFGenKbSecUserByULoginIdxKey keyULoginIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.put( keyULoginIdx, keepObj );
			}

			if( indexByEMConfIdx != null ) {
				CFGenKbSecUserByEMConfIdxKey keyEMConfIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPwdResetIdx != null ) {
				CFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefDevIdx != null ) {
				CFGenKbSecUserByDefDevIdxKey keyDefDevIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecUser != null ) {
				allSecUser.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecUser != null ) {
				allSecUser.put( keepObj.getPKey(), keepObj );
			}

			if( indexByULoginIdx != null ) {
				CFGenKbSecUserByULoginIdxKey keyULoginIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
				keyULoginIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				indexByULoginIdx.put( keyULoginIdx, keepObj );
			}

			if( indexByEMConfIdx != null ) {
				CFGenKbSecUserByEMConfIdxKey keyEMConfIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
				keyEMConfIdx.setOptionalEMailConfirmUuid( keepObj.getOptionalEMailConfirmUuid() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapEMConfIdx = indexByEMConfIdx.get( keyEMConfIdx );
				if( mapEMConfIdx != null ) {
					mapEMConfIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPwdResetIdx != null ) {
				CFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
				keyPwdResetIdx.setOptionalPasswordResetUuid( keepObj.getOptionalPasswordResetUuid() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapPwdResetIdx = indexByPwdResetIdx.get( keyPwdResetIdx );
				if( mapPwdResetIdx != null ) {
					mapPwdResetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefDevIdx != null ) {
				CFGenKbSecUserByDefDevIdxKey keyDefDevIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
				keyDefDevIdx.setOptionalDfltDevUserId( keepObj.getOptionalDfltDevUserId() );
				keyDefDevIdx.setOptionalDfltDevName( keepObj.getOptionalDfltDevName() );
				Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj > mapDefDevIdx = indexByDefDevIdx.get( keyDefDevIdx );
				if( mapDefDevIdx != null ) {
					mapDefDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbSecUserObj createSecUser( ICFGenKbSecUserObj Obj ) {
		ICFGenKbSecUserObj obj = Obj;
		CFGenKbSecUserBuff buff = obj.getSecUserBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().createSecUser(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSecUserObj readSecUser( CFGenKbSecUserPKey pkey ) {
		return( readSecUser( pkey, false ) );
	}

	public ICFGenKbSecUserObj readSecUser( CFGenKbSecUserPKey pkey, boolean forceRead ) {
		ICFGenKbSecUserObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSecUserBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecUserId() );
			if( readBuff != null ) {
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSecUserObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecUserObj readCachedSecUser( CFGenKbSecUserPKey pkey ) {
		ICFGenKbSecUserObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecUser( ICFGenKbSecUserObj obj )
	{
		final String S_ProcName = "CFGenKbSecUserTableObj.reallyDeepDisposeSecUser() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSecUserPKey pkey = obj.getPKey();
		ICFGenKbSecUserObj existing = readCachedSecUser( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSecUserByULoginIdxKey keyULoginIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		CFGenKbSecUserByEMConfIdxKey keyEMConfIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		CFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		CFGenKbSecUserByDefDevIdxKey keyDefDevIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		keyDefDevIdx.setOptionalDfltDevUserId( existing.getOptionalDfltDevUserId() );
		keyDefDevIdx.setOptionalDfltDevName( existing.getOptionalDfltDevName() );


					schema.getTSecGrpMembTableObj().deepDisposeTSecGrpMembByUserIdx( existing.getRequiredSecUserId() );
					schema.getSecGrpMembTableObj().deepDisposeSecGrpMembByUserIdx( existing.getRequiredSecUserId() );
					schema.getSecSessionTableObj().deepDisposeSecSessionBySecUserIdx( existing.getRequiredSecUserId() );
					schema.getSecSessionTableObj().deepDisposeSecSessionBySecProxyIdx( existing.getRequiredSecUserId() );
					schema.getSecDeviceTableObj().deepDisposeSecDeviceByUserIdx( existing.getRequiredSecUserId() );

		if( indexByULoginIdx != null ) {
			indexByULoginIdx.remove( keyULoginIdx );
		}

		if( indexByEMConfIdx != null ) {
			if( indexByEMConfIdx.containsKey( keyEMConfIdx ) ) {
				indexByEMConfIdx.get( keyEMConfIdx ).remove( pkey );
				if( indexByEMConfIdx.get( keyEMConfIdx ).size() <= 0 ) {
					indexByEMConfIdx.remove( keyEMConfIdx );
				}
			}
		}

		if( indexByPwdResetIdx != null ) {
			if( indexByPwdResetIdx.containsKey( keyPwdResetIdx ) ) {
				indexByPwdResetIdx.get( keyPwdResetIdx ).remove( pkey );
				if( indexByPwdResetIdx.get( keyPwdResetIdx ).size() <= 0 ) {
					indexByPwdResetIdx.remove( keyPwdResetIdx );
				}
			}
		}

		if( indexByDefDevIdx != null ) {
			if( indexByDefDevIdx.containsKey( keyDefDevIdx ) ) {
				indexByDefDevIdx.get( keyDefDevIdx ).remove( pkey );
				if( indexByDefDevIdx.get( keyDefDevIdx ).size() <= 0 ) {
					indexByDefDevIdx.remove( keyDefDevIdx );
				}
			}
		}


	}
	public void deepDisposeSecUser( CFGenKbSecUserPKey pkey ) {
		ICFGenKbSecUserObj obj = readCachedSecUser( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecUserObj lockSecUser( CFGenKbSecUserPKey pkey ) {
		ICFGenKbSecUserObj locked = null;
		CFGenKbSecUserBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecUserTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSecUserObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSecUser", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSecUserObj> readAllSecUser() {
		return( readAllSecUser( false ) );
	}

	public List<ICFGenKbSecUserObj> readAllSecUser( boolean forceRead ) {
		final String S_ProcName = "readAllSecUser";
		if( ( allSecUser == null ) || forceRead ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> map = new HashMap<CFGenKbSecUserPKey,ICFGenKbSecUserObj>();
			allSecUser = map;
			CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().readAllDerived( schema.getAuthorization() );
			CFGenKbSecUserBuff buff;
			ICFGenKbSecUserObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
			}
		}
		int len = allSecUser.size();
		ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
		Iterator<ICFGenKbSecUserObj> valIter = allSecUser.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecUserObj> readCachedAllSecUser() {
		final String S_ProcName = "readCachedAllSecUser";
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>();
		if( allSecUser != null ) {
			int len = allSecUser.size();
			ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
			Iterator<ICFGenKbSecUserObj> valIter = allSecUser.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecUser-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecUserObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbSecUserObj> pageAllSecUser(UUID priorSecUserId )
	{
		final String S_ProcName = "pageAllSecUser";
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> map = new HashMap<CFGenKbSecUserPKey,ICFGenKbSecUserObj>();
		CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageAllBuff( schema.getAuthorization(),
			priorSecUserId );
		CFGenKbSecUserBuff buff;
		ICFGenKbSecUserObj obj;
		ICFGenKbSecUserObj realised;
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbSecUserObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId )
	{
		return( readSecUserByIdIdx( SecUserId,
			false ) );
	}

	public ICFGenKbSecUserObj readSecUserByIdIdx( UUID SecUserId, boolean forceRead )
	{
		CFGenKbSecUserPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		ICFGenKbSecUserObj obj = readSecUser( pkey, forceRead );
		return( obj );
	}

	public ICFGenKbSecUserObj readSecUserByULoginIdx( String LoginId )
	{
		return( readSecUserByULoginIdx( LoginId,
			false ) );
	}

	public ICFGenKbSecUserObj readSecUserByULoginIdx( String LoginId, boolean forceRead )
	{
		if( indexByULoginIdx == null ) {
			indexByULoginIdx = new HashMap< CFGenKbSecUserByULoginIdxKey,
				ICFGenKbSecUserObj >();
		}
		CFGenKbSecUserByULoginIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		ICFGenKbSecUserObj obj = null;
		if( ( ! forceRead ) && indexByULoginIdx.containsKey( key ) ) {
			obj = indexByULoginIdx.get( key );
		}
		else {
			CFGenKbSecUserBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByULoginIdx( schema.getAuthorization(),
				LoginId );
			if( buff != null ) {
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbSecUserObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		return( readSecUserByEMConfIdx( EMailConfirmUuid,
			false ) );
	}

	public List<ICFGenKbSecUserObj> readSecUserByEMConfIdx( UUID EMailConfirmUuid,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByEMConfIdx";
		CFGenKbSecUserByEMConfIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict;
		if( indexByEMConfIdx == null ) {
			indexByEMConfIdx = new HashMap< CFGenKbSecUserByEMConfIdxKey,
				Map< CFGenKbSecUserPKey, ICFGenKbSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByEMConfIdx.containsKey( key ) ) {
			dict = indexByEMConfIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecUserPKey, ICFGenKbSecUserObj>();
			ICFGenKbSecUserObj obj;
			CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
			CFGenKbSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEMConfIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
		Iterator<ICFGenKbSecUserObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		return( readSecUserByPwdResetIdx( PasswordResetUuid,
			false ) );
	}

	public List<ICFGenKbSecUserObj> readSecUserByPwdResetIdx( UUID PasswordResetUuid,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByPwdResetIdx";
		CFGenKbSecUserByPwdResetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict;
		if( indexByPwdResetIdx == null ) {
			indexByPwdResetIdx = new HashMap< CFGenKbSecUserByPwdResetIdxKey,
				Map< CFGenKbSecUserPKey, ICFGenKbSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByPwdResetIdx.containsKey( key ) ) {
			dict = indexByPwdResetIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecUserPKey, ICFGenKbSecUserObj>();
			ICFGenKbSecUserObj obj;
			CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
			CFGenKbSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPwdResetIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
		Iterator<ICFGenKbSecUserObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		return( readSecUserByDefDevIdx( DfltDevUserId,
			DfltDevName,
			false ) );
	}

	public List<ICFGenKbSecUserObj> readSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecUserByDefDevIdx";
		CFGenKbSecUserByDefDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict;
		if( indexByDefDevIdx == null ) {
			indexByDefDevIdx = new HashMap< CFGenKbSecUserByDefDevIdxKey,
				Map< CFGenKbSecUserPKey, ICFGenKbSecUserObj > >();
		}
		if( ( ! forceRead ) && indexByDefDevIdx.containsKey( key ) ) {
			dict = indexByDefDevIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecUserPKey, ICFGenKbSecUserObj>();
			ICFGenKbSecUserObj obj;
			CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().readDerivedByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
			CFGenKbSecUserBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefDevIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
		Iterator<ICFGenKbSecUserObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecUserObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecUserObj readCachedSecUserByIdIdx( UUID SecUserId )
	{
		ICFGenKbSecUserObj obj = null;
		CFGenKbSecUserPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		obj = readCachedSecUser( pkey );
		return( obj );
	}

	public ICFGenKbSecUserObj readCachedSecUserByULoginIdx( String LoginId )
	{
		ICFGenKbSecUserObj obj = null;
		CFGenKbSecUserByULoginIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		if( indexByULoginIdx != null ) {
			if( indexByULoginIdx.containsKey( key ) ) {
				obj = indexByULoginIdx.get( key );
			}
			else {
				Iterator<ICFGenKbSecUserObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public List<ICFGenKbSecUserObj> readCachedSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		final String S_ProcName = "readCachedSecUserByEMConfIdx";
		CFGenKbSecUserByEMConfIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>();
		if( indexByEMConfIdx != null ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict;
			if( indexByEMConfIdx.containsKey( key ) ) {
				dict = indexByEMConfIdx.get( key );
				int len = dict.size();
				ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
				Iterator<ICFGenKbSecUserObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFGenKbSecUserObj obj;
			Iterator<ICFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecUserObj> readCachedSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		final String S_ProcName = "readCachedSecUserByPwdResetIdx";
		CFGenKbSecUserByPwdResetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>();
		if( indexByPwdResetIdx != null ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict;
			if( indexByPwdResetIdx.containsKey( key ) ) {
				dict = indexByPwdResetIdx.get( key );
				int len = dict.size();
				ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
				Iterator<ICFGenKbSecUserObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFGenKbSecUserObj obj;
			Iterator<ICFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecUserObj> readCachedSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "readCachedSecUserByDefDevIdx";
		CFGenKbSecUserByDefDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		ArrayList<ICFGenKbSecUserObj> arrayList = new ArrayList<ICFGenKbSecUserObj>();
		if( indexByDefDevIdx != null ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict;
			if( indexByDefDevIdx.containsKey( key ) ) {
				dict = indexByDefDevIdx.get( key );
				int len = dict.size();
				ICFGenKbSecUserObj arr[] = new ICFGenKbSecUserObj[len];
				Iterator<ICFGenKbSecUserObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFGenKbSecUserObj obj;
			Iterator<ICFGenKbSecUserObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecUserObj> cmp = new Comparator<ICFGenKbSecUserObj>() {
			public int compare( ICFGenKbSecUserObj lhs, ICFGenKbSecUserObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFGenKbSecUserPKey lhsPKey = lhs.getPKey();
					CFGenKbSecUserPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecUserByIdIdx( UUID SecUserId )
	{
		ICFGenKbSecUserObj obj = readCachedSecUserByIdIdx( SecUserId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecUserByULoginIdx( String LoginId )
	{
		ICFGenKbSecUserObj obj = readCachedSecUserByULoginIdx( LoginId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		final String S_ProcName = "deepDisposeSecUserByEMConfIdx";
		ICFGenKbSecUserObj obj;
		List<ICFGenKbSecUserObj> arrayList = readCachedSecUserByEMConfIdx( EMailConfirmUuid );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecUserObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		final String S_ProcName = "deepDisposeSecUserByPwdResetIdx";
		ICFGenKbSecUserObj obj;
		List<ICFGenKbSecUserObj> arrayList = readCachedSecUserByPwdResetIdx( PasswordResetUuid );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecUserObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "deepDisposeSecUserByDefDevIdx";
		ICFGenKbSecUserObj obj;
		List<ICFGenKbSecUserObj> arrayList = readCachedSecUserByDefDevIdx( DfltDevUserId,
				DfltDevName );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecUserObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate EMConfIdx key attributes.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecUserObj> pageSecUserByEMConfIdx( UUID EMailConfirmUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByEMConfIdx";
		CFGenKbSecUserByEMConfIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		List<ICFGenKbSecUserObj> retList = new LinkedList<ICFGenKbSecUserObj>();
		ICFGenKbSecUserObj obj;
		CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageBuffByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid,
			priorSecUserId );
		CFGenKbSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate PwdResetIdx key attributes.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecUserObj> pageSecUserByPwdResetIdx( UUID PasswordResetUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByPwdResetIdx";
		CFGenKbSecUserByPwdResetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		List<ICFGenKbSecUserObj> retList = new LinkedList<ICFGenKbSecUserObj>();
		ICFGenKbSecUserObj obj;
		CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageBuffByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid,
			priorSecUserId );
		CFGenKbSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecUser-derived instances sorted by their primary keys,
	 *	as identified by the duplicate DefDevIdx key attributes.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecUser-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecUserObj> pageSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageSecUserByDefDevIdx";
		CFGenKbSecUserByDefDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		List<ICFGenKbSecUserObj> retList = new LinkedList<ICFGenKbSecUserObj>();
		ICFGenKbSecUserObj obj;
		CFGenKbSecUserBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().pageBuffByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName,
			priorSecUserId );
		CFGenKbSecUserBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecUserTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecUserObj realised = (ICFGenKbSecUserObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbSecUserObj updateSecUser( ICFGenKbSecUserObj Obj ) {
		ICFGenKbSecUserObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().updateSecUser( schema.getAuthorization(),
			Obj.getSecUserBuff() );
		obj = (ICFGenKbSecUserObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecUser( ICFGenKbSecUserObj Obj ) {
		ICFGenKbSecUserObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUser( schema.getAuthorization(),
			obj.getSecUserBuff() );
		Obj.forget();
	}

	public void deleteSecUserByIdIdx( UUID SecUserId )
	{
		CFGenKbSecUserPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		ICFGenKbSecUserObj obj = readSecUser( pkey );
		if( obj != null ) {
			ICFGenKbSecUserEditObj editObj = (ICFGenKbSecUserEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSecUserEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeSecUserByIdIdx( SecUserId );
	}

	public void deleteSecUserByULoginIdx( String LoginId )
	{
		if( indexByULoginIdx == null ) {
			indexByULoginIdx = new HashMap< CFGenKbSecUserByULoginIdxKey,
				ICFGenKbSecUserObj >();
		}
		CFGenKbSecUserByULoginIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );
		ICFGenKbSecUserObj obj = null;
		if( indexByULoginIdx.containsKey( key ) ) {
			obj = indexByULoginIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByULoginIdx( schema.getAuthorization(),
				LoginId );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByULoginIdx( schema.getAuthorization(),
				LoginId );
		}
		deepDisposeSecUserByULoginIdx( LoginId );
	}

	public void deleteSecUserByEMConfIdx( UUID EMailConfirmUuid )
	{
		CFGenKbSecUserByEMConfIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );
		if( indexByEMConfIdx == null ) {
			indexByEMConfIdx = new HashMap< CFGenKbSecUserByEMConfIdxKey,
				Map< CFGenKbSecUserPKey, ICFGenKbSecUserObj > >();
		}
		if( indexByEMConfIdx.containsKey( key ) ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict = indexByEMConfIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
			Iterator<ICFGenKbSecUserObj> iter = dict.values().iterator();
			ICFGenKbSecUserObj obj;
			List<ICFGenKbSecUserObj> toForget = new LinkedList<ICFGenKbSecUserObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEMConfIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByEMConfIdx( schema.getAuthorization(),
				EMailConfirmUuid );
		}
		deepDisposeSecUserByEMConfIdx( EMailConfirmUuid );
	}

	public void deleteSecUserByPwdResetIdx( UUID PasswordResetUuid )
	{
		CFGenKbSecUserByPwdResetIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );
		if( indexByPwdResetIdx == null ) {
			indexByPwdResetIdx = new HashMap< CFGenKbSecUserByPwdResetIdxKey,
				Map< CFGenKbSecUserPKey, ICFGenKbSecUserObj > >();
		}
		if( indexByPwdResetIdx.containsKey( key ) ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict = indexByPwdResetIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
			Iterator<ICFGenKbSecUserObj> iter = dict.values().iterator();
			ICFGenKbSecUserObj obj;
			List<ICFGenKbSecUserObj> toForget = new LinkedList<ICFGenKbSecUserObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPwdResetIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByPwdResetIdx( schema.getAuthorization(),
				PasswordResetUuid );
		}
		deepDisposeSecUserByPwdResetIdx( PasswordResetUuid );
	}

	public void deleteSecUserByDefDevIdx( UUID DfltDevUserId,
		String DfltDevName )
	{
		CFGenKbSecUserByDefDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );
		if( indexByDefDevIdx == null ) {
			indexByDefDevIdx = new HashMap< CFGenKbSecUserByDefDevIdxKey,
				Map< CFGenKbSecUserPKey, ICFGenKbSecUserObj > >();
		}
		if( indexByDefDevIdx.containsKey( key ) ) {
			Map<CFGenKbSecUserPKey, ICFGenKbSecUserObj> dict = indexByDefDevIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
			Iterator<ICFGenKbSecUserObj> iter = dict.values().iterator();
			ICFGenKbSecUserObj obj;
			List<ICFGenKbSecUserObj> toForget = new LinkedList<ICFGenKbSecUserObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefDevIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecUser().deleteSecUserByDefDevIdx( schema.getAuthorization(),
				DfltDevUserId,
				DfltDevName );
		}
		deepDisposeSecUserByDefDevIdx( DfltDevUserId,
				DfltDevName );
	}

	public ICFGenKbSecUserObj getSystemUser() {
		boolean transactionStarted = schema.beginTransaction();
		ICFGenKbSecUserObj secUserObj;
		try {
			secUserObj = schema.getSecUserTableObj().readSecUserByULoginIdx( "system" );
			if( secUserObj == null ) {
				secUserObj = newInstance();
				ICFGenKbSecUserEditObj secUserEdit = secUserObj.beginEdit();
				secUserEdit.setRequiredEMailAddress( "system" );
				secUserObj = secUserEdit.create();
			}
			if( transactionStarted ) {
				schema.commit();
			}
		}
		catch( RuntimeException e ) {
			if( transactionStarted ) {
				try {
					schema.rollback();
				}
				catch( Exception e2 ) {
				}
			}
			throw e;
		}
		return( secUserObj );
	}
}