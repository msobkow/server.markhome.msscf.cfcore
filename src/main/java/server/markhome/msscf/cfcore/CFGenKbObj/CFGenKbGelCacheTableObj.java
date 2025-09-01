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

public class CFGenKbGelCacheTableObj
	implements ICFGenKbGelCacheTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj> members;
	private Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj> allGelCache;
	private Map< CFGenKbGelCacheByTenantIdxKey,
		Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj > > indexByTenantIdx;
	private Map< CFGenKbGelCacheByAltIdxKey,
		ICFGenKbGelCacheObj > indexByAltIdx;
	public static String TABLE_NAME = "GelCache";
	public static String TABLE_DBNAME = "gelcache";

	public CFGenKbGelCacheTableObj() {
		schema = null;
		members = new HashMap<CFGenKbGelCachePKey, ICFGenKbGelCacheObj>();
		allGelCache = null;
		indexByTenantIdx = null;
		indexByAltIdx = null;
	}

	public CFGenKbGelCacheTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbGelCachePKey, ICFGenKbGelCacheObj>();
		allGelCache = null;
		indexByTenantIdx = null;
		indexByAltIdx = null;
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
		allGelCache = null;
		indexByTenantIdx = null;
		indexByAltIdx = null;
		List<ICFGenKbGelCacheObj> toForget = new LinkedList<ICFGenKbGelCacheObj>();
		ICFGenKbGelCacheObj cur = null;
		Iterator<ICFGenKbGelCacheObj> iter = members.values().iterator();
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
	 *	CFGenKbGelCacheObj.
	 */
	public ICFGenKbGelCacheObj newInstance() {
		ICFGenKbGelCacheObj inst = new CFGenKbGelCacheObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbGelCacheObj.
	 */
	public ICFGenKbGelCacheEditObj newEditInstance( ICFGenKbGelCacheObj orig ) {
		ICFGenKbGelCacheEditObj edit = new CFGenKbGelCacheEditObj( orig );
		return( edit );
	}

	public ICFGenKbGelCacheObj realiseGelCache( ICFGenKbGelCacheObj Obj ) {
		ICFGenKbGelCacheObj obj = Obj;
		CFGenKbGelCachePKey pkey = obj.getPKey();
		ICFGenKbGelCacheObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbGelCacheObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbGelCacheByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByAltIdx != null ) {
				CFGenKbGelCacheByAltIdxKey keyAltIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
				keyAltIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAltIdx.setRequiredCacheName( keepObj.getRequiredCacheName() );
				indexByAltIdx.remove( keyAltIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbGelCacheByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				CFGenKbGelCacheByAltIdxKey keyAltIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
				keyAltIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAltIdx.setRequiredCacheName( keepObj.getRequiredCacheName() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

			if( allGelCache != null ) {
				allGelCache.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelCache != null ) {
				allGelCache.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbGelCacheByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				CFGenKbGelCacheByAltIdxKey keyAltIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
				keyAltIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAltIdx.setRequiredCacheName( keepObj.getRequiredCacheName() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbGelCacheObj createGelCache( ICFGenKbGelCacheObj Obj ) {
		ICFGenKbGelCacheObj obj = Obj;
		CFGenKbGelCacheBuff buff = obj.getGelCacheBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().createGelCache(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbGelCacheObj readGelCache( CFGenKbGelCachePKey pkey ) {
		return( readGelCache( pkey, false ) );
	}

	public ICFGenKbGelCacheObj readGelCache( CFGenKbGelCachePKey pkey, boolean forceRead ) {
		ICFGenKbGelCacheObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbGelCacheBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId() );
			if( readBuff != null ) {
				obj = schema.getGelCacheTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbGelCacheObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGelCacheObj readCachedGelCache( CFGenKbGelCachePKey pkey ) {
		ICFGenKbGelCacheObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelCache( ICFGenKbGelCacheObj obj )
	{
		final String S_ProcName = "CFGenKbGelCacheTableObj.reallyDeepDisposeGelCache() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbGelCachePKey pkey = obj.getPKey();
		ICFGenKbGelCacheObj existing = readCachedGelCache( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbGelCacheByTenantIdxKey keyTenantIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFGenKbGelCacheByAltIdxKey keyAltIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		keyAltIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyAltIdx.setRequiredCacheName( existing.getRequiredCacheName() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByAltIdx != null ) {
			indexByAltIdx.remove( keyAltIdx );
		}


	}
	public void deepDisposeGelCache( CFGenKbGelCachePKey pkey ) {
		ICFGenKbGelCacheObj obj = readCachedGelCache( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGelCacheObj lockGelCache( CFGenKbGelCachePKey pkey ) {
		ICFGenKbGelCacheObj locked = null;
		CFGenKbGelCacheBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getGelCacheTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbGelCacheObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockGelCache", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbGelCacheObj> readAllGelCache() {
		return( readAllGelCache( false ) );
	}

	public List<ICFGenKbGelCacheObj> readAllGelCache( boolean forceRead ) {
		final String S_ProcName = "readAllGelCache";
		if( ( allGelCache == null ) || forceRead ) {
			Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj> map = new HashMap<CFGenKbGelCachePKey,ICFGenKbGelCacheObj>();
			allGelCache = map;
			CFGenKbGelCacheBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().readAllDerived( schema.getAuthorization() );
			CFGenKbGelCacheBuff buff;
			ICFGenKbGelCacheObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelCacheObj realised = (ICFGenKbGelCacheObj)obj.realise();
			}
		}
		int len = allGelCache.size();
		ICFGenKbGelCacheObj arr[] = new ICFGenKbGelCacheObj[len];
		Iterator<ICFGenKbGelCacheObj> valIter = allGelCache.values().iterator();
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
		ArrayList<ICFGenKbGelCacheObj> arrayList = new ArrayList<ICFGenKbGelCacheObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelCacheObj> cmp = new Comparator<ICFGenKbGelCacheObj>() {
			public int compare( ICFGenKbGelCacheObj lhs, ICFGenKbGelCacheObj rhs ) {
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
					CFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					CFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelCacheObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelCacheObj> readCachedAllGelCache() {
		final String S_ProcName = "readCachedAllGelCache";
		ArrayList<ICFGenKbGelCacheObj> arrayList = new ArrayList<ICFGenKbGelCacheObj>();
		if( allGelCache != null ) {
			int len = allGelCache.size();
			ICFGenKbGelCacheObj arr[] = new ICFGenKbGelCacheObj[len];
			Iterator<ICFGenKbGelCacheObj> valIter = allGelCache.values().iterator();
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
		Comparator<ICFGenKbGelCacheObj> cmp = new Comparator<ICFGenKbGelCacheObj>() {
			public int compare( ICFGenKbGelCacheObj lhs, ICFGenKbGelCacheObj rhs ) {
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
					CFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					CFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelCacheByIdIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public ICFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId, boolean forceRead )
	{
		CFGenKbGelCachePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		ICFGenKbGelCacheObj obj = readGelCache( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId )
	{
		return( readGelCacheByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCacheByTenantIdx";
		CFGenKbGelCacheByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelCacheByTenantIdxKey,
				Map< CFGenKbGelCachePKey, ICFGenKbGelCacheObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelCachePKey, ICFGenKbGelCacheObj>();
			ICFGenKbGelCacheObj obj;
			CFGenKbGelCacheBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbGelCacheBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getGelCacheTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelCacheObj realised = (ICFGenKbGelCacheObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelCacheObj arr[] = new ICFGenKbGelCacheObj[len];
		Iterator<ICFGenKbGelCacheObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelCacheObj> arrayList = new ArrayList<ICFGenKbGelCacheObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelCacheObj> cmp = new Comparator<ICFGenKbGelCacheObj>() {
			public int compare( ICFGenKbGelCacheObj lhs, ICFGenKbGelCacheObj rhs ) {
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
					CFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					CFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelCacheObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGelCacheObj readGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		return( readGelCacheByAltIdx( TenantId,
			CacheName,
			false ) );
	}

	public ICFGenKbGelCacheObj readGelCacheByAltIdx( long TenantId,
		String CacheName, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< CFGenKbGelCacheByAltIdxKey,
				ICFGenKbGelCacheObj >();
		}
		CFGenKbGelCacheByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );
		ICFGenKbGelCacheObj obj = null;
		if( ( ! forceRead ) && indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
		}
		else {
			CFGenKbGelCacheBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByAltIdx( schema.getAuthorization(),
				TenantId,
				CacheName );
			if( buff != null ) {
				obj = schema.getGelCacheTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbGelCacheObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGelCacheObj readCachedGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		ICFGenKbGelCacheObj obj = null;
		CFGenKbGelCachePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		obj = readCachedGelCache( pkey );
		return( obj );
	}

	public List<ICFGenKbGelCacheObj> readCachedGelCacheByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelCacheByTenantIdx";
		CFGenKbGelCacheByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbGelCacheObj> arrayList = new ArrayList<ICFGenKbGelCacheObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbGelCacheObj arr[] = new ICFGenKbGelCacheObj[len];
				Iterator<ICFGenKbGelCacheObj> valIter = dict.values().iterator();
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
			ICFGenKbGelCacheObj obj;
			Iterator<ICFGenKbGelCacheObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelCacheObj> cmp = new Comparator<ICFGenKbGelCacheObj>() {
			public int compare( ICFGenKbGelCacheObj lhs, ICFGenKbGelCacheObj rhs ) {
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
					CFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					CFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbGelCacheObj readCachedGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		ICFGenKbGelCacheObj obj = null;
		CFGenKbGelCacheByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );
		if( indexByAltIdx != null ) {
			if( indexByAltIdx.containsKey( key ) ) {
				obj = indexByAltIdx.get( key );
			}
			else {
				Iterator<ICFGenKbGelCacheObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbGelCacheObj> valIter = members.values().iterator();
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

	public void deepDisposeGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		ICFGenKbGelCacheObj obj = readCachedGelCacheByIdIdx( TenantId,
				GelCacheId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelCacheByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelCacheByTenantIdx";
		ICFGenKbGelCacheObj obj;
		List<ICFGenKbGelCacheObj> arrayList = readCachedGelCacheByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelCacheObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		ICFGenKbGelCacheObj obj = readCachedGelCacheByAltIdx( TenantId,
				CacheName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGelCacheObj updateGelCache( ICFGenKbGelCacheObj Obj ) {
		ICFGenKbGelCacheObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().updateGelCache( schema.getAuthorization(),
			Obj.getGelCacheBuff() );
		obj = (ICFGenKbGelCacheObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteGelCache( ICFGenKbGelCacheObj Obj ) {
		ICFGenKbGelCacheObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCache( schema.getAuthorization(),
			obj.getGelCacheBuff() );
		Obj.forget();
	}

	public void deleteGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		CFGenKbGelCachePKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		ICFGenKbGelCacheObj obj = readGelCache( pkey );
		if( obj != null ) {
			ICFGenKbGelCacheEditObj editObj = (ICFGenKbGelCacheEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbGelCacheEditObj)obj.beginEdit();
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
		deepDisposeGelCacheByIdIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelCacheByTenantIdx( long TenantId )
	{
		CFGenKbGelCacheByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelCacheByTenantIdxKey,
				Map< CFGenKbGelCachePKey, ICFGenKbGelCacheObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbGelCachePKey, ICFGenKbGelCacheObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbGelCacheObj> iter = dict.values().iterator();
			ICFGenKbGelCacheObj obj;
			List<ICFGenKbGelCacheObj> toForget = new LinkedList<ICFGenKbGelCacheObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelCacheByTenantIdx( TenantId );
	}

	public void deleteGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< CFGenKbGelCacheByAltIdxKey,
				ICFGenKbGelCacheObj >();
		}
		CFGenKbGelCacheByAltIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );
		ICFGenKbGelCacheObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByAltIdx( schema.getAuthorization(),
				TenantId,
				CacheName );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByAltIdx( schema.getAuthorization(),
				TenantId,
				CacheName );
		}
		deepDisposeGelCacheByAltIdx( TenantId,
				CacheName );
	}
}