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

public class CFGenKbSecSessionTableObj
	implements ICFGenKbSecSessionTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> members;
	private Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> allSecSession;
	private Map< CFGenKbSecSessionBySecUserIdxKey,
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > > indexBySecUserIdx;
	private Map< CFGenKbSecSessionBySecDevIdxKey,
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > > indexBySecDevIdx;
	private Map< CFGenKbSecSessionByStartIdxKey,
		ICFGenKbSecSessionObj > indexByStartIdx;
	private Map< CFGenKbSecSessionByFinishIdxKey,
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > > indexByFinishIdx;
	private Map< CFGenKbSecSessionBySecProxyIdxKey,
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > > indexBySecProxyIdx;
	public static String TABLE_NAME = "SecSession";
	public static String TABLE_DBNAME = "secsess";

	public CFGenKbSecSessionTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj>();
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
	}

	public CFGenKbSecSessionTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj>();
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
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
		allSecSession = null;
		indexBySecUserIdx = null;
		indexBySecDevIdx = null;
		indexByStartIdx = null;
		indexByFinishIdx = null;
		indexBySecProxyIdx = null;
		List<ICFGenKbSecSessionObj> toForget = new LinkedList<ICFGenKbSecSessionObj>();
		ICFGenKbSecSessionObj cur = null;
		Iterator<ICFGenKbSecSessionObj> iter = members.values().iterator();
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
	 *	CFGenKbSecSessionObj.
	 */
	public ICFGenKbSecSessionObj newInstance() {
		ICFGenKbSecSessionObj inst = new CFGenKbSecSessionObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSecSessionObj.
	 */
	public ICFGenKbSecSessionEditObj newEditInstance( ICFGenKbSecSessionObj orig ) {
		ICFGenKbSecSessionEditObj edit = new CFGenKbSecSessionEditObj( orig );
		return( edit );
	}

	public ICFGenKbSecSessionObj realiseSecSession( ICFGenKbSecSessionObj Obj ) {
		ICFGenKbSecSessionObj obj = Obj;
		CFGenKbSecSessionPKey pkey = obj.getPKey();
		ICFGenKbSecSessionObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSecSessionObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexBySecUserIdx != null ) {
				CFGenKbSecSessionBySecUserIdxKey keySecUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.remove( keepObj.getPKey() );
					if( mapSecUserIdx.size() <= 0 ) {
						indexBySecUserIdx.remove( keySecUserIdx );
					}
				}
			}

			if( indexBySecDevIdx != null ) {
				CFGenKbSecSessionBySecDevIdxKey keySecDevIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.remove( keepObj.getPKey() );
					if( mapSecDevIdx.size() <= 0 ) {
						indexBySecDevIdx.remove( keySecDevIdx );
					}
				}
			}

			if( indexByStartIdx != null ) {
				CFGenKbSecSessionByStartIdxKey keyStartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.remove( keyStartIdx );
			}

			if( indexByFinishIdx != null ) {
				CFGenKbSecSessionByFinishIdxKey keyFinishIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.remove( keepObj.getPKey() );
					if( mapFinishIdx.size() <= 0 ) {
						indexByFinishIdx.remove( keyFinishIdx );
					}
				}
			}

			if( indexBySecProxyIdx != null ) {
				CFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.remove( keepObj.getPKey() );
					if( mapSecProxyIdx.size() <= 0 ) {
						indexBySecProxyIdx.remove( keySecProxyIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexBySecUserIdx != null ) {
				CFGenKbSecSessionBySecUserIdxKey keySecUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecDevIdx != null ) {
				CFGenKbSecSessionBySecDevIdxKey keySecDevIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByStartIdx != null ) {
				CFGenKbSecSessionByStartIdxKey keyStartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.put( keyStartIdx, keepObj );
			}

			if( indexByFinishIdx != null ) {
				CFGenKbSecSessionByFinishIdxKey keyFinishIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecProxyIdx != null ) {
				CFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecSession != null ) {
				allSecSession.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecSession != null ) {
				allSecSession.put( keepObj.getPKey(), keepObj );
			}

			if( indexBySecUserIdx != null ) {
				CFGenKbSecSessionBySecUserIdxKey keySecUserIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
				keySecUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecUserIdx = indexBySecUserIdx.get( keySecUserIdx );
				if( mapSecUserIdx != null ) {
					mapSecUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecDevIdx != null ) {
				CFGenKbSecSessionBySecDevIdxKey keySecDevIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
				keySecDevIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keySecDevIdx.setOptionalSecDevName( keepObj.getOptionalSecDevName() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecDevIdx = indexBySecDevIdx.get( keySecDevIdx );
				if( mapSecDevIdx != null ) {
					mapSecDevIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByStartIdx != null ) {
				CFGenKbSecSessionByStartIdxKey keyStartIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
				keyStartIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyStartIdx.setRequiredStart( keepObj.getRequiredStart() );
				indexByStartIdx.put( keyStartIdx, keepObj );
			}

			if( indexByFinishIdx != null ) {
				CFGenKbSecSessionByFinishIdxKey keyFinishIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
				keyFinishIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyFinishIdx.setOptionalFinish( keepObj.getOptionalFinish() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapFinishIdx = indexByFinishIdx.get( keyFinishIdx );
				if( mapFinishIdx != null ) {
					mapFinishIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexBySecProxyIdx != null ) {
				CFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
				keySecProxyIdx.setOptionalSecProxyId( keepObj.getOptionalSecProxyId() );
				Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > mapSecProxyIdx = indexBySecProxyIdx.get( keySecProxyIdx );
				if( mapSecProxyIdx != null ) {
					mapSecProxyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbSecSessionObj createSecSession( ICFGenKbSecSessionObj Obj ) {
		ICFGenKbSecSessionObj obj = Obj;
		CFGenKbSecSessionBuff buff = obj.getSecSessionBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().createSecSession(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSecSessionObj readSecSession( CFGenKbSecSessionPKey pkey ) {
		return( readSecSession( pkey, false ) );
	}

	public ICFGenKbSecSessionObj readSecSession( CFGenKbSecSessionPKey pkey, boolean forceRead ) {
		ICFGenKbSecSessionObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSecSessionBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecSessionId() );
			if( readBuff != null ) {
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSecSessionObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSecSessionObj readCachedSecSession( CFGenKbSecSessionPKey pkey ) {
		ICFGenKbSecSessionObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecSession( ICFGenKbSecSessionObj obj )
	{
		final String S_ProcName = "CFGenKbSecSessionTableObj.reallyDeepDisposeSecSession() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSecSessionPKey pkey = obj.getPKey();
		ICFGenKbSecSessionObj existing = readCachedSecSession( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSecSessionBySecUserIdxKey keySecUserIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		CFGenKbSecSessionBySecDevIdxKey keySecDevIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		CFGenKbSecSessionByStartIdxKey keyStartIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( existing.getRequiredStart() );

		CFGenKbSecSessionByFinishIdxKey keyFinishIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		CFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		keySecProxyIdx.setOptionalSecProxyId( existing.getOptionalSecProxyId() );



		if( indexBySecUserIdx != null ) {
			if( indexBySecUserIdx.containsKey( keySecUserIdx ) ) {
				indexBySecUserIdx.get( keySecUserIdx ).remove( pkey );
				if( indexBySecUserIdx.get( keySecUserIdx ).size() <= 0 ) {
					indexBySecUserIdx.remove( keySecUserIdx );
				}
			}
		}

		if( indexBySecDevIdx != null ) {
			if( indexBySecDevIdx.containsKey( keySecDevIdx ) ) {
				indexBySecDevIdx.get( keySecDevIdx ).remove( pkey );
				if( indexBySecDevIdx.get( keySecDevIdx ).size() <= 0 ) {
					indexBySecDevIdx.remove( keySecDevIdx );
				}
			}
		}

		if( indexByStartIdx != null ) {
			indexByStartIdx.remove( keyStartIdx );
		}

		if( indexByFinishIdx != null ) {
			if( indexByFinishIdx.containsKey( keyFinishIdx ) ) {
				indexByFinishIdx.get( keyFinishIdx ).remove( pkey );
				if( indexByFinishIdx.get( keyFinishIdx ).size() <= 0 ) {
					indexByFinishIdx.remove( keyFinishIdx );
				}
			}
		}

		if( indexBySecProxyIdx != null ) {
			if( indexBySecProxyIdx.containsKey( keySecProxyIdx ) ) {
				indexBySecProxyIdx.get( keySecProxyIdx ).remove( pkey );
				if( indexBySecProxyIdx.get( keySecProxyIdx ).size() <= 0 ) {
					indexBySecProxyIdx.remove( keySecProxyIdx );
				}
			}
		}


	}
	public void deepDisposeSecSession( CFGenKbSecSessionPKey pkey ) {
		ICFGenKbSecSessionObj obj = readCachedSecSession( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSecSessionObj lockSecSession( CFGenKbSecSessionPKey pkey ) {
		ICFGenKbSecSessionObj locked = null;
		CFGenKbSecSessionBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecSessionTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSecSessionObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSecSession", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSecSessionObj> readAllSecSession() {
		return( readAllSecSession( false ) );
	}

	public List<ICFGenKbSecSessionObj> readAllSecSession( boolean forceRead ) {
		final String S_ProcName = "readAllSecSession";
		if( ( allSecSession == null ) || forceRead ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> map = new HashMap<CFGenKbSecSessionPKey,ICFGenKbSecSessionObj>();
			allSecSession = map;
			CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readAllDerived( schema.getAuthorization() );
			CFGenKbSecSessionBuff buff;
			ICFGenKbSecSessionObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
			}
		}
		int len = allSecSession.size();
		ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
		Iterator<ICFGenKbSecSessionObj> valIter = allSecSession.values().iterator();
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
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecSessionObj> readCachedAllSecSession() {
		final String S_ProcName = "readCachedAllSecSession";
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>();
		if( allSecSession != null ) {
			int len = allSecSession.size();
			ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
			Iterator<ICFGenKbSecSessionObj> valIter = allSecSession.values().iterator();
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
		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecSession-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbSecSessionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<ICFGenKbSecSessionObj> pageAllSecSession(UUID priorSecSessionId )
	{
		final String S_ProcName = "pageAllSecSession";
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> map = new HashMap<CFGenKbSecSessionPKey,ICFGenKbSecSessionObj>();
		CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageAllBuff( schema.getAuthorization(),
			priorSecSessionId );
		CFGenKbSecSessionBuff buff;
		ICFGenKbSecSessionObj obj;
		ICFGenKbSecSessionObj realised;
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			realised = (ICFGenKbSecSessionObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public ICFGenKbSecSessionObj readSecSessionByIdIdx( UUID SecSessionId )
	{
		return( readSecSessionByIdIdx( SecSessionId,
			false ) );
	}

	public ICFGenKbSecSessionObj readSecSessionByIdIdx( UUID SecSessionId, boolean forceRead )
	{
		CFGenKbSecSessionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		ICFGenKbSecSessionObj obj = readSecSession( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId )
	{
		return( readSecSessionBySecUserIdx( SecUserId,
			false ) );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionBySecUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecUserIdx";
		CFGenKbSecSessionBySecUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
		if( indexBySecUserIdx == null ) {
			indexBySecUserIdx = new HashMap< CFGenKbSecSessionBySecUserIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecUserIdx.containsKey( key ) ) {
			dict = indexBySecUserIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj>();
			ICFGenKbSecSessionObj obj;
			CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecUserIdx( schema.getAuthorization(),
				SecUserId );
			CFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecUserIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
		Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		return( readSecSessionBySecDevIdx( SecUserId,
			SecDevName,
			false ) );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecDevIdx";
		CFGenKbSecSessionBySecDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
		if( indexBySecDevIdx == null ) {
			indexBySecDevIdx = new HashMap< CFGenKbSecSessionBySecDevIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecDevIdx.containsKey( key ) ) {
			dict = indexBySecDevIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj>();
			ICFGenKbSecSessionObj obj;
			CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
			CFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecDevIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
		Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecSessionObj readSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		return( readSecSessionByStartIdx( SecUserId,
			Start,
			false ) );
	}

	public ICFGenKbSecSessionObj readSecSessionByStartIdx( UUID SecUserId,
		Calendar Start, boolean forceRead )
	{
		if( indexByStartIdx == null ) {
			indexByStartIdx = new HashMap< CFGenKbSecSessionByStartIdxKey,
				ICFGenKbSecSessionObj >();
		}
		CFGenKbSecSessionByStartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		ICFGenKbSecSessionObj obj = null;
		if( ( ! forceRead ) && indexByStartIdx.containsKey( key ) ) {
			obj = indexByStartIdx.get( key );
		}
		else {
			CFGenKbSecSessionBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
			if( buff != null ) {
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbSecSessionObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		return( readSecSessionByFinishIdx( SecUserId,
			Finish,
			false ) );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionByFinishIdx";
		CFGenKbSecSessionByFinishIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
		if( indexByFinishIdx == null ) {
			indexByFinishIdx = new HashMap< CFGenKbSecSessionByFinishIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexByFinishIdx.containsKey( key ) ) {
			dict = indexByFinishIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj>();
			ICFGenKbSecSessionObj obj;
			CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
			CFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFinishIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
		Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		return( readSecSessionBySecProxyIdx( SecProxyId,
			false ) );
	}

	public List<ICFGenKbSecSessionObj> readSecSessionBySecProxyIdx( UUID SecProxyId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecSessionBySecProxyIdx";
		CFGenKbSecSessionBySecProxyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
		if( indexBySecProxyIdx == null ) {
			indexBySecProxyIdx = new HashMap< CFGenKbSecSessionBySecProxyIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( ( ! forceRead ) && indexBySecProxyIdx.containsKey( key ) ) {
			dict = indexBySecProxyIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj>();
			ICFGenKbSecSessionObj obj;
			CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().readDerivedBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
			CFGenKbSecSessionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexBySecProxyIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
		Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSecSessionObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSecSessionObj readCachedSecSessionByIdIdx( UUID SecSessionId )
	{
		ICFGenKbSecSessionObj obj = null;
		CFGenKbSecSessionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		obj = readCachedSecSession( pkey );
		return( obj );
	}

	public List<ICFGenKbSecSessionObj> readCachedSecSessionBySecUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecSessionBySecUserIdx";
		CFGenKbSecSessionBySecUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>();
		if( indexBySecUserIdx != null ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
			if( indexBySecUserIdx.containsKey( key ) ) {
				dict = indexBySecUserIdx.get( key );
				int len = dict.size();
				ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
				Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			ICFGenKbSecSessionObj obj;
			Iterator<ICFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecSessionObj> readCachedSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "readCachedSecSessionBySecDevIdx";
		CFGenKbSecSessionBySecDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>();
		if( indexBySecDevIdx != null ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
			if( indexBySecDevIdx.containsKey( key ) ) {
				dict = indexBySecDevIdx.get( key );
				int len = dict.size();
				ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
				Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			ICFGenKbSecSessionObj obj;
			Iterator<ICFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbSecSessionObj readCachedSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		ICFGenKbSecSessionObj obj = null;
		CFGenKbSecSessionByStartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		if( indexByStartIdx != null ) {
			if( indexByStartIdx.containsKey( key ) ) {
				obj = indexByStartIdx.get( key );
			}
			else {
				Iterator<ICFGenKbSecSessionObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbSecSessionObj> valIter = members.values().iterator();
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

	public List<ICFGenKbSecSessionObj> readCachedSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "readCachedSecSessionByFinishIdx";
		CFGenKbSecSessionByFinishIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>();
		if( indexByFinishIdx != null ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
			if( indexByFinishIdx.containsKey( key ) ) {
				dict = indexByFinishIdx.get( key );
				int len = dict.size();
				ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
				Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			ICFGenKbSecSessionObj obj;
			Iterator<ICFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbSecSessionObj> readCachedSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		final String S_ProcName = "readCachedSecSessionBySecProxyIdx";
		CFGenKbSecSessionBySecProxyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		ArrayList<ICFGenKbSecSessionObj> arrayList = new ArrayList<ICFGenKbSecSessionObj>();
		if( indexBySecProxyIdx != null ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict;
			if( indexBySecProxyIdx.containsKey( key ) ) {
				dict = indexBySecProxyIdx.get( key );
				int len = dict.size();
				ICFGenKbSecSessionObj arr[] = new ICFGenKbSecSessionObj[len];
				Iterator<ICFGenKbSecSessionObj> valIter = dict.values().iterator();
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
			ICFGenKbSecSessionObj obj;
			Iterator<ICFGenKbSecSessionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSecSessionObj> cmp = new Comparator<ICFGenKbSecSessionObj>() {
			public int compare( ICFGenKbSecSessionObj lhs, ICFGenKbSecSessionObj rhs ) {
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
					CFGenKbSecSessionPKey lhsPKey = lhs.getPKey();
					CFGenKbSecSessionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecSessionByIdIdx( UUID SecSessionId )
	{
		ICFGenKbSecSessionObj obj = readCachedSecSessionByIdIdx( SecSessionId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecSessionBySecUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecUserIdx";
		ICFGenKbSecSessionObj obj;
		List<ICFGenKbSecSessionObj> arrayList = readCachedSecSessionBySecUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecDevIdx";
		ICFGenKbSecSessionObj obj;
		List<ICFGenKbSecSessionObj> arrayList = readCachedSecSessionBySecDevIdx( SecUserId,
				SecDevName );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		ICFGenKbSecSessionObj obj = readCachedSecSessionByStartIdx( SecUserId,
				Start );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "deepDisposeSecSessionByFinishIdx";
		ICFGenKbSecSessionObj obj;
		List<ICFGenKbSecSessionObj> arrayList = readCachedSecSessionByFinishIdx( SecUserId,
				Finish );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		final String S_ProcName = "deepDisposeSecSessionBySecProxyIdx";
		ICFGenKbSecSessionObj obj;
		List<ICFGenKbSecSessionObj> arrayList = readCachedSecSessionBySecProxyIdx( SecProxyId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSecSessionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecUserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecSessionObj> pageSecSessionBySecUserIdx( UUID SecUserId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecUserIdx";
		CFGenKbSecSessionBySecUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<ICFGenKbSecSessionObj> retList = new LinkedList<ICFGenKbSecSessionObj>();
		ICFGenKbSecSessionObj obj;
		CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecUserIdx( schema.getAuthorization(),
				SecUserId,
			priorSecSessionId );
		CFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecDevIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecSessionObj> pageSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecDevIdx";
		CFGenKbSecSessionBySecDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		List<ICFGenKbSecSessionObj> retList = new LinkedList<ICFGenKbSecSessionObj>();
		ICFGenKbSecSessionObj obj;
		CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName,
			priorSecSessionId );
		CFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate FinishIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecSessionObj> pageSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionByFinishIdx";
		CFGenKbSecSessionByFinishIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		List<ICFGenKbSecSessionObj> retList = new LinkedList<ICFGenKbSecSessionObj>();
		ICFGenKbSecSessionObj obj;
		CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish,
			priorSecSessionId );
		CFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	/**
	 *	Read a page of data as a List of SecSession-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecProxyIdx key attributes.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecSession-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<ICFGenKbSecSessionObj> pageSecSessionBySecProxyIdx( UUID SecProxyId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageSecSessionBySecProxyIdx";
		CFGenKbSecSessionBySecProxyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		List<ICFGenKbSecSessionObj> retList = new LinkedList<ICFGenKbSecSessionObj>();
		ICFGenKbSecSessionObj obj;
		CFGenKbSecSessionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().pageBuffBySecProxyIdx( schema.getAuthorization(),
				SecProxyId,
			priorSecSessionId );
		CFGenKbSecSessionBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecSessionTableObj().newInstance();
			obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey() );
			obj.setBuff( buff );
			ICFGenKbSecSessionObj realised = (ICFGenKbSecSessionObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public ICFGenKbSecSessionObj updateSecSession( ICFGenKbSecSessionObj Obj ) {
		ICFGenKbSecSessionObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().updateSecSession( schema.getAuthorization(),
			Obj.getSecSessionBuff() );
		obj = (ICFGenKbSecSessionObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecSession( ICFGenKbSecSessionObj Obj ) {
		ICFGenKbSecSessionObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSession( schema.getAuthorization(),
			obj.getSecSessionBuff() );
		Obj.forget();
	}

	public void deleteSecSessionByIdIdx( UUID SecSessionId )
	{
		CFGenKbSecSessionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( SecSessionId );
		ICFGenKbSecSessionObj obj = readSecSession( pkey );
		if( obj != null ) {
			ICFGenKbSecSessionEditObj editObj = (ICFGenKbSecSessionEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSecSessionEditObj)obj.beginEdit();
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
		deepDisposeSecSessionByIdIdx( SecSessionId );
	}

	public void deleteSecSessionBySecUserIdx( UUID SecUserId )
	{
		CFGenKbSecSessionBySecUserIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexBySecUserIdx == null ) {
			indexBySecUserIdx = new HashMap< CFGenKbSecSessionBySecUserIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( indexBySecUserIdx.containsKey( key ) ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict = indexBySecUserIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<ICFGenKbSecSessionObj> iter = dict.values().iterator();
			ICFGenKbSecSessionObj obj;
			List<ICFGenKbSecSessionObj> toForget = new LinkedList<ICFGenKbSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecUserIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecSessionBySecUserIdx( SecUserId );
	}

	public void deleteSecSessionBySecDevIdx( UUID SecUserId,
		String SecDevName )
	{
		CFGenKbSecSessionBySecDevIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );
		if( indexBySecDevIdx == null ) {
			indexBySecDevIdx = new HashMap< CFGenKbSecSessionBySecDevIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( indexBySecDevIdx.containsKey( key ) ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict = indexBySecDevIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
			Iterator<ICFGenKbSecSessionObj> iter = dict.values().iterator();
			ICFGenKbSecSessionObj obj;
			List<ICFGenKbSecSessionObj> toForget = new LinkedList<ICFGenKbSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecDevIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecDevIdx( schema.getAuthorization(),
				SecUserId,
				SecDevName );
		}
		deepDisposeSecSessionBySecDevIdx( SecUserId,
				SecDevName );
	}

	public void deleteSecSessionByStartIdx( UUID SecUserId,
		Calendar Start )
	{
		if( indexByStartIdx == null ) {
			indexByStartIdx = new HashMap< CFGenKbSecSessionByStartIdxKey,
				ICFGenKbSecSessionObj >();
		}
		CFGenKbSecSessionByStartIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );
		ICFGenKbSecSessionObj obj = null;
		if( indexByStartIdx.containsKey( key ) ) {
			obj = indexByStartIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByStartIdx( schema.getAuthorization(),
				SecUserId,
				Start );
		}
		deepDisposeSecSessionByStartIdx( SecUserId,
				Start );
	}

	public void deleteSecSessionByFinishIdx( UUID SecUserId,
		Calendar Finish )
	{
		CFGenKbSecSessionByFinishIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );
		if( indexByFinishIdx == null ) {
			indexByFinishIdx = new HashMap< CFGenKbSecSessionByFinishIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( indexByFinishIdx.containsKey( key ) ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict = indexByFinishIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
			Iterator<ICFGenKbSecSessionObj> iter = dict.values().iterator();
			ICFGenKbSecSessionObj obj;
			List<ICFGenKbSecSessionObj> toForget = new LinkedList<ICFGenKbSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFinishIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionByFinishIdx( schema.getAuthorization(),
				SecUserId,
				Finish );
		}
		deepDisposeSecSessionByFinishIdx( SecUserId,
				Finish );
	}

	public void deleteSecSessionBySecProxyIdx( UUID SecProxyId )
	{
		CFGenKbSecSessionBySecProxyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );
		if( indexBySecProxyIdx == null ) {
			indexBySecProxyIdx = new HashMap< CFGenKbSecSessionBySecProxyIdxKey,
				Map< CFGenKbSecSessionPKey, ICFGenKbSecSessionObj > >();
		}
		if( indexBySecProxyIdx.containsKey( key ) ) {
			Map<CFGenKbSecSessionPKey, ICFGenKbSecSessionObj> dict = indexBySecProxyIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
			Iterator<ICFGenKbSecSessionObj> iter = dict.values().iterator();
			ICFGenKbSecSessionObj obj;
			List<ICFGenKbSecSessionObj> toForget = new LinkedList<ICFGenKbSecSessionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexBySecProxyIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableSecSession().deleteSecSessionBySecProxyIdx( schema.getAuthorization(),
				SecProxyId );
		}
		deepDisposeSecSessionBySecProxyIdx( SecProxyId );
	}

	public ICFGenKbSecSessionObj getSystemSession() {
		boolean transactionStarted = schema.beginTransaction();
		ICFGenKbSecUserObj userObj;
		ICFGenKbSecSessionObj sessionObj;
		try {
			userObj = schema.getSecUserTableObj().getSystemUser();
			sessionObj = readSecSessionByStartIdx( userObj.getRequiredSecUserId(),
				Calendar.getInstance() );
			if( sessionObj == null ) {
				sessionObj = newInstance();
				ICFGenKbSecSessionEditObj sessionEdit = sessionObj.beginEdit();
				sessionEdit.setRequiredContainerSecUser( userObj );
				sessionEdit.setRequiredStart( Calendar.getInstance() );
				sessionEdit.setOptionalFinish( null );
				sessionObj = sessionEdit.create();
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
		return( sessionObj );
	}
}