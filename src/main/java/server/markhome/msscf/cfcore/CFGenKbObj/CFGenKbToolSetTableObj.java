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

public class CFGenKbToolSetTableObj
	implements ICFGenKbToolSetTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> members;
	private Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> allToolSet;
	private Map< CFGenKbToolSetByNameIdxKey,
		ICFGenKbToolSetObj > indexByNameIdx;
	private Map< CFGenKbToolSetByTool0IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool0Idx;
	private Map< CFGenKbToolSetByTool1IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool1Idx;
	private Map< CFGenKbToolSetByTool2IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool2Idx;
	private Map< CFGenKbToolSetByTool3IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool3Idx;
	private Map< CFGenKbToolSetByTool4IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool4Idx;
	private Map< CFGenKbToolSetByTool5IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool5Idx;
	private Map< CFGenKbToolSetByTool6IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool6Idx;
	private Map< CFGenKbToolSetByTool7IdxKey,
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > > indexByTool7Idx;
	public static String TABLE_NAME = "ToolSet";
	public static String TABLE_DBNAME = "kbtoolset";

	public CFGenKbToolSetTableObj() {
		schema = null;
		members = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
		allToolSet = null;
		indexByNameIdx = null;
		indexByTool0Idx = null;
		indexByTool1Idx = null;
		indexByTool2Idx = null;
		indexByTool3Idx = null;
		indexByTool4Idx = null;
		indexByTool5Idx = null;
		indexByTool6Idx = null;
		indexByTool7Idx = null;
	}

	public CFGenKbToolSetTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
		allToolSet = null;
		indexByNameIdx = null;
		indexByTool0Idx = null;
		indexByTool1Idx = null;
		indexByTool2Idx = null;
		indexByTool3Idx = null;
		indexByTool4Idx = null;
		indexByTool5Idx = null;
		indexByTool6Idx = null;
		indexByTool7Idx = null;
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
		allToolSet = null;
		indexByNameIdx = null;
		indexByTool0Idx = null;
		indexByTool1Idx = null;
		indexByTool2Idx = null;
		indexByTool3Idx = null;
		indexByTool4Idx = null;
		indexByTool5Idx = null;
		indexByTool6Idx = null;
		indexByTool7Idx = null;
		List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
		ICFGenKbToolSetObj cur = null;
		Iterator<ICFGenKbToolSetObj> iter = members.values().iterator();
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
	 *	CFGenKbToolSetObj.
	 */
	public ICFGenKbToolSetObj newInstance() {
		ICFGenKbToolSetObj inst = new CFGenKbToolSetObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbToolSetObj.
	 */
	public ICFGenKbToolSetEditObj newEditInstance( ICFGenKbToolSetObj orig ) {
		ICFGenKbToolSetEditObj edit = new CFGenKbToolSetEditObj( orig );
		return( edit );
	}

	public ICFGenKbToolSetObj realiseToolSet( ICFGenKbToolSetObj Obj ) {
		ICFGenKbToolSetObj obj = Obj;
		CFGenKbToolSetPKey pkey = obj.getPKey();
		ICFGenKbToolSetObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbToolSetObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				CFGenKbToolSetByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByTool0Idx != null ) {
				CFGenKbToolSetByTool0IdxKey keyTool0Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
				keyTool0Idx.setRequiredToolId0( keepObj.getRequiredToolId0() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool0Idx = indexByTool0Idx.get( keyTool0Idx );
				if( mapTool0Idx != null ) {
					mapTool0Idx.remove( keepObj.getPKey() );
					if( mapTool0Idx.size() <= 0 ) {
						indexByTool0Idx.remove( keyTool0Idx );
					}
				}
			}

			if( indexByTool1Idx != null ) {
				CFGenKbToolSetByTool1IdxKey keyTool1Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
				keyTool1Idx.setOptionalToolId1( keepObj.getOptionalToolId1() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool1Idx = indexByTool1Idx.get( keyTool1Idx );
				if( mapTool1Idx != null ) {
					mapTool1Idx.remove( keepObj.getPKey() );
					if( mapTool1Idx.size() <= 0 ) {
						indexByTool1Idx.remove( keyTool1Idx );
					}
				}
			}

			if( indexByTool2Idx != null ) {
				CFGenKbToolSetByTool2IdxKey keyTool2Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
				keyTool2Idx.setOptionalToolId2( keepObj.getOptionalToolId2() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool2Idx = indexByTool2Idx.get( keyTool2Idx );
				if( mapTool2Idx != null ) {
					mapTool2Idx.remove( keepObj.getPKey() );
					if( mapTool2Idx.size() <= 0 ) {
						indexByTool2Idx.remove( keyTool2Idx );
					}
				}
			}

			if( indexByTool3Idx != null ) {
				CFGenKbToolSetByTool3IdxKey keyTool3Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
				keyTool3Idx.setOptionalToolId3( keepObj.getOptionalToolId3() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool3Idx = indexByTool3Idx.get( keyTool3Idx );
				if( mapTool3Idx != null ) {
					mapTool3Idx.remove( keepObj.getPKey() );
					if( mapTool3Idx.size() <= 0 ) {
						indexByTool3Idx.remove( keyTool3Idx );
					}
				}
			}

			if( indexByTool4Idx != null ) {
				CFGenKbToolSetByTool4IdxKey keyTool4Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
				keyTool4Idx.setOptionalToolId4( keepObj.getOptionalToolId4() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool4Idx = indexByTool4Idx.get( keyTool4Idx );
				if( mapTool4Idx != null ) {
					mapTool4Idx.remove( keepObj.getPKey() );
					if( mapTool4Idx.size() <= 0 ) {
						indexByTool4Idx.remove( keyTool4Idx );
					}
				}
			}

			if( indexByTool5Idx != null ) {
				CFGenKbToolSetByTool5IdxKey keyTool5Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
				keyTool5Idx.setOptionalToolId5( keepObj.getOptionalToolId5() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool5Idx = indexByTool5Idx.get( keyTool5Idx );
				if( mapTool5Idx != null ) {
					mapTool5Idx.remove( keepObj.getPKey() );
					if( mapTool5Idx.size() <= 0 ) {
						indexByTool5Idx.remove( keyTool5Idx );
					}
				}
			}

			if( indexByTool6Idx != null ) {
				CFGenKbToolSetByTool6IdxKey keyTool6Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
				keyTool6Idx.setOptionalToolId6( keepObj.getOptionalToolId6() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool6Idx = indexByTool6Idx.get( keyTool6Idx );
				if( mapTool6Idx != null ) {
					mapTool6Idx.remove( keepObj.getPKey() );
					if( mapTool6Idx.size() <= 0 ) {
						indexByTool6Idx.remove( keyTool6Idx );
					}
				}
			}

			if( indexByTool7Idx != null ) {
				CFGenKbToolSetByTool7IdxKey keyTool7Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
				keyTool7Idx.setOptionalToolId7( keepObj.getOptionalToolId7() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool7Idx = indexByTool7Idx.get( keyTool7Idx );
				if( mapTool7Idx != null ) {
					mapTool7Idx.remove( keepObj.getPKey() );
					if( mapTool7Idx.size() <= 0 ) {
						indexByTool7Idx.remove( keyTool7Idx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				CFGenKbToolSetByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByTool0Idx != null ) {
				CFGenKbToolSetByTool0IdxKey keyTool0Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
				keyTool0Idx.setRequiredToolId0( keepObj.getRequiredToolId0() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool0Idx = indexByTool0Idx.get( keyTool0Idx );
				if( mapTool0Idx != null ) {
					mapTool0Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool1Idx != null ) {
				CFGenKbToolSetByTool1IdxKey keyTool1Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
				keyTool1Idx.setOptionalToolId1( keepObj.getOptionalToolId1() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool1Idx = indexByTool1Idx.get( keyTool1Idx );
				if( mapTool1Idx != null ) {
					mapTool1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool2Idx != null ) {
				CFGenKbToolSetByTool2IdxKey keyTool2Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
				keyTool2Idx.setOptionalToolId2( keepObj.getOptionalToolId2() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool2Idx = indexByTool2Idx.get( keyTool2Idx );
				if( mapTool2Idx != null ) {
					mapTool2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool3Idx != null ) {
				CFGenKbToolSetByTool3IdxKey keyTool3Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
				keyTool3Idx.setOptionalToolId3( keepObj.getOptionalToolId3() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool3Idx = indexByTool3Idx.get( keyTool3Idx );
				if( mapTool3Idx != null ) {
					mapTool3Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool4Idx != null ) {
				CFGenKbToolSetByTool4IdxKey keyTool4Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
				keyTool4Idx.setOptionalToolId4( keepObj.getOptionalToolId4() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool4Idx = indexByTool4Idx.get( keyTool4Idx );
				if( mapTool4Idx != null ) {
					mapTool4Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool5Idx != null ) {
				CFGenKbToolSetByTool5IdxKey keyTool5Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
				keyTool5Idx.setOptionalToolId5( keepObj.getOptionalToolId5() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool5Idx = indexByTool5Idx.get( keyTool5Idx );
				if( mapTool5Idx != null ) {
					mapTool5Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool6Idx != null ) {
				CFGenKbToolSetByTool6IdxKey keyTool6Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
				keyTool6Idx.setOptionalToolId6( keepObj.getOptionalToolId6() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool6Idx = indexByTool6Idx.get( keyTool6Idx );
				if( mapTool6Idx != null ) {
					mapTool6Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool7Idx != null ) {
				CFGenKbToolSetByTool7IdxKey keyTool7Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
				keyTool7Idx.setOptionalToolId7( keepObj.getOptionalToolId7() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool7Idx = indexByTool7Idx.get( keyTool7Idx );
				if( mapTool7Idx != null ) {
					mapTool7Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allToolSet != null ) {
				allToolSet.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allToolSet != null ) {
				allToolSet.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				CFGenKbToolSetByNameIdxKey keyNameIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByTool0Idx != null ) {
				CFGenKbToolSetByTool0IdxKey keyTool0Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
				keyTool0Idx.setRequiredToolId0( keepObj.getRequiredToolId0() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool0Idx = indexByTool0Idx.get( keyTool0Idx );
				if( mapTool0Idx != null ) {
					mapTool0Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool1Idx != null ) {
				CFGenKbToolSetByTool1IdxKey keyTool1Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
				keyTool1Idx.setOptionalToolId1( keepObj.getOptionalToolId1() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool1Idx = indexByTool1Idx.get( keyTool1Idx );
				if( mapTool1Idx != null ) {
					mapTool1Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool2Idx != null ) {
				CFGenKbToolSetByTool2IdxKey keyTool2Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
				keyTool2Idx.setOptionalToolId2( keepObj.getOptionalToolId2() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool2Idx = indexByTool2Idx.get( keyTool2Idx );
				if( mapTool2Idx != null ) {
					mapTool2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool3Idx != null ) {
				CFGenKbToolSetByTool3IdxKey keyTool3Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
				keyTool3Idx.setOptionalToolId3( keepObj.getOptionalToolId3() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool3Idx = indexByTool3Idx.get( keyTool3Idx );
				if( mapTool3Idx != null ) {
					mapTool3Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool4Idx != null ) {
				CFGenKbToolSetByTool4IdxKey keyTool4Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
				keyTool4Idx.setOptionalToolId4( keepObj.getOptionalToolId4() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool4Idx = indexByTool4Idx.get( keyTool4Idx );
				if( mapTool4Idx != null ) {
					mapTool4Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool5Idx != null ) {
				CFGenKbToolSetByTool5IdxKey keyTool5Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
				keyTool5Idx.setOptionalToolId5( keepObj.getOptionalToolId5() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool5Idx = indexByTool5Idx.get( keyTool5Idx );
				if( mapTool5Idx != null ) {
					mapTool5Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool6Idx != null ) {
				CFGenKbToolSetByTool6IdxKey keyTool6Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
				keyTool6Idx.setOptionalToolId6( keepObj.getOptionalToolId6() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool6Idx = indexByTool6Idx.get( keyTool6Idx );
				if( mapTool6Idx != null ) {
					mapTool6Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByTool7Idx != null ) {
				CFGenKbToolSetByTool7IdxKey keyTool7Idx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
				keyTool7Idx.setOptionalToolId7( keepObj.getOptionalToolId7() );
				Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj > mapTool7Idx = indexByTool7Idx.get( keyTool7Idx );
				if( mapTool7Idx != null ) {
					mapTool7Idx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbToolSetObj createToolSet( ICFGenKbToolSetObj Obj ) {
		ICFGenKbToolSetObj obj = Obj;
		CFGenKbToolSetBuff buff = obj.getToolSetBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().createToolSet(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbToolSetObj readToolSet( CFGenKbToolSetPKey pkey ) {
		return( readToolSet( pkey, false ) );
	}

	public ICFGenKbToolSetObj readToolSet( CFGenKbToolSetPKey pkey, boolean forceRead ) {
		ICFGenKbToolSetObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbToolSetBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbToolSetObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbToolSetObj readCachedToolSet( CFGenKbToolSetPKey pkey ) {
		ICFGenKbToolSetObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeToolSet( ICFGenKbToolSetObj obj )
	{
		final String S_ProcName = "CFGenKbToolSetTableObj.reallyDeepDisposeToolSet() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbToolSetPKey pkey = obj.getPKey();
		ICFGenKbToolSetObj existing = readCachedToolSet( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbToolSetByNameIdxKey keyNameIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		CFGenKbToolSetByTool0IdxKey keyTool0Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		keyTool0Idx.setRequiredToolId0( existing.getRequiredToolId0() );

		CFGenKbToolSetByTool1IdxKey keyTool1Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		keyTool1Idx.setOptionalToolId1( existing.getOptionalToolId1() );

		CFGenKbToolSetByTool2IdxKey keyTool2Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		keyTool2Idx.setOptionalToolId2( existing.getOptionalToolId2() );

		CFGenKbToolSetByTool3IdxKey keyTool3Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		keyTool3Idx.setOptionalToolId3( existing.getOptionalToolId3() );

		CFGenKbToolSetByTool4IdxKey keyTool4Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		keyTool4Idx.setOptionalToolId4( existing.getOptionalToolId4() );

		CFGenKbToolSetByTool5IdxKey keyTool5Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		keyTool5Idx.setOptionalToolId5( existing.getOptionalToolId5() );

		CFGenKbToolSetByTool6IdxKey keyTool6Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		keyTool6Idx.setOptionalToolId6( existing.getOptionalToolId6() );

		CFGenKbToolSetByTool7IdxKey keyTool7Idx = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		keyTool7Idx.setOptionalToolId7( existing.getOptionalToolId7() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}

		if( indexByTool0Idx != null ) {
			if( indexByTool0Idx.containsKey( keyTool0Idx ) ) {
				indexByTool0Idx.get( keyTool0Idx ).remove( pkey );
				if( indexByTool0Idx.get( keyTool0Idx ).size() <= 0 ) {
					indexByTool0Idx.remove( keyTool0Idx );
				}
			}
		}

		if( indexByTool1Idx != null ) {
			if( indexByTool1Idx.containsKey( keyTool1Idx ) ) {
				indexByTool1Idx.get( keyTool1Idx ).remove( pkey );
				if( indexByTool1Idx.get( keyTool1Idx ).size() <= 0 ) {
					indexByTool1Idx.remove( keyTool1Idx );
				}
			}
		}

		if( indexByTool2Idx != null ) {
			if( indexByTool2Idx.containsKey( keyTool2Idx ) ) {
				indexByTool2Idx.get( keyTool2Idx ).remove( pkey );
				if( indexByTool2Idx.get( keyTool2Idx ).size() <= 0 ) {
					indexByTool2Idx.remove( keyTool2Idx );
				}
			}
		}

		if( indexByTool3Idx != null ) {
			if( indexByTool3Idx.containsKey( keyTool3Idx ) ) {
				indexByTool3Idx.get( keyTool3Idx ).remove( pkey );
				if( indexByTool3Idx.get( keyTool3Idx ).size() <= 0 ) {
					indexByTool3Idx.remove( keyTool3Idx );
				}
			}
		}

		if( indexByTool4Idx != null ) {
			if( indexByTool4Idx.containsKey( keyTool4Idx ) ) {
				indexByTool4Idx.get( keyTool4Idx ).remove( pkey );
				if( indexByTool4Idx.get( keyTool4Idx ).size() <= 0 ) {
					indexByTool4Idx.remove( keyTool4Idx );
				}
			}
		}

		if( indexByTool5Idx != null ) {
			if( indexByTool5Idx.containsKey( keyTool5Idx ) ) {
				indexByTool5Idx.get( keyTool5Idx ).remove( pkey );
				if( indexByTool5Idx.get( keyTool5Idx ).size() <= 0 ) {
					indexByTool5Idx.remove( keyTool5Idx );
				}
			}
		}

		if( indexByTool6Idx != null ) {
			if( indexByTool6Idx.containsKey( keyTool6Idx ) ) {
				indexByTool6Idx.get( keyTool6Idx ).remove( pkey );
				if( indexByTool6Idx.get( keyTool6Idx ).size() <= 0 ) {
					indexByTool6Idx.remove( keyTool6Idx );
				}
			}
		}

		if( indexByTool7Idx != null ) {
			if( indexByTool7Idx.containsKey( keyTool7Idx ) ) {
				indexByTool7Idx.get( keyTool7Idx ).remove( pkey );
				if( indexByTool7Idx.get( keyTool7Idx ).size() <= 0 ) {
					indexByTool7Idx.remove( keyTool7Idx );
				}
			}
		}


	}
	public void deepDisposeToolSet( CFGenKbToolSetPKey pkey ) {
		ICFGenKbToolSetObj obj = readCachedToolSet( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbToolSetObj lockToolSet( CFGenKbToolSetPKey pkey ) {
		ICFGenKbToolSetObj locked = null;
		CFGenKbToolSetBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getToolSetTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbToolSetObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockToolSet", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbToolSetObj> readAllToolSet() {
		return( readAllToolSet( false ) );
	}

	public List<ICFGenKbToolSetObj> readAllToolSet( boolean forceRead ) {
		final String S_ProcName = "readAllToolSet";
		if( ( allToolSet == null ) || forceRead ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> map = new HashMap<CFGenKbToolSetPKey,ICFGenKbToolSetObj>();
			allToolSet = map;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readAllDerived( schema.getAuthorization() );
			CFGenKbToolSetBuff buff;
			ICFGenKbToolSetObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
			}
		}
		int len = allToolSet.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = allToolSet.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readCachedAllToolSet() {
		final String S_ProcName = "readCachedAllToolSet";
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( allToolSet != null ) {
			int len = allToolSet.size();
			ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
			Iterator<ICFGenKbToolSetObj> valIter = allToolSet.values().iterator();
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
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbToolSetObj readToolSetByIdIdx( short Id )
	{
		return( readToolSetByIdIdx( Id,
			false ) );
	}

	public ICFGenKbToolSetObj readToolSetByIdIdx( short Id, boolean forceRead )
	{
		CFGenKbToolSetPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		pkey.setRequiredId( Id );
		ICFGenKbToolSetObj obj = readToolSet( pkey, forceRead );
		return( obj );
	}

	public ICFGenKbToolSetObj readToolSetByNameIdx( String Name )
	{
		return( readToolSetByNameIdx( Name,
			false ) );
	}

	public ICFGenKbToolSetObj readToolSetByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbToolSetByNameIdxKey,
				ICFGenKbToolSetObj >();
		}
		CFGenKbToolSetByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );
		ICFGenKbToolSetObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			CFGenKbToolSetBuff buff = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				obj = (ICFGenKbToolSetObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool0Idx( short ToolId0 )
	{
		return( readToolSetByTool0Idx( ToolId0,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool0Idx( short ToolId0,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool0Idx";
		CFGenKbToolSetByTool0IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool0Idx == null ) {
			indexByTool0Idx = new HashMap< CFGenKbToolSetByTool0IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool0Idx.containsKey( key ) ) {
			dict = indexByTool0Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool0Idx( schema.getAuthorization(),
				ToolId0 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool0Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool1Idx( Short ToolId1 )
	{
		return( readToolSetByTool1Idx( ToolId1,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool1Idx( Short ToolId1,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool1Idx";
		CFGenKbToolSetByTool1IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool1Idx == null ) {
			indexByTool1Idx = new HashMap< CFGenKbToolSetByTool1IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool1Idx.containsKey( key ) ) {
			dict = indexByTool1Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool1Idx( schema.getAuthorization(),
				ToolId1 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool1Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool2Idx( Short ToolId2 )
	{
		return( readToolSetByTool2Idx( ToolId2,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool2Idx( Short ToolId2,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool2Idx";
		CFGenKbToolSetByTool2IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool2Idx == null ) {
			indexByTool2Idx = new HashMap< CFGenKbToolSetByTool2IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool2Idx.containsKey( key ) ) {
			dict = indexByTool2Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool2Idx( schema.getAuthorization(),
				ToolId2 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool2Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool3Idx( Short ToolId3 )
	{
		return( readToolSetByTool3Idx( ToolId3,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool3Idx( Short ToolId3,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool3Idx";
		CFGenKbToolSetByTool3IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool3Idx == null ) {
			indexByTool3Idx = new HashMap< CFGenKbToolSetByTool3IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool3Idx.containsKey( key ) ) {
			dict = indexByTool3Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool3Idx( schema.getAuthorization(),
				ToolId3 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool3Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool4Idx( Short ToolId4 )
	{
		return( readToolSetByTool4Idx( ToolId4,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool4Idx( Short ToolId4,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool4Idx";
		CFGenKbToolSetByTool4IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool4Idx == null ) {
			indexByTool4Idx = new HashMap< CFGenKbToolSetByTool4IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool4Idx.containsKey( key ) ) {
			dict = indexByTool4Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool4Idx( schema.getAuthorization(),
				ToolId4 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool4Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool5Idx( Short ToolId5 )
	{
		return( readToolSetByTool5Idx( ToolId5,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool5Idx( Short ToolId5,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool5Idx";
		CFGenKbToolSetByTool5IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool5Idx == null ) {
			indexByTool5Idx = new HashMap< CFGenKbToolSetByTool5IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool5Idx.containsKey( key ) ) {
			dict = indexByTool5Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool5Idx( schema.getAuthorization(),
				ToolId5 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool5Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool6Idx( Short ToolId6 )
	{
		return( readToolSetByTool6Idx( ToolId6,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool6Idx( Short ToolId6,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool6Idx";
		CFGenKbToolSetByTool6IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool6Idx == null ) {
			indexByTool6Idx = new HashMap< CFGenKbToolSetByTool6IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool6Idx.containsKey( key ) ) {
			dict = indexByTool6Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool6Idx( schema.getAuthorization(),
				ToolId6 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool6Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool7Idx( Short ToolId7 )
	{
		return( readToolSetByTool7Idx( ToolId7,
			false ) );
	}

	public List<ICFGenKbToolSetObj> readToolSetByTool7Idx( Short ToolId7,
		boolean forceRead )
	{
		final String S_ProcName = "readToolSetByTool7Idx";
		CFGenKbToolSetByTool7IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );
		Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
		if( indexByTool7Idx == null ) {
			indexByTool7Idx = new HashMap< CFGenKbToolSetByTool7IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( ( ! forceRead ) && indexByTool7Idx.containsKey( key ) ) {
			dict = indexByTool7Idx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbToolSetPKey, ICFGenKbToolSetObj>();
			ICFGenKbToolSetObj obj;
			CFGenKbToolSetBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().readDerivedByTool7Idx( schema.getAuthorization(),
				ToolId7 );
			CFGenKbToolSetBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getToolSetTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey() );
				obj.setBuff( buff );
				ICFGenKbToolSetObj realised = (ICFGenKbToolSetObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTool7Idx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
		Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbToolSetObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbToolSetObj readCachedToolSetByIdIdx( short Id )
	{
		ICFGenKbToolSetObj obj = null;
		CFGenKbToolSetPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		pkey.setRequiredId( Id );
		obj = readCachedToolSet( pkey );
		return( obj );
	}

	public ICFGenKbToolSetObj readCachedToolSetByNameIdx( String Name )
	{
		ICFGenKbToolSetObj obj = null;
		CFGenKbToolSetByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
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
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
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

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool0Idx( short ToolId0 )
	{
		final String S_ProcName = "readCachedToolSetByTool0Idx";
		CFGenKbToolSetByTool0IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool0Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool0Idx.containsKey( key ) ) {
				dict = indexByTool0Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool1Idx( Short ToolId1 )
	{
		final String S_ProcName = "readCachedToolSetByTool1Idx";
		CFGenKbToolSetByTool1IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool1Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool1Idx.containsKey( key ) ) {
				dict = indexByTool1Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool2Idx( Short ToolId2 )
	{
		final String S_ProcName = "readCachedToolSetByTool2Idx";
		CFGenKbToolSetByTool2IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool2Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool2Idx.containsKey( key ) ) {
				dict = indexByTool2Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool3Idx( Short ToolId3 )
	{
		final String S_ProcName = "readCachedToolSetByTool3Idx";
		CFGenKbToolSetByTool3IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool3Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool3Idx.containsKey( key ) ) {
				dict = indexByTool3Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool4Idx( Short ToolId4 )
	{
		final String S_ProcName = "readCachedToolSetByTool4Idx";
		CFGenKbToolSetByTool4IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool4Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool4Idx.containsKey( key ) ) {
				dict = indexByTool4Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool5Idx( Short ToolId5 )
	{
		final String S_ProcName = "readCachedToolSetByTool5Idx";
		CFGenKbToolSetByTool5IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool5Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool5Idx.containsKey( key ) ) {
				dict = indexByTool5Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool6Idx( Short ToolId6 )
	{
		final String S_ProcName = "readCachedToolSetByTool6Idx";
		CFGenKbToolSetByTool6IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool6Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool6Idx.containsKey( key ) ) {
				dict = indexByTool6Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFGenKbToolSetObj> readCachedToolSetByTool7Idx( Short ToolId7 )
	{
		final String S_ProcName = "readCachedToolSetByTool7Idx";
		CFGenKbToolSetByTool7IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );
		ArrayList<ICFGenKbToolSetObj> arrayList = new ArrayList<ICFGenKbToolSetObj>();
		if( indexByTool7Idx != null ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict;
			if( indexByTool7Idx.containsKey( key ) ) {
				dict = indexByTool7Idx.get( key );
				int len = dict.size();
				ICFGenKbToolSetObj arr[] = new ICFGenKbToolSetObj[len];
				Iterator<ICFGenKbToolSetObj> valIter = dict.values().iterator();
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
			ICFGenKbToolSetObj obj;
			Iterator<ICFGenKbToolSetObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbToolSetObj> cmp = new Comparator<ICFGenKbToolSetObj>() {
			public int compare( ICFGenKbToolSetObj lhs, ICFGenKbToolSetObj rhs ) {
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
					CFGenKbToolSetPKey lhsPKey = lhs.getPKey();
					CFGenKbToolSetPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeToolSetByIdIdx( short Id )
	{
		ICFGenKbToolSetObj obj = readCachedToolSetByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolSetByNameIdx( String Name )
	{
		ICFGenKbToolSetObj obj = readCachedToolSetByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeToolSetByTool0Idx( short ToolId0 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool0Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool0Idx( ToolId0 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool1Idx( Short ToolId1 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool1Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool1Idx( ToolId1 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool2Idx( Short ToolId2 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool2Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool2Idx( ToolId2 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool3Idx( Short ToolId3 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool3Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool3Idx( ToolId3 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool4Idx( Short ToolId4 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool4Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool4Idx( ToolId4 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool5Idx( Short ToolId5 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool5Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool5Idx( ToolId5 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool6Idx( Short ToolId6 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool6Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool6Idx( ToolId6 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeToolSetByTool7Idx( Short ToolId7 )
	{
		final String S_ProcName = "deepDisposeToolSetByTool7Idx";
		ICFGenKbToolSetObj obj;
		List<ICFGenKbToolSetObj> arrayList = readCachedToolSetByTool7Idx( ToolId7 );
		if( arrayList != null )  {
			Iterator<ICFGenKbToolSetObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbToolSetObj updateToolSet( ICFGenKbToolSetObj Obj ) {
		ICFGenKbToolSetObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().updateToolSet( schema.getAuthorization(),
			Obj.getToolSetBuff() );
		obj = (ICFGenKbToolSetObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteToolSet( ICFGenKbToolSetObj Obj ) {
		ICFGenKbToolSetObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSet( schema.getAuthorization(),
			obj.getToolSetBuff() );
		Obj.forget();
	}

	public void deleteToolSetByIdIdx( short Id )
	{
		CFGenKbToolSetPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newPKey();
		pkey.setRequiredId( Id );
		ICFGenKbToolSetObj obj = readToolSet( pkey );
		if( obj != null ) {
			ICFGenKbToolSetEditObj editObj = (ICFGenKbToolSetEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbToolSetEditObj)obj.beginEdit();
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
		deepDisposeToolSetByIdIdx( Id );
	}

	public void deleteToolSetByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< CFGenKbToolSetByNameIdxKey,
				ICFGenKbToolSetObj >();
		}
		CFGenKbToolSetByNameIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );
		ICFGenKbToolSetObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeToolSetByNameIdx( Name );
	}

	public void deleteToolSetByTool0Idx( short ToolId0 )
	{
		CFGenKbToolSetByTool0IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );
		if( indexByTool0Idx == null ) {
			indexByTool0Idx = new HashMap< CFGenKbToolSetByTool0IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool0Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool0Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool0Idx( schema.getAuthorization(),
				ToolId0 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool0Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool0Idx( schema.getAuthorization(),
				ToolId0 );
		}
		deepDisposeToolSetByTool0Idx( ToolId0 );
	}

	public void deleteToolSetByTool1Idx( Short ToolId1 )
	{
		CFGenKbToolSetByTool1IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );
		if( indexByTool1Idx == null ) {
			indexByTool1Idx = new HashMap< CFGenKbToolSetByTool1IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool1Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool1Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool1Idx( schema.getAuthorization(),
				ToolId1 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool1Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool1Idx( schema.getAuthorization(),
				ToolId1 );
		}
		deepDisposeToolSetByTool1Idx( ToolId1 );
	}

	public void deleteToolSetByTool2Idx( Short ToolId2 )
	{
		CFGenKbToolSetByTool2IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );
		if( indexByTool2Idx == null ) {
			indexByTool2Idx = new HashMap< CFGenKbToolSetByTool2IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool2Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool2Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool2Idx( schema.getAuthorization(),
				ToolId2 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool2Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool2Idx( schema.getAuthorization(),
				ToolId2 );
		}
		deepDisposeToolSetByTool2Idx( ToolId2 );
	}

	public void deleteToolSetByTool3Idx( Short ToolId3 )
	{
		CFGenKbToolSetByTool3IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );
		if( indexByTool3Idx == null ) {
			indexByTool3Idx = new HashMap< CFGenKbToolSetByTool3IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool3Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool3Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool3Idx( schema.getAuthorization(),
				ToolId3 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool3Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool3Idx( schema.getAuthorization(),
				ToolId3 );
		}
		deepDisposeToolSetByTool3Idx( ToolId3 );
	}

	public void deleteToolSetByTool4Idx( Short ToolId4 )
	{
		CFGenKbToolSetByTool4IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );
		if( indexByTool4Idx == null ) {
			indexByTool4Idx = new HashMap< CFGenKbToolSetByTool4IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool4Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool4Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool4Idx( schema.getAuthorization(),
				ToolId4 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool4Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool4Idx( schema.getAuthorization(),
				ToolId4 );
		}
		deepDisposeToolSetByTool4Idx( ToolId4 );
	}

	public void deleteToolSetByTool5Idx( Short ToolId5 )
	{
		CFGenKbToolSetByTool5IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );
		if( indexByTool5Idx == null ) {
			indexByTool5Idx = new HashMap< CFGenKbToolSetByTool5IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool5Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool5Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool5Idx( schema.getAuthorization(),
				ToolId5 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool5Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool5Idx( schema.getAuthorization(),
				ToolId5 );
		}
		deepDisposeToolSetByTool5Idx( ToolId5 );
	}

	public void deleteToolSetByTool6Idx( Short ToolId6 )
	{
		CFGenKbToolSetByTool6IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );
		if( indexByTool6Idx == null ) {
			indexByTool6Idx = new HashMap< CFGenKbToolSetByTool6IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool6Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool6Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool6Idx( schema.getAuthorization(),
				ToolId6 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool6Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool6Idx( schema.getAuthorization(),
				ToolId6 );
		}
		deepDisposeToolSetByTool6Idx( ToolId6 );
	}

	public void deleteToolSetByTool7Idx( Short ToolId7 )
	{
		CFGenKbToolSetByTool7IdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );
		if( indexByTool7Idx == null ) {
			indexByTool7Idx = new HashMap< CFGenKbToolSetByTool7IdxKey,
				Map< CFGenKbToolSetPKey, ICFGenKbToolSetObj > >();
		}
		if( indexByTool7Idx.containsKey( key ) ) {
			Map<CFGenKbToolSetPKey, ICFGenKbToolSetObj> dict = indexByTool7Idx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool7Idx( schema.getAuthorization(),
				ToolId7 );
			Iterator<ICFGenKbToolSetObj> iter = dict.values().iterator();
			ICFGenKbToolSetObj obj;
			List<ICFGenKbToolSetObj> toForget = new LinkedList<ICFGenKbToolSetObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTool7Idx.remove( key );
		}
		else {
			((ICFGenKbSchema)schema.getBackingStore()).getTableToolSet().deleteToolSetByTool7Idx( schema.getAuthorization(),
				ToolId7 );
		}
		deepDisposeToolSetByTool7Idx( ToolId7 );
	}
}