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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author George Cristian Josan
 */
public class ClinicalOutcomeVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeVo copy(ims.RefMan.vo.ClinicalOutcomeVo valueObjectDest, ims.RefMan.vo.ClinicalOutcomeVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_ClinicalOutcome(valueObjectSrc.getID_ClinicalOutcome());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CatsReferral
		valueObjectDest.setCatsReferral(valueObjectSrc.getCatsReferral());
		// AuthoringInformation
		valueObjectDest.setAuthoringInformation(valueObjectSrc.getAuthoringInformation());
		// ActionComments
		valueObjectDest.setActionComments(valueObjectSrc.getActionComments());
		// ClinicalOutcome
		valueObjectDest.setClinicalOutcome(valueObjectSrc.getClinicalOutcome());
		// Date
		valueObjectDest.setDate(valueObjectSrc.getDate());
		// Procedure
		valueObjectDest.setProcedure(valueObjectSrc.getProcedure());
		// ClinicalOutcomeContext
		valueObjectDest.setClinicalOutcomeContext(valueObjectSrc.getClinicalOutcomeContext());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createClinicalOutcomeVoCollectionFromClinicalOutcome(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeVoCollection createClinicalOutcomeVoCollectionFromClinicalOutcome(java.util.Set domainObjectSet)	
	{
		return createClinicalOutcomeVoCollectionFromClinicalOutcome(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeVoCollection createClinicalOutcomeVoCollectionFromClinicalOutcome(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.ClinicalOutcomeVoCollection voList = new ims.RefMan.vo.ClinicalOutcomeVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = (ims.RefMan.domain.objects.ClinicalOutcome) iterator.next();
			ims.RefMan.vo.ClinicalOutcomeVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeVoCollection createClinicalOutcomeVoCollectionFromClinicalOutcome(java.util.List domainObjectList) 
	{
		return createClinicalOutcomeVoCollectionFromClinicalOutcome(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.ClinicalOutcome objects.
	 */
	public static ims.RefMan.vo.ClinicalOutcomeVoCollection createClinicalOutcomeVoCollectionFromClinicalOutcome(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.ClinicalOutcomeVoCollection voList = new ims.RefMan.vo.ClinicalOutcomeVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = (ims.RefMan.domain.objects.ClinicalOutcome) domainObjectList.get(i);
			ims.RefMan.vo.ClinicalOutcomeVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.ClinicalOutcome set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractClinicalOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeVoCollection voCollection) 
	 {
	 	return extractClinicalOutcomeSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractClinicalOutcomeSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ClinicalOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = ClinicalOutcomeVoAssembler.extractClinicalOutcome(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.ClinicalOutcome list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractClinicalOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeVoCollection voCollection) 
	 {
	 	return extractClinicalOutcomeList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractClinicalOutcomeList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.ClinicalOutcomeVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.ClinicalOutcome domainObject = ClinicalOutcomeVoAssembler.extractClinicalOutcome(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.ClinicalOutcome object.
	 * @param domainObject ims.RefMan.domain.objects.ClinicalOutcome
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeVo create(ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.ClinicalOutcome object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.ClinicalOutcomeVo create(DomainObjectMap map, ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.ClinicalOutcomeVo valueObject = (ims.RefMan.vo.ClinicalOutcomeVo) map.getValueObject(domainObject, ims.RefMan.vo.ClinicalOutcomeVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.ClinicalOutcomeVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.ClinicalOutcome
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeVo insert(ims.RefMan.vo.ClinicalOutcomeVo valueObject, ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.ClinicalOutcome
	 */
	 public static ims.RefMan.vo.ClinicalOutcomeVo insert(DomainObjectMap map, ims.RefMan.vo.ClinicalOutcomeVo valueObject, ims.RefMan.domain.objects.ClinicalOutcome domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_ClinicalOutcome(domainObject.getId());
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
			
		// CatsReferral
		if (domainObject.getCatsReferral() != null)
		{
			if(domainObject.getCatsReferral() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getCatsReferral();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(id, -1));				
			}
			else
			{
				valueObject.setCatsReferral(new ims.RefMan.vo.CatsReferralRefVo(domainObject.getCatsReferral().getId(), domainObject.getCatsReferral().getVersion()));
			}
		}
		// AuthoringInformation
		valueObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInformation()) );
		// ActionComments
		valueObject.setActionComments(domainObject.getActionComments());
		// ClinicalOutcome
		valueObject.setClinicalOutcome(ims.clinicaladmin.vo.domain.ClinicalOutcomeConfigLiteVoAssembler.create(map, domainObject.getClinicalOutcome()) );
		// Date
		java.util.Date Date = domainObject.getDate();
		if ( null != Date ) 
		{
			valueObject.setDate(new ims.framework.utils.Date(Date) );
		}
		// Procedure
		valueObject.setProcedure(ims.RefMan.vo.domain.ClinicalOutcomeProcedureVoAssembler.create(map, domainObject.getProcedure()) );
		// ClinicalOutcomeContext
		ims.domain.lookups.LookupInstance instance7 = domainObject.getClinicalOutcomeContext();
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

			ims.RefMan.vo.lookups.ClinicalOutcomeContext voLookup7 = new ims.RefMan.vo.lookups.ClinicalOutcomeContext(instance7.getId(),instance7.getText(), instance7.isActive(), null, img, color);
			ims.RefMan.vo.lookups.ClinicalOutcomeContext parentVoLookup7 = voLookup7;
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
								parentVoLookup7.setParent(new ims.RefMan.vo.lookups.ClinicalOutcomeContext(parent7.getId(),parent7.getText(), parent7.isActive(), null, img, color));
				parentVoLookup7 = parentVoLookup7.getParent();
								parent7 = parent7.getParent();
			}			
			valueObject.setClinicalOutcomeContext(voLookup7);
		}
		 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.ClinicalOutcome extractClinicalOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeVo valueObject) 
	{
		return 	extractClinicalOutcome(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.ClinicalOutcome extractClinicalOutcome(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.ClinicalOutcomeVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_ClinicalOutcome();
		ims.RefMan.domain.objects.ClinicalOutcome domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.ClinicalOutcome)domMap.get(valueObject);
			}
			// ims.RefMan.vo.ClinicalOutcomeVo ID_ClinicalOutcome field is unknown
			domainObject = new ims.RefMan.domain.objects.ClinicalOutcome();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_ClinicalOutcome());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.ClinicalOutcome)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.ClinicalOutcome) domainFactory.getDomainObject(ims.RefMan.domain.objects.ClinicalOutcome.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_ClinicalOutcome());

		ims.RefMan.domain.objects.CatsReferral value1 = null;
		if ( null != valueObject.getCatsReferral() ) 
		{
			if (valueObject.getCatsReferral().getBoId() == null)
			{
				if (domMap.get(valueObject.getCatsReferral()) != null)
				{
					value1 = (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject.getCatsReferral());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCatsReferral();	
			}
			else
			{
				value1 = (ims.RefMan.domain.objects.CatsReferral)domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, valueObject.getCatsReferral().getBoId());
			}
		}
		domainObject.setCatsReferral(value1);
		domainObject.setAuthoringInformation(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInformation(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getActionComments() != null && valueObject.getActionComments().equals(""))
		{
			valueObject.setActionComments(null);
		}
		domainObject.setActionComments(valueObject.getActionComments());
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig value4 = null;
		if ( null != valueObject.getClinicalOutcome() ) 
		{
			if (valueObject.getClinicalOutcome().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalOutcome()) != null)
				{
					value4 = (ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig)domMap.get(valueObject.getClinicalOutcome());
				}
			}
			else
			{
				value4 = (ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig)domainFactory.getDomainObject(ims.clinical.configuration.domain.objects.ClinicalOutcomeConfig.class, valueObject.getClinicalOutcome().getBoId());
			}
		}
		domainObject.setClinicalOutcome(value4);
		java.util.Date value5 = null;
		ims.framework.utils.Date date5 = valueObject.getDate();		
		if ( date5 != null ) 
		{
			value5 = date5.getDate();
		}
		domainObject.setDate(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.clinical.domain.objects.IntraOperativeCareRecord value6 = null;
		if ( null != valueObject.getProcedure() ) 
		{
			if (valueObject.getProcedure().getBoId() == null)
			{
				if (domMap.get(valueObject.getProcedure()) != null)
				{
					value6 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domMap.get(valueObject.getProcedure());
				}
			}
			else
			{
				value6 = (ims.core.clinical.domain.objects.IntraOperativeCareRecord)domainFactory.getDomainObject(ims.core.clinical.domain.objects.IntraOperativeCareRecord.class, valueObject.getProcedure().getBoId());
			}
		}
		domainObject.setProcedure(value6);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value7 = null;
		if ( null != valueObject.getClinicalOutcomeContext() ) 
		{
			value7 =
				domainFactory.getLookupInstance(valueObject.getClinicalOutcomeContext().getID());
		}
		domainObject.setClinicalOutcomeContext(value7);

		return domainObject;
	}

}
