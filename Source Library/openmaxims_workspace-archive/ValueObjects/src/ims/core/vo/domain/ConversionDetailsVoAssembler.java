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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class ConversionDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.ConversionDetailsVo copy(ims.core.vo.ConversionDetailsVo valueObjectDest, ims.core.vo.ConversionDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ConversionDetails(valueObjectSrc.getID_ConversionDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// LastUnid
		valueObjectDest.setLastUnid(valueObjectSrc.getLastUnid());
		// LastUpdatedDateTime
		valueObjectDest.setLastUpdatedDateTime(valueObjectSrc.getLastUpdatedDateTime());
		// TotalConversions
		valueObjectDest.setTotalConversions(valueObjectSrc.getTotalConversions());
		// TimeForOneConversion
		valueObjectDest.setTimeForOneConversion(valueObjectSrc.getTimeForOneConversion());
		// OneMinuteAverage
		valueObjectDest.setOneMinuteAverage(valueObjectSrc.getOneMinuteAverage());
		// OneHourAverage
		valueObjectDest.setOneHourAverage(valueObjectSrc.getOneHourAverage());
		// CreationDate
		valueObjectDest.setCreationDate(valueObjectSrc.getCreationDate());
		// TriggerFrequency
		valueObjectDest.setTriggerFrequency(valueObjectSrc.getTriggerFrequency());
		// LastRun
		valueObjectDest.setLastRun(valueObjectSrc.getLastRun());
		// NextRun
		valueObjectDest.setNextRun(valueObjectSrc.getNextRun());
		// RepeatInterval
		valueObjectDest.setRepeatInterval(valueObjectSrc.getRepeatInterval());
		// ConfiguredScheduledJobID
		valueObjectDest.setConfiguredScheduledJobID(valueObjectSrc.getConfiguredScheduledJobID());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createConversionDetailsVoCollectionFromConversionDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.ConversionDetails objects.
	 */
	public static ims.core.vo.ConversionDetailsVoCollection createConversionDetailsVoCollectionFromConversionDetails(java.util.Set domainObjectSet)	
	{
		return createConversionDetailsVoCollectionFromConversionDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.documents.domain.objects.ConversionDetails objects.
	 */
	public static ims.core.vo.ConversionDetailsVoCollection createConversionDetailsVoCollectionFromConversionDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.ConversionDetailsVoCollection voList = new ims.core.vo.ConversionDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.documents.domain.objects.ConversionDetails domainObject = (ims.core.documents.domain.objects.ConversionDetails) iterator.next();
			ims.core.vo.ConversionDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.documents.domain.objects.ConversionDetails objects.
	 */
	public static ims.core.vo.ConversionDetailsVoCollection createConversionDetailsVoCollectionFromConversionDetails(java.util.List domainObjectList) 
	{
		return createConversionDetailsVoCollectionFromConversionDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.documents.domain.objects.ConversionDetails objects.
	 */
	public static ims.core.vo.ConversionDetailsVoCollection createConversionDetailsVoCollectionFromConversionDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.ConversionDetailsVoCollection voList = new ims.core.vo.ConversionDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.documents.domain.objects.ConversionDetails domainObject = (ims.core.documents.domain.objects.ConversionDetails) domainObjectList.get(i);
			ims.core.vo.ConversionDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.documents.domain.objects.ConversionDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractConversionDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConversionDetailsVoCollection voCollection) 
	 {
	 	return extractConversionDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractConversionDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConversionDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ConversionDetailsVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.ConversionDetails domainObject = ConversionDetailsVoAssembler.extractConversionDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.documents.domain.objects.ConversionDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractConversionDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConversionDetailsVoCollection voCollection) 
	 {
	 	return extractConversionDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractConversionDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConversionDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.ConversionDetailsVo vo = voCollection.get(i);
			ims.core.documents.domain.objects.ConversionDetails domainObject = ConversionDetailsVoAssembler.extractConversionDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.documents.domain.objects.ConversionDetails object.
	 * @param domainObject ims.core.documents.domain.objects.ConversionDetails
	 */
	 public static ims.core.vo.ConversionDetailsVo create(ims.core.documents.domain.objects.ConversionDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.documents.domain.objects.ConversionDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.ConversionDetailsVo create(DomainObjectMap map, ims.core.documents.domain.objects.ConversionDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.ConversionDetailsVo valueObject = (ims.core.vo.ConversionDetailsVo) map.getValueObject(domainObject, ims.core.vo.ConversionDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.ConversionDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.documents.domain.objects.ConversionDetails
	 */
	 public static ims.core.vo.ConversionDetailsVo insert(ims.core.vo.ConversionDetailsVo valueObject, ims.core.documents.domain.objects.ConversionDetails domainObject) 
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
	 * @param domainObject ims.core.documents.domain.objects.ConversionDetails
	 */
	 public static ims.core.vo.ConversionDetailsVo insert(DomainObjectMap map, ims.core.vo.ConversionDetailsVo valueObject, ims.core.documents.domain.objects.ConversionDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ConversionDetails(domainObject.getId());
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
			
		// LastUnid
		valueObject.setLastUnid(domainObject.getLastUnid());
		// LastUpdatedDateTime
		java.util.Date LastUpdatedDateTime = domainObject.getLastUpdatedDateTime();
		if ( null != LastUpdatedDateTime ) 
		{
			valueObject.setLastUpdatedDateTime(new ims.framework.utils.DateTime(LastUpdatedDateTime) );
		}
		// TotalConversions
		valueObject.setTotalConversions(domainObject.getTotalConversions());
		// TimeForOneConversion
		valueObject.setTimeForOneConversion(domainObject.getTimeForOneConversion());
		// OneMinuteAverage
		valueObject.setOneMinuteAverage(domainObject.getOneMinuteAverage());
		// OneHourAverage
		valueObject.setOneHourAverage(domainObject.getOneHourAverage());
		// CreationDate
		java.util.Date CreationDate = domainObject.getCreationDate();
		if ( null != CreationDate ) 
		{
			valueObject.setCreationDate(new ims.framework.utils.DateTime(CreationDate) );
		}
		// TriggerFrequency
		valueObject.setTriggerFrequency(domainObject.getTriggerFrequency());
		// LastRun
		java.util.Date LastRun = domainObject.getLastRun();
		if ( null != LastRun ) 
		{
			valueObject.setLastRun(new ims.framework.utils.DateTime(LastRun) );
		}
		// NextRun
		java.util.Date NextRun = domainObject.getNextRun();
		if ( null != NextRun ) 
		{
			valueObject.setNextRun(new ims.framework.utils.DateTime(NextRun) );
		}
		// RepeatInterval
		valueObject.setRepeatInterval(domainObject.getRepeatInterval());
		// ConfiguredScheduledJobID
		valueObject.setConfiguredScheduledJobID(domainObject.getConfiguredScheduledJobID());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.documents.domain.objects.ConversionDetails extractConversionDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConversionDetailsVo valueObject) 
	{
		return 	extractConversionDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.documents.domain.objects.ConversionDetails extractConversionDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.ConversionDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ConversionDetails();
		ims.core.documents.domain.objects.ConversionDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.documents.domain.objects.ConversionDetails)domMap.get(valueObject);
			}
			// ims.core.vo.ConversionDetailsVo ID_ConversionDetails field is unknown
			domainObject = new ims.core.documents.domain.objects.ConversionDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ConversionDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.documents.domain.objects.ConversionDetails)domMap.get(key);
			}
			domainObject = (ims.core.documents.domain.objects.ConversionDetails) domainFactory.getDomainObject(ims.core.documents.domain.objects.ConversionDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ConversionDetails());

		domainObject.setLastUnid(valueObject.getLastUnid());
		ims.framework.utils.DateTime dateTime2 = valueObject.getLastUpdatedDateTime();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setLastUpdatedDateTime(value2);
		domainObject.setTotalConversions(valueObject.getTotalConversions());
		domainObject.setTimeForOneConversion(valueObject.getTimeForOneConversion());
		domainObject.setOneMinuteAverage(valueObject.getOneMinuteAverage());
		domainObject.setOneHourAverage(valueObject.getOneHourAverage());
		ims.framework.utils.DateTime dateTime7 = valueObject.getCreationDate();
		java.util.Date value7 = null;
		if ( dateTime7 != null ) 
		{
			value7 = dateTime7.getJavaDate();
		}
		domainObject.setCreationDate(value7);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTriggerFrequency() != null && valueObject.getTriggerFrequency().equals(""))
		{
			valueObject.setTriggerFrequency(null);
		}
		domainObject.setTriggerFrequency(valueObject.getTriggerFrequency());
		ims.framework.utils.DateTime dateTime9 = valueObject.getLastRun();
		java.util.Date value9 = null;
		if ( dateTime9 != null ) 
		{
			value9 = dateTime9.getJavaDate();
		}
		domainObject.setLastRun(value9);
		ims.framework.utils.DateTime dateTime10 = valueObject.getNextRun();
		java.util.Date value10 = null;
		if ( dateTime10 != null ) 
		{
			value10 = dateTime10.getJavaDate();
		}
		domainObject.setNextRun(value10);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRepeatInterval() != null && valueObject.getRepeatInterval().equals(""))
		{
			valueObject.setRepeatInterval(null);
		}
		domainObject.setRepeatInterval(valueObject.getRepeatInterval());
		domainObject.setConfiguredScheduledJobID(valueObject.getConfiguredScheduledJobID());

		return domainObject;
	}

}
