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

public class CFGenKbSecFormTableObj
	implements ICFGenKbSecFormTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> members;
	private Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> allSecForm;
	private Map< CFGenKbSecFormByClusterIdxKey,
		Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > > indexByClusterIdx;
	private Map< CFGenKbSecFormBySecAppIdxKey,
		Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > > indexBySecAppIdx;
	private Map< CFGenKbSecFormByUJEEServletIdxKey,
		ICFGenKbSecFormObj > indexByUJEEServletIdx;
	public static String TABLE_NAME = "SecForm";
	public static String TABLE_DBNAME = "secform";

	public CFGenKbSecFormTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSecFormPKey, ICFGenKbSecFormObj>();
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
	}

	public CFGenKbSecFormTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSecFormPKey, ICFGenKbSecFormObj>();
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
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
		allSecForm = null;
		indexByClusterIdx = null;
		indexBySecAppIdx = null;
		indexByUJEEServletIdx = null;
		List<ICFGenKbSecFormObj> toForget = new LinkedList<ICFGenKbSecFormObj>();
		ICFGenKbSecFormObj cur = null;
		Iterator<ICFGenKbSecFormObj> iter = members.values().iterator();
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
	 *	CFGenKbSecFormObj.
	 */
	public ICFGenKbSecFormObj newInstance() {
		ICFGenKbSecFormObj inst = new CFGenKbSecFormObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecFormObj.
	 */
	public ICFGenKbSecFormEditObj newEditInstance( ICFGenKbSecFormObj orig ) {
		ICFGenKbSecFormEditObj edit = new CFGenKbSecFormEditObj( orig );
		return( edit );
	}

	public ICFGenKbSecFormObj realiseSecForm( ICFGenKbSecFormObj Obj ) {
		ICFGenKbSecFormObj obj = Obj;
		CFGenKbSecFormPKey pkey = obj.getPKey();
		ICFGenKbSecFormObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSecFormObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				CFGenKbSecFormByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexBySecAppIdx != null ) {
				CFGenKbSecFormBySecAppIdxKey keySecAppIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.remove( keepObj.getPKey() );
					if( mapSecAppIdx.size() <= 0 ) {
						indexBySecAppIdx.remove( keySecAppIdx );
					}
				}
			}

			if( indexByUJEEServletIdx != null ) {
				CFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.remove( keyUJEEServletIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				CFGenKbSecFormByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecAppIdx != null ) {
				CFGenKbSecFormBySecAppIdxKey keySecAppIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEServletIdx != null ) {
				CFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.put( keyUJEEServletIdx, keepObj );
			}

			if( allSecForm != null ) {
				allSecForm.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecForm != null ) {
				allSecForm.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				CFGenKbSecFormByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecAppIdx != null ) {
				CFGenKbSecFormBySecAppIdxKey keySecAppIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
				keySecAppIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keySecAppIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj > mapSecAppIdx = indexBySecAppIdx.get( keySecAppIdx );
				if( mapSecAppIdx != null ) {
					mapSecAppIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEServletIdx != null ) {
				CFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
				keyUJEEServletIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEServletIdx.setRequiredSecAppId( keepObj.getRequiredSecAppId() );
				keyUJEEServletIdx.setRequiredJEEServletMapName( keepObj.getRequiredJEEServletMapName() );
				indexByUJEEServletIdx.put( keyUJEEServletIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbSecFormObj createSecForm( ICFGenKbSecFormObj Obj ) {
		ICFGenKbSecFormObj obj = Obj;
		CFGenKbSecFormBuff buff = obj.getSecFormBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().createSecForm(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSecFormObj readSecForm( CFGenKbSecFormPKey pkey ) {
		return( readSecForm( pkey, false ) );
	}

	public ICFGenKbSecFormObj readSecForm( CFGenKbSecFormPKey pkey, boolean forceRead ) {
		ICFGenKbSecFormObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSecFormBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecFormId() );
			if( readBuff != null ) {
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSecFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecFormObj readCachedSecForm( CFGenKbSecFormPKey pkey ) {
		ICFGenKbSecFormObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecForm( ICFGenKbSecFormObj obj )
	{
		final String S_ProcName = "CFGenKbSecFormTableObj.reallyDeepDisposeSecForm() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSecFormPKey pkey = obj.getPKey();
		ICFGenKbSecFormObj existing = readCachedSecForm( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSecFormByClusterIdxKey keyClusterIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		CFGenKbSecFormBySecAppIdxKey keySecAppIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		CFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		keyUJEEServletIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEServletIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );
		keyUJEEServletIdx.setRequiredJEEServletMapName( existing.getRequiredJEEServletMapName() );



		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexBySecAppIdx != null ) {
			if( indexBySecAppIdx.containsKey( keySecAppIdx ) ) {
				indexBySecAppIdx.get( keySecAppIdx ).remove( pkey );
				if( indexBySecAppIdx.get( keySecAppIdx ).size() <= 0 ) {
					indexBySecAppIdx.remove( keySecAppIdx );
				}
			}
		}

		if( indexByUJEEServletIdx != null ) {
			indexByUJEEServletIdx.remove( keyUJEEServletIdx );
		}


	}
	public void deepDisposeSecForm( CFGenKbSecFormPKey pkey ) {
		ICFGenKbSecFormObj obj = readCachedSecForm( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecFormObj lockSecForm( CFGenKbSecFormPKey pkey ) {
		ICFGenKbSecFormObj locked = null;
		CFGenKbSecFormBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecFormTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSecFormObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSecForm", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSecFormObj> readAllSecForm() {
		return( readAllSecForm( false ) );
	}

	public List<ICFGenKbSecFormObj> readAllSecForm( boolean forceRead ) {
		final String S_ProcName = "readAllSecForm";
		if( ( allSecForm == null ) || forceRead ) {
			Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> map = new HashMap<CFGenKbSecFormPKey,ICFGenKbSecFormObj>();
			allSecForm = map;
			CFGenKbSecFormBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().readAllDerived( schema.getAuthorization() );
			CFGenKbSecFormBuff buff;
			ICFGenKbSecFormObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecFormObj realised = (ICFGenKbSecFormObj)obj.realise();
			}
		}
		int len = allSecForm.size();
		ICFGenKbSecFormObj arr[] = new ICFGenKbSecFormObj[len];
		Iterator<ICFGenKbSecFormObj> valIter = allSecForm.values().iterator();
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
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecFormObj> cmp = new Comparator<ICFGenKbSecFormObj>() {
			public int compare( ICFGenKbSecFormObj lhs, ICFGenKbSecFormObj rhs ) {
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
					CFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					CFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecFormObj> readCachedAllSecForm() {
		final String S_ProcName = "readCachedAllSecForm";
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>();
		if( allSecForm != null ) {
			int len = allSecForm.size();
			ICFGenKbSecFormObj arr[] = new ICFGenKbSecFormObj[len];
			Iterator<ICFGenKbSecFormObj> valIter = allSecForm.values().iterator();
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
		Comparator<ICFGenKbSecFormObj> cmp = new Comparator<ICFGenKbSecFormObj>() {
			public int compare( ICFGenKbSecFormObj lhs, ICFGenKbSecFormObj rhs ) {
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
					CFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					CFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageAllSecForm";
		Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> map = new HashMap<CFGenKbSecFormPKey,ICFGenKbSecFormObj>();
		CFGenKbSecFormBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecFormId );
		CFGenKbSecFormBuff buff;
		ICFGenKbSecFormObj obj;
		ICFGenKbSecFormObj realised;
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbSecFormObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		return( readSecFormByIdIdx( ClusterId,
			SecFormId,
			false ) );
	}

	public ICFGenKbSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId, boolean forceRead )
	{
		CFGenKbSecFormPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		ICFGenKbSecFormObj obj = readSecForm( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId )
	{
		return( readSecFormByClusterIdx( ClusterId,
			false ) );
	}

	public List<ICFGenKbSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecFormByClusterIdx";
		CFGenKbSecFormByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSecFormByClusterIdxKey,
				Map< CFGenKbSecFormPKey, ICFGenKbSecFormObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecFormPKey, ICFGenKbSecFormObj>();
			ICFGenKbSecFormObj obj;
			CFGenKbSecFormBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			CFGenKbSecFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecFormObj realised = (ICFGenKbSecFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecFormObj arr[] = new ICFGenKbSecFormObj[len];
		Iterator<ICFGenKbSecFormObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecFormObj> cmp = new Comparator<ICFGenKbSecFormObj>() {
			public int compare( ICFGenKbSecFormObj lhs, ICFGenKbSecFormObj rhs ) {
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
					CFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					CFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecFormBySecAppIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public List<ICFGenKbSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecFormBySecAppIdx";
		CFGenKbSecFormBySecAppIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> dict;
		if( indexBySecAppIdx == null ) {
			indexBySecAppIdx = new HashMap< CFGenKbSecFormBySecAppIdxKey,
				Map< CFGenKbSecFormPKey, ICFGenKbSecFormObj > >();
		}
		if( ( ! forceRead ) && indexBySecAppIdx.containsKey( key ) ) {
			dict = indexBySecAppIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecFormPKey, ICFGenKbSecFormObj>();
			ICFGenKbSecFormObj obj;
			CFGenKbSecFormBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			CFGenKbSecFormBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecFormObj realised = (ICFGenKbSecFormObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecAppIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecFormObj arr[] = new ICFGenKbSecFormObj[len];
		Iterator<ICFGenKbSecFormObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecFormObj> cmp = new Comparator<ICFGenKbSecFormObj>() {
			public int compare( ICFGenKbSecFormObj lhs, ICFGenKbSecFormObj rhs ) {
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
					CFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					CFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecFormObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecFormObj readSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		return( readSecFormByUJEEServletIdx( ClusterId,
			SecAppId,
			JEEServletMapName,
			false ) );
	}

	public ICFGenKbSecFormObj readSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName, boolean forceRead )
	{
		if( indexByUJEEServletIdx == null ) {
			indexByUJEEServletIdx = new HashMap< CFGenKbSecFormByUJEEServletIdxKey,
				ICFGenKbSecFormObj >();
		}
		CFGenKbSecFormByUJEEServletIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		ICFGenKbSecFormObj obj = null;
		if( ( ! forceRead ) && indexByUJEEServletIdx.containsKey( key ) ) {
			obj = indexByUJEEServletIdx.get( key );
		}
		else {
			CFGenKbSecFormBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().readDerivedByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
			if( buff != null ) {
				obj = schema.getSecFormTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbSecFormObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		ICFGenKbSecFormObj obj = null;
		CFGenKbSecFormPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		obj = readCachedSecForm( pkey );
		return( obj );
	}

	public List<ICFGenKbSecFormObj> readCachedSecFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecFormByClusterIdx";
		CFGenKbSecFormByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>();
		if( indexByClusterIdx != null ) {
			Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				ICFGenKbSecFormObj arr[] = new ICFGenKbSecFormObj[len];
				Iterator<ICFGenKbSecFormObj> valIter = dict.values().iterator();
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
			ICFGenKbSecFormObj obj;
			Iterator<ICFGenKbSecFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecFormObj> cmp = new Comparator<ICFGenKbSecFormObj>() {
			public int compare( ICFGenKbSecFormObj lhs, ICFGenKbSecFormObj rhs ) {
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
					CFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					CFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "readCachedSecFormBySecAppIdx";
		CFGenKbSecFormBySecAppIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		ArrayList<ICFGenKbSecFormObj> arrayList = new ArrayList<ICFGenKbSecFormObj>();
		if( indexBySecAppIdx != null ) {
			Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> dict;
			if( indexBySecAppIdx.containsKey( key ) ) {
				dict = indexBySecAppIdx.get( key );
				int len = dict.size();
				ICFGenKbSecFormObj arr[] = new ICFGenKbSecFormObj[len];
				Iterator<ICFGenKbSecFormObj> valIter = dict.values().iterator();
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
			ICFGenKbSecFormObj obj;
			Iterator<ICFGenKbSecFormObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecFormObj> cmp = new Comparator<ICFGenKbSecFormObj>() {
			public int compare( ICFGenKbSecFormObj lhs, ICFGenKbSecFormObj rhs ) {
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
					CFGenKbSecFormPKey lhsPKey = lhs.getPKey();
					CFGenKbSecFormPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		ICFGenKbSecFormObj obj = null;
		CFGenKbSecFormByUJEEServletIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		if( indexByUJEEServletIdx != null ) {
			if( indexByUJEEServletIdx.containsKey( key ) ) {
				obj = indexByUJEEServletIdx.get( key );
			}
			else {
				Iterator<ICFGenKbSecFormObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbSecFormObj> valIter = members.values().iterator();
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

	public void deepDisposeSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		ICFGenKbSecFormObj obj = readCachedSecFormByIdIdx( ClusterId,
				SecFormId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecFormByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecFormByClusterIdx";
		ICFGenKbSecFormObj obj;
		List<ICFGenKbSecFormObj> arrayList = readCachedSecFormByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "deepDisposeSecFormBySecAppIdx";
		ICFGenKbSecFormObj obj;
		List<ICFGenKbSecFormObj> arrayList = readCachedSecFormBySecAppIdx( ClusterId,
				SecAppId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecFormObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		ICFGenKbSecFormObj obj = readCachedSecFormByUJEEServletIdx( ClusterId,
				SecAppId,
				JEEServletMapName );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecFormObj> pageSecFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageSecFormByClusterIdx";
		CFGenKbSecFormByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<ICFGenKbSecFormObj> retList = new LinkedList<ICFGenKbSecFormObj>();
		ICFGenKbSecFormObj obj;
		CFGenKbSecFormBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecFormId );
		CFGenKbSecFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecFormObj realised = (ICFGenKbSecFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecAppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageSecFormBySecAppIdx";
		CFGenKbSecFormBySecAppIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		List<ICFGenKbSecFormObj> retList = new LinkedList<ICFGenKbSecFormObj>();
		ICFGenKbSecFormObj obj;
		CFGenKbSecFormBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().pageBuffBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
			priorClusterId,
			priorSecFormId );
		CFGenKbSecFormBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecFormTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecFormObj realised = (ICFGenKbSecFormObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbSecFormObj updateSecForm( ICFGenKbSecFormObj Obj ) {
		ICFGenKbSecFormObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().updateSecForm( schema.getAuthorization(),
			Obj.getSecFormBuff() );
		obj = (ICFGenKbSecFormObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecForm( ICFGenKbSecFormObj Obj ) {
		ICFGenKbSecFormObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecForm( schema.getAuthorization(),
			obj.getSecFormBuff() );
		Obj.forget();
	}

	public void deleteSecFormByIdIdx( long ClusterId,
		int SecFormId )
	{
		CFGenKbSecFormPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecFormId( SecFormId );
		ICFGenKbSecFormObj obj = readSecForm( pkey );
		if( obj != null ) {
			ICFGenKbSecFormEditObj editObj = (ICFGenKbSecFormEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSecFormEditObj)obj.beginEdit();
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
		deepDisposeSecFormByIdIdx( ClusterId,
				SecFormId );
	}

	public void deleteSecFormByClusterIdx( long ClusterId )
	{
		CFGenKbSecFormByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSecFormByClusterIdxKey,
				Map< CFGenKbSecFormPKey, ICFGenKbSecFormObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> dict = indexByClusterIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<ICFGenKbSecFormObj> iter = dict.values().iterator();
			ICFGenKbSecFormObj obj;
			List<ICFGenKbSecFormObj> toForget = new LinkedList<ICFGenKbSecFormObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecFormByClusterIdx( ClusterId );
	}

	public void deleteSecFormBySecAppIdx( long ClusterId,
		int SecAppId )
	{
		CFGenKbSecFormBySecAppIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		if( indexBySecAppIdx == null ) {
			indexBySecAppIdx = new HashMap< CFGenKbSecFormBySecAppIdxKey,
				Map< CFGenKbSecFormPKey, ICFGenKbSecFormObj > >();
		}
		if( indexBySecAppIdx.containsKey( key ) ) {
			Map<CFGenKbSecFormPKey, ICFGenKbSecFormObj> dict = indexBySecAppIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
			Iterator<ICFGenKbSecFormObj> iter = dict.values().iterator();
			ICFGenKbSecFormObj obj;
			List<ICFGenKbSecFormObj> toForget = new LinkedList<ICFGenKbSecFormObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecAppIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormBySecAppIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId );
		}
		deepDisposeSecFormBySecAppIdx( ClusterId,
				SecAppId );
	}

	public void deleteSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		if( indexByUJEEServletIdx == null ) {
			indexByUJEEServletIdx = new HashMap< CFGenKbSecFormByUJEEServletIdxKey,
				ICFGenKbSecFormObj >();
		}
		CFGenKbSecFormByUJEEServletIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );
		ICFGenKbSecFormObj obj = null;
		if( indexByUJEEServletIdx.containsKey( key ) ) {
			obj = indexByUJEEServletIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecForm().deleteSecFormByUJEEServletIdx( schema.getAuthorization(),
				ClusterId,
				SecAppId,
				JEEServletMapName );
		}
		deepDisposeSecFormByUJEEServletIdx( ClusterId,
				SecAppId,
				JEEServletMapName );
	}
}