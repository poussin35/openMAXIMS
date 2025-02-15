//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.icp.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class ICPPhaseVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.icp.vo.ICPPhaseVo copy(ims.icp.vo.ICPPhaseVo valueObjectDest, ims.icp.vo.ICPPhaseVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ICPPhase(valueObjectSrc.getID_ICPPhase());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Rules
		valueObjectDest.setRules(valueObjectSrc.getRules());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// isActivatedOnInitiation
		valueObjectDest.setIsActivatedOnInitiation(valueObjectSrc.getIsActivatedOnInitiation());
		// Actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
		// Name
		valueObjectDest.setName(valueObjectSrc.getName());
		// Goals
		valueObjectDest.setGoals(valueObjectSrc.getGoals());
		// HelpURL
		valueObjectDest.setHelpURL(valueObjectSrc.getHelpURL());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// Status
		valueObjectDest.setStatus(valueObjectSrc.getStatus());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createICPPhaseVoCollectionFromICPPhase(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPPhase objects.
	 */
	public static ims.icp.vo.ICPPhaseVoCollection createICPPhaseVoCollectionFromICPPhase(java.util.Set domainObjectSet)	
	{
		return createICPPhaseVoCollectionFromICPPhase(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.icps.configuration.domain.objects.ICPPhase objects.
	 */
	public static ims.icp.vo.ICPPhaseVoCollection createICPPhaseVoCollectionFromICPPhase(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.icp.vo.ICPPhaseVoCollection voList = new ims.icp.vo.ICPPhaseVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.icps.configuration.domain.objects.ICPPhase domainObject = (ims.icps.configuration.domain.objects.ICPPhase) iterator.next();
			ims.icp.vo.ICPPhaseVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPPhase objects.
	 */
	public static ims.icp.vo.ICPPhaseVoCollection createICPPhaseVoCollectionFromICPPhase(java.util.List domainObjectList) 
	{
		return createICPPhaseVoCollectionFromICPPhase(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.icps.configuration.domain.objects.ICPPhase objects.
	 */
	public static ims.icp.vo.ICPPhaseVoCollection createICPPhaseVoCollectionFromICPPhase(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.icp.vo.ICPPhaseVoCollection voList = new ims.icp.vo.ICPPhaseVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.icps.configuration.domain.objects.ICPPhase domainObject = (ims.icps.configuration.domain.objects.ICPPhase) domainObjectList.get(i);
			ims.icp.vo.ICPPhaseVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.icps.configuration.domain.objects.ICPPhase set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractICPPhaseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPPhaseVoCollection voCollection) 
	 {
	 	return extractICPPhaseSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractICPPhaseSet(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPPhaseVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPPhaseVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPPhase domainObject = ICPPhaseVoAssembler.extractICPPhase(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.icps.configuration.domain.objects.ICPPhase list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractICPPhaseList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPPhaseVoCollection voCollection) 
	 {
	 	return extractICPPhaseList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractICPPhaseList(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPPhaseVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.icp.vo.ICPPhaseVo vo = voCollection.get(i);
			ims.icps.configuration.domain.objects.ICPPhase domainObject = ICPPhaseVoAssembler.extractICPPhase(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPPhase object.
	 * @param domainObject ims.icps.configuration.domain.objects.ICPPhase
	 */
	 public static ims.icp.vo.ICPPhaseVo create(ims.icps.configuration.domain.objects.ICPPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.icps.configuration.domain.objects.ICPPhase object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.icp.vo.ICPPhaseVo create(DomainObjectMap map, ims.icps.configuration.domain.objects.ICPPhase domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.icp.vo.ICPPhaseVo valueObject = (ims.icp.vo.ICPPhaseVo) map.getValueObject(domainObject, ims.icp.vo.ICPPhaseVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.icp.vo.ICPPhaseVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICPPhase
	 */
	 public static ims.icp.vo.ICPPhaseVo insert(ims.icp.vo.ICPPhaseVo valueObject, ims.icps.configuration.domain.objects.ICPPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.icps.configuration.domain.objects.ICPPhase
	 */
	 public static ims.icp.vo.ICPPhaseVo insert(DomainObjectMap map, ims.icp.vo.ICPPhaseVo valueObject, ims.icps.configuration.domain.objects.ICPPhase domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ICPPhase(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// Rules
		valueObject.setRules(ims.admin.vo.domain.BusinessRuleVoAssembler.createBusinessRuleVoCollectionFromBusinessRule(map, domainObject.getRules()) );
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// isActivatedOnInitiation
		valueObject.setIsActivatedOnInitiation( domainObject.isIsActivatedOnInitiation() );
		// Actions
		valueObject.setActions(ims.icp.vo.domain.ICPActionLiteVoAssembler.createICPActionLiteVoCollectionFromICPAction(map, domainObject.getActions()) );
		// Name
		valueObject.setName(domainObject.getName());
		// Goals
		valueObject.setGoals(ims.icp.vo.domain.IcpPhaseGoalVoAssembler.createIcpPhaseGoalVoCollectionFromICPPhaseGoal(map, domainObject.getGoals()) );
		// HelpURL
		valueObject.setHelpURL(domainObject.getHelpURL());
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// Status
		ims.domain.lookups.LookupInstance instance9 = domainObject.getStatus();
		if ( null != instance9 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance9.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance9.getImage().getImageId(), instance9.getImage().getImagePath());
			}
			color = instance9.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.PreActiveActiveInactiveStatus voLookup9 = new ims.core.vo.lookups.PreActiveActiveInactiveStatus(instance9.getId(),instance9.getText(), instance9.isActive(), null, img, color);
			ims.core.vo.lookups.PreActiveActiveInactiveStatus parentVoLookup9 = voLookup9;
			ims.domain.lookups.LookupInstance parent9 = instance9.getParent();
			while (parent9 != null)
			{
				if (parent9.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent9.getImage().getImageId(), parent9.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent9.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup9.setParent(new ims.core.vo.lookups.PreActiveActiveInactiveStatus(parent9.getId(),parent9.getText(), parent9.isActive(), null, img, color));
				parentVoLookup9 = parentVoLookup9.getParent();
								parent9 = parent9.getParent();
			}			
			valueObject.setStatus(voLookup9);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.icps.configuration.domain.objects.ICPPhase extractICPPhase(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPPhaseVo valueObject) 
	{
		return 	extractICPPhase(domainFactory, valueObject, new HashMap());
	}

	public static ims.icps.configuration.domain.objects.ICPPhase extractICPPhase(ims.domain.ILightweightDomainFactory domainFactory, ims.icp.vo.ICPPhaseVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ICPPhase();
		ims.icps.configuration.domain.objects.ICPPhase domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPPhase)domMap.get(valueObject);
			}
			// ims.icp.vo.ICPPhaseVo ID_ICPPhase field is unknown
			domainObject = new ims.icps.configuration.domain.objects.ICPPhase();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ICPPhase());
			if (domMap.get(key) != null)
			{
				return (ims.icps.configuration.domain.objects.ICPPhase)domMap.get(key);
			}
			domainObject = (ims.icps.configuration.domain.objects.ICPPhase) domainFactory.getDomainObject(ims.icps.configuration.domain.objects.ICPPhase.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ICPPhase());

		domainObject.setRules(ims.admin.vo.domain.BusinessRuleVoAssembler.extractBusinessRuleSet(domainFactory, valueObject.getRules(), domainObject.getRules(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActivatedOnInitiation(valueObject.getIsActivatedOnInitiation());

		// SaveAsRefVO treated as RefValueObject
		ims.icps.configuration.vo.ICPActionRefVoCollection refCollection4 = new ims.icps.configuration.vo.ICPActionRefVoCollection();
		if (valueObject.getActions() != null)
		{
			for (int i4=0; i4<valueObject.getActions().size(); i4++)
			{
				ims.icps.configuration.vo.ICPActionRefVo ref4 = (ims.icps.configuration.vo.ICPActionRefVo)valueObject.getActions().get(i4);
				refCollection4.add(ref4);
			}
		}
		int size4 = (null == refCollection4) ? 0 : refCollection4.size();		
		java.util.Set domainActions4 = domainObject.getActions();
		if (domainActions4 == null)
		{
			domainActions4 = new java.util.HashSet();
		}
		java.util.Set newSet4  = new java.util.HashSet();
		for(int i=0; i<size4; i++) 
		{
			ims.icps.configuration.vo.ICPActionRefVo vo = refCollection4.get(i);					
			ims.icps.configuration.domain.objects.ICPAction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.icps.configuration.domain.objects.ICPAction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.icps.configuration.domain.objects.ICPAction)domainFactory.getDomainObject( ims.icps.configuration.domain.objects.ICPAction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainActions4.contains(dom))
			{
				domainActions4.add(dom);
			}
			newSet4.add(dom);			
		}
		java.util.Set removedSet4 = new java.util.HashSet();
		java.util.Iterator iter4 = domainActions4.iterator();
		//Find out which objects need to be removed
		while (iter4.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter4.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet4.contains(o))
			{
				removedSet4.add(o);
			}
		}
		iter4 = removedSet4.iterator();
		//Remove the unwanted objects
		while (iter4.hasNext())
		{
			domainActions4.remove(iter4.next());
		}		
		
		domainObject.setActions(domainActions4);		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		domainObject.setGoals(ims.icp.vo.domain.IcpPhaseGoalVoAssembler.extractICPPhaseGoalSet(domainFactory, valueObject.getGoals(), domainObject.getGoals(), domMap));		
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getHelpURL() != null && valueObject.getHelpURL().equals(""))
		{
			valueObject.setHelpURL(null);
		}
		domainObject.setHelpURL(valueObject.getHelpURL());
		domainObject.setSequence(valueObject.getSequence());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value9 = null;
		if ( null != valueObject.getStatus() ) 
		{
			value9 =
				domainFactory.getLookupInstance(valueObject.getStatus().getID());
		}
		domainObject.setStatus(value9);

		return domainObject;
	}

}
