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
 * Generated on 12/10/2015, 13:25
 *
 */
package ims.emergency.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class DefaultEDLocationDeptTypeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.emergency.vo.DefaultEDLocationDeptTypeVo copy(ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObjectDest, ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_DefaultEDLocationDeptType(valueObjectSrc.getID_DefaultEDLocationDeptType());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Location
		valueObjectDest.setLocation(valueObjectSrc.getLocation());
		// DefaultDeptType
		valueObjectDest.setDefaultDeptType(valueObjectSrc.getDefaultDeptType());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.DefaultEDLocationDeptType objects.
	 */
	public static ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(java.util.Set domainObjectSet)	
	{
		return createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.DefaultEDLocationDeptType objects.
	 */
	public static ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection voList = new ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject = (ims.core.admin.domain.objects.DefaultEDLocationDeptType) iterator.next();
			ims.emergency.vo.DefaultEDLocationDeptTypeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.DefaultEDLocationDeptType objects.
	 */
	public static ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(java.util.List domainObjectList) 
	{
		return createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.DefaultEDLocationDeptType objects.
	 */
	public static ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection createDefaultEDLocationDeptTypeVoCollectionFromDefaultEDLocationDeptType(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection voList = new ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject = (ims.core.admin.domain.objects.DefaultEDLocationDeptType) domainObjectList.get(i);
			ims.emergency.vo.DefaultEDLocationDeptTypeVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.DefaultEDLocationDeptType set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractDefaultEDLocationDeptTypeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection voCollection) 
	 {
	 	return extractDefaultEDLocationDeptTypeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractDefaultEDLocationDeptTypeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DefaultEDLocationDeptTypeVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject = DefaultEDLocationDeptTypeVoAssembler.extractDefaultEDLocationDeptType(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.DefaultEDLocationDeptType list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractDefaultEDLocationDeptTypeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection voCollection) 
	 {
	 	return extractDefaultEDLocationDeptTypeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractDefaultEDLocationDeptTypeList(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DefaultEDLocationDeptTypeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.emergency.vo.DefaultEDLocationDeptTypeVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject = DefaultEDLocationDeptTypeVoAssembler.extractDefaultEDLocationDeptType(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.DefaultEDLocationDeptType object.
	 * @param domainObject ims.core.admin.domain.objects.DefaultEDLocationDeptType
	 */
	 public static ims.emergency.vo.DefaultEDLocationDeptTypeVo create(ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.DefaultEDLocationDeptType object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.emergency.vo.DefaultEDLocationDeptTypeVo create(DomainObjectMap map, ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObject = (ims.emergency.vo.DefaultEDLocationDeptTypeVo) map.getValueObject(domainObject, ims.emergency.vo.DefaultEDLocationDeptTypeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.emergency.vo.DefaultEDLocationDeptTypeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.DefaultEDLocationDeptType
	 */
	 public static ims.emergency.vo.DefaultEDLocationDeptTypeVo insert(ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObject, ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.DefaultEDLocationDeptType
	 */
	 public static ims.emergency.vo.DefaultEDLocationDeptTypeVo insert(DomainObjectMap map, ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObject, ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_DefaultEDLocationDeptType(domainObject.getId());
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
			
		// Location
		valueObject.setLocation(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getLocation()) );
		// DefaultDeptType
		ims.domain.lookups.LookupInstance instance2 = domainObject.getDefaultDeptType();
		if ( null != instance2 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance2.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance2.getImage().getImageId(), instance2.getImage().getImagePath());
			}
			color = instance2.getColor();
			if (color != null) 
				color.getValue();

			ims.emergency.vo.lookups.EmergencyDeptType voLookup2 = new ims.emergency.vo.lookups.EmergencyDeptType(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.emergency.vo.lookups.EmergencyDeptType parentVoLookup2 = voLookup2;
			ims.domain.lookups.LookupInstance parent2 = instance2.getParent();
			while (parent2 != null)
			{
				if (parent2.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent2.getImage().getImageId(), parent2.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent2.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup2.setParent(new ims.emergency.vo.lookups.EmergencyDeptType(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setDefaultDeptType(voLookup2);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.DefaultEDLocationDeptType extractDefaultEDLocationDeptType(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObject) 
	{
		return 	extractDefaultEDLocationDeptType(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.DefaultEDLocationDeptType extractDefaultEDLocationDeptType(ims.domain.ILightweightDomainFactory domainFactory, ims.emergency.vo.DefaultEDLocationDeptTypeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_DefaultEDLocationDeptType();
		ims.core.admin.domain.objects.DefaultEDLocationDeptType domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.DefaultEDLocationDeptType)domMap.get(valueObject);
			}
			// ims.emergency.vo.DefaultEDLocationDeptTypeVo ID_DefaultEDLocationDeptType field is unknown
			domainObject = new ims.core.admin.domain.objects.DefaultEDLocationDeptType();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_DefaultEDLocationDeptType());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.DefaultEDLocationDeptType)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.DefaultEDLocationDeptType) domainFactory.getDomainObject(ims.core.admin.domain.objects.DefaultEDLocationDeptType.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_DefaultEDLocationDeptType());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getLocation() ) 
		{
			if (valueObject.getLocation().getBoId() == null)
			{
				if (domMap.get(valueObject.getLocation()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getLocation());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getLocation().getBoId());
			}
		}
		domainObject.setLocation(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getDefaultDeptType() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getDefaultDeptType().getID());
		}
		domainObject.setDefaultDeptType(value2);

		return domainObject;
	}

}
