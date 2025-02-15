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
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class TrackingMovementLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.TrackingMovementLiteVo copy(ims.core.vo.TrackingMovementLiteVo valueObjectDest, ims.core.vo.TrackingMovementLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TrackingMovement(valueObjectSrc.getID_TrackingMovement());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// MovementType
		valueObjectDest.setMovementType(valueObjectSrc.getMovementType());
		// PatientReturned
		valueObjectDest.setPatientReturned(valueObjectSrc.getPatientReturned());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTrackingMovementLiteVoCollectionFromTrackingMovement(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.TrackingMovement objects.
	 */
	public static ims.core.vo.TrackingMovementLiteVoCollection createTrackingMovementLiteVoCollectionFromTrackingMovement(java.util.Set domainObjectSet)	
	{
		return createTrackingMovementLiteVoCollectionFromTrackingMovement(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.TrackingMovement objects.
	 */
	public static ims.core.vo.TrackingMovementLiteVoCollection createTrackingMovementLiteVoCollectionFromTrackingMovement(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.TrackingMovementLiteVoCollection voList = new ims.core.vo.TrackingMovementLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.TrackingMovement domainObject = (ims.core.admin.pas.domain.objects.TrackingMovement) iterator.next();
			ims.core.vo.TrackingMovementLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.TrackingMovement objects.
	 */
	public static ims.core.vo.TrackingMovementLiteVoCollection createTrackingMovementLiteVoCollectionFromTrackingMovement(java.util.List domainObjectList) 
	{
		return createTrackingMovementLiteVoCollectionFromTrackingMovement(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.TrackingMovement objects.
	 */
	public static ims.core.vo.TrackingMovementLiteVoCollection createTrackingMovementLiteVoCollectionFromTrackingMovement(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.TrackingMovementLiteVoCollection voList = new ims.core.vo.TrackingMovementLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.TrackingMovement domainObject = (ims.core.admin.pas.domain.objects.TrackingMovement) domainObjectList.get(i);
			ims.core.vo.TrackingMovementLiteVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.TrackingMovement set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTrackingMovementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TrackingMovementLiteVoCollection voCollection) 
	 {
	 	return extractTrackingMovementSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTrackingMovementSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TrackingMovementLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TrackingMovementLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.TrackingMovement domainObject = TrackingMovementLiteVoAssembler.extractTrackingMovement(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.TrackingMovement list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTrackingMovementList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TrackingMovementLiteVoCollection voCollection) 
	 {
	 	return extractTrackingMovementList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTrackingMovementList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TrackingMovementLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.TrackingMovementLiteVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.TrackingMovement domainObject = TrackingMovementLiteVoAssembler.extractTrackingMovement(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.TrackingMovement object.
	 * @param domainObject ims.core.admin.pas.domain.objects.TrackingMovement
	 */
	 public static ims.core.vo.TrackingMovementLiteVo create(ims.core.admin.pas.domain.objects.TrackingMovement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.TrackingMovement object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.TrackingMovementLiteVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.TrackingMovement domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.TrackingMovementLiteVo valueObject = (ims.core.vo.TrackingMovementLiteVo) map.getValueObject(domainObject, ims.core.vo.TrackingMovementLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.TrackingMovementLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.TrackingMovement
	 */
	 public static ims.core.vo.TrackingMovementLiteVo insert(ims.core.vo.TrackingMovementLiteVo valueObject, ims.core.admin.pas.domain.objects.TrackingMovement domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.TrackingMovement
	 */
	 public static ims.core.vo.TrackingMovementLiteVo insert(DomainObjectMap map, ims.core.vo.TrackingMovementLiteVo valueObject, ims.core.admin.pas.domain.objects.TrackingMovement domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TrackingMovement(domainObject.getId());
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
			
		// MovementType
		ims.domain.lookups.LookupInstance instance1 = domainObject.getMovementType();
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

			ims.core.vo.lookups.TrackingMovementType voLookup1 = new ims.core.vo.lookups.TrackingMovementType(instance1.getId(),instance1.getText(), instance1.isActive(), null, img, color);
			ims.core.vo.lookups.TrackingMovementType parentVoLookup1 = voLookup1;
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
								parentVoLookup1.setParent(new ims.core.vo.lookups.TrackingMovementType(parent1.getId(),parent1.getText(), parent1.isActive(), null, img, color));
				parentVoLookup1 = parentVoLookup1.getParent();
								parent1 = parent1.getParent();
			}			
			valueObject.setMovementType(voLookup1);
		}
				// PatientReturned
		valueObject.setPatientReturned( domainObject.isPatientReturned() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.TrackingMovement extractTrackingMovement(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TrackingMovementLiteVo valueObject) 
	{
		return 	extractTrackingMovement(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.TrackingMovement extractTrackingMovement(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.TrackingMovementLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TrackingMovement();
		ims.core.admin.pas.domain.objects.TrackingMovement domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.TrackingMovement)domMap.get(valueObject);
			}
			// ims.core.vo.TrackingMovementLiteVo ID_TrackingMovement field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.TrackingMovement();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TrackingMovement());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.TrackingMovement)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.TrackingMovement) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.TrackingMovement.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TrackingMovement());

		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value1 = null;
		if ( null != valueObject.getMovementType() ) 
		{
			value1 =
				domainFactory.getLookupInstance(valueObject.getMovementType().getID());
		}
		domainObject.setMovementType(value1);
		domainObject.setPatientReturned(valueObject.getPatientReturned());

		return domainObject;
	}

}
