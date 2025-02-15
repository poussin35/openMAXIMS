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

package ims.clinical.vo;

/**
 * Linked to core.clinical.Clinical Notes business object (ID: 1011100000).
 */
public class ExtendedClinicalNotesFilterVo extends ims.core.clinical.vo.ClinicalNotesRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ExtendedClinicalNotesFilterVo()
	{
	}
	public ExtendedClinicalNotesFilterVo(Integer id, int version)
	{
		super(id, version);
	}
	public ExtendedClinicalNotesFilterVo(ims.clinical.vo.beans.ExtendedClinicalNotesFilterVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.discipline = bean.getDiscipline() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getDiscipline());
		this.datefrom = bean.getDateFrom() == null ? null : bean.getDateFrom().buildDateTime();
		this.dateto = bean.getDateTo() == null ? null : bean.getDateTo().buildDateTime();
		this.recordinguser = bean.getRecordingUser() == null ? null : bean.getRecordingUser().buildVo();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.ClinicalNotesStatus.buildLookup(bean.getStatus());
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
		this.forreview = bean.getForReview();
		this.forreviewdiscipline = bean.getForReviewDiscipline() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getForReviewDiscipline());
		this.authoringhcp = bean.getAuthoringHCP() == null ? null : bean.getAuthoringHCP().buildVo();
		this.noteclassification = bean.getNoteClassification() == null ? null : ims.clinical.vo.lookups.ClinicalNoteClassification.buildLookup(bean.getNoteClassification());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.patientnotesonly = bean.getPatientNotesOnly();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.ExtendedClinicalNotesFilterVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.discipline = bean.getDiscipline() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getDiscipline());
		this.datefrom = bean.getDateFrom() == null ? null : bean.getDateFrom().buildDateTime();
		this.dateto = bean.getDateTo() == null ? null : bean.getDateTo().buildDateTime();
		this.recordinguser = bean.getRecordingUser() == null ? null : bean.getRecordingUser().buildVo(map);
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.ClinicalNotesStatus.buildLookup(bean.getStatus());
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
		this.forreview = bean.getForReview();
		this.forreviewdiscipline = bean.getForReviewDiscipline() == null ? null : ims.core.vo.lookups.HcpDisType.buildLookup(bean.getForReviewDiscipline());
		this.authoringhcp = bean.getAuthoringHCP() == null ? null : bean.getAuthoringHCP().buildVo(map);
		this.noteclassification = bean.getNoteClassification() == null ? null : ims.clinical.vo.lookups.ClinicalNoteClassification.buildLookup(bean.getNoteClassification());
		this.carecontext = bean.getCareContext() == null ? null : new ims.core.admin.vo.CareContextRefVo(new Integer(bean.getCareContext().getId()), bean.getCareContext().getVersion());
		this.patientnotesonly = bean.getPatientNotesOnly();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.ExtendedClinicalNotesFilterVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.ExtendedClinicalNotesFilterVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.ExtendedClinicalNotesFilterVoBean();
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
		if(fieldName.equals("DISCIPLINE"))
			return getDiscipline();
		if(fieldName.equals("DATEFROM"))
			return getDateFrom();
		if(fieldName.equals("DATETO"))
			return getDateTo();
		if(fieldName.equals("RECORDINGUSER"))
			return getRecordingUser();
		if(fieldName.equals("STATUS"))
			return getStatus();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		if(fieldName.equals("FORREVIEW"))
			return getForReview();
		if(fieldName.equals("FORREVIEWDISCIPLINE"))
			return getForReviewDiscipline();
		if(fieldName.equals("AUTHORINGHCP"))
			return getAuthoringHCP();
		if(fieldName.equals("NOTECLASSIFICATION"))
			return getNoteClassification();
		if(fieldName.equals("CARECONTEXT"))
			return getCareContext();
		if(fieldName.equals("PATIENTNOTESONLY"))
			return getPatientNotesOnly();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getDisciplineIsNotNull()
	{
		return this.discipline != null;
	}
	public ims.core.vo.lookups.HcpDisType getDiscipline()
	{
		return this.discipline;
	}
	public void setDiscipline(ims.core.vo.lookups.HcpDisType value)
	{
		this.isValidated = false;
		this.discipline = value;
	}
	public boolean getDateFromIsNotNull()
	{
		return this.datefrom != null;
	}
	public ims.framework.utils.DateTime getDateFrom()
	{
		return this.datefrom;
	}
	public void setDateFrom(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.datefrom = value;
	}
	public boolean getDateToIsNotNull()
	{
		return this.dateto != null;
	}
	public ims.framework.utils.DateTime getDateTo()
	{
		return this.dateto;
	}
	public void setDateTo(ims.framework.utils.DateTime value)
	{
		this.isValidated = false;
		this.dateto = value;
	}
	public boolean getRecordingUserIsNotNull()
	{
		return this.recordinguser != null;
	}
	public ims.core.vo.MemberOfStaffShortVo getRecordingUser()
	{
		return this.recordinguser;
	}
	public void setRecordingUser(ims.core.vo.MemberOfStaffShortVo value)
	{
		this.isValidated = false;
		this.recordinguser = value;
	}
	public boolean getStatusIsNotNull()
	{
		return this.status != null;
	}
	public ims.core.vo.lookups.ClinicalNotesStatus getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.core.vo.lookups.ClinicalNotesStatus value)
	{
		this.isValidated = false;
		this.status = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.core.vo.PatientShort getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.PatientShort value)
	{
		this.isValidated = false;
		this.patient = value;
	}
	public boolean getForReviewIsNotNull()
	{
		return this.forreview != null;
	}
	public Boolean getForReview()
	{
		return this.forreview;
	}
	public void setForReview(Boolean value)
	{
		this.isValidated = false;
		this.forreview = value;
	}
	public boolean getForReviewDisciplineIsNotNull()
	{
		return this.forreviewdiscipline != null;
	}
	public ims.core.vo.lookups.HcpDisType getForReviewDiscipline()
	{
		return this.forreviewdiscipline;
	}
	public void setForReviewDiscipline(ims.core.vo.lookups.HcpDisType value)
	{
		this.isValidated = false;
		this.forreviewdiscipline = value;
	}
	public boolean getAuthoringHCPIsNotNull()
	{
		return this.authoringhcp != null;
	}
	public ims.core.vo.Hcp getAuthoringHCP()
	{
		return this.authoringhcp;
	}
	public void setAuthoringHCP(ims.core.vo.Hcp value)
	{
		this.isValidated = false;
		this.authoringhcp = value;
	}
	public boolean getNoteClassificationIsNotNull()
	{
		return this.noteclassification != null;
	}
	public ims.clinical.vo.lookups.ClinicalNoteClassification getNoteClassification()
	{
		return this.noteclassification;
	}
	public void setNoteClassification(ims.clinical.vo.lookups.ClinicalNoteClassification value)
	{
		this.isValidated = false;
		this.noteclassification = value;
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
	public boolean getPatientNotesOnlyIsNotNull()
	{
		return this.patientnotesonly != null;
	}
	public Boolean getPatientNotesOnly()
	{
		return this.patientnotesonly;
	}
	public void setPatientNotesOnly(Boolean value)
	{
		this.isValidated = false;
		this.patientnotesonly = value;
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
		if(this.recordinguser != null)
		{
			if(!this.recordinguser.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patient != null)
		{
			if(!this.patient.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.authoringhcp != null)
		{
			if(!this.authoringhcp.isValidated())
			{
				this.isBusy = false;
				return false;
			}
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
		if(this.recordinguser != null)
		{
			String[] listOfOtherErrors = this.recordinguser.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patient != null)
		{
			String[] listOfOtherErrors = this.patient.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.authoringhcp != null)
		{
			String[] listOfOtherErrors = this.authoringhcp.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.carecontext == null)
			listOfErrors.add("CareContext is mandatory");
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
	
		ExtendedClinicalNotesFilterVo clone = new ExtendedClinicalNotesFilterVo(this.id, this.version);
		
		if(this.discipline == null)
			clone.discipline = null;
		else
			clone.discipline = (ims.core.vo.lookups.HcpDisType)this.discipline.clone();
		if(this.datefrom == null)
			clone.datefrom = null;
		else
			clone.datefrom = (ims.framework.utils.DateTime)this.datefrom.clone();
		if(this.dateto == null)
			clone.dateto = null;
		else
			clone.dateto = (ims.framework.utils.DateTime)this.dateto.clone();
		if(this.recordinguser == null)
			clone.recordinguser = null;
		else
			clone.recordinguser = (ims.core.vo.MemberOfStaffShortVo)this.recordinguser.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.ClinicalNotesStatus)this.status.clone();
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.core.vo.PatientShort)this.patient.clone();
		clone.forreview = this.forreview;
		if(this.forreviewdiscipline == null)
			clone.forreviewdiscipline = null;
		else
			clone.forreviewdiscipline = (ims.core.vo.lookups.HcpDisType)this.forreviewdiscipline.clone();
		if(this.authoringhcp == null)
			clone.authoringhcp = null;
		else
			clone.authoringhcp = (ims.core.vo.Hcp)this.authoringhcp.clone();
		if(this.noteclassification == null)
			clone.noteclassification = null;
		else
			clone.noteclassification = (ims.clinical.vo.lookups.ClinicalNoteClassification)this.noteclassification.clone();
		clone.carecontext = this.carecontext;
		clone.patientnotesonly = this.patientnotesonly;
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
		if (!(ExtendedClinicalNotesFilterVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ExtendedClinicalNotesFilterVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ExtendedClinicalNotesFilterVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ExtendedClinicalNotesFilterVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.discipline != null)
			count++;
		if(this.datefrom != null)
			count++;
		if(this.dateto != null)
			count++;
		if(this.recordinguser != null)
			count++;
		if(this.status != null)
			count++;
		if(this.patient != null)
			count++;
		if(this.forreview != null)
			count++;
		if(this.forreviewdiscipline != null)
			count++;
		if(this.authoringhcp != null)
			count++;
		if(this.noteclassification != null)
			count++;
		if(this.carecontext != null)
			count++;
		if(this.patientnotesonly != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.core.vo.lookups.HcpDisType discipline;
	protected ims.framework.utils.DateTime datefrom;
	protected ims.framework.utils.DateTime dateto;
	protected ims.core.vo.MemberOfStaffShortVo recordinguser;
	protected ims.core.vo.lookups.ClinicalNotesStatus status;
	protected ims.core.vo.PatientShort patient;
	protected Boolean forreview;
	protected ims.core.vo.lookups.HcpDisType forreviewdiscipline;
	protected ims.core.vo.Hcp authoringhcp;
	protected ims.clinical.vo.lookups.ClinicalNoteClassification noteclassification;
	protected ims.core.admin.vo.CareContextRefVo carecontext;
	protected Boolean patientnotesonly;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
