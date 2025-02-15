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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.ocrr.vo;

/**
 * Linked to OCRR.OrderingResults.PACSLaunchAudit business object (ID: 1070100024).
 */
public class PACSLaunchAuditVo extends ims.ocrr.orderingresults.vo.PACSLaunchAuditRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PACSLaunchAuditVo()
	{
	}
	public PACSLaunchAuditVo(Integer id, int version)
	{
		super(id, version);
	}
	public PACSLaunchAuditVo(ims.ocrr.vo.beans.PACSLaunchAuditVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.accessionno = bean.getAccessionNo();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.launchinguser = bean.getLaunchingUser() == null ? null : new ims.core.resource.people.vo.MemberOfStaffRefVo(new Integer(bean.getLaunchingUser().getId()), bean.getLaunchingUser().getVersion());
		this.launchdatetime = bean.getLaunchDateTime() == null ? null : bean.getLaunchDateTime().buildDateTime();
		this.pacsclienttype = bean.getPACSClientType() == null ? null : ims.core.vo.lookups.PACSClientType.buildLookup(bean.getPACSClientType());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.beans.PACSLaunchAuditVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.accessionno = bean.getAccessionNo();
		this.patient = bean.getPatient() == null ? null : new ims.core.patient.vo.PatientRefVo(new Integer(bean.getPatient().getId()), bean.getPatient().getVersion());
		this.launchinguser = bean.getLaunchingUser() == null ? null : new ims.core.resource.people.vo.MemberOfStaffRefVo(new Integer(bean.getLaunchingUser().getId()), bean.getLaunchingUser().getVersion());
		this.launchdatetime = bean.getLaunchDateTime() == null ? null : bean.getLaunchDateTime().buildDateTime();
		this.pacsclienttype = bean.getPACSClientType() == null ? null : ims.core.vo.lookups.PACSClientType.buildLookup(bean.getPACSClientType());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.beans.PACSLaunchAuditVoBean bean = null;
		if(map != null)
			bean = (ims.ocrr.vo.beans.PACSLaunchAuditVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.ocrr.vo.beans.PACSLaunchAuditVoBean();
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
		if(fieldName.equals("ACCESSIONNO"))
			return getAccessionNo();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("LAUNCHINGUSER"))
			return getLaunchingUser();
		if(fieldName.equals("LAUNCHDATETIME"))
			return getLaunchDateTime();
		if(fieldName.equals("PACSCLIENTTYPE"))
			return getPACSClientType();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAccessionNoIsNotNull()
	{
		return this.accessionno != null;
	}
	public String getAccessionNo()
	{
		return this.accessionno;
	}
	public static int getAccessionNoMaxLength()
	{
		return 25;
	}
	public void setAccessionNo(String value)
	{
		this.isValidated = false;
		this.accessionno = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.patient.vo.PatientRefVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.patient.vo.PatientRefVo value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getLaunchingUserIsNotNull()
	{
		return this.launchinguser != null;
	}
	public ims.core.resource.people.vo.MemberOfStaffRefVo getLaunchingUser()
	{
		return this.launchinguser;
	}
	public void setLaunchingUser(ims.core.resource.people.vo.MemberOfStaffRefVo value)
	{
		this.isValidated = false;
		this.launchinguser = value;
	}
	public boolean getLaunchDateTimeIsNotNull()
	{
		return this.launchdatetime != null;
	}
	public ims.framework.utils.DateTime getLaunchDateTime()
	{
		return this.launchdatetime;
	}
	public void setLaunchDateTime(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.launchdatetime = value;
	}
	public boolean getPACSClientTypeIsNotNull()
	{
		return this.pacsclienttype != null;
	}
	public ims.core.vo.lookups.PACSClientType getPACSClientType()
	{
		return this.pacsclienttype;
	}
	public void setPACSClientType(ims.core.vo.lookups.PACSClientType value)
	{
		this.isValidated = false;
		this.pacsclienttype = value;
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
		if(this.accessionno == null || this.accessionno.length() == 0)
			listOfErrors.add("AccessionNo is mandatory");
		else if(this.accessionno.length() > 25)
			listOfErrors.add("The length of the field [accessionno] in the value object [ims.ocrr.vo.PACSLaunchAuditVo] is too big. It should be less or equal to 25");
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.launchinguser == null)
			listOfErrors.add("LaunchingUser is mandatory");
		if(this.launchdatetime == null)
			listOfErrors.add("LaunchDateTime is mandatory");
		if(this.pacsclienttype == null)
			listOfErrors.add("PACSClientType is mandatory");
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
	
		PACSLaunchAuditVo clone = new PACSLaunchAuditVo(this.id, this.version);
		
		clone.accessionno = this.accessionno;
		clone.patient = this.patient;
		clone.launchinguser = this.launchinguser;
		if(this.launchdatetime == null)
			clone.launchdatetime = null;
		else
			clone.launchdatetime = (ims.framework.utils.DateTime)this.launchdatetime.clone();
		if(this.pacsclienttype == null)
			clone.pacsclienttype = null;
		else
			clone.pacsclienttype = (ims.core.vo.lookups.PACSClientType)this.pacsclienttype.clone();
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
		if (!(PACSLaunchAuditVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PACSLaunchAuditVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PACSLaunchAuditVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PACSLaunchAuditVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.accessionno != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.launchinguser != null)
			count++;
		if(this.launchdatetime != null)
			count++;
		if(this.pacsclienttype != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected String accessionno;
	protected ims.core.patient.vo.PatientRefVo patient;
	protected ims.core.resource.people.vo.MemberOfStaffRefVo launchinguser;
	protected ims.framework.utils.DateTime launchdatetime;
	protected ims.core.vo.lookups.PACSClientType pacsclienttype;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
