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
package ims.therapies.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Sean Nesbitt
 */
public class HomeVisitShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.therapies.vo.HomeVisitShortVo copy(ims.therapies.vo.HomeVisitShortVo valueObjectDest, ims.therapies.vo.HomeVisitShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_HomeVisit(valueObjectSrc.getID_HomeVisit());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createHomeVisitShortVoCollectionFromHomeVisit(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit objects.
	 */
	public static ims.therapies.vo.HomeVisitShortVoCollection createHomeVisitShortVoCollectionFromHomeVisit(java.util.Set domainObjectSet)	
	{
		return createHomeVisitShortVoCollectionFromHomeVisit(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit objects.
	 */
	public static ims.therapies.vo.HomeVisitShortVoCollection createHomeVisitShortVoCollectionFromHomeVisit(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.therapies.vo.HomeVisitShortVoCollection voList = new ims.therapies.vo.HomeVisitShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit) iterator.next();
			ims.therapies.vo.HomeVisitShortVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit objects.
	 */
	public static ims.therapies.vo.HomeVisitShortVoCollection createHomeVisitShortVoCollectionFromHomeVisit(java.util.List domainObjectList) 
	{
		return createHomeVisitShortVoCollectionFromHomeVisit(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit objects.
	 */
	public static ims.therapies.vo.HomeVisitShortVoCollection createHomeVisitShortVoCollectionFromHomeVisit(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.therapies.vo.HomeVisitShortVoCollection voList = new ims.therapies.vo.HomeVisitShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit) domainObjectList.get(i);
			ims.therapies.vo.HomeVisitShortVo vo = create(map, domainObject);

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
	 * Create the ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractHomeVisitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HomeVisitShortVoCollection voCollection) 
	 {
	 	return extractHomeVisitSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractHomeVisitSet(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HomeVisitShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HomeVisitShortVo vo = voCollection.get(i);
			ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject = HomeVisitShortVoAssembler.extractHomeVisit(domainFactory, vo, domMap);

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
	 * Create the ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractHomeVisitList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HomeVisitShortVoCollection voCollection) 
	 {
	 	return extractHomeVisitList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractHomeVisitList(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HomeVisitShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.therapies.vo.HomeVisitShortVo vo = voCollection.get(i);
			ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject = HomeVisitShortVoAssembler.extractHomeVisit(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit object.
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit
	 */
	 public static ims.therapies.vo.HomeVisitShortVo create(ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.therapies.vo.HomeVisitShortVo create(DomainObjectMap map, ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.therapies.vo.HomeVisitShortVo valueObject = (ims.therapies.vo.HomeVisitShortVo) map.getValueObject(domainObject, ims.therapies.vo.HomeVisitShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.therapies.vo.HomeVisitShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit
	 */
	 public static ims.therapies.vo.HomeVisitShortVo insert(ims.therapies.vo.HomeVisitShortVo valueObject, ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject) 
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
	 * @param domainObject ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit
	 */
	 public static ims.therapies.vo.HomeVisitShortVo insert(DomainObjectMap map, ims.therapies.vo.HomeVisitShortVo valueObject, ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_HomeVisit(domainObject.getId());
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
			
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// CareContext
		if (domainObject.getCareContext() != null)
		{
			if(domainObject.getCareContext() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCareContext();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(id, -1));				
			}
			else
			{
				valueObject.setCareContext(new ims.core.admin.vo.CareContextRefVo(domainObject.getCareContext().getId(), domainObject.getCareContext().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit extractHomeVisit(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HomeVisitShortVo valueObject) 
	{
		return 	extractHomeVisit(domainFactory, valueObject, new HashMap());
	}

	public static ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit extractHomeVisit(ims.domain.ILightweightDomainFactory domainFactory, ims.therapies.vo.HomeVisitShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_HomeVisit();
		ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit)domMap.get(valueObject);
			}
			// ims.therapies.vo.HomeVisitShortVo ID_HomeVisit field is unknown
			domainObject = new ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_HomeVisit());
			if (domMap.get(key) != null)
			{
				return (ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit)domMap.get(key);
			}
			domainObject = (ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit) domainFactory.getDomainObject(ims.therapies.homeandenvironmentalvisit.domain.objects.HomeVisit.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_HomeVisit());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value1 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value1 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value1);
		ims.core.admin.domain.objects.CareContext value2 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value2 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getCareContext();	
			}
			else
			{
				value2 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value2);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));

		return domainObject;
	}

}
