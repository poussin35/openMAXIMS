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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class PrintLocationConfigVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.PrintLocationConfigVo copy(ims.admin.vo.PrintLocationConfigVo valueObjectDest, ims.admin.vo.PrintLocationConfigVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PrintLocationConfig(valueObjectSrc.getID_PrintLocationConfig());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Site
		valueObjectDest.setSite(valueObjectSrc.getSite());
		// PrintToOrderingLocation
		valueObjectDest.setPrintToOrderingLocation(valueObjectSrc.getPrintToOrderingLocation());
		// PrintCentral
		valueObjectDest.setPrintCentral(valueObjectSrc.getPrintCentral());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPrintLocationConfigVoCollectionFromPrintLocationConfig(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PrintLocationConfig objects.
	 */
	public static ims.admin.vo.PrintLocationConfigVoCollection createPrintLocationConfigVoCollectionFromPrintLocationConfig(java.util.Set domainObjectSet)	
	{
		return createPrintLocationConfigVoCollectionFromPrintLocationConfig(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.PrintLocationConfig objects.
	 */
	public static ims.admin.vo.PrintLocationConfigVoCollection createPrintLocationConfigVoCollectionFromPrintLocationConfig(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.PrintLocationConfigVoCollection voList = new ims.admin.vo.PrintLocationConfigVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.PrintLocationConfig domainObject = (ims.core.admin.domain.objects.PrintLocationConfig) iterator.next();
			ims.admin.vo.PrintLocationConfigVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PrintLocationConfig objects.
	 */
	public static ims.admin.vo.PrintLocationConfigVoCollection createPrintLocationConfigVoCollectionFromPrintLocationConfig(java.util.List domainObjectList) 
	{
		return createPrintLocationConfigVoCollectionFromPrintLocationConfig(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.PrintLocationConfig objects.
	 */
	public static ims.admin.vo.PrintLocationConfigVoCollection createPrintLocationConfigVoCollectionFromPrintLocationConfig(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.PrintLocationConfigVoCollection voList = new ims.admin.vo.PrintLocationConfigVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.PrintLocationConfig domainObject = (ims.core.admin.domain.objects.PrintLocationConfig) domainObjectList.get(i);
			ims.admin.vo.PrintLocationConfigVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.PrintLocationConfig set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPrintLocationConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintLocationConfigVoCollection voCollection) 
	 {
	 	return extractPrintLocationConfigSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPrintLocationConfigSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintLocationConfigVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PrintLocationConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PrintLocationConfig domainObject = PrintLocationConfigVoAssembler.extractPrintLocationConfig(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.PrintLocationConfig list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPrintLocationConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintLocationConfigVoCollection voCollection) 
	 {
	 	return extractPrintLocationConfigList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPrintLocationConfigList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintLocationConfigVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.PrintLocationConfigVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.PrintLocationConfig domainObject = PrintLocationConfigVoAssembler.extractPrintLocationConfig(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.PrintLocationConfig object.
	 * @param domainObject ims.core.admin.domain.objects.PrintLocationConfig
	 */
	 public static ims.admin.vo.PrintLocationConfigVo create(ims.core.admin.domain.objects.PrintLocationConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.PrintLocationConfig object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.PrintLocationConfigVo create(DomainObjectMap map, ims.core.admin.domain.objects.PrintLocationConfig domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.PrintLocationConfigVo valueObject = (ims.admin.vo.PrintLocationConfigVo) map.getValueObject(domainObject, ims.admin.vo.PrintLocationConfigVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.PrintLocationConfigVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.PrintLocationConfig
	 */
	 public static ims.admin.vo.PrintLocationConfigVo insert(ims.admin.vo.PrintLocationConfigVo valueObject, ims.core.admin.domain.objects.PrintLocationConfig domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.PrintLocationConfig
	 */
	 public static ims.admin.vo.PrintLocationConfigVo insert(DomainObjectMap map, ims.admin.vo.PrintLocationConfigVo valueObject, ims.core.admin.domain.objects.PrintLocationConfig domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PrintLocationConfig(domainObject.getId());
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
			
		// Site
		valueObject.setSite(ims.core.vo.domain.LocationLiteVoAssembler.create(map, domainObject.getSite()) );
		// PrintToOrderingLocation
		ims.domain.lookups.LookupInstance instance2 = domainObject.getPrintToOrderingLocation();
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

			ims.core.vo.lookups.YesNo voLookup2 = new ims.core.vo.lookups.YesNo(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNo(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setPrintToOrderingLocation(voLookup2);
		}
				// PrintCentral
		ims.domain.lookups.LookupInstance instance3 = domainObject.getPrintCentral();
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

			ims.core.vo.lookups.YesNo voLookup3 = new ims.core.vo.lookups.YesNo(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.YesNo(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setPrintCentral(voLookup3);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.PrintLocationConfig extractPrintLocationConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintLocationConfigVo valueObject) 
	{
		return 	extractPrintLocationConfig(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.PrintLocationConfig extractPrintLocationConfig(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.PrintLocationConfigVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PrintLocationConfig();
		ims.core.admin.domain.objects.PrintLocationConfig domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.PrintLocationConfig)domMap.get(valueObject);
			}
			// ims.admin.vo.PrintLocationConfigVo ID_PrintLocationConfig field is unknown
			domainObject = new ims.core.admin.domain.objects.PrintLocationConfig();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PrintLocationConfig());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.PrintLocationConfig)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.PrintLocationConfig) domainFactory.getDomainObject(ims.core.admin.domain.objects.PrintLocationConfig.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PrintLocationConfig());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.place.domain.objects.Location value1 = null;
		if ( null != valueObject.getSite() ) 
		{
			if (valueObject.getSite().getBoId() == null)
			{
				if (domMap.get(valueObject.getSite()) != null)
				{
					value1 = (ims.core.resource.place.domain.objects.Location)domMap.get(valueObject.getSite());
				}
			}
			else
			{
				value1 = (ims.core.resource.place.domain.objects.Location)domainFactory.getDomainObject(ims.core.resource.place.domain.objects.Location.class, valueObject.getSite().getBoId());
			}
		}
		domainObject.setSite(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getPrintToOrderingLocation() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getPrintToOrderingLocation().getID());
		}
		domainObject.setPrintToOrderingLocation(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getPrintCentral() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getPrintCentral().getID());
		}
		domainObject.setPrintCentral(value3);

		return domainObject;
	}

}
