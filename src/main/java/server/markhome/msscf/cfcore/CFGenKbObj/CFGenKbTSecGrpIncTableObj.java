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

public class CFGenKbTSecGrpIncTableObj
	implements ICFGenKbTSecGrpIncTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> members;
	private Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> allTSecGrpInc;
	private Map< CFGenKbTSecGrpIncByTenantIdxKey,
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > > indexByTenantIdx;
	private Map< CFGenKbTSecGrpIncByGroupIdxKey,
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > > indexByGroupIdx;
	private Map< CFGenKbTSecGrpIncByIncludeIdxKey,
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > > indexByIncludeIdx;
	private Map< CFGenKbTSecGrpIncByUIncludeIdxKey,
		ICFGenKbTSecGrpIncObj > indexByUIncludeIdx;
	public static String TABLE_NAME = "TSecGrpInc";
	public static String TABLE_DBNAME = "tsecinc";

	public CFGenKbTSecGrpIncTableObj() {
		schema = null;
		members = new HashMap<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj>();
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
	}

	public CFGenKbTSecGrpIncTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj>();
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
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
		allTSecGrpInc = null;
		indexByTenantIdx = null;
		indexByGroupIdx = null;
		indexByIncludeIdx = null;
		indexByUIncludeIdx = null;
		List<ICFGenKbTSecGrpIncObj> toForget = new LinkedList<ICFGenKbTSecGrpIncObj>();
		ICFGenKbTSecGrpIncObj cur = null;
		Iterator<ICFGenKbTSecGrpIncObj> iter = members.values().iterator();
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
	 *	CFGenKbTSecGrpIncObj.
	 */
	public ICFGenKbTSecGrpIncObj newInstance() {
		ICFGenKbTSecGrpIncObj inst = new CFGenKbTSecGrpIncObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbTSecGrpIncObj.
	 */
	public ICFGenKbTSecGrpIncEditObj newEditInstance( ICFGenKbTSecGrpIncObj orig ) {
		ICFGenKbTSecGrpIncEditObj edit = new CFGenKbTSecGrpIncEditObj( orig );
		return( edit );
	}

	public ICFGenKbTSecGrpIncObj realiseTSecGrpInc( ICFGenKbTSecGrpIncObj Obj ) {
		ICFGenKbTSecGrpIncObj obj = Obj;
		CFGenKbTSecGrpIncPKey pkey = obj.getPKey();
		ICFGenKbTSecGrpIncObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbTSecGrpIncObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByGroupIdx != null ) {
				CFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.remove( keepObj.getPKey() );
					if( mapGroupIdx.size() <= 0 ) {
						indexByGroupIdx.remove( keyGroupIdx );
					}
				}
			}

			if( indexByIncludeIdx != null ) {
				CFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.remove( keepObj.getPKey() );
					if( mapIncludeIdx.size() <= 0 ) {
						indexByIncludeIdx.remove( keyIncludeIdx );
					}
				}
			}

			if( indexByUIncludeIdx != null ) {
				CFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.remove( keyUIncludeIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				CFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				CFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				CFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

			if( allTSecGrpInc != null ) {
				allTSecGrpInc.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTSecGrpInc != null ) {
				allTSecGrpInc.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGroupIdx != null ) {
				CFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
				keyGroupIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGroupIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapGroupIdx = indexByGroupIdx.get( keyGroupIdx );
				if( mapGroupIdx != null ) {
					mapGroupIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByIncludeIdx != null ) {
				CFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
				keyIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > mapIncludeIdx = indexByIncludeIdx.get( keyIncludeIdx );
				if( mapIncludeIdx != null ) {
					mapIncludeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUIncludeIdx != null ) {
				CFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
				keyUIncludeIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyUIncludeIdx.setRequiredTSecGroupId( keepObj.getRequiredTSecGroupId() );
				keyUIncludeIdx.setRequiredIncludeGroupId( keepObj.getRequiredIncludeGroupId() );
				indexByUIncludeIdx.put( keyUIncludeIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFGenKbTSecGrpIncObj createTSecGrpInc( ICFGenKbTSecGrpIncObj Obj ) {
		ICFGenKbTSecGrpIncObj obj = Obj;
		CFGenKbTSecGrpIncBuff buff = obj.getTSecGrpIncBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().createTSecGrpInc(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbTSecGrpIncObj readTSecGrpInc( CFGenKbTSecGrpIncPKey pkey ) {
		return( readTSecGrpInc( pkey, false ) );
	}

	public ICFGenKbTSecGrpIncObj readTSecGrpInc( CFGenKbTSecGrpIncPKey pkey, boolean forceRead ) {
		ICFGenKbTSecGrpIncObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbTSecGrpIncBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredTSecGrpIncId() );
			if( readBuff != null ) {
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbTSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbTSecGrpIncObj readCachedTSecGrpInc( CFGenKbTSecGrpIncPKey pkey ) {
		ICFGenKbTSecGrpIncObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeTSecGrpInc( ICFGenKbTSecGrpIncObj obj )
	{
		final String S_ProcName = "CFGenKbTSecGrpIncTableObj.reallyDeepDisposeTSecGrpInc() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbTSecGrpIncPKey pkey = obj.getPKey();
		ICFGenKbTSecGrpIncObj existing = readCachedTSecGrpInc( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		CFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		CFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		CFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUIncludeIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByGroupIdx != null ) {
			if( indexByGroupIdx.containsKey( keyGroupIdx ) ) {
				indexByGroupIdx.get( keyGroupIdx ).remove( pkey );
				if( indexByGroupIdx.get( keyGroupIdx ).size() <= 0 ) {
					indexByGroupIdx.remove( keyGroupIdx );
				}
			}
		}

		if( indexByIncludeIdx != null ) {
			if( indexByIncludeIdx.containsKey( keyIncludeIdx ) ) {
				indexByIncludeIdx.get( keyIncludeIdx ).remove( pkey );
				if( indexByIncludeIdx.get( keyIncludeIdx ).size() <= 0 ) {
					indexByIncludeIdx.remove( keyIncludeIdx );
				}
			}
		}

		if( indexByUIncludeIdx != null ) {
			indexByUIncludeIdx.remove( keyUIncludeIdx );
		}


	}
	public void deepDisposeTSecGrpInc( CFGenKbTSecGrpIncPKey pkey ) {
		ICFGenKbTSecGrpIncObj obj = readCachedTSecGrpInc( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbTSecGrpIncObj lockTSecGrpInc( CFGenKbTSecGrpIncPKey pkey ) {
		ICFGenKbTSecGrpIncObj locked = null;
		CFGenKbTSecGrpIncBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getTSecGrpIncTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbTSecGrpIncObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockTSecGrpInc", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbTSecGrpIncObj> readAllTSecGrpInc() {
		return( readAllTSecGrpInc( false ) );
	}

	public List<ICFGenKbTSecGrpIncObj> readAllTSecGrpInc( boolean forceRead ) {
		final String S_ProcName = "readAllTSecGrpInc";
		if( ( allTSecGrpInc == null ) || forceRead ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> map = new HashMap<CFGenKbTSecGrpIncPKey,ICFGenKbTSecGrpIncObj>();
			allTSecGrpInc = map;
			CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readAllDerived( schema.getAuthorization() );
			CFGenKbTSecGrpIncBuff buff;
			ICFGenKbTSecGrpIncObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
			}
		}
		int len = allTSecGrpInc.size();
		ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
		Iterator<ICFGenKbTSecGrpIncObj> valIter = allTSecGrpInc.values().iterator();
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
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbTSecGrpIncObj> readCachedAllTSecGrpInc() {
		final String S_ProcName = "readCachedAllTSecGrpInc";
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>();
		if( allTSecGrpInc != null ) {
			int len = allTSecGrpInc.size();
			ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
			Iterator<ICFGenKbTSecGrpIncObj> valIter = allTSecGrpInc.values().iterator();
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
		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the TSecGrpInc-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbTSecGrpIncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbTSecGrpIncObj> pageAllTSecGrpInc(Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageAllTSecGrpInc";
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> map = new HashMap<CFGenKbTSecGrpIncPKey,ICFGenKbTSecGrpIncObj>();
		CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageAllBuff( schema.getAuthorization(),
			priorTenantId,
			priorTSecGrpIncId );
		CFGenKbTSecGrpIncBuff buff;
		ICFGenKbTSecGrpIncObj obj;
		ICFGenKbTSecGrpIncObj realised;
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbTSecGrpIncObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		return( readTSecGrpIncByIdIdx( TenantId,
			TSecGrpIncId,
			false ) );
	}

	public ICFGenKbTSecGrpIncObj readTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId, boolean forceRead )
	{
		CFGenKbTSecGrpIncPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		ICFGenKbTSecGrpIncObj obj = readTSecGrpInc( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId )
	{
		return( readTSecGrpIncByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbTSecGrpIncObj> readTSecGrpIncByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByTenantIdx";
		CFGenKbTSecGrpIncByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbTSecGrpIncByTenantIdxKey,
				Map< CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj>();
			ICFGenKbTSecGrpIncObj obj;
			CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
		Iterator<ICFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		return( readTSecGrpIncByGroupIdx( TenantId,
			TSecGroupId,
			false ) );
	}

	public List<ICFGenKbTSecGrpIncObj> readTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByGroupIdx";
		CFGenKbTSecGrpIncByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict;
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< CFGenKbTSecGrpIncByGroupIdxKey,
				Map< CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByGroupIdx.containsKey( key ) ) {
			dict = indexByGroupIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj>();
			ICFGenKbTSecGrpIncObj obj;
			CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			CFGenKbTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGroupIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
		Iterator<ICFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		return( readTSecGrpIncByIncludeIdx( TenantId,
			IncludeGroupId,
			false ) );
	}

	public List<ICFGenKbTSecGrpIncObj> readTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		boolean forceRead )
	{
		final String S_ProcName = "readTSecGrpIncByIncludeIdx";
		CFGenKbTSecGrpIncByIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict;
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< CFGenKbTSecGrpIncByIncludeIdxKey,
				Map< CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > >();
		}
		if( ( ! forceRead ) && indexByIncludeIdx.containsKey( key ) ) {
			dict = indexByIncludeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj>();
			ICFGenKbTSecGrpIncObj obj;
			CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
			CFGenKbTSecGrpIncBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIncludeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
		Iterator<ICFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbTSecGrpIncObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbTSecGrpIncObj readTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		return( readTSecGrpIncByUIncludeIdx( TenantId,
			TSecGroupId,
			IncludeGroupId,
			false ) );
	}

	public ICFGenKbTSecGrpIncObj readTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId, boolean forceRead )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< CFGenKbTSecGrpIncByUIncludeIdxKey,
				ICFGenKbTSecGrpIncObj >();
		}
		CFGenKbTSecGrpIncByUIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ICFGenKbTSecGrpIncObj obj = null;
		if( ( ! forceRead ) && indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
		}
		else {
			CFGenKbTSecGrpIncBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().readDerivedByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
			if( buff != null ) {
				obj = schema.getTSecGrpIncTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbTSecGrpIncObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbTSecGrpIncObj readCachedTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		ICFGenKbTSecGrpIncObj obj = null;
		CFGenKbTSecGrpIncPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		obj = readCachedTSecGrpInc( pkey );
		return( obj );
	}

	public List<ICFGenKbTSecGrpIncObj> readCachedTSecGrpIncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByTenantIdx";
		CFGenKbTSecGrpIncByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
				Iterator<ICFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
			ICFGenKbTSecGrpIncObj obj;
			Iterator<ICFGenKbTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbTSecGrpIncObj> readCachedTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByGroupIdx";
		CFGenKbTSecGrpIncByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>();
		if( indexByGroupIdx != null ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict;
			if( indexByGroupIdx.containsKey( key ) ) {
				dict = indexByGroupIdx.get( key );
				int len = dict.size();
				ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
				Iterator<ICFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
			ICFGenKbTSecGrpIncObj obj;
			Iterator<ICFGenKbTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbTSecGrpIncObj> readCachedTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "readCachedTSecGrpIncByIncludeIdx";
		CFGenKbTSecGrpIncByIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ArrayList<ICFGenKbTSecGrpIncObj> arrayList = new ArrayList<ICFGenKbTSecGrpIncObj>();
		if( indexByIncludeIdx != null ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict;
			if( indexByIncludeIdx.containsKey( key ) ) {
				dict = indexByIncludeIdx.get( key );
				int len = dict.size();
				ICFGenKbTSecGrpIncObj arr[] = new ICFGenKbTSecGrpIncObj[len];
				Iterator<ICFGenKbTSecGrpIncObj> valIter = dict.values().iterator();
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
			ICFGenKbTSecGrpIncObj obj;
			Iterator<ICFGenKbTSecGrpIncObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbTSecGrpIncObj> cmp = new Comparator<ICFGenKbTSecGrpIncObj>() {
			public int compare( ICFGenKbTSecGrpIncObj lhs, ICFGenKbTSecGrpIncObj rhs ) {
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
					CFGenKbTSecGrpIncPKey lhsPKey = lhs.getPKey();
					CFGenKbTSecGrpIncPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbTSecGrpIncObj readCachedTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		ICFGenKbTSecGrpIncObj obj = null;
		CFGenKbTSecGrpIncByUIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByUIncludeIdx != null ) {
			if( indexByUIncludeIdx.containsKey( key ) ) {
				obj = indexByUIncludeIdx.get( key );
			}
			else {
				Iterator<ICFGenKbTSecGrpIncObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbTSecGrpIncObj> valIter = members.values().iterator();
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

	public void deepDisposeTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		ICFGenKbTSecGrpIncObj obj = readCachedTSecGrpIncByIdIdx( TenantId,
				TSecGrpIncId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeTSecGrpIncByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByTenantIdx";
		ICFGenKbTSecGrpIncObj obj;
		List<ICFGenKbTSecGrpIncObj> arrayList = readCachedTSecGrpIncByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbTSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByGroupIdx";
		ICFGenKbTSecGrpIncObj obj;
		List<ICFGenKbTSecGrpIncObj> arrayList = readCachedTSecGrpIncByGroupIdx( TenantId,
				TSecGroupId );
		if( arrayList != null )  {
			Iterator<ICFGenKbTSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "deepDisposeTSecGrpIncByIncludeIdx";
		ICFGenKbTSecGrpIncObj obj;
		List<ICFGenKbTSecGrpIncObj> arrayList = readCachedTSecGrpIncByIncludeIdx( TenantId,
				IncludeGroupId );
		if( arrayList != null )  {
			Iterator<ICFGenKbTSecGrpIncObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		ICFGenKbTSecGrpIncObj obj = readCachedTSecGrpIncByUIncludeIdx( TenantId,
				TSecGroupId,
				IncludeGroupId );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate TenantIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbTSecGrpIncObj> pageTSecGrpIncByTenantIdx( long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByTenantIdx";
		CFGenKbTSecGrpIncByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		List<ICFGenKbTSecGrpIncObj> retList = new LinkedList<ICFGenKbTSecGrpIncObj>();
		ICFGenKbTSecGrpIncObj obj;
		CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByTenantIdx( schema.getAuthorization(),
				TenantId,
			priorTenantId,
			priorTSecGrpIncId );
		CFGenKbTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate GroupIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbTSecGrpIncObj> pageTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByGroupIdx";
		CFGenKbTSecGrpIncByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		List<ICFGenKbTSecGrpIncObj> retList = new LinkedList<ICFGenKbTSecGrpIncObj>();
		ICFGenKbTSecGrpIncObj obj;
		CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
			priorTenantId,
			priorTSecGrpIncId );
		CFGenKbTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of TSecGrpInc-derived instances sorted by their primary keys,
	 *	as identified by the duplicate IncludeIdx key attributes.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return	A List of TSecGrpInc-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbTSecGrpIncObj> pageTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageTSecGrpIncByIncludeIdx";
		CFGenKbTSecGrpIncByIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		List<ICFGenKbTSecGrpIncObj> retList = new LinkedList<ICFGenKbTSecGrpIncObj>();
		ICFGenKbTSecGrpIncObj obj;
		CFGenKbTSecGrpIncBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().pageBuffByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId,
			priorTenantId,
			priorTSecGrpIncId );
		CFGenKbTSecGrpIncBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getTSecGrpIncTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey() );
			obj.setBuff( buff );
			ICFGenKbTSecGrpIncObj realised = (ICFGenKbTSecGrpIncObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbTSecGrpIncObj updateTSecGrpInc( ICFGenKbTSecGrpIncObj Obj ) {
		ICFGenKbTSecGrpIncObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().updateTSecGrpInc( schema.getAuthorization(),
			Obj.getTSecGrpIncBuff() );
		obj = (ICFGenKbTSecGrpIncObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteTSecGrpInc( ICFGenKbTSecGrpIncObj Obj ) {
		ICFGenKbTSecGrpIncObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpInc( schema.getAuthorization(),
			obj.getTSecGrpIncBuff() );
		Obj.forget();
	}

	public void deleteTSecGrpIncByIdIdx( long TenantId,
		long TSecGrpIncId )
	{
		CFGenKbTSecGrpIncPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredTSecGrpIncId( TSecGrpIncId );
		ICFGenKbTSecGrpIncObj obj = readTSecGrpInc( pkey );
		if( obj != null ) {
			ICFGenKbTSecGrpIncEditObj editObj = (ICFGenKbTSecGrpIncEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbTSecGrpIncEditObj)obj.beginEdit();
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
		deepDisposeTSecGrpIncByIdIdx( TenantId,
				TSecGrpIncId );
	}

	public void deleteTSecGrpIncByTenantIdx( long TenantId )
	{
		CFGenKbTSecGrpIncByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbTSecGrpIncByTenantIdxKey,
				Map< CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbTSecGrpIncObj> iter = dict.values().iterator();
			ICFGenKbTSecGrpIncObj obj;
			List<ICFGenKbTSecGrpIncObj> toForget = new LinkedList<ICFGenKbTSecGrpIncObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeTSecGrpIncByTenantIdx( TenantId );
	}

	public void deleteTSecGrpIncByGroupIdx( long TenantId,
		int TSecGroupId )
	{
		CFGenKbTSecGrpIncByGroupIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		if( indexByGroupIdx == null ) {
			indexByGroupIdx = new HashMap< CFGenKbTSecGrpIncByGroupIdxKey,
				Map< CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > >();
		}
		if( indexByGroupIdx.containsKey( key ) ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict = indexByGroupIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
			Iterator<ICFGenKbTSecGrpIncObj> iter = dict.values().iterator();
			ICFGenKbTSecGrpIncObj obj;
			List<ICFGenKbTSecGrpIncObj> toForget = new LinkedList<ICFGenKbTSecGrpIncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGroupIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId );
		}
		deepDisposeTSecGrpIncByGroupIdx( TenantId,
				TSecGroupId );
	}

	public void deleteTSecGrpIncByIncludeIdx( long TenantId,
		int IncludeGroupId )
	{
		CFGenKbTSecGrpIncByIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		if( indexByIncludeIdx == null ) {
			indexByIncludeIdx = new HashMap< CFGenKbTSecGrpIncByIncludeIdxKey,
				Map< CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj > >();
		}
		if( indexByIncludeIdx.containsKey( key ) ) {
			Map<CFGenKbTSecGrpIncPKey, ICFGenKbTSecGrpIncObj> dict = indexByIncludeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
			Iterator<ICFGenKbTSecGrpIncObj> iter = dict.values().iterator();
			ICFGenKbTSecGrpIncObj obj;
			List<ICFGenKbTSecGrpIncObj> toForget = new LinkedList<ICFGenKbTSecGrpIncObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIncludeIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( schema.getAuthorization(),
				TenantId,
				IncludeGroupId );
		}
		deepDisposeTSecGrpIncByIncludeIdx( TenantId,
				IncludeGroupId );
	}

	public void deleteTSecGrpIncByUIncludeIdx( long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		if( indexByUIncludeIdx == null ) {
			indexByUIncludeIdx = new HashMap< CFGenKbTSecGrpIncByUIncludeIdxKey,
				ICFGenKbTSecGrpIncObj >();
		}
		CFGenKbTSecGrpIncByUIncludeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );
		ICFGenKbTSecGrpIncObj obj = null;
		if( indexByUIncludeIdx.containsKey( key ) ) {
			obj = indexByUIncludeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableTSecGrpInc().deleteTSecGrpIncByUIncludeIdx( schema.getAuthorization(),
				TenantId,
				TSecGroupId,
				IncludeGroupId );
		}
		deepDisposeTSecGrpIncByUIncludeIdx( TenantId,
				TSecGroupId,
				IncludeGroupId );
	}
}