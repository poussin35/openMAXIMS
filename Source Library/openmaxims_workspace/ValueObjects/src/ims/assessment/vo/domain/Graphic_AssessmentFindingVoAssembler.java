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
package ims.assessment.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cristian Belciug
 */
public class Graphic_AssessmentFindingVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.assessment.vo.Graphic_AssessmentFindingVo copy(ims.assessment.vo.Graphic_AssessmentFindingVo valueObjectDest, ims.assessment.vo.Graphic_AssessmentFindingVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_GraphicAssessmentFinding(valueObjectSrc.getID_GraphicAssessmentFinding());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Sequence
		valueObjectDest.setSequence(valueObjectSrc.getSequence());
		// Finding
		valueObjectDest.setFinding(valueObjectSrc.getFinding());
		// FindingStage
		valueObjectDest.setFindingStage(valueObjectSrc.getFindingStage());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.GraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentFindingVoCollection createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(java.util.Set domainObjectSet)	
	{
		return createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.assessment.configuration.domain.objects.GraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentFindingVoCollection createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.assessment.vo.Graphic_AssessmentFindingVoCollection voList = new ims.assessment.vo.Graphic_AssessmentFindingVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessmentFinding) iterator.next();
			ims.assessment.vo.Graphic_AssessmentFindingVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.GraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentFindingVoCollection createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(java.util.List domainObjectList) 
	{
		return createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.assessment.configuration.domain.objects.GraphicAssessmentFinding objects.
	 */
	public static ims.assessment.vo.Graphic_AssessmentFindingVoCollection createGraphic_AssessmentFindingVoCollectionFromGraphicAssessmentFinding(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.assessment.vo.Graphic_AssessmentFindingVoCollection voList = new ims.assessment.vo.Graphic_AssessmentFindingVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessmentFinding) domainObjectList.get(i);
			ims.assessment.vo.Graphic_AssessmentFindingVo vo = create(map, domainObject);

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
	 * Create the ims.assessment.configuration.domain.objects.GraphicAssessmentFinding set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractGraphicAssessmentFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentFindingVoCollection voCollection) 
	 {
	 	return extractGraphicAssessmentFindingSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractGraphicAssessmentFindingSet(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentFindingVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Graphic_AssessmentFindingVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject = Graphic_AssessmentFindingVoAssembler.extractGraphicAssessmentFinding(domainFactory, vo, domMap);

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
	 * Create the ims.assessment.configuration.domain.objects.GraphicAssessmentFinding list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractGraphicAssessmentFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentFindingVoCollection voCollection) 
	 {
	 	return extractGraphicAssessmentFindingList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractGraphicAssessmentFindingList(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentFindingVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.assessment.vo.Graphic_AssessmentFindingVo vo = voCollection.get(i);
			ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject = Graphic_AssessmentFindingVoAssembler.extractGraphicAssessmentFinding(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.assessment.configuration.domain.objects.GraphicAssessmentFinding object.
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessmentFinding
	 */
	 public static ims.assessment.vo.Graphic_AssessmentFindingVo create(ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.assessment.configuration.domain.objects.GraphicAssessmentFinding object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.assessment.vo.Graphic_AssessmentFindingVo create(DomainObjectMap map, ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.assessment.vo.Graphic_AssessmentFindingVo valueObject = (ims.assessment.vo.Graphic_AssessmentFindingVo) map.getValueObject(domainObject, ims.assessment.vo.Graphic_AssessmentFindingVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.assessment.vo.Graphic_AssessmentFindingVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessmentFinding
	 */
	 public static ims.assessment.vo.Graphic_AssessmentFindingVo insert(ims.assessment.vo.Graphic_AssessmentFindingVo valueObject, ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject) 
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
	 * @param domainObject ims.assessment.configuration.domain.objects.GraphicAssessmentFinding
	 */
	 public static ims.assessment.vo.Graphic_AssessmentFindingVo insert(DomainObjectMap map, ims.assessment.vo.Graphic_AssessmentFindingVo valueObject, ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_GraphicAssessmentFinding(domainObject.getId());
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
			
		// Sequence
		valueObject.setSequence(domainObject.getSequence());
		// Finding
		valueObject.setFinding(ims.core.vo.domain.DrawingGraphicFindingVoAssembler.create(map, domainObject.getFinding()) );
		// FindingStage
		valueObject.setFindingStage(ims.assessment.vo.domain.Finding_StageQuestionsVoAssembler.createFinding_StageQuestionsVoCollectionFromFindingStageQuestions(map, domainObject.getFindingStage()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.assessment.configuration.domain.objects.GraphicAssessmentFinding extractGraphicAssessmentFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentFindingVo valueObject) 
	{
		return 	extractGraphicAssessmentFinding(domainFactory, valueObject, new HashMap());
	}

	public static ims.assessment.configuration.domain.objects.GraphicAssessmentFinding extractGraphicAssessmentFinding(ims.domain.ILightweightDomainFactory domainFactory, ims.assessment.vo.Graphic_AssessmentFindingVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_GraphicAssessmentFinding();
		ims.assessment.configuration.domain.objects.GraphicAssessmentFinding domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.assessment.configuration.domain.objects.GraphicAssessmentFinding)domMap.get(valueObject);
			}
			// ims.assessment.vo.Graphic_AssessmentFindingVo ID_GraphicAssessmentFinding field is unknown
			domainObject = new ims.assessment.configuration.domain.objects.GraphicAssessmentFinding();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_GraphicAssessmentFinding());
			if (domMap.get(key) != null)
			{
				return (ims.assessment.configuration.domain.objects.GraphicAssessmentFinding)domMap.get(key);
			}
			domainObject = (ims.assessment.configuration.domain.objects.GraphicAssessmentFinding) domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.GraphicAssessmentFinding.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_GraphicAssessmentFinding());

		domainObject.setSequence(valueObject.getSequence());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.assessment.configuration.domain.objects.DrawingGraphicFinding value2 = null;
		if ( null != valueObject.getFinding() ) 
		{
			if (valueObject.getFinding().getBoId() == null)
			{
				if (domMap.get(valueObject.getFinding()) != null)
				{
					value2 = (ims.assessment.configuration.domain.objects.DrawingGraphicFinding)domMap.get(valueObject.getFinding());
				}
			}
			else
			{
				value2 = (ims.assessment.configuration.domain.objects.DrawingGraphicFinding)domainFactory.getDomainObject(ims.assessment.configuration.domain.objects.DrawingGraphicFinding.class, valueObject.getFinding().getBoId());
			}
		}
		domainObject.setFinding(value2);
		domainObject.setFindingStage(ims.assessment.vo.domain.Finding_StageQuestionsVoAssembler.extractFindingStageQuestionsList(domainFactory, valueObject.getFindingStage(), domainObject.getFindingStage(), domMap));		

		return domainObject;
	}

}
