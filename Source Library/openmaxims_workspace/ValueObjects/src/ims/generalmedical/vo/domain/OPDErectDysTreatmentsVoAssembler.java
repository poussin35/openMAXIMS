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
package ims.generalmedical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class OPDErectDysTreatmentsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.generalmedical.vo.OPDErectDysTreatmentsVo copy(ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObjectDest, ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OPDErectDysfxTreatments(valueObjectSrc.getID_OPDErectDysfxTreatments());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Treatment
		valueObjectDest.setTreatment(valueObjectSrc.getTreatment());
		// Tried
		valueObjectDest.setTried(valueObjectSrc.getTried());
		// TreatScore
		valueObjectDest.setTreatScore(valueObjectSrc.getTreatScore());
		// TreatDetails
		valueObjectDest.setTreatDetails(valueObjectSrc.getTreatDetails());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDErectDysfxTreatments objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(java.util.Set domainObjectSet)	
	{
		return createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.medical.domain.objects.OPDErectDysfxTreatments objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection voList = new ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.medical.domain.objects.OPDErectDysfxTreatments domainObject = (ims.medical.domain.objects.OPDErectDysfxTreatments) iterator.next();
			ims.generalmedical.vo.OPDErectDysTreatmentsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDErectDysfxTreatments objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(java.util.List domainObjectList) 
	{
		return createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.medical.domain.objects.OPDErectDysfxTreatments objects.
	 */
	public static ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection createOPDErectDysTreatmentsVoCollectionFromOPDErectDysfxTreatments(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection voList = new ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.medical.domain.objects.OPDErectDysfxTreatments domainObject = (ims.medical.domain.objects.OPDErectDysfxTreatments) domainObjectList.get(i);
			ims.generalmedical.vo.OPDErectDysTreatmentsVo vo = create(map, domainObject);

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
	 * Create the ims.medical.domain.objects.OPDErectDysfxTreatments set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOPDErectDysfxTreatmentsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection voCollection) 
	 {
	 	return extractOPDErectDysfxTreatmentsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOPDErectDysfxTreatmentsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDErectDysTreatmentsVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDErectDysfxTreatments domainObject = OPDErectDysTreatmentsVoAssembler.extractOPDErectDysfxTreatments(domainFactory, vo, domMap);

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
	 * Create the ims.medical.domain.objects.OPDErectDysfxTreatments list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOPDErectDysfxTreatmentsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection voCollection) 
	 {
	 	return extractOPDErectDysfxTreatmentsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOPDErectDysfxTreatmentsList(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysTreatmentsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.generalmedical.vo.OPDErectDysTreatmentsVo vo = voCollection.get(i);
			ims.medical.domain.objects.OPDErectDysfxTreatments domainObject = OPDErectDysTreatmentsVoAssembler.extractOPDErectDysfxTreatments(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.medical.domain.objects.OPDErectDysfxTreatments object.
	 * @param domainObject ims.medical.domain.objects.OPDErectDysfxTreatments
	 */
	 public static ims.generalmedical.vo.OPDErectDysTreatmentsVo create(ims.medical.domain.objects.OPDErectDysfxTreatments domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.medical.domain.objects.OPDErectDysfxTreatments object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.generalmedical.vo.OPDErectDysTreatmentsVo create(DomainObjectMap map, ims.medical.domain.objects.OPDErectDysfxTreatments domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObject = (ims.generalmedical.vo.OPDErectDysTreatmentsVo) map.getValueObject(domainObject, ims.generalmedical.vo.OPDErectDysTreatmentsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.generalmedical.vo.OPDErectDysTreatmentsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.medical.domain.objects.OPDErectDysfxTreatments
	 */
	 public static ims.generalmedical.vo.OPDErectDysTreatmentsVo insert(ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObject, ims.medical.domain.objects.OPDErectDysfxTreatments domainObject) 
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
	 * @param domainObject ims.medical.domain.objects.OPDErectDysfxTreatments
	 */
	 public static ims.generalmedical.vo.OPDErectDysTreatmentsVo insert(DomainObjectMap map, ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObject, ims.medical.domain.objects.OPDErectDysfxTreatments domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OPDErectDysfxTreatments(domainObject.getId());
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
			
		// Treatment
		ims.domain.lookups.LookupInstance instance1 = domainObject.getTreatment();
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

			ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven voLookup1 = new ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.spinalinjuries.vo.lookups.ErectDysTreatmentsGiven(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setTreatment(voLookup1);
		}
				// Tried
		ims.domain.lookups.LookupInstance instance2 = domainObject.getTried();
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

			ims.core.vo.lookups.YesNoUnknown voLookup2 = new ims.core.vo.lookups.YesNoUnknown(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.core.vo.lookups.YesNoUnknown parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.core.vo.lookups.YesNoUnknown(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setTried(voLookup2);
		}
				// TreatScore
		ims.domain.lookups.LookupInstance instance3 = domainObject.getTreatScore();
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

			ims.core.vo.lookups.ErectDysTreatScore voLookup3 = new ims.core.vo.lookups.ErectDysTreatScore(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.ErectDysTreatScore parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.ErectDysTreatScore(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setTreatScore(voLookup3);
		}
				// TreatDetails
		valueObject.setTreatDetails(domainObject.getTreatDetails());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.medical.domain.objects.OPDErectDysfxTreatments extractOPDErectDysfxTreatments(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObject) 
	{
		return 	extractOPDErectDysfxTreatments(domainFactory, valueObject, new HashMap());
	}

	public static ims.medical.domain.objects.OPDErectDysfxTreatments extractOPDErectDysfxTreatments(ims.domain.ILightweightDomainFactory domainFactory, ims.generalmedical.vo.OPDErectDysTreatmentsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OPDErectDysfxTreatments();
		ims.medical.domain.objects.OPDErectDysfxTreatments domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.medical.domain.objects.OPDErectDysfxTreatments)domMap.get(valueObject);
			}
			// ims.generalmedical.vo.OPDErectDysTreatmentsVo ID_OPDErectDysfxTreatments field is unknown
			domainObject = new ims.medical.domain.objects.OPDErectDysfxTreatments();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OPDErectDysfxTreatments());
			if (domMap.get(key) != null)
			{
				return (ims.medical.domain.objects.OPDErectDysfxTreatments)domMap.get(key);
			}
			domainObject = (ims.medical.domain.objects.OPDErectDysfxTreatments) domainFactory.getDomainObject(ims.medical.domain.objects.OPDErectDysfxTreatments.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OPDErectDysfxTreatments());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getTreatment() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getTreatment().getID());
		}
		domainObject.setTreatment(value1);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getTried() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getTried().getID());
		}
		domainObject.setTried(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getTreatScore() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getTreatScore().getID());
		}
		domainObject.setTreatScore(value3);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTreatDetails() != null && valueObject.getTreatDetails().equals(""))
		{
			valueObject.setTreatDetails(null);
		}
		domainObject.setTreatDetails(valueObject.getTreatDetails());

		return domainObject;
	}

}
