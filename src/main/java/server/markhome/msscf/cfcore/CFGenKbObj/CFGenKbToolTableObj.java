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

public class CFGenKbToolTableObj
	implements ICFGenKbToolTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbToolPKey, ICFGenKbToolObj> members;
	private Map<CFGenKbToolPKey, ICFGenKbToolObj> allTool;
	private Map< CFGenKbToolByNameIdxKey,
		ICFGenKbToolObj > indexByNameIdx;
	private Map< CFGenKbToolByReplacesIdxKey,
		Map<CFGenKbToolPKey, ICFGenKbToolObj > > indexByReplacesIdx;
	public static String TABLE_NAME = "Tool";
	public static String TABLE_DBNAME = "kbtool";

	public CFGenKbToolTableObj() {
		schema = null;
		members = new HashMap<CFGenKbToolPKey, ICFGenKbToolObj>();
		allTool = null;
		indexByNameIdx = null;
		indexByReplacesIdx = null;
	}

	public CFGenKbToolTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbToolPKey, ICFGenKbToolObj>();
		allTool = null;
		indexByNameIdx = null;
		indexByReplacesIdx = null;
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
		allTool = null;
		indexByNameIdx = null;
		indexByReplacesIdx = null;
		List<ICFGenKbToolObj> toForget = new LinkedList<ICFGenKbToolObj>();
		ICFGenKbToolObj cur = null;
		Iterator<ICFGenKbToolObj> iter = members.values().iterator();
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
	 *	CFGenKbToolObj.
	 */
	public ICFGenKbToolObj newInstance() {
		ICFGenKbToolObj inst = new CFGenKbToolObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbToolObj.
	 */
	public ICFGenKbToolEditObj newEditInstance( ICFGenKbToolObj orig ) {
		ICFGenKbToolEditObj edit = new CFGenKbToolEditObj( orig );
		return( edit );
	}

	public ICFGenKbToolObj realiseTool( ICFGenKbToolObj Obj ) {
		ICFGenKbToolObj obj = Obj;
		CFGenKbToolPKey pkey = obj.getPKey();
		ICFGenKbToolObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbToolObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				CFGenKbToolByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByReplacesIdx != null ) {
				CFGenKbToolByReplacesIdxKey keyReplacesIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
				keyReplacesIdx.setOptionalReplacesId( keepObj.getOptionalReplacesId() );
				Map<CFGenKbToolPKey, ICFGenKbToolObj > mapReplacesIdx = indexByReplacesIdx.get( keyReplacesIdx );
				if( mapReplacesIdx != null ) {
					mapReplacesIdx.remove( keepObj.getPKey() );
					if( mapReplacesIdx.size() <= 0 ) {
						indexByReplacesIdx.remove( keyReplacesIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				CFGenKbToolByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByReplacesIdx != null ) {
				CFGenKbToolByReplacesIdxKey keyReplacesIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
				keyReplacesIdx.setOptionalReplacesId( keepObj.getOptionalReplacesId() );
				Map<CFGenKbToolPKey, ICFGenKbToolObj > mapReplacesIdx = indexByReplacesIdx.get( keyReplacesIdx );
				if( mapReplacesIdx != null ) {
					mapReplacesIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allTool != null ) {
				allTool.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTool != null ) {
				allTool.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				CFGenKbToolByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByReplacesIdx != null ) {
				CFGenKbToolByReplacesIdxKey keyReplacesIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
				keyReplacesIdx.setOptionalReplacesId( keepObj.getOptionalReplacesId() );
				Map<CFGenKbToolPKey, ICFGenKbToolObj > mapReplacesIdx = indexByReplacesIdx.get( keyReplacesIdx );
				if( mapReplacesIdx != null ) {
					mapReplacesIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbToolObj createTool( ICFGenKbToolObj Obj ) {
		ICFGenKbToolObj obj = Obj;
		CFGenKbToolBuff buff = obj.getToolBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableTool().createTool(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbToolObj readTool( CFGenKbToolPKey pkey ) {
		return( readTool( pkey, false ) );
	}

	public ICFGenKbToolObj readTool( CFGenKbToolPKey pkey, boolean forceRead ) {
		ICFGenKbToolObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbToolBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getToolTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbToolObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbToolObj readCachedTool( CFGenKbToolPKey pkey ) {
		ICFGenKbToolObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTool( ICFGenKbToolObj obj )
	{
		final String S_ProcName = "CFGenKbToolTableObj.reallyDeepDisposeTool() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbToolPKey pkey = obj.getPKey();
		ICFGenKbToolObj existing = readCachedTool( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbToolByNameIdxKey keyNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		CFGenKbToolByReplacesIdxKey keyReplacesIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		keyReplacesIdx.setOptionalReplacesId( existing.getOptionalReplacesId() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByReplacesIdx != null ) {
			if( indexByReplacesIdx.containsKey( keyReplacesIdx ) ) {
				indexByReplacesIdx.get( keyReplacesIdx ).remove( pkey );
				if( indexByReplacesIdx.get( keyReplacesIdx ).size() <= 0 ) {
					indexByReplacesIdx.remove( keyReplacesIdx );
				}
			}
		}


	}
	public void deepDisposeTool( CFGenKbToolPKey pkey ) {
		ICFGenKbToolObj obj = readCachedTool( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbToolObj lockTool( CFGenKbToolPKey pkey ) {
		ICFGenKbToolObj locked = null;
		CFGenKbToolBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTool().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getToolTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbToolObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockTool", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbToolObj> readAllTool() {
		return( readAllTool( false ) );
	}

	public List<ICFGenKbToolObj> readAllTool( boolean forceRead ) {
		final String S_ProcName = "readAllTool";
		if( ( allTool == null ) || forceRead ) {
			Map<CFGenKbToolPKey, ICFGenKbToolObj> map = new HashMap<CFGenKbToolPKey,ICFGenKbToolObj>();
			allTool = map;
			CFGenKbToolBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTool().readAllDerived( schema.getAuthorization() );
			CFGenKbToolBuff buff;
			ICFGenKbToolObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolObj realised = (ICFGenKbToolObj)obj.realise();
			}
		}
		int len = allTool.size();
		ICFGenKbToolObj arr[] = new ICFGenKbToolObj[len];
		Iterator<ICFGenKbToolObj> valIter = allTool.values().iterator();
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
		ArrayList<ICFGenKbToolObj> arrayList = new ArrayList<ICFGenKbToolObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolObj> cmp = new Comparator<ICFGenKbToolObj>() {
			public int compare( ICFGenKbToolObj lhs, ICFGenKbToolObj rhs ) {
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
					CFGenKbToolPKey lhsPKey = lhs.getPKey();
					CFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolObj> readCachedAllTool() {
		final String S_ProcName = "readCachedAllTool";
		ArrayList<ICFGenKbToolObj> arrayList = new ArrayList<ICFGenKbToolObj>();
		if( allTool != null ) {
			int len = allTool.size();
			ICFGenKbToolObj arr[] = new ICFGenKbToolObj[len];
			Iterator<ICFGenKbToolObj> valIter = allTool.values().iterator();
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
		Comparator<ICFGenKbToolObj> cmp = new Comparator<ICFGenKbToolObj>() {
			public int compare( ICFGenKbToolObj lhs, ICFGenKbToolObj rhs ) {
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
					CFGenKbToolPKey lhsPKey = lhs.getPKey();
					CFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbToolObj readToolByIdIdx( short Id )
	{
		return( readToolByIdIdx( Id,
			false ) );
	}

	public ICFGenKbToolObj readToolByIdIdx( short Id, boolean forceRead )
	{
		CFGenKbToolPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		pkey.setRequiredId( Id );
		ICFGenKbToolObj obj = readTool( pkey, forceRead );
		return( obj );
	}

	public ICFGenKbToolObj readToolByNameIdx( String Name )
	{
		return( readToolByNameIdx( Name,
			false ) );
	}

	public ICFGenKbToolObj readToolByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbToolByNameIdxKey,
				ICFGenKbToolObj >();
		}
		CFGenKbToolByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );
		ICFGenKbToolObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFGenKbToolBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getToolTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbToolObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId )
	{
		return( readToolByReplacesIdx( ReplacesId,
			false ) );
	}

	public List<ICFGenKbToolObj> readToolByReplacesIdx( Short ReplacesId,
		boolean forceRead )
	{
		final String S_ProcName = "readToolByReplacesIdx";
		CFGenKbToolByReplacesIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );
		Map<CFGenKbToolPKey, ICFGenKbToolObj> dict;
		if( indexByReplacesIdx == null ) {
			indexByReplacesIdx = new HashMap< CFGenKbToolByReplacesIdxKey,
				Map< CFGenKbToolPKey, ICFGenKbToolObj > >();
		}
		if( ( ! forceRead ) && indexByReplacesIdx.containsKey( key ) ) {
			dict = indexByReplacesIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolPKey, ICFGenKbToolObj>();
			ICFGenKbToolObj obj;
			CFGenKbToolBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTool().readDerivedByReplacesIdx( schema.getAuthorization(),
				ReplacesId );
			CFGenKbToolBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolObj realised = (ICFGenKbToolObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByReplacesIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolObj arr[] = new ICFGenKbToolObj[len];
		Iterator<ICFGenKbToolObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolObj> arrayList = new ArrayList<ICFGenKbToolObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolObj> cmp = new Comparator<ICFGenKbToolObj>() {
			public int compare( ICFGenKbToolObj lhs, ICFGenKbToolObj rhs ) {
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
					CFGenKbToolPKey lhsPKey = lhs.getPKey();
					CFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbToolObj readCachedToolByIdIdx( short Id )
	{
		ICFGenKbToolObj obj = null;
		CFGenKbToolPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedTool( pkey );
		return( obj );
	}

	public ICFGenKbToolObj readCachedToolByNameIdx( String Name )
	{
		ICFGenKbToolObj obj = null;
		CFGenKbToolByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbToolObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbToolObj> valIter = members.values().iterator();
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

	public List<ICFGenKbToolObj> readCachedToolByReplacesIdx( Short ReplacesId )
	{
		final String S_ProcName = "readCachedToolByReplacesIdx";
		CFGenKbToolByReplacesIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );
		ArrayList<ICFGenKbToolObj> arrayList = new ArrayList<ICFGenKbToolObj>();
		if( indexByReplacesIdx != null ) {
			Map<CFGenKbToolPKey, ICFGenKbToolObj> dict;
			if( indexByReplacesIdx.containsKey( key ) ) {
				dict = indexByReplacesIdx.get( key );
				int len = dict.size();
				ICFGenKbToolObj arr[] = new ICFGenKbToolObj[len];
				Iterator<ICFGenKbToolObj> valIter = dict.values().iterator();
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
			ICFGenKbToolObj obj;
			Iterator<ICFGenKbToolObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolObj> cmp = new Comparator<ICFGenKbToolObj>() {
			public int compare( ICFGenKbToolObj lhs, ICFGenKbToolObj rhs ) {
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
					CFGenKbToolPKey lhsPKey = lhs.getPKey();
					CFGenKbToolPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeToolByIdIdx( short Id )
	{
		ICFGenKbToolObj obj = readCachedToolByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolByNameIdx( String Name )
	{
		ICFGenKbToolObj obj = readCachedToolByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolByReplacesIdx( Short ReplacesId )
	{
		final String S_ProcName = "deepDisposeToolByReplacesIdx";
		ICFGenKbToolObj obj;
		List<ICFGenKbToolObj> arrayList = readCachedToolByReplacesIdx( ReplacesId );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbToolObj updateTool( ICFGenKbToolObj Obj ) {
		ICFGenKbToolObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableTool().updateTool( schema.getAuthorization(),
			Obj.getToolBuff() );
		obj = (ICFGenKbToolObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTool( ICFGenKbToolObj Obj ) {
		ICFGenKbToolObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableTool().deleteTool( schema.getAuthorization(),
			obj.getToolBuff() );
		Obj.forget();
	}

	public void deleteToolByIdIdx( short Id )
	{
		CFGenKbToolPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newPKey();
		pkey.setRequiredId( Id );
		ICFGenKbToolObj obj = readTool( pkey );
		if( obj != null ) {
			ICFGenKbToolEditObj editObj = (ICFGenKbToolEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbToolEditObj)obj.beginEdit();
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
		deepDisposeToolByIdIdx( Id );
	}

	public void deleteToolByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbToolByNameIdxKey,
				ICFGenKbToolObj >();
		}
		CFGenKbToolByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );
		ICFGenKbToolObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeToolByNameIdx( Name );
	}

	public void deleteToolByReplacesIdx( Short ReplacesId )
	{
		CFGenKbToolByReplacesIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );
		if( indexByReplacesIdx == null ) {
			indexByReplacesIdx = new HashMap< CFGenKbToolByReplacesIdxKey,
				Map< CFGenKbToolPKey, ICFGenKbToolObj > >();
		}
		if( indexByReplacesIdx.containsKey( key ) ) {
			Map<CFGenKbToolPKey, ICFGenKbToolObj> dict = indexByReplacesIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByReplacesIdx( schema.getAuthorization(),
				ReplacesId );
			Iterator<ICFGenKbToolObj> iter = dict.values().iterator();
			ICFGenKbToolObj obj;
			List<ICFGenKbToolObj> toForget = new LinkedList<ICFGenKbToolObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByReplacesIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTool().deleteToolByReplacesIdx( schema.getAuthorization(),
				ReplacesId );
		}
		deepDisposeToolByReplacesIdx( ReplacesId );
	}
}