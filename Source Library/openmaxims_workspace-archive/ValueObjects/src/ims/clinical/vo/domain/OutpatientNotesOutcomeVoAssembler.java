//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
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
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:32
 *
 */
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Vasile Purdila
 */
public class OutpatientNotesOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.OutpatientNotesOutcomeVo copy(ims.clinical.vo.OutpatientNotesOutcomeVo valueObjectDest, ims.clinical.vo.OutpatientNotesOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OutpatientNotesOutcome(valueObjectSrc.getID_OutpatientNotesOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// ClinicalNote
		valueObjectDest.setClinicalNote(valueObjectSrc.getClinicalNote());
		// InstructionNextClinic
		valueObjectDest.setInstructionNextClinic(valueObjectSrc.getInstructionNextClinic());
		// Outcome
		valueObjectDest.setOutcome(valueObjectSrc.getOutcome());
		// ReviewIn
		valueObjectDest.setReviewIn(valueObjectSrc.getReviewIn());
		// ReviewinUnits
		valueObjectDest.setReviewinUnits(valueObjectSrc.getReviewinUnits());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.OutpatientNotesOutcome objects.
	 */
	public static ims.clinical.vo.OutpatientNotesOutcomeVoCollection createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(java.util.Set domainObjectSet)	
	{
		return createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.clinical.domain.objects.OutpatientNotesOutcome objects.
	 */
	public static ims.clinical.vo.OutpatientNotesOutcomeVoCollection createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.OutpatientNotesOutcomeVoCollection voList = new ims.clinical.vo.OutpatientNotesOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.clinical.domain.objects.OutpatientNotesOutcome domainObject = (ims.clinical.domain.objects.OutpatientNotesOutcome) iterator.next();
			ims.clinical.vo.OutpatientNotesOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.clinical.domain.objects.OutpatientNotesOutcome objects.
	 */
	public static ims.clinical.vo.OutpatientNotesOutcomeVoCollection createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(java.util.List domainObjectList) 
	{
		return createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.clinical.domain.objects.OutpatientNotesOutcome objects.
	 */
	public static ims.clinical.vo.OutpatientNotesOutcomeVoCollection createOutpatientNotesOutcomeVoCollectionFromOutpatientNotesOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.OutpatientNotesOutcomeVoCollection voList = new ims.clinical.vo.OutpatientNotesOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.clinical.domain.objects.OutpatientNotesOutcome domainObject = (ims.clinical.domain.objects.OutpatientNotesOutcome) domainObjectList.get(i);
			ims.clinical.vo.OutpatientNotesOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.clinical.domain.objects.OutpatientNotesOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOutpatientNotesOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OutpatientNotesOutcomeVoCollection voCollection) 
	 {
	 	return extractOutpatientNotesOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOutpatientNotesOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OutpatientNotesOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.OutpatientNotesOutcomeVo vo = voCollection.get(i);
			ims.clinical.domain.objects.OutpatientNotesOutcome domainObject = OutpatientNotesOutcomeVoAssembler.extractOutpatientNotesOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.clinical.domain.objects.OutpatientNotesOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOutpatientNotesOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OutpatientNotesOutcomeVoCollection voCollection) 
	 {
	 	return extractOutpatientNotesOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOutpatientNotesOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OutpatientNotesOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.OutpatientNotesOutcomeVo vo = voCollection.get(i);
			ims.clinical.domain.objects.OutpatientNotesOutcome domainObject = OutpatientNotesOutcomeVoAssembler.extractOutpatientNotesOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.clinical.domain.objects.OutpatientNotesOutcome object.
	 * @param domainObject ims.clinical.domain.objects.OutpatientNotesOutcome
	 */
	 public static ims.clinical.vo.OutpatientNotesOutcomeVo create(ims.clinical.domain.objects.OutpatientNotesOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.clinical.domain.objects.OutpatientNotesOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.OutpatientNotesOutcomeVo create(DomainObjectMap map, ims.clinical.domain.objects.OutpatientNotesOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.OutpatientNotesOutcomeVo valueObject = (ims.clinical.vo.OutpatientNotesOutcomeVo) map.getValueObject(domainObject, ims.clinical.vo.OutpatientNotesOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.OutpatientNotesOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.clinical.domain.objects.OutpatientNotesOutcome
	 */
	 public static ims.clinical.vo.OutpatientNotesOutcomeVo insert(ims.clinical.vo.OutpatientNotesOutcomeVo valueObject, ims.clinical.domain.objects.OutpatientNotesOutcome domainObject) 
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
	 * @param domainObject ims.clinical.domain.objects.OutpatientNotesOutcome
	 */
	 public static ims.clinical.vo.OutpatientNotesOutcomeVo insert(DomainObjectMap map, ims.clinical.vo.OutpatientNotesOutcomeVo valueObject, ims.clinical.domain.objects.OutpatientNotesOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OutpatientNotesOutcome(domainObject.getId());
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
			
		// ClinicalNote
		valueObject.setClinicalNote(ims.clinical.vo.domain.SoapNoteVoAssembler.create(map, domainObject.getClinicalNote()) );
		// InstructionNextClinic
		valueObject.setInstructionNextClinic(domainObject.getInstructionNextClinic());
		// Outcome
		ims.domain.lookups.LookupInstance instance3 = domainObject.getOutcome();
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

			ims.clinical.vo.lookups.OpdFollowUp voLookup3 = new ims.clinical.vo.lookups.OpdFollowUp(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.clinical.vo.lookups.OpdFollowUp parentVoLookup3 = voLookup3;
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
								parentVoLookup3.setParent(new ims.clinical.vo.lookups.OpdFollowUp(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setOutcome(voLookup3);
		}
				// ReviewIn
		valueObject.setReviewIn(domainObject.getReviewIn());
		// ReviewinUnits
		ims.domain.lookups.LookupInstance instance5 = domainObject.getReviewinUnits();
		if ( null != instance5 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance5.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance5.getImage().getImageId(), instance5.getImage().getImagePath());
			}
			color = instance5.getColor();
			if (color != null) 
				color.getValue();

			ims.clinical.vo.lookups.ReviewInDuration voLookup5 = new ims.clinical.vo.lookups.ReviewInDuration(instance5.getId(),instance5.getText(), instance5.isActive(), null, img, color);
			ims.clinical.vo.lookups.ReviewInDuration parentVoLookup5 = voLookup5;
			ims.domain.lookups.LookupInstance parent5 = instance5.getParent();
			while (parent5 != null)
			{
				if (parent5.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent5.getImage().getImageId(), parent5.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent5.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup5.setParent(new ims.clinical.vo.lookups.ReviewInDuration(parent5.getId(),parent5.getText(), parent5.isActive(), null, img, color));
				parentVoLookup5 = parentVoLookup5.getParent();
								parent5 = parent5.getParent();
			}			
			valueObject.setReviewinUnits(voLookup5);
		}
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
		// ClinicalContact
		if (domainObject.getClinicalContact() != null)
		{
			if(domainObject.getClinicalContact() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getClinicalContact();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(id, -1));				
			}
			else
			{
				valueObject.setClinicalContact(new ims.core.admin.vo.ClinicalContactRefVo(domainObject.getClinicalContact().getId(), domainObject.getClinicalContact().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.clinical.domain.objects.OutpatientNotesOutcome extractOutpatientNotesOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OutpatientNotesOutcomeVo valueObject) 
	{
		return 	extractOutpatientNotesOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.clinical.domain.objects.OutpatientNotesOutcome extractOutpatientNotesOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.OutpatientNotesOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OutpatientNotesOutcome();
		ims.clinical.domain.objects.OutpatientNotesOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.clinical.domain.objects.OutpatientNotesOutcome)domMap.get(valueObject);
			}
			// ims.clinical.vo.OutpatientNotesOutcomeVo ID_OutpatientNotesOutcome field is unknown
			domainObject = new ims.clinical.domain.objects.OutpatientNotesOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OutpatientNotesOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.clinical.domain.objects.OutpatientNotesOutcome)domMap.get(key);
			}
			domainObject = (ims.clinical.domain.objects.OutpatientNotesOutcome) domainFactory.getDomainObject(ims.clinical.domain.objects.OutpatientNotesOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OutpatientNotesOutcome());

		domainObject.setClinicalNote(ims.clinical.vo.domain.SoapNoteVoAssembler.extractSoapNote(domainFactory, valueObject.getClinicalNote(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getInstructionNextClinic() != null && valueObject.getInstructionNextClinic().equals(""))
		{
			valueObject.setInstructionNextClinic(null);
		}
		domainObject.setInstructionNextClinic(valueObject.getInstructionNextClinic());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getOutcome() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getOutcome().getID());
		}
		domainObject.setOutcome(value3);
		domainObject.setReviewIn(valueObject.getReviewIn());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value5 = null;
		if ( null != valueObject.getReviewinUnits() ) 
		{
			value5 =
				domainFactory.getLookupInstance(valueObject.getReviewinUnits().getID());
		}
		domainObject.setReviewinUnits(value5);
		ims.core.admin.domain.objects.CareContext value6 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value6 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value6 = domainObject.getCareContext();	
			}
			else
			{
				value6 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value6);
		ims.core.admin.domain.objects.ClinicalContact value7 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value7 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value7 = domainObject.getClinicalContact();	
			}
			else
			{
				value7 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value7);

		return domainObject;
	}

}
