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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Aidan Mc Donnell
 */
public class ReferralServiceVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ReferralServiceVo copy(ims.RefMan.vo.ReferralServiceVo valueObjectDest, ims.RefMan.vo.ReferralServiceVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ReferralService(valueObjectSrc.getID_ReferralService());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ReferralServices
		valueObjectDest.setReferralServices(valueObjectSrc.getReferralServices());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReferralServiceVoCollectionFromReferralService(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReferralService objects.
	 */
	public static ims.RefMan.vo.ReferralServiceVoCollection createReferralServiceVoCollectionFromReferralService(java.util.Set domainObjectSet)	
	{
		return createReferralServiceVoCollectionFromReferralService(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ReferralService objects.
	 */
	public static ims.RefMan.vo.ReferralServiceVoCollection createReferralServiceVoCollectionFromReferralService(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ReferralServiceVoCollection voList = new ims.RefMan.vo.ReferralServiceVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ReferralService domainObject = (ims.RefMan.domain.objects.ReferralService) iterator.next();
			ims.RefMan.vo.ReferralServiceVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReferralService objects.
	 */
	public static ims.RefMan.vo.ReferralServiceVoCollection createReferralServiceVoCollectionFromReferralService(java.util.List domainObjectList) 
	{
		return createReferralServiceVoCollectionFromReferralService(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ReferralService objects.
	 */
	public static ims.RefMan.vo.ReferralServiceVoCollection createReferralServiceVoCollectionFromReferralService(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ReferralServiceVoCollection voList = new ims.RefMan.vo.ReferralServiceVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ReferralService domainObject = (ims.RefMan.domain.objects.ReferralService) domainObjectList.get(i);
			ims.RefMan.vo.ReferralServiceVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ReferralService set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractReferralServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralServiceVoCollection voCollection) 
	 {
	 	return extractReferralServiceSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractReferralServiceSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralServiceVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralServiceVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReferralService domainObject = ReferralServiceVoAssembler.extractReferralService(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ReferralService list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractReferralServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralServiceVoCollection voCollection) 
	 {
	 	return extractReferralServiceList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractReferralServiceList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralServiceVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ReferralServiceVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ReferralService domainObject = ReferralServiceVoAssembler.extractReferralService(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ReferralService object.
	 * @param domainObject ims.RefMan.domain.objects.ReferralService
	 */
	 public static ims.RefMan.vo.ReferralServiceVo create(ims.RefMan.domain.objects.ReferralService domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ReferralService object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ReferralServiceVo create(DomainObjectMap map, ims.RefMan.domain.objects.ReferralService domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ReferralServiceVo valueObject = (ims.RefMan.vo.ReferralServiceVo) map.getValueObject(domainObject, ims.RefMan.vo.ReferralServiceVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ReferralServiceVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ReferralService
	 */
	 public static ims.RefMan.vo.ReferralServiceVo insert(ims.RefMan.vo.ReferralServiceVo valueObject, ims.RefMan.domain.objects.ReferralService domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ReferralService
	 */
	 public static ims.RefMan.vo.ReferralServiceVo insert(DomainObjectMap map, ims.RefMan.vo.ReferralServiceVo valueObject, ims.RefMan.domain.objects.ReferralService domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ReferralService(domainObject.getId());
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
			
		// ReferralServices
		ims.core.clinical.vo.ServiceRefVoCollection ReferralServices = new ims.core.clinical.vo.ServiceRefVoCollection();
		for(java.util.Iterator iterator = domainObject.getReferralServices().iterator(); iterator.hasNext(); ) 
		{
			ims.core.clinical.domain.objects.Service tmp = (ims.core.clinical.domain.objects.Service)iterator.next();
			if (tmp != null)
				ReferralServices.add(new ims.core.clinical.vo.ServiceRefVo(tmp.getId(),tmp.getVersion()));
		}
		valueObject.setReferralServices(ReferralServices);
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ReferralService extractReferralService(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralServiceVo valueObject) 
	{
		return 	extractReferralService(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ReferralService extractReferralService(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ReferralServiceVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ReferralService();
		ims.RefMan.domain.objects.ReferralService domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ReferralService)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ReferralServiceVo ID_ReferralService field is unknown
			domainObject = new ims.RefMan.domain.objects.ReferralService();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ReferralService());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ReferralService)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ReferralService) domainFactory.getDomainObject(ims.RefMan.domain.objects.ReferralService.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ReferralService());


		ims.core.clinical.vo.ServiceRefVoCollection refCollection1 = valueObject.getReferralServices();
		int size1 = (null == refCollection1) ? 0 : refCollection1.size();		
		java.util.Set domainReferralServices1 = domainObject.getReferralServices();
		if (domainReferralServices1 == null)
		{
			domainReferralServices1 = new java.util.HashSet();
		}
		java.util.Set newSet1  = new java.util.HashSet();
		for(int i=0; i<size1; i++) 
		{
			ims.core.clinical.vo.ServiceRefVo vo = refCollection1.get(i);					
			ims.core.clinical.domain.objects.Service dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.core.clinical.domain.objects.Service)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.core.clinical.domain.objects.Service)domainFactory.getDomainObject( ims.core.clinical.domain.objects.Service.class, vo.getBoId());
				}
			}

			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainReferralServices1.contains(dom))
			{
				domainReferralServices1.add(dom);
			}
			newSet1.add(dom);			
		}
		java.util.Set removedSet1 = new java.util.HashSet();
		java.util.Iterator iter1 = domainReferralServices1.iterator();
		//Find out which objects need to be removed
		while (iter1.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter1.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet1.contains(o))
			{
				removedSet1.add(o);
			}
		}
		iter1 = removedSet1.iterator();
		//Remove the unwanted objects
		while (iter1.hasNext())
		{
			domainReferralServices1.remove(iter1.next());
		}		
		
		domainObject.setReferralServices(domainReferralServices1);		

		return domainObject;
	}

}
