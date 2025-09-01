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

public class CFGenKbSecDeviceTableObj
	implements ICFGenKbSecDeviceTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> members;
	private Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> allSecDevice;
	private Map< CFGenKbSecDeviceByNameIdxKey,
		ICFGenKbSecDeviceObj > indexByNameIdx;
	private Map< CFGenKbSecDeviceByUserIdxKey,
		Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj > > indexByUserIdx;
	public static String TABLE_NAME = "SecDevice";
	public static String TABLE_DBNAME = "secdev";

	public CFGenKbSecDeviceTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj>();
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
	}

	public CFGenKbSecDeviceTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj>();
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
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
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
		List<ICFGenKbSecDeviceObj> toForget = new LinkedList<ICFGenKbSecDeviceObj>();
		ICFGenKbSecDeviceObj cur = null;
		Iterator<ICFGenKbSecDeviceObj> iter = members.values().iterator();
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
	 *	CFGenKbSecDeviceObj.
	 */
	public ICFGenKbSecDeviceObj newInstance() {
		ICFGenKbSecDeviceObj inst = new CFGenKbSecDeviceObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecDeviceObj.
	 */
	public ICFGenKbSecDeviceEditObj newEditInstance( ICFGenKbSecDeviceObj orig ) {
		ICFGenKbSecDeviceEditObj edit = new CFGenKbSecDeviceEditObj( orig );
		return( edit );
	}

	public ICFGenKbSecDeviceObj realiseSecDevice( ICFGenKbSecDeviceObj Obj ) {
		ICFGenKbSecDeviceObj obj = Obj;
		CFGenKbSecDevicePKey pkey = obj.getPKey();
		ICFGenKbSecDeviceObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSecDeviceObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				CFGenKbSecDeviceByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByUserIdx != null ) {
				CFGenKbSecDeviceByUserIdxKey keyUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				CFGenKbSecDeviceByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByUserIdx != null ) {
				CFGenKbSecDeviceByUserIdxKey keyUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecDevice != null ) {
				allSecDevice.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecDevice != null ) {
				allSecDevice.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				CFGenKbSecDeviceByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByUserIdx != null ) {
				CFGenKbSecDeviceByUserIdxKey keyUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbSecDeviceObj createSecDevice( ICFGenKbSecDeviceObj Obj ) {
		ICFGenKbSecDeviceObj obj = Obj;
		CFGenKbSecDeviceBuff buff = obj.getSecDeviceBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().createSecDevice(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSecDeviceObj readSecDevice( CFGenKbSecDevicePKey pkey ) {
		return( readSecDevice( pkey, false ) );
	}

	public ICFGenKbSecDeviceObj readSecDevice( CFGenKbSecDevicePKey pkey, boolean forceRead ) {
		ICFGenKbSecDeviceObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSecDeviceBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecUserId(),
				pkey.getRequiredDevName() );
			if( readBuff != null ) {
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSecDeviceObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecDeviceObj readCachedSecDevice( CFGenKbSecDevicePKey pkey ) {
		ICFGenKbSecDeviceObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecDevice( ICFGenKbSecDeviceObj obj )
	{
		final String S_ProcName = "CFGenKbSecDeviceTableObj.reallyDeepDisposeSecDevice() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSecDevicePKey pkey = obj.getPKey();
		ICFGenKbSecDeviceObj existing = readCachedSecDevice( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSecDeviceByNameIdxKey keyNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		CFGenKbSecDeviceByUserIdxKey keyUserIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByUserIdx != null ) {
			if( indexByUserIdx.containsKey( keyUserIdx ) ) {
				indexByUserIdx.get( keyUserIdx ).remove( pkey );
				if( indexByUserIdx.get( keyUserIdx ).size() <= 0 ) {
					indexByUserIdx.remove( keyUserIdx );
				}
			}
		}


	}
	public void deepDisposeSecDevice( CFGenKbSecDevicePKey pkey ) {
		ICFGenKbSecDeviceObj obj = readCachedSecDevice( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecDeviceObj lockSecDevice( CFGenKbSecDevicePKey pkey ) {
		ICFGenKbSecDeviceObj locked = null;
		CFGenKbSecDeviceBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecDeviceTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSecDeviceObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSecDevice", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSecDeviceObj> readAllSecDevice() {
		return( readAllSecDevice( false ) );
	}

	public List<ICFGenKbSecDeviceObj> readAllSecDevice( boolean forceRead ) {
		final String S_ProcName = "readAllSecDevice";
		if( ( allSecDevice == null ) || forceRead ) {
			Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> map = new HashMap<CFGenKbSecDevicePKey,ICFGenKbSecDeviceObj>();
			allSecDevice = map;
			CFGenKbSecDeviceBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readAllDerived( schema.getAuthorization() );
			CFGenKbSecDeviceBuff buff;
			ICFGenKbSecDeviceObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecDeviceObj realised = (ICFGenKbSecDeviceObj)obj.realise();
			}
		}
		int len = allSecDevice.size();
		ICFGenKbSecDeviceObj arr[] = new ICFGenKbSecDeviceObj[len];
		Iterator<ICFGenKbSecDeviceObj> valIter = allSecDevice.values().iterator();
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
		ArrayList<ICFGenKbSecDeviceObj> arrayList = new ArrayList<ICFGenKbSecDeviceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecDeviceObj> cmp = new Comparator<ICFGenKbSecDeviceObj>() {
			public int compare( ICFGenKbSecDeviceObj lhs, ICFGenKbSecDeviceObj rhs ) {
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
					CFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					CFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecDeviceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecDeviceObj> readCachedAllSecDevice() {
		final String S_ProcName = "readCachedAllSecDevice";
		ArrayList<ICFGenKbSecDeviceObj> arrayList = new ArrayList<ICFGenKbSecDeviceObj>();
		if( allSecDevice != null ) {
			int len = allSecDevice.size();
			ICFGenKbSecDeviceObj arr[] = new ICFGenKbSecDeviceObj[len];
			Iterator<ICFGenKbSecDeviceObj> valIter = allSecDevice.values().iterator();
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
		Comparator<ICFGenKbSecDeviceObj> cmp = new Comparator<ICFGenKbSecDeviceObj>() {
			public int compare( ICFGenKbSecDeviceObj lhs, ICFGenKbSecDeviceObj rhs ) {
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
					CFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					CFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecDevice-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbSecDeviceObj> pageAllSecDevice(UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageAllSecDevice";
		Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> map = new HashMap<CFGenKbSecDevicePKey,ICFGenKbSecDeviceObj>();
		CFGenKbSecDeviceBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().pageAllBuff( schema.getAuthorization(),
			priorSecUserId,
			priorDevName );
		CFGenKbSecDeviceBuff buff;
		ICFGenKbSecDeviceObj obj;
		ICFGenKbSecDeviceObj realised;
		ArrayList<ICFGenKbSecDeviceObj> arrayList = new ArrayList<ICFGenKbSecDeviceObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbSecDeviceObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		return( readSecDeviceByIdIdx( SecUserId,
			DevName,
			false ) );
	}

	public ICFGenKbSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName, boolean forceRead )
	{
		CFGenKbSecDevicePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		ICFGenKbSecDeviceObj obj = readSecDevice( pkey, forceRead );
		return( obj );
	}

	public ICFGenKbSecDeviceObj readSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		return( readSecDeviceByNameIdx( SecUserId,
			DevName,
			false ) );
	}

	public ICFGenKbSecDeviceObj readSecDeviceByNameIdx( UUID SecUserId,
		String DevName, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbSecDeviceByNameIdxKey,
				ICFGenKbSecDeviceObj >();
		}
		CFGenKbSecDeviceByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		ICFGenKbSecDeviceObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFGenKbSecDeviceBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
			if( buff != null ) {
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbSecDeviceObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId )
	{
		return( readSecDeviceByUserIdx( SecUserId,
			false ) );
	}

	public List<ICFGenKbSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecDeviceByUserIdx";
		CFGenKbSecDeviceByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< CFGenKbSecDeviceByUserIdxKey,
				Map< CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj>();
			ICFGenKbSecDeviceObj obj;
			CFGenKbSecDeviceBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			CFGenKbSecDeviceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecDeviceObj realised = (ICFGenKbSecDeviceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecDeviceObj arr[] = new ICFGenKbSecDeviceObj[len];
		Iterator<ICFGenKbSecDeviceObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecDeviceObj> arrayList = new ArrayList<ICFGenKbSecDeviceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecDeviceObj> cmp = new Comparator<ICFGenKbSecDeviceObj>() {
			public int compare( ICFGenKbSecDeviceObj lhs, ICFGenKbSecDeviceObj rhs ) {
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
					CFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					CFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecDeviceObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecDeviceObj readCachedSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		ICFGenKbSecDeviceObj obj = null;
		CFGenKbSecDevicePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		obj = readCachedSecDevice( pkey );
		return( obj );
	}

	public ICFGenKbSecDeviceObj readCachedSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		ICFGenKbSecDeviceObj obj = null;
		CFGenKbSecDeviceByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbSecDeviceObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbSecDeviceObj> valIter = members.values().iterator();
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

	public List<ICFGenKbSecDeviceObj> readCachedSecDeviceByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecDeviceByUserIdx";
		CFGenKbSecDeviceByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<ICFGenKbSecDeviceObj> arrayList = new ArrayList<ICFGenKbSecDeviceObj>();
		if( indexByUserIdx != null ) {
			Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				ICFGenKbSecDeviceObj arr[] = new ICFGenKbSecDeviceObj[len];
				Iterator<ICFGenKbSecDeviceObj> valIter = dict.values().iterator();
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
			ICFGenKbSecDeviceObj obj;
			Iterator<ICFGenKbSecDeviceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecDeviceObj> cmp = new Comparator<ICFGenKbSecDeviceObj>() {
			public int compare( ICFGenKbSecDeviceObj lhs, ICFGenKbSecDeviceObj rhs ) {
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
					CFGenKbSecDevicePKey lhsPKey = lhs.getPKey();
					CFGenKbSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		ICFGenKbSecDeviceObj obj = readCachedSecDeviceByIdIdx( SecUserId,
				DevName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		ICFGenKbSecDeviceObj obj = readCachedSecDeviceByNameIdx( SecUserId,
				DevName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecDeviceByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecDeviceByUserIdx";
		ICFGenKbSecDeviceObj obj;
		List<ICFGenKbSecDeviceObj> arrayList = readCachedSecDeviceByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecDeviceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecDevice-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecDevice-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecDeviceObj> pageSecDeviceByUserIdx( UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageSecDeviceByUserIdx";
		CFGenKbSecDeviceByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<ICFGenKbSecDeviceObj> retList = new LinkedList<ICFGenKbSecDeviceObj>();
		ICFGenKbSecDeviceObj obj;
		CFGenKbSecDeviceBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorSecUserId,
			priorDevName );
		CFGenKbSecDeviceBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecDeviceTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecDeviceObj realised = (ICFGenKbSecDeviceObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbSecDeviceObj updateSecDevice( ICFGenKbSecDeviceObj Obj ) {
		ICFGenKbSecDeviceObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().updateSecDevice( schema.getAuthorization(),
			Obj.getSecDeviceBuff() );
		obj = (ICFGenKbSecDeviceObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecDevice( ICFGenKbSecDeviceObj Obj ) {
		ICFGenKbSecDeviceObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDevice( schema.getAuthorization(),
			obj.getSecDeviceBuff() );
		Obj.forget();
	}

	public void deleteSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		CFGenKbSecDevicePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		ICFGenKbSecDeviceObj obj = readSecDevice( pkey );
		if( obj != null ) {
			ICFGenKbSecDeviceEditObj editObj = (ICFGenKbSecDeviceEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSecDeviceEditObj)obj.beginEdit();
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
		deepDisposeSecDeviceByIdIdx( SecUserId,
				DevName );
	}

	public void deleteSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbSecDeviceByNameIdxKey,
				ICFGenKbSecDeviceObj >();
		}
		CFGenKbSecDeviceByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		ICFGenKbSecDeviceObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
		}
		deepDisposeSecDeviceByNameIdx( SecUserId,
				DevName );
	}

	public void deleteSecDeviceByUserIdx( UUID SecUserId )
	{
		CFGenKbSecDeviceByUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< CFGenKbSecDeviceByUserIdxKey,
				Map< CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<CFGenKbSecDevicePKey, ICFGenKbSecDeviceObj> dict = indexByUserIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<ICFGenKbSecDeviceObj> iter = dict.values().iterator();
			ICFGenKbSecDeviceObj obj;
			List<ICFGenKbSecDeviceObj> toForget = new LinkedList<ICFGenKbSecDeviceObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByUserIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecDeviceByUserIdx( SecUserId );
	}
}