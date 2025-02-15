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

package ims.core.vo;

/**
 * Linked to core.clinical.IncludeDiagnosisInDischargeReport business object (ID: 1003100097).
 */
public class IncludeDiagnosisInDischargeReportVo extends ims.core.clinical.vo.IncludeDiagnosisInDischargeReportRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public IncludeDiagnosisInDischargeReportVo()
	{
	}
	public IncludeDiagnosisInDischargeReportVo(Integer id, int version)
	{
		super(id, version);
	}
	public IncludeDiagnosisInDischargeReportVo(ims.core.vo.beans.IncludeDiagnosisInDischargeReportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.diagnosis = bean.getDiagnosis() == null ? null : new ims.core.clinical.vo.PatientDiagnosisRefVo(new Integer(bean.getDiagnosis().getId()), bean.getDiagnosis().getVersion());
		this.includeinreport = bean.getIncludeInReport();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.IncludeDiagnosisInDischargeReportVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.diagnosis = bean.getDiagnosis() == null ? null : new ims.core.clinical.vo.PatientDiagnosisRefVo(new Integer(bean.getDiagnosis().getId()), bean.getDiagnosis().getVersion());
		this.includeinreport = bean.getIncludeInReport();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.IncludeDiagnosisInDischargeReportVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.IncludeDiagnosisInDischargeReportVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.IncludeDiagnosisInDischargeReportVoBean();
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
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("DIAGNOSIS"))
			return getDiagnosis();
		if(fieldName.equals("INCLUDEINREPORT"))
			return getIncludeInReport();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getCareContextIsNotNull()
	{
		return this.carecontext != null;
	}
	public ims.core.admin.vo.CareContextRefVo getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.core.admin.vo.CareContextRefVo value)
	{
		this.isValidated = false;
		this.carecontext = value;
	}
	public boolean getDiagnosisIsNotNull()
	{
		return this.diagnosis != null;
	}
	public ims.core.clinical.vo.PatientDiagnosisRefVo getDiagnosis()
	{
		return this.diagnosis;
	}
	public void setDiagnosis(ims.core.clinical.vo.PatientDiagnosisRefVo value)
	{
		this.isValidated = false;
		this.diagnosis = value;
	}
	public boolean getIncludeInReportIsNotNull()
	{
		return this.includeinreport != null;
	}
	public Boolean getIncludeInReport()
	{
		return this.includeinreport;
	}
	public void setIncludeInReport(Boolean value)
	{
		this.isValidated = false;
		this.includeinreport = value;
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
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
		if(this.diagnosis == null)
			listOfErrors.add("Diagnosis is mandatory");
		if(this.includeinreport == null)
			listOfErrors.add("IncludeInReport is mandatory");
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
	
		IncludeDiagnosisInDischargeReportVo clone = new IncludeDiagnosisInDischargeReportVo(this.id, this.version);
		
		clone.carecontext = this.carecontext;
		clone.diagnosis = this.diagnosis;
		clone.includeinreport = this.includeinreport;
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
		if (!(IncludeDiagnosisInDischargeReportVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A IncludeDiagnosisInDischargeReportVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((IncludeDiagnosisInDischargeReportVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((IncludeDiagnosisInDischargeReportVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.carecontext != null)
			count++;
		if(this.diagnosis != null)
			count++;
		if(this.includeinreport != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected ims.core.clinical.vo.PatientDiagnosisRefVo diagnosis;
	protected Boolean includeinreport;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
