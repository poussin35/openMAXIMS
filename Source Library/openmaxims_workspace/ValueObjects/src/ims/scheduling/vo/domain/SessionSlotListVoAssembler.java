//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 12/10/2015, 13:24
 *
 */
package ims.scheduling.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class SessionSlotListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.scheduling.vo.SessionSlotListVo copy(ims.scheduling.vo.SessionSlotListVo valueObjectDest, ims.scheduling.vo.SessionSlotListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_Session_Slot(valueObjectSrc.getID_Session_Slot());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// StartTm
		valueObjectDest.setStartTm(valueObjectSrc.getStartTm());
		// Session
		valueObjectDest.setSession(valueObjectSrc.getSession());
		// Priority
		valueObjectDest.setPriority(valueObjectSrc.getPriority());
		// Comment
		valueObjectDest.setComment(valueObjectSrc.getComment());
		// Activity
		valueObjectDest.setActivity(valueObjectSrc.getActivity());
		// Functions
		valueObjectDest.setFunctions(valueObjectSrc.getFunctions());
		// DirectAccessSlot
		valueObjectDest.setDirectAccessSlot(valueObjectSrc.getDirectAccessSlot());
		// Duration
		valueObjectDest.setDuration(valueObjectSrc.getDuration());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createSessionSlotListVoCollectionFromSession_Slot(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotListVoCollection createSessionSlotListVoCollectionFromSession_Slot(java.util.Set domainObjectSet)	
	{
		return createSessionSlotListVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotListVoCollection createSessionSlotListVoCollectionFromSession_Slot(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.scheduling.vo.SessionSlotListVoCollection voList = new ims.scheduling.vo.SessionSlotListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) iterator.next();
			ims.scheduling.vo.SessionSlotListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotListVoCollection createSessionSlotListVoCollectionFromSession_Slot(java.util.List domainObjectList) 
	{
		return createSessionSlotListVoCollectionFromSession_Slot(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.scheduling.domain.objects.Session_Slot objects.
	 */
	public static ims.scheduling.vo.SessionSlotListVoCollection createSessionSlotListVoCollectionFromSession_Slot(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.scheduling.vo.SessionSlotListVoCollection voList = new ims.scheduling.vo.SessionSlotListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.scheduling.domain.objects.Session_Slot domainObject = (ims.scheduling.domain.objects.Session_Slot) domainObjectList.get(i);
			ims.scheduling.vo.SessionSlotListVo vo = create(map, domainObject);

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
	 * Create the ims.scheduling.domain.objects.Session_Slot set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotListVoCollection voCollection) 
	 {
	 	return extractSession_SlotSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractSession_SlotSet(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotListVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotListVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 * Create the ims.scheduling.domain.objects.Session_Slot list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotListVoCollection voCollection) 
	 {
	 	return extractSession_SlotList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractSession_SlotList(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.scheduling.vo.SessionSlotListVo vo = voCollection.get(i);
			ims.scheduling.domain.objects.Session_Slot domainObject = SessionSlotListVoAssembler.extractSession_Slot(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.scheduling.domain.objects.Session_Slot object.
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotListVo create(ims.scheduling.domain.objects.Session_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.scheduling.domain.objects.Session_Slot object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.scheduling.vo.SessionSlotListVo create(DomainObjectMap map, ims.scheduling.domain.objects.Session_Slot domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.scheduling.vo.SessionSlotListVo valueObject = (ims.scheduling.vo.SessionSlotListVo) map.getValueObject(domainObject, ims.scheduling.vo.SessionSlotListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.scheduling.vo.SessionSlotListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotListVo insert(ims.scheduling.vo.SessionSlotListVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
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
	 * @param domainObject ims.scheduling.domain.objects.Session_Slot
	 */
	 public static ims.scheduling.vo.SessionSlotListVo insert(DomainObjectMap map, ims.scheduling.vo.SessionSlotListVo valueObject, ims.scheduling.domain.objects.Session_Slot domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_Session_Slot(domainObject.getId());
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
			
		// StartTm
		String StartTm = domainObject.getStartTm();
		if ( null != StartTm ) 
		{
			valueObject.setStartTm(new ims.framework.utils.Time(StartTm) );
		}
		// Session
		valueObject.setSession(ims.scheduling.vo.domain.SessionListVoAssembler.create(map, domainObject.getSession()) );
		// Priority
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPriority();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedulingPriority voLookup3 = new ims.scheduling.vo.lookups.SchedulingPriority(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedulingPriority parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.scheduling.vo.lookups.SchedulingPriority(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPriority(voLookup3);
		}
				// Comment
		valueObject.setComment(domainObject.getComment());
		// Activity
		valueObject.setActivity(ims.core.vo.domain.ActivityForSessionManagementVoAssembler.create(map, domainObject.getActivity()) );
		// Functions
		valueObject.setFunctions(ims.core.vo.domain.ServiceFunctionLiteVoAssembler.createServiceFunctionLiteVoCollectionFromServiceFunction(map, domainObject.getFunctions()) );
		// DirectAccessSlot
		ims.domain.lookups.LookupInstance instance7 = domainObject.getDirectAccessSlot();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.scheduling.vo.lookups.SchedCABSlotType voLookup7 = new ims.scheduling.vo.lookups.SchedCABSlotType(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.scheduling.vo.lookups.SchedCABSlotType parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.scheduling.vo.lookups.SchedCABSlotType(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setDirectAccessSlot(voLookup7);
		}
				// Duration
		valueObject.setDuration(domainObject.getDuration());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotListVo valueObject) 
	{
		return 	extractSession_Slot(domainFactory, valueObject, new HashMap());
	}

	public static ims.scheduling.domain.objects.Session_Slot extractSession_Slot(ims.domain.ILightweightDomainFactory domainFactory, ims.scheduling.vo.SessionSlotListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_Session_Slot();
		ims.scheduling.domain.objects.Session_Slot domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.scheduling.domain.objects.Session_Slot)domMap.get(valueObject);
			}
			// ims.scheduling.vo.SessionSlotListVo ID_Session_Slot field is unknown
			domainObject = new ims.scheduling.domain.objects.Session_Slot();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_Session_Slot());
			if (domMap.get(key) != null)
			{
				return (ims.scheduling.domain.objects.Session_Slot)domMap.get(key);
			}
			domainObject = (ims.scheduling.domain.objects.Session_Slot) domainFactory.getDomainObject(ims.scheduling.domain.objects.Session_Slot.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_Session_Slot());

		ims.framework.utils.Time time1 = valueObject.getStartTm();
		String value1 = null;
		if ( time1 != null ) 
		{
			value1 = time1.toString();
		}
		domainObject.setStartTm(value1);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.scheduling.domain.objects.Sch_Session value2 = null;
		if ( null != valueObject.getSession() ) 
		{
			if (valueObject.getSession().getBoId() == null)
			{
				if (domMap.get(valueObject.getSession()) != null)
				{
					value2 = (ims.scheduling.domain.objects.Sch_Session)domMap.get(valueObject.getSession());
				}
			}
			else
			{
				value2 = (ims.scheduling.domain.objects.Sch_Session)domainFactory.getDomainObject(ims.scheduling.domain.objects.Sch_Session.class, valueObject.getSession().getBoId());
			}
		}
		domainObject.setSession(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPriority() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPriority().getID());
		}
		domainObject.setPriority(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getComment() != null && valueObject.getComment().equals(""))
		{
			valueObject.setComment(null);
		}
		domainObject.setComment(valueObject.getComment());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Activity value5 = null;
		if ( null != valueObject.getActivity() ) 
		{
			if (valueObject.getActivity().getBoId() == null)
			{
				if (domMap.get(valueObject.getActivity()) != null)
				{
					value5 = (ims.core.resource.place.domain.objects.Activity)domMap.get(valueObject.getActivity());
				}
			}
			else
			{
				value5 = (ims.core.resource.place.domain.objects.Activity)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Activity.class, valueObject.getActivity().getBoId());
			}
		}
		domainObject.setActivity(value5);

		// SaveAsRefVO treated as RefValueObject
		ims.core.clinical.vo.ServiceFunctionRefVoCollection refCollection6 = new ims.core.clinical.vo.ServiceFunctionRefVoCollection();
		if (valueObject.getFunctions() != null)
		{
			for (int i6=0; i6<valueObject.getFunctions().size(); i6++)
			{
				ims.core.clinical.vo.ServiceFunctionRefVo ref6 = (ims.core.clinical.vo.ServiceFunctionRefVo)valueObject.getFunctions().get(i6);
				refCollection6.add(ref6);
			}
		}
		int size6 = (null == refCollection6) ? 0 : refCollection6.size();		
		java.util.Set domainFunctions6 = domainObject.getFunctions();
		if (domainFunctions6 == null)
		{
			domainFunctions6 = new java.util.HashSet();
		}
		java.util.Set newSet6  = new java.util.HashSet();
		for(int i=0; i<size6; i++) 
		{
			ims.core.clinical.vo.ServiceFunctionRefVo vo = refCollection6.get(i);					
			ims.core.clinical.domain.objects.ServiceFunction dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.ServiceFunction)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.ServiceFunction)domainFactory.getDomainObject( ims.core.clinical.domain.objects.ServiceFunction.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainFunctions6.contains(dom))
			{
				domainFunctions6.add(dom);
			}
			newSet6.add(dom);			
		}
		java.util.Set removedSet6 = new java.util.HashSet();
		java.util.Iterator iter6 = domainFunctions6.iterator();
		//Find out which objects need to be removed
		while (iter6.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter6.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet6.contains(o))
			{
				removedSet6.add(o);
			}
		}
		iter6 = removedSet6.iterator();
		//Remove the unwanted objects
		while (iter6.hasNext())
		{
			domainFunctions6.remove(iter6.next());
		}		
		
		domainObject.setFunctions(domainFunctions6);		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getDirectAccessSlot() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getDirectAccessSlot().getID());
		}
		domainObject.setDirectAccessSlot(value7);
		domainObject.setDuration(valueObject.getDuration());

		return domainObject;
	}

}
