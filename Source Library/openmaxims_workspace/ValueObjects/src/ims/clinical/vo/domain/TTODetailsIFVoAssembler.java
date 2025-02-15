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
package ims.clinical.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Michael Noonan
 */
public class TTODetailsIFVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.clinical.vo.TTODetailsIFVo copy(ims.clinical.vo.TTODetailsIFVo valueObjectDest, ims.clinical.vo.TTODetailsIFVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TTAMedication(valueObjectSrc.getID_TTAMedication());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Medication
		valueObjectDest.setMedication(valueObjectSrc.getMedication());
		// DateDispensed
		valueObjectDest.setDateDispensed(valueObjectSrc.getDateDispensed());
		// DoseAmount
		valueObjectDest.setDoseAmount(valueObjectSrc.getDoseAmount());
		// DoseUnit
		valueObjectDest.setDoseUnit(valueObjectSrc.getDoseUnit());
		// DaysSupply
		valueObjectDest.setDaysSupply(valueObjectSrc.getDaysSupply());
		// Frequency
		valueObjectDest.setFrequency(valueObjectSrc.getFrequency());
		// GpToContinue
		valueObjectDest.setGpToContinue(valueObjectSrc.getGpToContinue());
		// Route
		valueObjectDest.setRoute(valueObjectSrc.getRoute());
		// MedComments
		valueObjectDest.setMedComments(valueObjectSrc.getMedComments());
		// SortOrder
		valueObjectDest.setSortOrder(valueObjectSrc.getSortOrder());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createTTODetailsIFVoCollectionFromTTAMedication(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTODetailsIFVoCollection createTTODetailsIFVoCollectionFromTTAMedication(java.util.Set domainObjectSet)	
	{
		return createTTODetailsIFVoCollectionFromTTAMedication(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTODetailsIFVoCollection createTTODetailsIFVoCollectionFromTTAMedication(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.clinical.vo.TTODetailsIFVoCollection voList = new ims.clinical.vo.TTODetailsIFVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.edischarge.domain.objects.TTAMedication domainObject = (ims.edischarge.domain.objects.TTAMedication) iterator.next();
			ims.clinical.vo.TTODetailsIFVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTODetailsIFVoCollection createTTODetailsIFVoCollectionFromTTAMedication(java.util.List domainObjectList) 
	{
		return createTTODetailsIFVoCollectionFromTTAMedication(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.edischarge.domain.objects.TTAMedication objects.
	 */
	public static ims.clinical.vo.TTODetailsIFVoCollection createTTODetailsIFVoCollectionFromTTAMedication(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.clinical.vo.TTODetailsIFVoCollection voList = new ims.clinical.vo.TTODetailsIFVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.edischarge.domain.objects.TTAMedication domainObject = (ims.edischarge.domain.objects.TTAMedication) domainObjectList.get(i);
			ims.clinical.vo.TTODetailsIFVo vo = create(map, domainObject);

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
	 * Create the ims.edischarge.domain.objects.TTAMedication set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTTAMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTODetailsIFVoCollection voCollection) 
	 {
	 	return extractTTAMedicationSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTTAMedicationSet(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTODetailsIFVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTODetailsIFVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedication domainObject = TTODetailsIFVoAssembler.extractTTAMedication(domainFactory, vo, domMap);

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
	 * Create the ims.edischarge.domain.objects.TTAMedication list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTTAMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTODetailsIFVoCollection voCollection) 
	 {
	 	return extractTTAMedicationList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTTAMedicationList(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTODetailsIFVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.clinical.vo.TTODetailsIFVo vo = voCollection.get(i);
			ims.edischarge.domain.objects.TTAMedication domainObject = TTODetailsIFVoAssembler.extractTTAMedication(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedication object.
	 * @param domainObject ims.edischarge.domain.objects.TTAMedication
	 */
	 public static ims.clinical.vo.TTODetailsIFVo create(ims.edischarge.domain.objects.TTAMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.edischarge.domain.objects.TTAMedication object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.clinical.vo.TTODetailsIFVo create(DomainObjectMap map, ims.edischarge.domain.objects.TTAMedication domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.clinical.vo.TTODetailsIFVo valueObject = (ims.clinical.vo.TTODetailsIFVo) map.getValueObject(domainObject, ims.clinical.vo.TTODetailsIFVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.clinical.vo.TTODetailsIFVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.edischarge.domain.objects.TTAMedication
	 */
	 public static ims.clinical.vo.TTODetailsIFVo insert(ims.clinical.vo.TTODetailsIFVo valueObject, ims.edischarge.domain.objects.TTAMedication domainObject) 
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
	 * @param domainObject ims.edischarge.domain.objects.TTAMedication
	 */
	 public static ims.clinical.vo.TTODetailsIFVo insert(DomainObjectMap map, ims.clinical.vo.TTODetailsIFVo valueObject, ims.edischarge.domain.objects.TTAMedication domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TTAMedication(domainObject.getId());
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
			
		// Medication
		valueObject.setMedication(domainObject.getMedication());
		// DateDispensed
		java.util.Date DateDispensed = domainObject.getDateDispensed();
		if ( null != DateDispensed ) 
		{
			valueObject.setDateDispensed(new ims.framework.utils.DateTime(DateDispensed) );
		}
		// DoseAmount
		valueObject.setDoseAmount(domainObject.getDoseAmount());
		// DoseUnit
		ims.domain.lookups.LookupInstance instance4 = domainObject.getDoseUnit();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicationDoseUnit voLookup4 = new ims.core.vo.lookups.MedicationDoseUnit(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationDoseUnit parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.core.vo.lookups.MedicationDoseUnit(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setDoseUnit(voLookup4);
		}
				// DaysSupply
		valueObject.setDaysSupply(domainObject.getDaysSupply());
		// Frequency
		valueObject.setFrequency(domainObject.getFrequency());
		// GpToContinue
		ims.domain.lookups.LookupInstance instance7 = domainObject.getGpToContinue();
		if ( null != instance7 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance7.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance7.getImage().getImageId(), instance7.getImage().getImagePath());
			}
			color = instance7.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.YesNo voLookup7 = new ims.core.vo.lookups.YesNo(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.core.vo.lookups.YesNo parentVoLookup7 = voLookup7;
			ims.domain.lookups.LookupInstance parent7 = instance7.getParent();
			while (parent7 != null)
			{
				if (parent7.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent7.getImage().getImageId(), parent7.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent7.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup7.setParent(new ims.core.vo.lookups.YesNo(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setGpToContinue(voLookup7);
		}
				// Route
		ims.domain.lookups.LookupInstance instance8 = domainObject.getRoute();
		if ( null != instance8 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance8.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance8.getImage().getImageId(), instance8.getImage().getImagePath());
			}
			color = instance8.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.MedicationRoute voLookup8 = new ims.core.vo.lookups.MedicationRoute(instance8.getId(),instance8.getText(), instance8.isActive(), null, img, color);
			ims.core.vo.lookups.MedicationRoute parentVoLookup8 = voLookup8;
			ims.domain.lookups.LookupInstance parent8 = instance8.getParent();
			while (parent8 != null)
			{
				if (parent8.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent8.getImage().getImageId(), parent8.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent8.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup8.setParent(new ims.core.vo.lookups.MedicationRoute(parent8.getId(),parent8.getText(), parent8.isActive(), null, img, color));
				parentVoLookup8 = parentVoLookup8.getParent();
								parent8 = parent8.getParent();
			}			
			valueObject.setRoute(voLookup8);
		}
				// MedComments
		valueObject.setMedComments(ims.clinical.vo.domain.TTANoteVoAssembler.createTTANoteVoCollectionFromTTANote(map, domainObject.getMedComments()) );
		// SortOrder
		valueObject.setSortOrder(domainObject.getSortOrder());
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.edischarge.domain.objects.TTAMedication extractTTAMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTODetailsIFVo valueObject) 
	{
		return 	extractTTAMedication(domainFactory, valueObject, new HashMap());
	}

	public static ims.edischarge.domain.objects.TTAMedication extractTTAMedication(ims.domain.ILightweightDomainFactory domainFactory, ims.clinical.vo.TTODetailsIFVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TTAMedication();
		ims.edischarge.domain.objects.TTAMedication domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedication)domMap.get(valueObject);
			}
			// ims.clinical.vo.TTODetailsIFVo ID_TTAMedication field is unknown
			domainObject = new ims.edischarge.domain.objects.TTAMedication();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TTAMedication());
			if (domMap.get(key) != null)
			{
				return (ims.edischarge.domain.objects.TTAMedication)domMap.get(key);
			}
			domainObject = (ims.edischarge.domain.objects.TTAMedication) domainFactory.getDomainObject(ims.edischarge.domain.objects.TTAMedication.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TTAMedication());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getMedication() != null && valueObject.getMedication().equals(""))
		{
			valueObject.setMedication(null);
		}
		domainObject.setMedication(valueObject.getMedication());
		ims.framework.utils.DateTime dateTime2 = valueObject.getDateDispensed();
		java.util.Date value2 = null;
		if ( dateTime2 != null ) 
		{
			value2 = dateTime2.getJavaDate();
		}
		domainObject.setDateDispensed(value2);
		domainObject.setDoseAmount(valueObject.getDoseAmount());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getDoseUnit() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getDoseUnit().getID());
		}
		domainObject.setDoseUnit(value4);
		domainObject.setDaysSupply(valueObject.getDaysSupply());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getFrequency() != null && valueObject.getFrequency().equals(""))
		{
			valueObject.setFrequency(null);
		}
		domainObject.setFrequency(valueObject.getFrequency());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getGpToContinue() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getGpToContinue().getID());
		}
		domainObject.setGpToContinue(value7);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value8 = null;
		if ( null != valueObject.getRoute() ) 
		{
			value8 =
				domainFactory.getLookupInstance(valueObject.getRoute().getID());
		}
		domainObject.setRoute(value8);
		domainObject.setMedComments(ims.clinical.vo.domain.TTANoteVoAssembler.extractTTANoteList(domainFactory, valueObject.getMedComments(), domainObject.getMedComments(), domMap));		
		domainObject.setSortOrder(valueObject.getSortOrder());

		return domainObject;
	}

}
