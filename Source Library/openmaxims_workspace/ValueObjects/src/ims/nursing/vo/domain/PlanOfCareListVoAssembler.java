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
package ims.nursing.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Neil McAnaspie
 */
public class PlanOfCareListVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.nursing.vo.PlanOfCareListVo copy(ims.nursing.vo.PlanOfCareListVo valueObjectDest, ims.nursing.vo.PlanOfCareListVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PlanOfCare(valueObjectSrc.getID_PlanOfCare());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Actions
		valueObjectDest.setActions(valueObjectSrc.getActions());
		// Group
		valueObjectDest.setGroup(valueObjectSrc.getGroup());
		// Title
		valueObjectDest.setTitle(valueObjectSrc.getTitle());
		// StartDateTime
		valueObjectDest.setStartDateTime(valueObjectSrc.getStartDateTime());
		// ResolvedDateTime
		valueObjectDest.setResolvedDateTime(valueObjectSrc.getResolvedDateTime());
		// AssessmentQuestion
		valueObjectDest.setAssessmentQuestion(valueObjectSrc.getAssessmentQuestion());
		// LevelOfIntervention
		valueObjectDest.setLevelOfIntervention(valueObjectSrc.getLevelOfIntervention());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPlanOfCareListVoCollectionFromPlanOfCare(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareListVoCollection createPlanOfCareListVoCollectionFromPlanOfCare(java.util.Set domainObjectSet)	
	{
		return createPlanOfCareListVoCollectionFromPlanOfCare(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareListVoCollection createPlanOfCareListVoCollectionFromPlanOfCare(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.nursing.vo.PlanOfCareListVoCollection voList = new ims.nursing.vo.PlanOfCareListVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.nursing.domain.objects.PlanOfCare domainObject = (ims.nursing.domain.objects.PlanOfCare) iterator.next();
			ims.nursing.vo.PlanOfCareListVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareListVoCollection createPlanOfCareListVoCollectionFromPlanOfCare(java.util.List domainObjectList) 
	{
		return createPlanOfCareListVoCollectionFromPlanOfCare(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.nursing.domain.objects.PlanOfCare objects.
	 */
	public static ims.nursing.vo.PlanOfCareListVoCollection createPlanOfCareListVoCollectionFromPlanOfCare(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.nursing.vo.PlanOfCareListVoCollection voList = new ims.nursing.vo.PlanOfCareListVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.nursing.domain.objects.PlanOfCare domainObject = (ims.nursing.domain.objects.PlanOfCare) domainObjectList.get(i);
			ims.nursing.vo.PlanOfCareListVo vo = create(map, domainObject);

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
	 * Create the ims.nursing.domain.objects.PlanOfCare set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPlanOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareListVoCollection voCollection) 
	 {
	 	return extractPlanOfCareSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPlanOfCareSet(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareListVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PlanOfCareListVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PlanOfCare domainObject = PlanOfCareListVoAssembler.extractPlanOfCare(domainFactory, vo, domMap);

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
	 * Create the ims.nursing.domain.objects.PlanOfCare list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPlanOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareListVoCollection voCollection) 
	 {
	 	return extractPlanOfCareList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPlanOfCareList(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareListVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.nursing.vo.PlanOfCareListVo vo = voCollection.get(i);
			ims.nursing.domain.objects.PlanOfCare domainObject = PlanOfCareListVoAssembler.extractPlanOfCare(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.nursing.domain.objects.PlanOfCare object.
	 * @param domainObject ims.nursing.domain.objects.PlanOfCare
	 */
	 public static ims.nursing.vo.PlanOfCareListVo create(ims.nursing.domain.objects.PlanOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.nursing.domain.objects.PlanOfCare object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.nursing.vo.PlanOfCareListVo create(DomainObjectMap map, ims.nursing.domain.objects.PlanOfCare domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.nursing.vo.PlanOfCareListVo valueObject = (ims.nursing.vo.PlanOfCareListVo) map.getValueObject(domainObject, ims.nursing.vo.PlanOfCareListVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.nursing.vo.PlanOfCareListVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.nursing.domain.objects.PlanOfCare
	 */
	 public static ims.nursing.vo.PlanOfCareListVo insert(ims.nursing.vo.PlanOfCareListVo valueObject, ims.nursing.domain.objects.PlanOfCare domainObject) 
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
	 * @param domainObject ims.nursing.domain.objects.PlanOfCare
	 */
	 public static ims.nursing.vo.PlanOfCareListVo insert(DomainObjectMap map, ims.nursing.vo.PlanOfCareListVo valueObject, ims.nursing.domain.objects.PlanOfCare domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PlanOfCare(domainObject.getId());
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
			
		// Actions
		valueObject.setActions(ims.nursing.vo.domain.PlanOfCareActionsVoAssembler.createPlanOfCareActionsVoCollectionFromPlanOfCareActions(map, domainObject.getActions()) );
		// Group
		ims.domain.lookups.LookupInstance instance2 = domainObject.getGroup();
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

			ims.clinical.vo.lookups.PlanOfCareGroupings voLookup2 = new ims.clinical.vo.lookups.PlanOfCareGroupings(instance2.getId(),instance2.getText(), instance2.isActive(), null, img, color);
			ims.clinical.vo.lookups.PlanOfCareGroupings parentVoLookup2 = voLookup2;
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
								parentVoLookup2.setParent(new ims.clinical.vo.lookups.PlanOfCareGroupings(parent2.getId(),parent2.getText(), parent2.isActive(), null, img, color));
				parentVoLookup2 = parentVoLookup2.getParent();
								parent2 = parent2.getParent();
			}			
			valueObject.setGroup(voLookup2);
		}
				// Title
		valueObject.setTitle(domainObject.getTitle());
		// StartDateTime
		java.util.Date StartDateTime = domainObject.getStartDateTime();
		if ( null != StartDateTime ) 
		{
			valueObject.setStartDateTime(new ims.framework.utils.DateTime(StartDateTime) );
		}
		// ResolvedDateTime
		java.util.Date ResolvedDateTime = domainObject.getResolvedDateTime();
		if ( null != ResolvedDateTime ) 
		{
			valueObject.setResolvedDateTime(new ims.framework.utils.DateTime(ResolvedDateTime) );
		}
		// AssessmentQuestion
		valueObject.setAssessmentQuestion(ims.core.vo.domain.AssessmentQuestionShortVoAssembler.create(map, domainObject.getAssessmentQuestion()) );
		// LevelOfIntervention
		valueObject.setLevelOfIntervention(domainObject.getLevelOfIntervention());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.nursing.domain.objects.PlanOfCare extractPlanOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareListVo valueObject) 
	{
		return 	extractPlanOfCare(domainFactory, valueObject, new HashMap());
	}

	public static ims.nursing.domain.objects.PlanOfCare extractPlanOfCare(ims.domain.ILightweightDomainFactory domainFactory, ims.nursing.vo.PlanOfCareListVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PlanOfCare();
		ims.nursing.domain.objects.PlanOfCare domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.nursing.domain.objects.PlanOfCare)domMap.get(valueObject);
			}
			// ims.nursing.vo.PlanOfCareListVo ID_PlanOfCare field is unknown
			domainObject = new ims.nursing.domain.objects.PlanOfCare();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PlanOfCare());
			if (domMap.get(key) != null)
			{
				return (ims.nursing.domain.objects.PlanOfCare)domMap.get(key);
			}
			domainObject = (ims.nursing.domain.objects.PlanOfCare) domainFactory.getDomainObject(ims.nursing.domain.objects.PlanOfCare.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PlanOfCare());

		domainObject.setActions(ims.nursing.vo.domain.PlanOfCareActionsVoAssembler.extractPlanOfCareActionsSet(domainFactory, valueObject.getActions(), domainObject.getActions(), domMap));		
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value2 = null;
		if ( null != valueObject.getGroup() ) 
		{
			value2 =
				domainFactory.getLookupInstance(valueObject.getGroup().getID());
		}
		domainObject.setGroup(value2);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getTitle() != null && valueObject.getTitle().equals(""))
		{
			valueObject.setTitle(null);
		}
		domainObject.setTitle(valueObject.getTitle());
		ims.framework.utils.DateTime dateTime4 = valueObject.getStartDateTime();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setStartDateTime(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getResolvedDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setResolvedDateTime(value5);
		domainObject.setAssessmentQuestion(ims.core.vo.domain.AssessmentQuestionShortVoAssembler.extractAssessmentQuestion(domainFactory, valueObject.getAssessmentQuestion(), domMap));
		domainObject.setLevelOfIntervention(valueObject.getLevelOfIntervention());

		return domainObject;
	}

}
