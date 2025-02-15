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
package ims.RefMan.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Cornel Ventuneac
 */
public class CatsReferralERODWithElectiveOnlyVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo copy(ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObjectDest, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_CatsReferral(valueObjectSrc.getID_CatsReferral());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// Journey
		valueObjectDest.setJourney(valueObjectSrc.getJourney());
		// ElectiveEROD
		valueObjectDest.setElectiveEROD(valueObjectSrc.getElectiveEROD());
		// ElectiveERODHistory
		valueObjectDest.setElectiveERODHistory(valueObjectSrc.getElectiveERODHistory());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(java.util.Set domainObjectSet)	
	{
		return createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection voList = new ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) iterator.next();
			ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(java.util.List domainObjectList) 
	{
		return createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.RefMan.domain.objects.CatsReferral objects.
	 */
	public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection createCatsReferralERODWithElectiveOnlyVoCollectionFromCatsReferral(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection voList = new ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.RefMan.domain.objects.CatsReferral domainObject = (ims.RefMan.domain.objects.CatsReferral) domainObjectList.get(i);
			ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo vo = create(map, domainObject);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection voCollection) 
	 {
	 	return extractCatsReferralSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractCatsReferralSet(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralERODWithElectiveOnlyVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ims.RefMan.domain.objects.CatsReferral list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection voCollection) 
	 {
	 	return extractCatsReferralList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractCatsReferralList(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo vo = voCollection.get(i);
			ims.RefMan.domain.objects.CatsReferral domainObject = CatsReferralERODWithElectiveOnlyVoAssembler.extractCatsReferral(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo create(ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.RefMan.domain.objects.CatsReferral object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo create(DomainObjectMap map, ims.RefMan.domain.objects.CatsReferral domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObject = (ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo) map.getValueObject(domainObject, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo insert(ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
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
	 * @param domainObject ims.RefMan.domain.objects.CatsReferral
	 */
	 public static ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo insert(DomainObjectMap map, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObject, ims.RefMan.domain.objects.CatsReferral domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_CatsReferral(domainObject.getId());
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
			
		// Journey
		valueObject.setJourney(ims.RefMan.vo.domain.PatientPathwayJourneyForERODVoAssembler.create(map, domainObject.getJourney()) );
		// ElectiveEROD
		valueObject.setElectiveEROD(ims.RefMan.vo.domain.ReferralERODVoAssembler.createReferralERODVoCollectionFromReferralEROD(map, domainObject.getElectiveEROD()) );
		// ElectiveERODHistory
		valueObject.setElectiveERODHistory(ims.RefMan.vo.domain.ReferralERODVoAssembler.createReferralERODVoCollectionFromReferralEROD(map, domainObject.getElectiveERODHistory()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObject) 
	{
		return 	extractCatsReferral(domainFactory, valueObject, new HashMap());
	}

	public static ims.RefMan.domain.objects.CatsReferral extractCatsReferral(ims.domain.ILightweightDomainFactory domainFactory, ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_CatsReferral();
		ims.RefMan.domain.objects.CatsReferral domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(valueObject);
			}
			// ims.RefMan.vo.CatsReferralERODWithElectiveOnlyVo ID_CatsReferral field is unknown
			domainObject = new ims.RefMan.domain.objects.CatsReferral();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_CatsReferral());
			if (domMap.get(key) != null)
			{
				return (ims.RefMan.domain.objects.CatsReferral)domMap.get(key);
			}
			domainObject = (ims.RefMan.domain.objects.CatsReferral) domainFactory.getDomainObject(ims.RefMan.domain.objects.CatsReferral.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_CatsReferral());

	// SaveAsRefVO - treated as a refVo in extract methods
	ims.pathways.domain.objects.PatientPathwayJourney value1 = null;
		if ( null != valueObject.getJourney() ) 
		{
			if (valueObject.getJourney().getBoId() == null)
			{
				if (domMap.get(valueObject.getJourney()) != null)
				{
					value1 = (ims.pathways.domain.objects.PatientPathwayJourney)domMap.get(valueObject.getJourney());
				}
			}
			else
			{
				value1 = (ims.pathways.domain.objects.PatientPathwayJourney)domainFactory.getDomainObject(ims.pathways.domain.objects.PatientPathwayJourney.class, valueObject.getJourney().getBoId());
			}
		}
		domainObject.setJourney(value1);

		// SaveAsRefVO treated as RefValueObject
		ims.RefMan.vo.ReferralERODRefVoCollection refCollection2 = new ims.RefMan.vo.ReferralERODRefVoCollection();
		if (valueObject.getElectiveEROD() != null)
		{
			for (int i2=0; i2<valueObject.getElectiveEROD().size(); i2++)
			{
				ims.RefMan.vo.ReferralERODRefVo ref2 = (ims.RefMan.vo.ReferralERODRefVo)valueObject.getElectiveEROD().get(i2);
				refCollection2.add(ref2);
			}
		}
		int size2 = (null == refCollection2) ? 0 : refCollection2.size();		
		java.util.List domainElectiveEROD2 = domainObject.getElectiveEROD();
		if (domainElectiveEROD2 == null)
		{
			domainElectiveEROD2 = new java.util.ArrayList();
		}
		for(int i=0; i < size2; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection2.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainElectiveEROD2.indexOf(dom);
			if (domIdx == -1)
			{
				domainElectiveEROD2.add(i, dom);
			}
			else if (i != domIdx && i < domainElectiveEROD2.size())
			{
				Object tmp = domainElectiveEROD2.get(i);
				domainElectiveEROD2.set(i, domainElectiveEROD2.get(domIdx));
				domainElectiveEROD2.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i2 = domainElectiveEROD2.size();
		while (i2 > size2)
		{
			domainElectiveEROD2.remove(i2-1);
			i2 = domainElectiveEROD2.size();
		}
		
		domainObject.setElectiveEROD(domainElectiveEROD2);		

		// SaveAsRefVO treated as RefValueObject
		ims.RefMan.vo.ReferralERODRefVoCollection refCollection3 = new ims.RefMan.vo.ReferralERODRefVoCollection();
		if (valueObject.getElectiveERODHistory() != null)
		{
			for (int i3=0; i3<valueObject.getElectiveERODHistory().size(); i3++)
			{
				ims.RefMan.vo.ReferralERODRefVo ref3 = (ims.RefMan.vo.ReferralERODRefVo)valueObject.getElectiveERODHistory().get(i3);
				refCollection3.add(ref3);
			}
		}
		int size3 = (null == refCollection3) ? 0 : refCollection3.size();		
		java.util.List domainElectiveERODHistory3 = domainObject.getElectiveERODHistory();
		if (domainElectiveERODHistory3 == null)
		{
			domainElectiveERODHistory3 = new java.util.ArrayList();
		}
		for(int i=0; i < size3; i++) 
		{
			ims.RefMan.vo.ReferralERODRefVo vo = refCollection3.get(i);			
			ims.RefMan.domain.objects.ReferralEROD dom = null;
			if ( null != vo ) 
			{
				if (vo.getBoId() == null)
				{
					if (domMap.get(vo) != null)
					{
						dom = (ims.RefMan.domain.objects.ReferralEROD)domMap.get(vo);
					}
				}
				else
				{
					dom = (ims.RefMan.domain.objects.ReferralEROD)domainFactory.getDomainObject( ims.RefMan.domain.objects.ReferralEROD.class, vo.getBoId());
				}
			}

			int domIdx = domainElectiveERODHistory3.indexOf(dom);
			if (domIdx == -1)
			{
				domainElectiveERODHistory3.add(i, dom);
			}
			else if (i != domIdx && i < domainElectiveERODHistory3.size())
			{
				Object tmp = domainElectiveERODHistory3.get(i);
				domainElectiveERODHistory3.set(i, domainElectiveERODHistory3.get(domIdx));
				domainElectiveERODHistory3.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i3 = domainElectiveERODHistory3.size();
		while (i3 > size3)
		{
			domainElectiveERODHistory3.remove(i3-1);
			i3 = domainElectiveERODHistory3.size();
		}
		
		domainObject.setElectiveERODHistory(domainElectiveERODHistory3);		

		return domainObject;
	}

}
