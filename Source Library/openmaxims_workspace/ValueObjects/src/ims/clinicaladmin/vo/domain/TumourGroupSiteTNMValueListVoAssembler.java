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
package ims.clinicaladmin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Catalin Tomozei
 */
public class TumourGroupSiteTNMValueListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo copy(ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObjectDest, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TumourGroupSiteTNMValue(valueObjectSrc.getID_TumourGroupSiteTNMValue());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// TNMType
		valueObjectDest.setTNMType(valueObjectSrc.getTNMType());
		// TNMValue
		valueObjectDest.setTNMValue(valueObjectSrc.getTNMValue());
		// TNMDescription
		valueObjectDest.setTNMDescription(valueObjectSrc.getTNMDescription());
		// ClinicalPathological
		valueObjectDest.setClinicalPathological(valueObjectSrc.getClinicalPathological());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(java.util.Set domainObjectSet)	
	{
		return createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection voList = new ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue) iterator.next();
			ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(java.util.List domainObjectList) 
	{
		return createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue objects.
	 */
	public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection createTumourGroupSiteTNMValueListVoCollectionFromTumourGroupSiteTNMValue(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection voList = new ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue) domainObjectList.get(i);
			ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo vo = create(map, domainObject);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTumourGroupSiteTNMValueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection voCollection) 
	 {
	 	return extractTumourGroupSiteTNMValueSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTumourGroupSiteTNMValueSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject = TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, vo, domMap);

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
	 * Create the ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTumourGroupSiteTNMValueList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection voCollection) 
	 {
	 	return extractTumourGroupSiteTNMValueList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTumourGroupSiteTNMValueList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo vo = voCollection.get(i);
			ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject = TumourGroupSiteTNMValueListVoAssembler.extractTumourGroupSiteTNMValue(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue object.
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo create(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo create(DomainObjectMap map, ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObject = (ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo) map.getValueObject(domainObject, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo insert(ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObject, ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject) 
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
	 * @param domainObject ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue
	 */
	 public static ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo insert(DomainObjectMap map, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObject, ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TumourGroupSiteTNMValue(domainObject.getId());
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
			
		// TNMType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTNMType();
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

			ims.oncology.vo.lookups.TNMType voLookup1 = new ims.oncology.vo.lookups.TNMType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.oncology.vo.lookups.TNMType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTNMType(voLookup1);
		}
				// TNMValue
		valueObject.setTNMValue(domainObject.getTNMValue());
		// TNMDescription
		valueObject.setTNMDescription(domainObject.getTNMDescription());
		// ClinicalPathological
		ims.domain.lookups.LookupInstance instance4 = domainObject.getClinicalPathological();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.oncology.vo.lookups.TNMClinicalpathological voLookup4 = new ims.oncology.vo.lookups.TNMClinicalpathological(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.oncology.vo.lookups.TNMClinicalpathological parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.oncology.vo.lookups.TNMClinicalpathological(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setClinicalPathological(voLookup4);
		}
				// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue extractTumourGroupSiteTNMValue(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObject) 
	{
		return 	extractTumourGroupSiteTNMValue(domainFactory, valueObject, new HashMap());
	}

	public static ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue extractTumourGroupSiteTNMValue(ims.domain.ILightweightDomainFactory domainFactory, ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TumourGroupSiteTNMValue();
		ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(valueObject);
			}
			// ims.clinicaladmin.vo.TumourGroupSiteTNMValueListVo ID_TumourGroupSiteTNMValue field is unknown
			domainObject = new ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TumourGroupSiteTNMValue());
			if (domMap.get(key) != null)
			{
				return (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue)domMap.get(key);
			}
			domainObject = (ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue) domainFactory.getDomainObject(ims.oncology.configuration.domain.objects.TumourGroupSiteTNMValue.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TumourGroupSiteTNMValue());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTNMType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTNMType().getID());
		}
		domainObject.setTNMType(value1);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTNMValue() != null && valueObject.getTNMValue().equals(""))
		{
			valueObject.setTNMValue(null);
		}
		domainObject.setTNMValue(valueObject.getTNMValue());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTNMDescription() != null && valueObject.getTNMDescription().equals(""))
		{
			valueObject.setTNMDescription(null);
		}
		domainObject.setTNMDescription(valueObject.getTNMDescription());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getClinicalPathological() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getClinicalPathological().getID());
		}
		domainObject.setClinicalPathological(value4);
		domainObject.setIsActive(valueObject.getIsActive());

		return domainObject;
	}

}
