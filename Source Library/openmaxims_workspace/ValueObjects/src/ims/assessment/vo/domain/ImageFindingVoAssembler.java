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
package ims.assessment.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Kevin O'Carroll
 */
public class ImageFindingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.ImageFindingVo copy(ims.assessment.vo.ImageFindingVo valueObjectDest, ims.assessment.vo.ImageFindingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ImageFinding(valueObjectSrc.getID_ImageFinding());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// DisplayText
		valueObjectDest.setDisplayText(valueObjectSrc.getDisplayText());
		// Colour
		valueObjectDest.setColour(valueObjectSrc.getColour());
		// Image
		valueObjectDest.setImage(valueObjectSrc.getImage());
		// RenderStyle
		valueObjectDest.setRenderStyle(valueObjectSrc.getRenderStyle());
		// FindingQuestions
		valueObjectDest.setFindingQuestions(valueObjectSrc.getFindingQuestions());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createImageFindingVoCollectionFromImageFinding(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.ImageFinding objects.
	 */
	public static ims.assessment.vo.ImageFindingVoCollection createImageFindingVoCollectionFromImageFinding(java.util.Set domainObjectSet)	
	{
		return createImageFindingVoCollectionFromImageFinding(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.ImageFinding objects.
	 */
	public static ims.assessment.vo.ImageFindingVoCollection createImageFindingVoCollectionFromImageFinding(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.ImageFindingVoCollection voList = new ims.assessment.vo.ImageFindingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.ImageFinding domainObject = (ims.assessment.configuration.domain.objects.ImageFinding) iterator.next();
			ims.assessment.vo.ImageFindingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.ImageFinding objects.
	 */
	public static ims.assessment.vo.ImageFindingVoCollection createImageFindingVoCollectionFromImageFinding(java.util.List domainObjectList) 
	{
		return createImageFindingVoCollectionFromImageFinding(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.ImageFinding objects.
	 */
	public static ims.assessment.vo.ImageFindingVoCollection createImageFindingVoCollectionFromImageFinding(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.ImageFindingVoCollection voList = new ims.assessment.vo.ImageFindingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.ImageFinding domainObject = (ims.assessment.configuration.domain.objects.ImageFinding) domainObjectList.get(i);
			ims.assessment.vo.ImageFindingVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.configuration.domain.objects.ImageFinding set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractImageFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.ImageFindingVoCollection voCollection) 
	 {
	 	return extractImageFindingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractImageFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.ImageFindingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.ImageFindingVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.ImageFinding domainObject = ImageFindingVoAssembler.extractImageFinding(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.configuration.domain.objects.ImageFinding list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractImageFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.ImageFindingVoCollection voCollection) 
	 {
	 	return extractImageFindingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractImageFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.ImageFindingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.ImageFindingVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.ImageFinding domainObject = ImageFindingVoAssembler.extractImageFinding(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.ImageFinding object.
	 * @param domainObject ims.assessment.configuration.domain.objects.ImageFinding
	 */
	 public static ims.assessment.vo.ImageFindingVo create(ims.assessment.configuration.domain.objects.ImageFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.ImageFinding object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.ImageFindingVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.ImageFinding domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.ImageFindingVo valueObject = (ims.assessment.vo.ImageFindingVo) map.getValueObject(domainObject, ims.assessment.vo.ImageFindingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.ImageFindingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.ImageFinding
	 */
	 public static ims.assessment.vo.ImageFindingVo insert(ims.assessment.vo.ImageFindingVo valueObject, ims.assessment.configuration.domain.objects.ImageFinding domainObject) 
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
	 * @param domainObject ims.assessment.configuration.domain.objects.ImageFinding
	 */
	 public static ims.assessment.vo.ImageFindingVo insert(DomainObjectMap map, ims.assessment.vo.ImageFindingVo valueObject, ims.assessment.configuration.domain.objects.ImageFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ImageFinding(domainObject.getId());
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
			
		// Description
		valueObject.setDescription(domainObject.getDescription());
		// DisplayText
		valueObject.setDisplayText(domainObject.getDisplayText());
		// Colour
		valueObject.setColour(domainObject.getColour());
		// Image
		valueObject.setImage(ims.admin.vo.domain.AppImageVoAssembler.create(map, domainObject.getImage()) );
		// RenderStyle
		valueObject.setRenderStyle( domainObject.isRenderStyle() );
		// FindingQuestions
		valueObject.setFindingQuestions(ims.assessment.vo.domain.ImageFindingQuestionVoAssembler.createImageFindingQuestionVoCollectionFromImageFindingQuestion(map, domainObject.getFindingQuestions()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.ImageFinding extractImageFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.ImageFindingVo valueObject) 
	{
		return 	extractImageFinding(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.ImageFinding extractImageFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.ImageFindingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ImageFinding();
		ims.assessment.configuration.domain.objects.ImageFinding domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.ImageFinding)domMap.get(valueObject);
			}
			// ims.assessment.vo.ImageFindingVo ID_ImageFinding field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.ImageFinding();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ImageFinding());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.ImageFinding)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.ImageFinding) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.ImageFinding.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ImageFinding());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDisplayText() != null && valueObject.getDisplayText().equals(""))
		{
			valueObject.setDisplayText(null);
		}
		domainObject.setDisplayText(valueObject.getDisplayText());
		domainObject.setColour(valueObject.getColour());
		domainObject.setImage(ims.admin.vo.domain.AppImageVoAssembler.extractAppImage(domainFactory, valueObject.getImage(), domMap));
		domainObject.setRenderStyle(valueObject.getRenderStyle());
		domainObject.setFindingQuestions(ims.assessment.vo.domain.ImageFindingQuestionVoAssembler.extractImageFindingQuestionSet(domainFactory, valueObject.getFindingQuestions(), domainObject.getFindingQuestions(), domMap));		

		return domainObject;
	}

}
