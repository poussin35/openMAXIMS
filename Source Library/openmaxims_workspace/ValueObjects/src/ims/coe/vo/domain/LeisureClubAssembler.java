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
package ims.coe.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sinead McDermott
 */
public class LeisureClubAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.coe.vo.LeisureClub copy(ims.coe.vo.LeisureClub valueObjectDest, ims.coe.vo.LeisureClub valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_LeisueClubs(valueObjectSrc.getID_LeisueClubs());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClubName
		valueObjectDest.setClubName(valueObjectSrc.getClubName());
		// Requirements
		valueObjectDest.setRequirements(valueObjectSrc.getRequirements());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// DaysOfWeek
		valueObjectDest.setDaysOfWeek(valueObjectSrc.getDaysOfWeek());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createLeisureClubCollectionFromLeisueClubs(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.LeisueClubs objects.
	 */
	public static ims.coe.vo.LeisureClubCollection createLeisureClubCollectionFromLeisueClubs(java.util.Set domainObjectSet)	
	{
		return createLeisureClubCollectionFromLeisueClubs(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.coe.assessment.domain.objects.LeisueClubs objects.
	 */
	public static ims.coe.vo.LeisureClubCollection createLeisureClubCollectionFromLeisueClubs(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.coe.vo.LeisureClubCollection voList = new ims.coe.vo.LeisureClubCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.coe.assessment.domain.objects.LeisueClubs domainObject = (ims.coe.assessment.domain.objects.LeisueClubs) iterator.next();
			ims.coe.vo.LeisureClub vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.LeisueClubs objects.
	 */
	public static ims.coe.vo.LeisureClubCollection createLeisureClubCollectionFromLeisueClubs(java.util.List domainObjectList) 
	{
		return createLeisureClubCollectionFromLeisueClubs(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.coe.assessment.domain.objects.LeisueClubs objects.
	 */
	public static ims.coe.vo.LeisureClubCollection createLeisureClubCollectionFromLeisueClubs(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.coe.vo.LeisureClubCollection voList = new ims.coe.vo.LeisureClubCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.coe.assessment.domain.objects.LeisueClubs domainObject = (ims.coe.assessment.domain.objects.LeisueClubs) domainObjectList.get(i);
			ims.coe.vo.LeisureClub vo = create(map, domainObject);

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
	 * Create the ims.coe.assessment.domain.objects.LeisueClubs set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractLeisueClubsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.LeisureClubCollection voCollection) 
	 {
	 	return extractLeisueClubsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractLeisueClubsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.LeisureClubCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.LeisureClub vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.LeisueClubs domainObject = LeisureClubAssembler.extractLeisueClubs(domainFactory, vo, domMap);

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
	 * Create the ims.coe.assessment.domain.objects.LeisueClubs list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractLeisueClubsList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.LeisureClubCollection voCollection) 
	 {
	 	return extractLeisueClubsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractLeisueClubsList(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.LeisureClubCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.coe.vo.LeisureClub vo = voCollection.get(i);
			ims.coe.assessment.domain.objects.LeisueClubs domainObject = LeisureClubAssembler.extractLeisueClubs(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.coe.assessment.domain.objects.LeisueClubs object.
	 * @param domainObject ims.coe.assessment.domain.objects.LeisueClubs
	 */
	 public static ims.coe.vo.LeisureClub create(ims.coe.assessment.domain.objects.LeisueClubs domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.coe.assessment.domain.objects.LeisueClubs object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.coe.vo.LeisureClub create(DomainObjectMap map, ims.coe.assessment.domain.objects.LeisueClubs domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.coe.vo.LeisureClub valueObject = (ims.coe.vo.LeisureClub) map.getValueObject(domainObject, ims.coe.vo.LeisureClub.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.coe.vo.LeisureClub(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.coe.assessment.domain.objects.LeisueClubs
	 */
	 public static ims.coe.vo.LeisureClub insert(ims.coe.vo.LeisureClub valueObject, ims.coe.assessment.domain.objects.LeisueClubs domainObject) 
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
	 * @param domainObject ims.coe.assessment.domain.objects.LeisueClubs
	 */
	 public static ims.coe.vo.LeisureClub insert(DomainObjectMap map, ims.coe.vo.LeisureClub valueObject, ims.coe.assessment.domain.objects.LeisueClubs domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_LeisueClubs(domainObject.getId());
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
			
		// ClubName
		ims.domain.lookups.LookupInstance instance1 = domainObject.getClubName();
		if ( null != instance1 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance1.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance1.getImage().getImageId(), instance1.getImage().getImagePath());
			}
			color = instance1.getColor();
			if (color != null) 
				color.getValue();

			ims.coe.vo.lookups.ClubName voLookup1 = new ims.coe.vo.lookups.ClubName(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.coe.vo.lookups.ClubName parentVoLookup1 = voLookup1;
			ims.domain.lookups.LookupInstance parent1 = instance1.getParent();
			while (parent1 != null)
			{
				if (parent1.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent1.getImage().getImageId(), parent1.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent1.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup1.setParent(new ims.coe.vo.lookups.ClubName(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setClubName(voLookup1);
		}
				// Requirements
		valueObject.setRequirements(domainObject.getRequirements());
		// Frequency
		valueObject.setFrequency(domainObject.getFrequency());
		// DaysOfWeek
		valueObject.setDaysOfWeek(domainObject.getDaysOfWeek());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.coe.assessment.domain.objects.LeisueClubs extractLeisueClubs(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.LeisureClub valueObject) 
	{
		return 	extractLeisueClubs(domainFactory, valueObject, new HashMap());
	}

	public static ims.coe.assessment.domain.objects.LeisueClubs extractLeisueClubs(ims.domain.ILightweightDomainFactory domainFactory, ims.coe.vo.LeisureClub valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_LeisueClubs();
		ims.coe.assessment.domain.objects.LeisueClubs domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.coe.assessment.domain.objects.LeisueClubs)domMap.get(valueObject);
			}
			// ims.coe.vo.LeisureClub ID_LeisueClubs field is unknown
			domainObject = new ims.coe.assessment.domain.objects.LeisueClubs();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_LeisueClubs());
			if (domMap.get(key) != null)
			{
				return (ims.coe.assessment.domain.objects.LeisueClubs)domMap.get(key);
			}
			domainObject = (ims.coe.assessment.domain.objects.LeisueClubs) domainFactory.getDomainObject(ims.coe.assessment.domain.objects.LeisueClubs.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_LeisueClubs());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getClubName() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getClubName().getID());
		}
		domainObject.setClubName(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getRequirements() != null && valueObject.getRequirements().equals(""))
		{
			valueObject.setRequirements(null);
		}
		domainObject.setRequirements(valueObject.getRequirements());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFrequency() != null && valueObject.getFrequency().equals(""))
		{
			valueObject.setFrequency(null);
		}
		domainObject.setFrequency(valueObject.getFrequency());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDaysOfWeek() != null && valueObject.getDaysOfWeek().equals(""))
		{
			valueObject.setDaysOfWeek(null);
		}
		domainObject.setDaysOfWeek(valueObject.getDaysOfWeek());

		return domainObject;
	}

}
