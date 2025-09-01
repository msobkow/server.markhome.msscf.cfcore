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

public class CFGenKbGelIteratorTableObj
	implements ICFGenKbGelIteratorTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> members;
	private Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> allGelIterator;
	private Map< CFGenKbGelInstructionByTenantIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByTenantIdx;
	private Map< CFGenKbGelInstructionByGelCacheIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByGelCacheIdx;
	private Map< CFGenKbGelInstructionByChainIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByChainIdx;
	private Map< CFGenKbGelIteratorByBeforeIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByBeforeIdx;
	private Map< CFGenKbGelIteratorByFirstIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByFirstIdx;
	private Map< CFGenKbGelIteratorByEachIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByEachIdx;
	private Map< CFGenKbGelIteratorByLastIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByLastIdx;
	private Map< CFGenKbGelIteratorByLoneIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByLoneIdx;
	private Map< CFGenKbGelIteratorByEmptyIdxKey,
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > > indexByEmptyIdx;
	public static String TABLE_NAME = "GelIterator";
	public static String TABLE_DBNAME = "geliter";

	public CFGenKbGelIteratorTableObj() {
		schema = null;
		members = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
		allGelIterator = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
	}

	public CFGenKbGelIteratorTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
		allGelIterator = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
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
		allGelIterator = null;
		indexByTenantIdx = null;
		indexByGelCacheIdx = null;
		indexByChainIdx = null;
		indexByBeforeIdx = null;
		indexByFirstIdx = null;
		indexByEachIdx = null;
		indexByLastIdx = null;
		indexByLoneIdx = null;
		indexByEmptyIdx = null;
		List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
		ICFGenKbGelIteratorObj cur = null;
		Iterator<ICFGenKbGelIteratorObj> iter = members.values().iterator();
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
	 *	CFGenKbGelIteratorObj.
	 */
	public ICFGenKbGelIteratorObj newInstance() {
		ICFGenKbGelIteratorObj inst = new CFGenKbGelIteratorObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbGelIteratorObj.
	 */
	public ICFGenKbGelIteratorEditObj newEditInstance( ICFGenKbGelIteratorObj orig ) {
		ICFGenKbGelIteratorEditObj edit = new CFGenKbGelIteratorEditObj( orig );
		return( edit );
	}

	public ICFGenKbGelIteratorObj realiseGelIterator( ICFGenKbGelIteratorObj Obj ) {
		ICFGenKbGelIteratorObj obj = Obj;
		CFGenKbGelInstructionPKey pkey = obj.getPKey();
		ICFGenKbGelIteratorObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbGelIteratorObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					indexByGelCacheIdx.remove( keyGelCacheIdx );
				}
			}

			if( indexByChainIdx != null ) {
				CFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					indexByChainIdx.remove( keyChainIdx );
				}
			}

			if( indexByBeforeIdx != null ) {
				CFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.remove( keepObj.getPKey() );
					if( mapBeforeIdx.size() <= 0 ) {
						indexByBeforeIdx.remove( keyBeforeIdx );
					}
				}
			}

			if( indexByFirstIdx != null ) {
				CFGenKbGelIteratorByFirstIdxKey keyFirstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.remove( keepObj.getPKey() );
					if( mapFirstIdx.size() <= 0 ) {
						indexByFirstIdx.remove( keyFirstIdx );
					}
				}
			}

			if( indexByEachIdx != null ) {
				CFGenKbGelIteratorByEachIdxKey keyEachIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.remove( keepObj.getPKey() );
					if( mapEachIdx.size() <= 0 ) {
						indexByEachIdx.remove( keyEachIdx );
					}
				}
			}

			if( indexByLastIdx != null ) {
				CFGenKbGelIteratorByLastIdxKey keyLastIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.remove( keepObj.getPKey() );
					if( mapLastIdx.size() <= 0 ) {
						indexByLastIdx.remove( keyLastIdx );
					}
				}
			}

			if( indexByLoneIdx != null ) {
				CFGenKbGelIteratorByLoneIdxKey keyLoneIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.remove( keepObj.getPKey() );
					if( mapLoneIdx.size() <= 0 ) {
						indexByLoneIdx.remove( keyLoneIdx );
					}
				}
			}

			if( indexByEmptyIdx != null ) {
				CFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.remove( keepObj.getPKey() );
					if( mapEmptyIdx.size() <= 0 ) {
						indexByEmptyIdx.remove( keyEmptyIdx );
					}
				}
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().realiseGelInstruction( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					mapGelCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainIdx != null ) {
				CFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				CFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				CFGenKbGelIteratorByFirstIdxKey keyFirstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				CFGenKbGelIteratorByEachIdxKey keyEachIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				CFGenKbGelIteratorByLastIdxKey keyLastIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				CFGenKbGelIteratorByLoneIdxKey keyLoneIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				CFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allGelIterator != null ) {
				allGelIterator.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().realiseGelInstruction( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelIterator != null ) {
				allGelIterator.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFGenKbGelInstructionByTenantIdxKey keyTenantIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByGelCacheIdx != null ) {
				CFGenKbGelInstructionByGelCacheIdxKey keyGelCacheIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
				keyGelCacheIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyGelCacheIdx.setRequiredGelCacheId( keepObj.getRequiredGelCacheId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapGelCacheIdx = indexByGelCacheIdx.get( keyGelCacheIdx );
				if( mapGelCacheIdx != null ) {
					mapGelCacheIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByChainIdx != null ) {
				CFGenKbGelInstructionByChainIdxKey keyChainIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
				keyChainIdx.setOptionalChainInstTenantId( keepObj.getOptionalChainInstTenantId() );
				keyChainIdx.setOptionalChainInstGelCacheId( keepObj.getOptionalChainInstGelCacheId() );
				keyChainIdx.setOptionalChainInstGelInstId( keepObj.getOptionalChainInstGelInstId() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapChainIdx = indexByChainIdx.get( keyChainIdx );
				if( mapChainIdx != null ) {
					mapChainIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByBeforeIdx != null ) {
				CFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
				keyBeforeIdx.setOptionalExpandBefore( keepObj.getOptionalExpandBefore() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapBeforeIdx = indexByBeforeIdx.get( keyBeforeIdx );
				if( mapBeforeIdx != null ) {
					mapBeforeIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByFirstIdx != null ) {
				CFGenKbGelIteratorByFirstIdxKey keyFirstIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
				keyFirstIdx.setOptionalExpandFirst( keepObj.getOptionalExpandFirst() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapFirstIdx = indexByFirstIdx.get( keyFirstIdx );
				if( mapFirstIdx != null ) {
					mapFirstIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEachIdx != null ) {
				CFGenKbGelIteratorByEachIdxKey keyEachIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
				keyEachIdx.setRequiredExpandEach( keepObj.getRequiredExpandEach() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapEachIdx = indexByEachIdx.get( keyEachIdx );
				if( mapEachIdx != null ) {
					mapEachIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLastIdx != null ) {
				CFGenKbGelIteratorByLastIdxKey keyLastIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
				keyLastIdx.setOptionalExpandLast( keepObj.getOptionalExpandLast() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapLastIdx = indexByLastIdx.get( keyLastIdx );
				if( mapLastIdx != null ) {
					mapLastIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLoneIdx != null ) {
				CFGenKbGelIteratorByLoneIdxKey keyLoneIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
				keyLoneIdx.setOptionalExpandLone( keepObj.getOptionalExpandLone() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapLoneIdx = indexByLoneIdx.get( keyLoneIdx );
				if( mapLoneIdx != null ) {
					mapLoneIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByEmptyIdx != null ) {
				CFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
				keyEmptyIdx.setOptionalExpandEmpty( keepObj.getOptionalExpandEmpty() );
				Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > mapEmptyIdx = indexByEmptyIdx.get( keyEmptyIdx );
				if( mapEmptyIdx != null ) {
					mapEmptyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbGelIteratorObj createGelIterator( ICFGenKbGelIteratorObj Obj ) {
		ICFGenKbGelIteratorObj obj = Obj;
		CFGenKbGelIteratorBuff buff = obj.getGelIteratorBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().createGelIterator(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a917" ) ) {
			obj = (ICFGenKbGelIteratorObj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbGelIteratorObj readGelIterator( CFGenKbGelInstructionPKey pkey ) {
		return( readGelIterator( pkey, false ) );
	}

	public ICFGenKbGelIteratorObj readGelIterator( CFGenKbGelInstructionPKey pkey, boolean forceRead ) {
		ICFGenKbGelIteratorObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbGelIteratorBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByPIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId(),
				pkey.getRequiredGelInstId() );
			if( readBuff != null ) {
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbGelIteratorObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbGelIteratorObj readCachedGelIterator( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelIteratorObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelIterator( ICFGenKbGelIteratorObj obj )
	{
		final String S_ProcName = "CFGenKbGelIteratorTableObj.reallyDeepDisposeGelIterator() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbGelInstructionPKey pkey = obj.getPKey();
		ICFGenKbGelIteratorObj existing = readCachedGelIterator( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbGelIteratorByBeforeIdxKey keyBeforeIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		CFGenKbGelIteratorByFirstIdxKey keyFirstIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		CFGenKbGelIteratorByEachIdxKey keyEachIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		CFGenKbGelIteratorByLastIdxKey keyLastIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		CFGenKbGelIteratorByLoneIdxKey keyLoneIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		CFGenKbGelIteratorByEmptyIdxKey keyEmptyIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		keyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );



		if( indexByBeforeIdx != null ) {
			if( indexByBeforeIdx.containsKey( keyBeforeIdx ) ) {
				indexByBeforeIdx.get( keyBeforeIdx ).remove( pkey );
				if( indexByBeforeIdx.get( keyBeforeIdx ).size() <= 0 ) {
					indexByBeforeIdx.remove( keyBeforeIdx );
				}
			}
		}

		if( indexByFirstIdx != null ) {
			if( indexByFirstIdx.containsKey( keyFirstIdx ) ) {
				indexByFirstIdx.get( keyFirstIdx ).remove( pkey );
				if( indexByFirstIdx.get( keyFirstIdx ).size() <= 0 ) {
					indexByFirstIdx.remove( keyFirstIdx );
				}
			}
		}

		if( indexByEachIdx != null ) {
			if( indexByEachIdx.containsKey( keyEachIdx ) ) {
				indexByEachIdx.get( keyEachIdx ).remove( pkey );
				if( indexByEachIdx.get( keyEachIdx ).size() <= 0 ) {
					indexByEachIdx.remove( keyEachIdx );
				}
			}
		}

		if( indexByLastIdx != null ) {
			if( indexByLastIdx.containsKey( keyLastIdx ) ) {
				indexByLastIdx.get( keyLastIdx ).remove( pkey );
				if( indexByLastIdx.get( keyLastIdx ).size() <= 0 ) {
					indexByLastIdx.remove( keyLastIdx );
				}
			}
		}

		if( indexByLoneIdx != null ) {
			if( indexByLoneIdx.containsKey( keyLoneIdx ) ) {
				indexByLoneIdx.get( keyLoneIdx ).remove( pkey );
				if( indexByLoneIdx.get( keyLoneIdx ).size() <= 0 ) {
					indexByLoneIdx.remove( keyLoneIdx );
				}
			}
		}

		if( indexByEmptyIdx != null ) {
			if( indexByEmptyIdx.containsKey( keyEmptyIdx ) ) {
				indexByEmptyIdx.get( keyEmptyIdx ).remove( pkey );
				if( indexByEmptyIdx.get( keyEmptyIdx ).size() <= 0 ) {
					indexByEmptyIdx.remove( keyEmptyIdx );
				}
			}
		}


		schema.getGelInstructionTableObj().reallyDeepDisposeGelInstruction( obj );
	}
	public void deepDisposeGelIterator( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelIteratorObj obj = readCachedGelIterator( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbGelIteratorObj lockGelIterator( CFGenKbGelInstructionPKey pkey ) {
		ICFGenKbGelIteratorObj locked = null;
		CFGenKbGelIteratorBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbGelIteratorObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockGelIterator", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbGelIteratorObj> readAllGelIterator() {
		return( readAllGelIterator( false ) );
	}

	public List<ICFGenKbGelIteratorObj> readAllGelIterator( boolean forceRead ) {
		final String S_ProcName = "readAllGelIterator";
		if( ( allGelIterator == null ) || forceRead ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> map = new HashMap<CFGenKbGelInstructionPKey,ICFGenKbGelIteratorObj>();
			allGelIterator = map;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readAllDerived( schema.getAuthorization() );
			CFGenKbGelIteratorBuff buff;
			ICFGenKbGelIteratorObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
			}
		}
		int len = allGelIterator.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = allGelIterator.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedAllGelIterator() {
		final String S_ProcName = "readCachedAllGelIterator";
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( allGelIterator != null ) {
			int len = allGelIterator.size();
			ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
			Iterator<ICFGenKbGelIteratorObj> valIter = allGelIterator.values().iterator();
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
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		return( readGelIteratorByPIdx( TenantId,
			GelCacheId,
			GelInstId,
			false ) );
	}

	public ICFGenKbGelIteratorObj readGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId, boolean forceRead )
	{
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		ICFGenKbGelIteratorObj obj = readGelIterator( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId )
	{
		return( readGelIteratorByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByTenantIdx";
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelInstructionByTenantIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelIteratorByGelCacheIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByGelCacheIdx";
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< CFGenKbGelInstructionByGelCacheIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByGelCacheIdx.containsKey( key ) ) {
			dict = indexByGelCacheIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByGelCacheIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		return( readGelIteratorByChainIdx( ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByChainIdx";
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< CFGenKbGelInstructionByChainIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByChainIdx.containsKey( key ) ) {
			dict = indexByChainIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelInstructionObj obj;
			CFGenKbGelInstructionBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelInstruction().readDerivedByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			CFGenKbGelInstructionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByChainIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore )
	{
		return( readGelIteratorByBeforeIdx( ExpandBefore,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByBeforeIdx( String ExpandBefore,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByBeforeIdx";
		CFGenKbGelIteratorByBeforeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< CFGenKbGelIteratorByBeforeIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByBeforeIdx.containsKey( key ) ) {
			dict = indexByBeforeIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelIteratorObj obj;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			CFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByBeforeIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst )
	{
		return( readGelIteratorByFirstIdx( ExpandFirst,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByFirstIdx( String ExpandFirst,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByFirstIdx";
		CFGenKbGelIteratorByFirstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< CFGenKbGelIteratorByFirstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByFirstIdx.containsKey( key ) ) {
			dict = indexByFirstIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelIteratorObj obj;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			CFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByFirstIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach )
	{
		return( readGelIteratorByEachIdx( ExpandEach,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByEachIdx( String ExpandEach,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByEachIdx";
		CFGenKbGelIteratorByEachIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< CFGenKbGelIteratorByEachIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByEachIdx.containsKey( key ) ) {
			dict = indexByEachIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelIteratorObj obj;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByEachIdx( schema.getAuthorization(),
				ExpandEach );
			CFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEachIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast )
	{
		return( readGelIteratorByLastIdx( ExpandLast,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByLastIdx( String ExpandLast,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByLastIdx";
		CFGenKbGelIteratorByLastIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< CFGenKbGelIteratorByLastIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByLastIdx.containsKey( key ) ) {
			dict = indexByLastIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelIteratorObj obj;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByLastIdx( schema.getAuthorization(),
				ExpandLast );
			CFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLastIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone )
	{
		return( readGelIteratorByLoneIdx( ExpandLone,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByLoneIdx( String ExpandLone,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByLoneIdx";
		CFGenKbGelIteratorByLoneIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< CFGenKbGelIteratorByLoneIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByLoneIdx.containsKey( key ) ) {
			dict = indexByLoneIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelIteratorObj obj;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			CFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLoneIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		return( readGelIteratorByEmptyIdx( ExpandEmpty,
			false ) );
	}

	public List<ICFGenKbGelIteratorObj> readGelIteratorByEmptyIdx( String ExpandEmpty,
		boolean forceRead )
	{
		final String S_ProcName = "readGelIteratorByEmptyIdx";
		CFGenKbGelIteratorByEmptyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< CFGenKbGelIteratorByEmptyIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( ( ! forceRead ) && indexByEmptyIdx.containsKey( key ) ) {
			dict = indexByEmptyIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj>();
			ICFGenKbGelIteratorObj obj;
			CFGenKbGelIteratorBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().readDerivedByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			CFGenKbGelIteratorBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFGenKbGelIteratorObj)schema.getGelInstructionTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey() );
				obj.setBuff( buff );
				ICFGenKbGelIteratorObj realised = (ICFGenKbGelIteratorObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByEmptyIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
		Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbGelIteratorObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbGelIteratorObj readCachedGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		ICFGenKbGelIteratorObj obj = null;
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		obj = readCachedGelIterator( pkey );
		return( obj );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelIteratorByTenantIdx";
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByTenantIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "readCachedGelIteratorByGelCacheIdx";
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByGelCacheIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByGelCacheIdx.containsKey( key ) ) {
				dict = indexByGelCacheIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "readCachedGelIteratorByChainIdx";
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByChainIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByChainIdx.containsKey( key ) ) {
				dict = indexByChainIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "readCachedGelIteratorByBeforeIdx";
		CFGenKbGelIteratorByBeforeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByBeforeIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByBeforeIdx.containsKey( key ) ) {
				dict = indexByBeforeIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "readCachedGelIteratorByFirstIdx";
		CFGenKbGelIteratorByFirstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByFirstIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByFirstIdx.containsKey( key ) ) {
				dict = indexByFirstIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "readCachedGelIteratorByEachIdx";
		CFGenKbGelIteratorByEachIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByEachIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByEachIdx.containsKey( key ) ) {
				dict = indexByEachIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "readCachedGelIteratorByLastIdx";
		CFGenKbGelIteratorByLastIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByLastIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByLastIdx.containsKey( key ) ) {
				dict = indexByLastIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "readCachedGelIteratorByLoneIdx";
		CFGenKbGelIteratorByLoneIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByLoneIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByLoneIdx.containsKey( key ) ) {
				dict = indexByLoneIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbGelIteratorObj> readCachedGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "readCachedGelIteratorByEmptyIdx";
		CFGenKbGelIteratorByEmptyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		ArrayList<ICFGenKbGelIteratorObj> arrayList = new ArrayList<ICFGenKbGelIteratorObj>();
		if( indexByEmptyIdx != null ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict;
			if( indexByEmptyIdx.containsKey( key ) ) {
				dict = indexByEmptyIdx.get( key );
				int len = dict.size();
				ICFGenKbGelIteratorObj arr[] = new ICFGenKbGelIteratorObj[len];
				Iterator<ICFGenKbGelIteratorObj> valIter = dict.values().iterator();
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
			ICFGenKbGelIteratorObj obj;
			Iterator<ICFGenKbGelIteratorObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbGelIteratorObj> cmp = new Comparator<ICFGenKbGelIteratorObj>() {
			public int compare( ICFGenKbGelIteratorObj lhs, ICFGenKbGelIteratorObj rhs ) {
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
					CFGenKbGelInstructionPKey lhsPKey = lhs.getPKey();
					CFGenKbGelInstructionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		ICFGenKbGelIteratorObj obj = readCachedGelIteratorByPIdx( TenantId,
				GelCacheId,
				GelInstId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelIteratorByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelIteratorByTenantIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "deepDisposeGelIteratorByGelCacheIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByGelCacheIdx( TenantId,
				GelCacheId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "deepDisposeGelIteratorByChainIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByBeforeIdx( String ExpandBefore )
	{
		final String S_ProcName = "deepDisposeGelIteratorByBeforeIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByBeforeIdx( ExpandBefore );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByFirstIdx( String ExpandFirst )
	{
		final String S_ProcName = "deepDisposeGelIteratorByFirstIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByFirstIdx( ExpandFirst );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByEachIdx( String ExpandEach )
	{
		final String S_ProcName = "deepDisposeGelIteratorByEachIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByEachIdx( ExpandEach );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByLastIdx( String ExpandLast )
	{
		final String S_ProcName = "deepDisposeGelIteratorByLastIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByLastIdx( ExpandLast );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByLoneIdx( String ExpandLone )
	{
		final String S_ProcName = "deepDisposeGelIteratorByLoneIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByLoneIdx( ExpandLone );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		final String S_ProcName = "deepDisposeGelIteratorByEmptyIdx";
		ICFGenKbGelIteratorObj obj;
		List<ICFGenKbGelIteratorObj> arrayList = readCachedGelIteratorByEmptyIdx( ExpandEmpty );
		if( arrayList != null )  {
			Iterator<ICFGenKbGelIteratorObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbGelIteratorObj updateGelIterator( ICFGenKbGelIteratorObj Obj ) {
		ICFGenKbGelIteratorObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().updateGelIterator( schema.getAuthorization(),
			Obj.getGelIteratorBuff() );
		if( Obj.getClassCode().equals( "a917" ) ) {
			obj = (ICFGenKbGelIteratorObj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deleteGelIterator( ICFGenKbGelIteratorObj Obj ) {
		ICFGenKbGelIteratorObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIterator( schema.getAuthorization(),
			obj.getGelIteratorBuff() );
		Obj.forget();
	}

	public void deleteGelIteratorByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		CFGenKbGelInstructionPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		pkey.setRequiredGelInstId( GelInstId );
		ICFGenKbGelIteratorObj obj = readGelIterator( pkey );
		if( obj != null ) {
			ICFGenKbGelIteratorEditObj editObj = (ICFGenKbGelIteratorEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbGelIteratorEditObj)obj.beginEdit();
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
		deepDisposeGelIteratorByPIdx( TenantId,
				GelCacheId,
				GelInstId );
	}

	public void deleteGelIteratorByTenantIdx( long TenantId )
	{
		CFGenKbGelInstructionByTenantIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFGenKbGelInstructionByTenantIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByTenantIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelIteratorByTenantIdx( TenantId );
	}

	public void deleteGelIteratorByGelCacheIdx( long TenantId,
		long GelCacheId )
	{
		CFGenKbGelInstructionByGelCacheIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		if( indexByGelCacheIdx == null ) {
			indexByGelCacheIdx = new HashMap< CFGenKbGelInstructionByGelCacheIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByGelCacheIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByGelCacheIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByGelCacheIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByGelCacheIdx( schema.getAuthorization(),
				TenantId,
				GelCacheId );
		}
		deepDisposeGelIteratorByGelCacheIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelIteratorByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		CFGenKbGelInstructionByChainIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( ChainInstTenantId );
		key.setOptionalChainInstGelCacheId( ChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( ChainInstGelInstId );
		if( indexByChainIdx == null ) {
			indexByChainIdx = new HashMap< CFGenKbGelInstructionByChainIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByChainIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByChainIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByChainIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByChainIdx( schema.getAuthorization(),
				ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
		}
		deepDisposeGelIteratorByChainIdx( ChainInstTenantId,
				ChainInstGelCacheId,
				ChainInstGelInstId );
	}

	public void deleteGelIteratorByBeforeIdx( String ExpandBefore )
	{
		CFGenKbGelIteratorByBeforeIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );
		if( indexByBeforeIdx == null ) {
			indexByBeforeIdx = new HashMap< CFGenKbGelIteratorByBeforeIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByBeforeIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByBeforeIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByBeforeIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByBeforeIdx( schema.getAuthorization(),
				ExpandBefore );
		}
		deepDisposeGelIteratorByBeforeIdx( ExpandBefore );
	}

	public void deleteGelIteratorByFirstIdx( String ExpandFirst )
	{
		CFGenKbGelIteratorByFirstIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );
		if( indexByFirstIdx == null ) {
			indexByFirstIdx = new HashMap< CFGenKbGelIteratorByFirstIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByFirstIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByFirstIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByFirstIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByFirstIdx( schema.getAuthorization(),
				ExpandFirst );
		}
		deepDisposeGelIteratorByFirstIdx( ExpandFirst );
	}

	public void deleteGelIteratorByEachIdx( String ExpandEach )
	{
		CFGenKbGelIteratorByEachIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );
		if( indexByEachIdx == null ) {
			indexByEachIdx = new HashMap< CFGenKbGelIteratorByEachIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByEachIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByEachIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEachIdx( schema.getAuthorization(),
				ExpandEach );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEachIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEachIdx( schema.getAuthorization(),
				ExpandEach );
		}
		deepDisposeGelIteratorByEachIdx( ExpandEach );
	}

	public void deleteGelIteratorByLastIdx( String ExpandLast )
	{
		CFGenKbGelIteratorByLastIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );
		if( indexByLastIdx == null ) {
			indexByLastIdx = new HashMap< CFGenKbGelIteratorByLastIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByLastIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByLastIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLastIdx( schema.getAuthorization(),
				ExpandLast );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLastIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLastIdx( schema.getAuthorization(),
				ExpandLast );
		}
		deepDisposeGelIteratorByLastIdx( ExpandLast );
	}

	public void deleteGelIteratorByLoneIdx( String ExpandLone )
	{
		CFGenKbGelIteratorByLoneIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );
		if( indexByLoneIdx == null ) {
			indexByLoneIdx = new HashMap< CFGenKbGelIteratorByLoneIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByLoneIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByLoneIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLoneIdx( schema.getAuthorization(),
				ExpandLone );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLoneIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByLoneIdx( schema.getAuthorization(),
				ExpandLone );
		}
		deepDisposeGelIteratorByLoneIdx( ExpandLone );
	}

	public void deleteGelIteratorByEmptyIdx( String ExpandEmpty )
	{
		CFGenKbGelIteratorByEmptyIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryGelIterator().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );
		if( indexByEmptyIdx == null ) {
			indexByEmptyIdx = new HashMap< CFGenKbGelIteratorByEmptyIdxKey,
				Map< CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj > >();
		}
		if( indexByEmptyIdx.containsKey( key ) ) {
			Map<CFGenKbGelInstructionPKey, ICFGenKbGelIteratorObj> dict = indexByEmptyIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
			Iterator<ICFGenKbGelIteratorObj> iter = dict.values().iterator();
			ICFGenKbGelIteratorObj obj;
			List<ICFGenKbGelIteratorObj> toForget = new LinkedList<ICFGenKbGelIteratorObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByEmptyIdx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableGelIterator().deleteGelIteratorByEmptyIdx( schema.getAuthorization(),
				ExpandEmpty );
		}
		deepDisposeGelIteratorByEmptyIdx( ExpandEmpty );
	}
}