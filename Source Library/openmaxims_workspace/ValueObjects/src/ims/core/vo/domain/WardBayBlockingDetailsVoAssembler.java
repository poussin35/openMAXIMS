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
 * Generated on 12/10/2015, 13:23
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Gabriel Maxim
 */
public class WardBayBlockingDetailsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.WardBayBlockingDetailsVo copy(ims.core.vo.WardBayBlockingDetailsVo valueObjectDest, ims.core.vo.WardBayBlockingDetailsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_WardBayBlockingDetails(valueObjectSrc.getID_WardBayBlockingDetails());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// BlockedBy
		valueObjectDest.setBlockedBy(valueObjectSrc.getBlockedBy());
		// BlockedDate
		valueObjectDest.setBlockedDate(valueObjectSrc.getBlockedDate());
		// ReasonForBlocking
		valueObjectDest.setReasonForBlocking(valueObjectSrc.getReasonForBlocking());
		// EstimatedReopeningDate
		valueObjectDest.setEstimatedReopeningDate(valueObjectSrc.getEstimatedReopeningDate());
		// ReopenDate
		valueObjectDest.setReopenDate(valueObjectSrc.getReopenDate());
		// ReopenReason
		valueObjectDest.setReopenReason(valueObjectSrc.getReopenReason());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardBayBlockingDetails objects.
	 */
	public static ims.core.vo.WardBayBlockingDetailsVoCollection createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(java.util.Set domainObjectSet)	
	{
		return createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.pas.domain.objects.WardBayBlockingDetails objects.
	 */
	public static ims.core.vo.WardBayBlockingDetailsVoCollection createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.WardBayBlockingDetailsVoCollection voList = new ims.core.vo.WardBayBlockingDetailsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject = (ims.core.admin.pas.domain.objects.WardBayBlockingDetails) iterator.next();
			ims.core.vo.WardBayBlockingDetailsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardBayBlockingDetails objects.
	 */
	public static ims.core.vo.WardBayBlockingDetailsVoCollection createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(java.util.List domainObjectList) 
	{
		return createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.pas.domain.objects.WardBayBlockingDetails objects.
	 */
	public static ims.core.vo.WardBayBlockingDetailsVoCollection createWardBayBlockingDetailsVoCollectionFromWardBayBlockingDetails(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.WardBayBlockingDetailsVoCollection voList = new ims.core.vo.WardBayBlockingDetailsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject = (ims.core.admin.pas.domain.objects.WardBayBlockingDetails) domainObjectList.get(i);
			ims.core.vo.WardBayBlockingDetailsVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.pas.domain.objects.WardBayBlockingDetails set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractWardBayBlockingDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardBayBlockingDetailsVoCollection voCollection) 
	 {
	 	return extractWardBayBlockingDetailsSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractWardBayBlockingDetailsSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardBayBlockingDetailsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardBayBlockingDetailsVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject = WardBayBlockingDetailsVoAssembler.extractWardBayBlockingDetails(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.pas.domain.objects.WardBayBlockingDetails list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractWardBayBlockingDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardBayBlockingDetailsVoCollection voCollection) 
	 {
	 	return extractWardBayBlockingDetailsList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractWardBayBlockingDetailsList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardBayBlockingDetailsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.WardBayBlockingDetailsVo vo = voCollection.get(i);
			ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject = WardBayBlockingDetailsVoAssembler.extractWardBayBlockingDetails(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardBayBlockingDetails object.
	 * @param domainObject ims.core.admin.pas.domain.objects.WardBayBlockingDetails
	 */
	 public static ims.core.vo.WardBayBlockingDetailsVo create(ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.pas.domain.objects.WardBayBlockingDetails object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.WardBayBlockingDetailsVo create(DomainObjectMap map, ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.WardBayBlockingDetailsVo valueObject = (ims.core.vo.WardBayBlockingDetailsVo) map.getValueObject(domainObject, ims.core.vo.WardBayBlockingDetailsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.WardBayBlockingDetailsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.pas.domain.objects.WardBayBlockingDetails
	 */
	 public static ims.core.vo.WardBayBlockingDetailsVo insert(ims.core.vo.WardBayBlockingDetailsVo valueObject, ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject) 
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
	 * @param domainObject ims.core.admin.pas.domain.objects.WardBayBlockingDetails
	 */
	 public static ims.core.vo.WardBayBlockingDetailsVo insert(DomainObjectMap map, ims.core.vo.WardBayBlockingDetailsVo valueObject, ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_WardBayBlockingDetails(domainObject.getId());
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
			
		// BlockedBy
		valueObject.setBlockedBy(ims.core.vo.domain.MemberOfStaffLiteVoAssembler.create(map, domainObject.getBlockedBy()) );
		// BlockedDate
		java.util.Date BlockedDate = domainObject.getBlockedDate();
		if ( null != BlockedDate ) 
		{
			valueObject.setBlockedDate(new ims.framework.utils.DateTime(BlockedDate) );
		}
		// ReasonForBlocking
		ims.domain.lookups.LookupInstance instance3 = domainObject.getReasonForBlocking();
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

			ims.core.vo.lookups.WardBayBlockingReason voLookup3 = new ims.core.vo.lookups.WardBayBlockingReason(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.core.vo.lookups.WardBayBlockingReason parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.core.vo.lookups.WardBayBlockingReason(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setReasonForBlocking(voLookup3);
		}
				// EstimatedReopeningDate
		java.util.Date EstimatedReopeningDate = domainObject.getEstimatedReopeningDate();
		if ( null != EstimatedReopeningDate ) 
		{
			valueObject.setEstimatedReopeningDate(new ims.framework.utils.DateTime(EstimatedReopeningDate) );
		}
		// ReopenDate
		java.util.Date ReopenDate = domainObject.getReopenDate();
		if ( null != ReopenDate ) 
		{
			valueObject.setReopenDate(new ims.framework.utils.DateTime(ReopenDate) );
		}
		// ReopenReason
		ims.domain.lookups.LookupInstance instance6 = domainObject.getReopenReason();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.WardBayReopenReason voLookup6 = new ims.core.vo.lookups.WardBayReopenReason(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.WardBayReopenReason parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.WardBayReopenReason(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setReopenReason(voLookup6);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.pas.domain.objects.WardBayBlockingDetails extractWardBayBlockingDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardBayBlockingDetailsVo valueObject) 
	{
		return 	extractWardBayBlockingDetails(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.pas.domain.objects.WardBayBlockingDetails extractWardBayBlockingDetails(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.WardBayBlockingDetailsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_WardBayBlockingDetails();
		ims.core.admin.pas.domain.objects.WardBayBlockingDetails domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardBayBlockingDetails)domMap.get(valueObject);
			}
			// ims.core.vo.WardBayBlockingDetailsVo ID_WardBayBlockingDetails field is unknown
			domainObject = new ims.core.admin.pas.domain.objects.WardBayBlockingDetails();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_WardBayBlockingDetails());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.pas.domain.objects.WardBayBlockingDetails)domMap.get(key);
			}
			domainObject = (ims.core.admin.pas.domain.objects.WardBayBlockingDetails) domainFactory.getDomainObject(ims.core.admin.pas.domain.objects.WardBayBlockingDetails.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_WardBayBlockingDetails());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.resource.people.domain.objects.MemberOfStaff value1 = null;
		if ( null != valueObject.getBlockedBy() ) 
		{
			if (valueObject.getBlockedBy().getBoId() == null)
			{
				if (domMap.get(valueObject.getBlockedBy()) != null)
				{
					value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domMap.get(valueObject.getBlockedBy());
				}
			}
			else
			{
				value1 = (ims.core.resource.people.domain.objects.MemberOfStaff)domainFactory.getDomainObject(ims.core.resource.people.domain.objects.MemberOfStaff.class, valueObject.getBlockedBy().getBoId());
			}
		}
		domainObject.setBlockedBy(value1);
		ims.framework.utils.DateTime dateTime2 = valueObject.getBlockedDate();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setBlockedDate(value2);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getReasonForBlocking() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getReasonForBlocking().getID());
		}
		domainObject.setReasonForBlocking(value3);
		ims.framework.utils.DateTime dateTime4 = valueObject.getEstimatedReopeningDate();
		java.util.Date value4 = null;
		if ( dateTime4 != null ) 
		{
			value4 = dateTime4.getJavaDate();
		}
		domainObject.setEstimatedReopeningDate(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getReopenDate();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setReopenDate(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getReopenReason() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getReopenReason().getID());
		}
		domainObject.setReopenReason(value6);

		return domainObject;
	}

}
