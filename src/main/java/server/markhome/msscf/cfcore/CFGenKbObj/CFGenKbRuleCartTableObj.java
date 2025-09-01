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

public class CFGenKbRuleCartTableObj
	implements ICFGenKbRuleCartTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj> members;
	private Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj> allRuleCart;
	private Map< CFGenKbRuleCartByTenantIdxKey,
		Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj > > indexByTenantIdx;
	private Map< CFGenKbRuleCartByNameIdxKey,
		ICFGenKbRuleCartObj > indexByNameIdx;
	public static String TABLE_NAME = "RuleCart";
	public static String TABLE_DBNAME = "kbrulecart";

	public CFGenKbRuleCartTableObj() {
		schema = null;
		members = new HashMap<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj>();
		allRuleCart = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
	}

	public CFGenKbRuleCartTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj>();
		allRuleCart = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
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
		allRuleCart = null;
		indexByTenantIdx = null;
		indexByNameIdx = null;
		List<ICFGenKbRuleCartObj> toForget = new LinkedList<ICFGenKbRuleCartObj>();
		ICFGenKbRuleCartObj cur = null;
		Iterator<ICFGenKbRuleCartObj> iter = members.values().iterator();
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
	 *	CFGenKbRuleCartObj.
	 */
	public ICFGenKbRuleCartObj newInstance() {
		ICFGenKbRuleCartObj inst = new CFGenKbRuleCartObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbRuleCartObj.
	 */
	public ICFGenKbRuleCartEditObj newEditInstance( ICFGenKbRuleCartObj orig ) {
		ICFGenKbRuleCartEditObj edit = new CFGenKbRuleCartEditObj( orig );
		return( edit );
	}

	public ICFGenKbRuleCartObj realiseRuleCart( ICFGenKbRuleCartObj Obj ) {
		ICFGenKbRuleCartObj obj = Obj;
		CFGenKbRuleCartPKey pkey = obj.getPKey();
		ICFGenKbRuleCartObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbRuleCartObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbRuleCartByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				CFGenKbRuleCartByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbRuleCartByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				CFGenKbRuleCartByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allRuleCart != null ) {
				allRuleCart.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allRuleCart != null ) {
				allRuleCart.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbRuleCartByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				CFGenKbRuleCartByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbRuleCartObj createRuleCart( ICFGenKbRuleCartObj Obj ) {
		ICFGenKbRuleCartObj obj = Obj;
		CFGenKbRuleCartBuff buff = obj.getRuleCartBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().createRuleCart(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbRuleCartObj readRuleCart( CFGenKbRuleCartPKey pkey ) {
		return( readRuleCart( pkey, false ) );
	}

	public ICFGenKbRuleCartObj readRuleCart( CFGenKbRuleCartPKey pkey, boolean forceRead ) {
		ICFGenKbRuleCartObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbRuleCartBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getRuleCartTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbRuleCartObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbRuleCartObj readCachedRuleCart( CFGenKbRuleCartPKey pkey ) {
		ICFGenKbRuleCartObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeRuleCart( ICFGenKbRuleCartObj obj )
	{
		final String S_ProcName = "CFGenKbRuleCartTableObj.reallyDeepDisposeRuleCart() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbRuleCartPKey pkey = obj.getPKey();
		ICFGenKbRuleCartObj existing = readCachedRuleCart( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbRuleCartByTenantIdxKey keyTenantIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFGenKbRuleCartByNameIdxKey keyNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getGenItemTableObj().deepDisposeGenItemByCartIdx( existing.getRequiredTenantId(),
						existing.getRequiredId() );

		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeRuleCart( CFGenKbRuleCartPKey pkey ) {
		ICFGenKbRuleCartObj obj = readCachedRuleCart( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbRuleCartObj lockRuleCart( CFGenKbRuleCartPKey pkey ) {
		ICFGenKbRuleCartObj locked = null;
		CFGenKbRuleCartBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getRuleCartTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbRuleCartObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockRuleCart", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbRuleCartObj> readAllRuleCart() {
		return( readAllRuleCart( false ) );
	}

	public List<ICFGenKbRuleCartObj> readAllRuleCart( boolean forceRead ) {
		final String S_ProcName = "readAllRuleCart";
		if( ( allRuleCart == null ) || forceRead ) {
			Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj> map = new HashMap<CFGenKbRuleCartPKey,ICFGenKbRuleCartObj>();
			allRuleCart = map;
			CFGenKbRuleCartBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readAllDerived( schema.getAuthorization() );
			CFGenKbRuleCartBuff buff;
			ICFGenKbRuleCartObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( buff );
				ICFGenKbRuleCartObj realised = (ICFGenKbRuleCartObj)obj.realise();
			}
		}
		int len = allRuleCart.size();
		ICFGenKbRuleCartObj arr[] = new ICFGenKbRuleCartObj[len];
		Iterator<ICFGenKbRuleCartObj> valIter = allRuleCart.values().iterator();
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
		ArrayList<ICFGenKbRuleCartObj> arrayList = new ArrayList<ICFGenKbRuleCartObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbRuleCartObj> cmp = new Comparator<ICFGenKbRuleCartObj>() {
			public int compare( ICFGenKbRuleCartObj lhs, ICFGenKbRuleCartObj rhs ) {
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
					CFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					CFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbRuleCartObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbRuleCartObj> readCachedAllRuleCart() {
		final String S_ProcName = "readCachedAllRuleCart";
		ArrayList<ICFGenKbRuleCartObj> arrayList = new ArrayList<ICFGenKbRuleCartObj>();
		if( allRuleCart != null ) {
			int len = allRuleCart.size();
			ICFGenKbRuleCartObj arr[] = new ICFGenKbRuleCartObj[len];
			Iterator<ICFGenKbRuleCartObj> valIter = allRuleCart.values().iterator();
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
		Comparator<ICFGenKbRuleCartObj> cmp = new Comparator<ICFGenKbRuleCartObj>() {
			public int compare( ICFGenKbRuleCartObj lhs, ICFGenKbRuleCartObj rhs ) {
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
					CFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					CFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id )
	{
		return( readRuleCartByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFGenKbRuleCartObj readRuleCartByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFGenKbRuleCartPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFGenKbRuleCartObj obj = readRuleCart( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId )
	{
		return( readRuleCartByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbRuleCartObj> readRuleCartByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readRuleCartByTenantIdx";
		CFGenKbRuleCartByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbRuleCartByTenantIdxKey,
				Map< CFGenKbRuleCartPKey, ICFGenKbRuleCartObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj>();
			ICFGenKbRuleCartObj obj;
			CFGenKbRuleCartBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbRuleCartBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getRuleCartTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( buff );
				ICFGenKbRuleCartObj realised = (ICFGenKbRuleCartObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbRuleCartObj arr[] = new ICFGenKbRuleCartObj[len];
		Iterator<ICFGenKbRuleCartObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbRuleCartObj> arrayList = new ArrayList<ICFGenKbRuleCartObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbRuleCartObj> cmp = new Comparator<ICFGenKbRuleCartObj>() {
			public int compare( ICFGenKbRuleCartObj lhs, ICFGenKbRuleCartObj rhs ) {
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
					CFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					CFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbRuleCartObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbRuleCartObj readRuleCartByNameIdx( long TenantId,
		String Name )
	{
		return( readRuleCartByNameIdx( TenantId,
			Name,
			false ) );
	}

	public ICFGenKbRuleCartObj readRuleCartByNameIdx( long TenantId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbRuleCartByNameIdxKey,
				ICFGenKbRuleCartObj >();
		}
		CFGenKbRuleCartByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		ICFGenKbRuleCartObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFGenKbRuleCartBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			if( buff != null ) {
				obj = schema.getRuleCartTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbRuleCartObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbRuleCartObj readCachedRuleCartByIdIdx( long TenantId,
		long Id )
	{
		ICFGenKbRuleCartObj obj = null;
		CFGenKbRuleCartPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedRuleCart( pkey );
		return( obj );
	}

	public List<ICFGenKbRuleCartObj> readCachedRuleCartByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedRuleCartByTenantIdx";
		CFGenKbRuleCartByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbRuleCartObj> arrayList = new ArrayList<ICFGenKbRuleCartObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbRuleCartObj arr[] = new ICFGenKbRuleCartObj[len];
				Iterator<ICFGenKbRuleCartObj> valIter = dict.values().iterator();
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
			ICFGenKbRuleCartObj obj;
			Iterator<ICFGenKbRuleCartObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbRuleCartObj> cmp = new Comparator<ICFGenKbRuleCartObj>() {
			public int compare( ICFGenKbRuleCartObj lhs, ICFGenKbRuleCartObj rhs ) {
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
					CFGenKbRuleCartPKey lhsPKey = lhs.getPKey();
					CFGenKbRuleCartPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbRuleCartObj readCachedRuleCartByNameIdx( long TenantId,
		String Name )
	{
		ICFGenKbRuleCartObj obj = null;
		CFGenKbRuleCartByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbRuleCartObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbRuleCartObj> valIter = members.values().iterator();
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

	public void deepDisposeRuleCartByIdIdx( long TenantId,
		long Id )
	{
		ICFGenKbRuleCartObj obj = readCachedRuleCartByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeRuleCartByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeRuleCartByTenantIdx";
		ICFGenKbRuleCartObj obj;
		List<ICFGenKbRuleCartObj> arrayList = readCachedRuleCartByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbRuleCartObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeRuleCartByNameIdx( long TenantId,
		String Name )
	{
		ICFGenKbRuleCartObj obj = readCachedRuleCartByNameIdx( TenantId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbRuleCartObj updateRuleCart( ICFGenKbRuleCartObj Obj ) {
		ICFGenKbRuleCartObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().updateRuleCart( schema.getAuthorization(),
			Obj.getRuleCartBuff() );
		obj = (ICFGenKbRuleCartObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteRuleCart( ICFGenKbRuleCartObj Obj ) {
		ICFGenKbRuleCartObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCart( schema.getAuthorization(),
			obj.getRuleCartBuff() );
		Obj.forget();
	}

	public void deleteRuleCartByIdIdx( long TenantId,
		long Id )
	{
		CFGenKbRuleCartPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFGenKbRuleCartObj obj = readRuleCart( pkey );
		if( obj != null ) {
			ICFGenKbRuleCartEditObj editObj = (ICFGenKbRuleCartEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbRuleCartEditObj)obj.beginEdit();
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
		deepDisposeRuleCartByIdIdx( TenantId,
				Id );
	}

	public void deleteRuleCartByTenantIdx( long TenantId )
	{
		CFGenKbRuleCartByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbRuleCartByTenantIdxKey,
				Map< CFGenKbRuleCartPKey, ICFGenKbRuleCartObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbRuleCartPKey, ICFGenKbRuleCartObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbRuleCartObj> iter = dict.values().iterator();
			ICFGenKbRuleCartObj obj;
			List<ICFGenKbRuleCartObj> toForget = new LinkedList<ICFGenKbRuleCartObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeRuleCartByTenantIdx( TenantId );
	}

	public void deleteRuleCartByNameIdx( long TenantId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbRuleCartByNameIdxKey,
				ICFGenKbRuleCartObj >();
		}
		CFGenKbRuleCartByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );
		ICFGenKbRuleCartObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableRuleCart().deleteRuleCartByNameIdx( schema.getAuthorization(),
				TenantId,
				Name );
		}
		deepDisposeRuleCartByNameIdx( TenantId,
				Name );
	}
}