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
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class IncludeAlertInDischargeReportsVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.IncludeAlertInDischargeReportsVo copy(ims.core.vo.IncludeAlertInDischargeReportsVo valueObjectDest, ims.core.vo.IncludeAlertInDischargeReportsVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_IncludeAlertInDischargeReport(valueObjectSrc.getID_IncludeAlertInDischargeReport());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// Alert
		valueObjectDest.setAlert(valueObjectSrc.getAlert());
		// IncludeInReport
		valueObjectDest.setIncludeInReport(valueObjectSrc.getIncludeInReport());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IncludeAlertInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAlertInDischargeReportsVoCollection createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(java.util.Set domainObjectSet)	
	{
		return createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.IncludeAlertInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAlertInDischargeReportsVoCollection createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.IncludeAlertInDischargeReportsVoCollection voList = new ims.core.vo.IncludeAlertInDischargeReportsVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject = (ims.core.clinical.domain.objects.IncludeAlertInDischargeReport) iterator.next();
			ims.core.vo.IncludeAlertInDischargeReportsVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IncludeAlertInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAlertInDischargeReportsVoCollection createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(java.util.List domainObjectList) 
	{
		return createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.IncludeAlertInDischargeReport objects.
	 */
	public static ims.core.vo.IncludeAlertInDischargeReportsVoCollection createIncludeAlertInDischargeReportsVoCollectionFromIncludeAlertInDischargeReport(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.IncludeAlertInDischargeReportsVoCollection voList = new ims.core.vo.IncludeAlertInDischargeReportsVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject = (ims.core.clinical.domain.objects.IncludeAlertInDischargeReport) domainObjectList.get(i);
			ims.core.vo.IncludeAlertInDischargeReportsVo vo = create(map, domainObject);

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
	 * Create the ims.core.clinical.domain.objects.IncludeAlertInDischargeReport set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractIncludeAlertInDischargeReportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAlertInDischargeReportsVoCollection voCollection) 
	 {
	 	return extractIncludeAlertInDischargeReportSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractIncludeAlertInDischargeReportSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAlertInDischargeReportsVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IncludeAlertInDischargeReportsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject = IncludeAlertInDischargeReportsVoAssembler.extractIncludeAlertInDischargeReport(domainFactory, vo, domMap);

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
	 * Create the ims.core.clinical.domain.objects.IncludeAlertInDischargeReport list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractIncludeAlertInDischargeReportList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAlertInDischargeReportsVoCollection voCollection) 
	 {
	 	return extractIncludeAlertInDischargeReportList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractIncludeAlertInDischargeReportList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAlertInDischargeReportsVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.IncludeAlertInDischargeReportsVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject = IncludeAlertInDischargeReportsVoAssembler.extractIncludeAlertInDischargeReport(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.clinical.domain.objects.IncludeAlertInDischargeReport object.
	 * @param domainObject ims.core.clinical.domain.objects.IncludeAlertInDischargeReport
	 */
	 public static ims.core.vo.IncludeAlertInDischargeReportsVo create(ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.IncludeAlertInDischargeReport object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.IncludeAlertInDischargeReportsVo create(DomainObjectMap map, ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.IncludeAlertInDischargeReportsVo valueObject = (ims.core.vo.IncludeAlertInDischargeReportsVo) map.getValueObject(domainObject, ims.core.vo.IncludeAlertInDischargeReportsVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.IncludeAlertInDischargeReportsVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.IncludeAlertInDischargeReport
	 */
	 public static ims.core.vo.IncludeAlertInDischargeReportsVo insert(ims.core.vo.IncludeAlertInDischargeReportsVo valueObject, ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject) 
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
	 * @param domainObject ims.core.clinical.domain.objects.IncludeAlertInDischargeReport
	 */
	 public static ims.core.vo.IncludeAlertInDischargeReportsVo insert(DomainObjectMap map, ims.core.vo.IncludeAlertInDischargeReportsVo valueObject, ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_IncludeAlertInDischargeReport(domainObject.getId());
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
		// Alert
		if (domainObject.getAlert() != null)
		{
			if(domainObject.getAlert() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getAlert();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setAlert(new ims.core.clinical.vo.PatientAlertRefVo(id, -1));				
			}
			else
			{
				valueObject.setAlert(new ims.core.clinical.vo.PatientAlertRefVo(domainObject.getAlert().getId(), domainObject.getAlert().getVersion()));
			}
		}
		// IncludeInReport
		valueObject.setIncludeInReport( domainObject.isIncludeInReport() );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.IncludeAlertInDischargeReport extractIncludeAlertInDischargeReport(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAlertInDischargeReportsVo valueObject) 
	{
		return 	extractIncludeAlertInDischargeReport(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.IncludeAlertInDischargeReport extractIncludeAlertInDischargeReport(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.IncludeAlertInDischargeReportsVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_IncludeAlertInDischargeReport();
		ims.core.clinical.domain.objects.IncludeAlertInDischargeReport domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.IncludeAlertInDischargeReport)domMap.get(valueObject);
			}
			// ims.core.vo.IncludeAlertInDischargeReportsVo ID_IncludeAlertInDischargeReport field is unknown
			domainObject = new ims.core.clinical.domain.objects.IncludeAlertInDischargeReport();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_IncludeAlertInDischargeReport());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.IncludeAlertInDischargeReport)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.IncludeAlertInDischargeReport) domainFactory.getDomainObject(ims.core.clinical.domain.objects.IncludeAlertInDischargeReport.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_IncludeAlertInDischargeReport());

		ims.core.admin.domain.objects.CareContext value1 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value1 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value1 = domainObject.getCareContext();	
			}
			else
			{
				value1 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value1);
		ims.core.clinical.domain.objects.PatientAlert value2 = null;
		if ( null != valueObject.getAlert() ) 
		{
			if (valueObject.getAlert().getBoId() == null)
			{
				if (domMap.get(valueObject.getAlert()) != null)
				{
					value2 = (ims.core.clinical.domain.objects.PatientAlert)domMap.get(valueObject.getAlert());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value2 = domainObject.getAlert();	
			}
			else
			{
				value2 = (ims.core.clinical.domain.objects.PatientAlert)domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientAlert.class, valueObject.getAlert().getBoId());
			}
		}
		domainObject.setAlert(value2);
		domainObject.setIncludeInReport(valueObject.getIncludeInReport());

		return domainObject;
	}

}
