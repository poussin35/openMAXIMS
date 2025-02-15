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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.spinalinjuries.vo;

/**
 * Linked to spinalinjuries.Shared.RespObserv business object (ID: 1024100004).
 */
public class RespExamObs extends ims.spinalinjuries.shared.vo.RespObservRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public RespExamObs()
	{
	}
	public RespExamObs(Integer id, int version)
	{
		super(id, version);
	}
	public RespExamObs(ims.spinalinjuries.vo.beans.RespExamObsBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.observtype = bean.getObservType() == null ? null : ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding.buildLookup(bean.getObservType());
		this.observfind = bean.getObservFind() == null ? null : ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding.buildLookup(bean.getObservFind());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.spinalinjuries.vo.beans.RespExamObsBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.observtype = bean.getObservType() == null ? null : ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding.buildLookup(bean.getObservType());
		this.observfind = bean.getObservFind() == null ? null : ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding.buildLookup(bean.getObservFind());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.spinalinjuries.vo.beans.RespExamObsBean bean = null;
		if(map != null)
			bean = (ims.spinalinjuries.vo.beans.RespExamObsBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.spinalinjuries.vo.beans.RespExamObsBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("OBSERVTYPE"))
			return getObservType();
		if(fieldName.equals("OBSERVFIND"))
			return getObservFind();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getObservTypeIsNotNull()
	{
		return this.observtype != null;
	}
	public ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding getObservType()
	{
		return this.observtype;
	}
	public void setObservType(ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding value)
	{
		this.isValidated = false;
		this.observtype = value;
	}
	public boolean getObservFindIsNotNull()
	{
		return this.observfind != null;
	}
	public ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding getObservFind()
	{
		return this.observfind;
	}
	public void setObservFind(ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding value)
	{
		this.isValidated = false;
		this.observfind = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		RespExamObs clone = new RespExamObs(this.id, this.version);
		
		if(this.observtype == null)
			clone.observtype = null;
		else
			clone.observtype = (ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding)this.observtype.clone();
		if(this.observfind == null)
			clone.observfind = null;
		else
			clone.observfind = (ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding)this.observfind.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(RespExamObs.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A RespExamObs object cannot be compared an Object of type " + obj.getClass().getName());
		}
		RespExamObs compareObj = (RespExamObs)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_RespObserv() == null && compareObj.getID_RespObserv() != null)
				return -1;
			if(this.getID_RespObserv() != null && compareObj.getID_RespObserv() == null)
				return 1;
			if(this.getID_RespObserv() != null && compareObj.getID_RespObserv() != null)
				retVal = this.getID_RespObserv().compareTo(compareObj.getID_RespObserv());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.observtype != null)
			count++;
		if(this.observfind != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding observtype;
	protected ims.spinalinjuries.vo.lookups.RespExamObsTypeFinding observfind;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
