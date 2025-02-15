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

package ims.oncology.vo;

/**
 * Linked to Oncology.Configuration.ChemoRegimensConfig business object (ID: 1075100020).
 */
public class ChemoRegimensConfigVo extends ims.oncology.configuration.vo.ChemoRegimensConfigRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ChemoRegimensConfigVo()
	{
	}
	public ChemoRegimensConfigVo(Integer id, int version)
	{
		super(id, version);
	}
	public ChemoRegimensConfigVo(ims.oncology.vo.beans.ChemoRegimensConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.regimen = bean.getRegimen() == null ? null : ims.oncology.vo.lookups.RegimenAcronym.buildLookup(bean.getRegimen());
		this.procurementcode = bean.getProcurementCode() == null ? null : ims.oncology.vo.lookups.ProcurementCode.buildLookup(bean.getProcurementCode());
		this.dayonedeliverycode = bean.getDayOneDeliveryCode() == null ? null : ims.oncology.vo.lookups.DayOneDeliveryCode.buildLookup(bean.getDayOneDeliveryCode());
		this.deliverycodeallotherdays = bean.getDeliveryCodeAllOtherDays() == null ? null : ims.oncology.vo.lookups.DeliveryCodeAllOtherDays.buildLookup(bean.getDeliveryCodeAllOtherDays());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.regimendescription = bean.getRegimenDescription();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.oncology.vo.beans.ChemoRegimensConfigVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.regimen = bean.getRegimen() == null ? null : ims.oncology.vo.lookups.RegimenAcronym.buildLookup(bean.getRegimen());
		this.procurementcode = bean.getProcurementCode() == null ? null : ims.oncology.vo.lookups.ProcurementCode.buildLookup(bean.getProcurementCode());
		this.dayonedeliverycode = bean.getDayOneDeliveryCode() == null ? null : ims.oncology.vo.lookups.DayOneDeliveryCode.buildLookup(bean.getDayOneDeliveryCode());
		this.deliverycodeallotherdays = bean.getDeliveryCodeAllOtherDays() == null ? null : ims.oncology.vo.lookups.DeliveryCodeAllOtherDays.buildLookup(bean.getDeliveryCodeAllOtherDays());
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getStatus());
		this.regimendescription = bean.getRegimenDescription();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.oncology.vo.beans.ChemoRegimensConfigVoBean bean = null;
		if(map != null)
			bean = (ims.oncology.vo.beans.ChemoRegimensConfigVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.oncology.vo.beans.ChemoRegimensConfigVoBean();
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
		if(fieldName.equals("REGIMEN"))
			return getRegimen();
		if(fieldName.equals("PROCUREMENTCODE"))
			return getProcurementCode();
		if(fieldName.equals("DAYONEDELIVERYCODE"))
			return getDayOneDeliveryCode();
		if(fieldName.equals("DELIVERYCODEALLOTHERDAYS"))
			return getDeliveryCodeAllOtherDays();
		if(fieldName.equals("STATUS"))
			return getStatus();
		if(fieldName.equals("REGIMENDESCRIPTION"))
			return getRegimenDescription();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getRegimenIsNotNull()
	{
		return this.regimen != null;
	}
	public ims.oncology.vo.lookups.RegimenAcronym getRegimen()
	{
		return this.regimen;
	}
	public void setRegimen(ims.oncology.vo.lookups.RegimenAcronym value)
	{
		this.isValidated = false;
		this.regimen = value;
	}
	public boolean getProcurementCodeIsNotNull()
	{
		return this.procurementcode != null;
	}
	public ims.oncology.vo.lookups.ProcurementCode getProcurementCode()
	{
		return this.procurementcode;
	}
	public void setProcurementCode(ims.oncology.vo.lookups.ProcurementCode value)
	{
		this.isValidated = false;
		this.procurementcode = value;
	}
	public boolean getDayOneDeliveryCodeIsNotNull()
	{
		return this.dayonedeliverycode != null;
	}
	public ims.oncology.vo.lookups.DayOneDeliveryCode getDayOneDeliveryCode()
	{
		return this.dayonedeliverycode;
	}
	public void setDayOneDeliveryCode(ims.oncology.vo.lookups.DayOneDeliveryCode value)
	{
		this.isValidated = false;
		this.dayonedeliverycode = value;
	}
	public boolean getDeliveryCodeAllOtherDaysIsNotNull()
	{
		return this.deliverycodeallotherdays != null;
	}
	public ims.oncology.vo.lookups.DeliveryCodeAllOtherDays getDeliveryCodeAllOtherDays()
	{
		return this.deliverycodeallotherdays;
	}
	public void setDeliveryCodeAllOtherDays(ims.oncology.vo.lookups.DeliveryCodeAllOtherDays value)
	{
		this.isValidated = false;
		this.deliverycodeallotherdays = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getRegimenDescriptionIsNotNull()
	{
		return this.regimendescription != null;
	}
	public String getRegimenDescription()
	{
		return this.regimendescription;
	}
	public static int getRegimenDescriptionMaxLength()
	{
		return 70;
	}
	public void setRegimenDescription(String value)
	{
		this.isValidated = false;
		this.regimendescription = value;
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
		if(this.regimen == null)
			listOfErrors.add("Regimen is mandatory");
		if(this.status == null)
			listOfErrors.add("Status is mandatory");
		if(this.regimendescription != null)
			if(this.regimendescription.length() > 70)
				listOfErrors.add("The length of the field [regimendescription] in the value object [ims.oncology.vo.ChemoRegimensConfigVo] is too big. It should be less or equal to 70");
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
	
		ChemoRegimensConfigVo clone = new ChemoRegimensConfigVo(this.id, this.version);
		
		if(this.regimen == null)
			clone.regimen = null;
		else
			clone.regimen = (ims.oncology.vo.lookups.RegimenAcronym)this.regimen.clone();
		if(this.procurementcode == null)
			clone.procurementcode = null;
		else
			clone.procurementcode = (ims.oncology.vo.lookups.ProcurementCode)this.procurementcode.clone();
		if(this.dayonedeliverycode == null)
			clone.dayonedeliverycode = null;
		else
			clone.dayonedeliverycode = (ims.oncology.vo.lookups.DayOneDeliveryCode)this.dayonedeliverycode.clone();
		if(this.deliverycodeallotherdays == null)
			clone.deliverycodeallotherdays = null;
		else
			clone.deliverycodeallotherdays = (ims.oncology.vo.lookups.DeliveryCodeAllOtherDays)this.deliverycodeallotherdays.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.status.clone();
		clone.regimendescription = this.regimendescription;
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
		if (!(ChemoRegimensConfigVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ChemoRegimensConfigVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ChemoRegimensConfigVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ChemoRegimensConfigVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.regimen != null)
			count++;
		if(this.procurementcode != null)
			count++;
		if(this.dayonedeliverycode != null)
			count++;
		if(this.deliverycodeallotherdays != null)
			count++;
		if(this.status != null)
			count++;
		if(this.regimendescription != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.oncology.vo.lookups.RegimenAcronym regimen;
	protected ims.oncology.vo.lookups.ProcurementCode procurementcode;
	protected ims.oncology.vo.lookups.DayOneDeliveryCode dayonedeliverycode;
	protected ims.oncology.vo.lookups.DeliveryCodeAllOtherDays deliverycodeallotherdays;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus status;
	protected String regimendescription;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
