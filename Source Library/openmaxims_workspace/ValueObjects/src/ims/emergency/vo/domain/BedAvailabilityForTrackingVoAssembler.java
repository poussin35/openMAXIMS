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
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class BedAvailabilityForTrackingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.BedAvailabilityForTrackingVo copy(ims.emergency.vo.BedAvailabilityForTrackingVo valueObjectDest, ims.emergency.vo.BedAvailabilityForTrackingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_BedAvailability(valueObjectSrc.getID_BedAvailability());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// AwaitingDateTime
		valueObjectDest.setAwaitingDateTime(valueObjectSrc.getAwaitingDateTime());
		// AvailableDateTime
		valueObjectDest.setAvailableDateTime(valueObjectSrc.getAvailableDateTime());
		// Ward
		valueObjectDest.setWard(valueObjectSrc.getWard());
		// RequestedBy
		valueObjectDest.setRequestedBy(valueObjectSrc.getRequestedBy());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createBedAvailabilityForTrackingVoCollectionFromBedAvailability(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.BedAvailability objects.
	 */
	public static ims.emergency.vo.BedAvailabilityForTrackingVoCollection createBedAvailabilityForTrackingVoCollectionFromBedAvailability(java.util.Set domainObjectSet)	
	{
		return createBedAvailabilityForTrackingVoCollectionFromBedAvailability(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.emergency.domain.objects.BedAvailability objects.
	 */
	public static ims.emergency.vo.BedAvailabilityForTrackingVoCollection createBedAvailabilityForTrackingVoCollectionFromBedAvailability(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.BedAvailabilityForTrackingVoCollection voList = new ims.emergency.vo.BedAvailabilityForTrackingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.emergency.domain.objects.BedAvailability domainObject = (ims.emergency.domain.objects.BedAvailability) iterator.next();
			ims.emergency.vo.BedAvailabilityForTrackingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.emergency.domain.objects.BedAvailability objects.
	 */
	public static ims.emergency.vo.BedAvailabilityForTrackingVoCollection createBedAvailabilityForTrackingVoCollectionFromBedAvailability(java.util.List domainObjectList) 
	{
		return createBedAvailabilityForTrackingVoCollectionFromBedAvailability(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.emergency.domain.objects.BedAvailability objects.
	 */
	public static ims.emergency.vo.BedAvailabilityForTrackingVoCollection createBedAvailabilityForTrackingVoCollectionFromBedAvailability(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.BedAvailabilityForTrackingVoCollection voList = new ims.emergency.vo.BedAvailabilityForTrackingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.emergency.domain.objects.BedAvailability domainObject = (ims.emergency.domain.objects.BedAvailability) domainObjectList.get(i);
			ims.emergency.vo.BedAvailabilityForTrackingVo vo = create(map, domainObject);

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
	 * Create the ims.emergency.domain.objects.BedAvailability set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractBedAvailabilitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.BedAvailabilityForTrackingVoCollection voCollection) 
	 {
	 	return extractBedAvailabilitySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractBedAvailabilitySet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.BedAvailabilityForTrackingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.BedAvailabilityForTrackingVo vo = voCollection.get(i);
			ims.emergency.domain.objects.BedAvailability domainObject = BedAvailabilityForTrackingVoAssembler.extractBedAvailability(domainFactory, vo, domMap);

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
	 * Create the ims.emergency.domain.objects.BedAvailability list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractBedAvailabilityList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.BedAvailabilityForTrackingVoCollection voCollection) 
	 {
	 	return extractBedAvailabilityList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractBedAvailabilityList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.BedAvailabilityForTrackingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.BedAvailabilityForTrackingVo vo = voCollection.get(i);
			ims.emergency.domain.objects.BedAvailability domainObject = BedAvailabilityForTrackingVoAssembler.extractBedAvailability(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.emergency.domain.objects.BedAvailability object.
	 * @param domainObject ims.emergency.domain.objects.BedAvailability
	 */
	 public static ims.emergency.vo.BedAvailabilityForTrackingVo create(ims.emergency.domain.objects.BedAvailability domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.emergency.domain.objects.BedAvailability object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.BedAvailabilityForTrackingVo create(DomainObjectMap map, ims.emergency.domain.objects.BedAvailability domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.BedAvailabilityForTrackingVo valueObject = (ims.emergency.vo.BedAvailabilityForTrackingVo) map.getValueObject(domainObject, ims.emergency.vo.BedAvailabilityForTrackingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.BedAvailabilityForTrackingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.emergency.domain.objects.BedAvailability
	 */
	 public static ims.emergency.vo.BedAvailabilityForTrackingVo insert(ims.emergency.vo.BedAvailabilityForTrackingVo valueObject, ims.emergency.domain.objects.BedAvailability domainObject) 
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
	 * @param domainObject ims.emergency.domain.objects.BedAvailability
	 */
	 public static ims.emergency.vo.BedAvailabilityForTrackingVo insert(DomainObjectMap map, ims.emergency.vo.BedAvailabilityForTrackingVo valueObject, ims.emergency.domain.objects.BedAvailability domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_BedAvailability(domainObject.getId());
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
			
		// AwaitingDateTime
		java.util.Date AwaitingDateTime = domainObject.getAwaitingDateTime();
		if ( null != AwaitingDateTime ) 
		{
			valueObject.setAwaitingDateTime(new ims.framework.utils.DateTime(AwaitingDateTime) );
		}
		// AvailableDateTime
		java.util.Date AvailableDateTime = domainObject.getAvailableDateTime();
		if ( null != AvailableDateTime ) 
		{
			valueObject.setAvailableDateTime(new ims.framework.utils.DateTime(AvailableDateTime) );
		}
		// Ward
		valueObject.setWard(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getWard()) );
		// RequestedBy
		valueObject.setRequestedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getRequestedBy()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.emergency.domain.objects.BedAvailability extractBedAvailability(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.BedAvailabilityForTrackingVo valueObject) 
	{
		return 	extractBedAvailability(domainFactory, valueObject, new HashMap());
	}

	public static ims.emergency.domain.objects.BedAvailability extractBedAvailability(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.BedAvailabilityForTrackingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_BedAvailability();
		ims.emergency.domain.objects.BedAvailability domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.emergency.domain.objects.BedAvailability)domMap.get(valueObject);
			}
			// ims.emergency.vo.BedAvailabilityForTrackingVo ID_BedAvailability field is unknown
			domainObject = new ims.emergency.domain.objects.BedAvailability();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_BedAvailability());
			if (domMap.get(key) != null)
			{
				return (ims.emergency.domain.objects.BedAvailability)domMap.get(key);
			}
			domainObject = (ims.emergency.domain.objects.BedAvailability) domainFactory.getDomainObject(ims.emergency.domain.objects.BedAvailability.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_BedAvailability());

		ims.framework.utils.DateTime dateTime1 = valueObject.getAwaitingDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setAwaitingDateTime(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getAvailableDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setAvailableDateTime(value2);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value3 = null;
		if ( null != valueObject.getWard() ) 
		{
			if (valueObject.getWard().getBoId() == null)
			{
				if (domMap.get(valueObject.getWard()) != null)
				{
					value3 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getWard());
				}
			}
			else
			{
				value3 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getWard().getBoId());
			}
		}
		domainObject.setWard(value3);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value4 = null;
		if ( null != valueObject.getRequestedBy() ) 
		{
			if (valueObject.getRequestedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getRequestedBy()) != null)
				{
					value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getRequestedBy());
				}
			}
			else
			{
				value4 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getRequestedBy().getBoId());
			}
		}
		domainObject.setRequestedBy(value4);

		return domainObject;
	}

}
