// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.vo.beans;

public class PatientElectiveListBedAdmissionVoBean extends ims.vo.ValueObjectBean
{
	public PatientElectiveListBedAdmissionVoBean()
	{
	}
	public PatientElectiveListBedAdmissionVoBean(ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.electivelist = vo.getElectiveList() == null ? null : (ims.RefMan.vo.beans.ElectiveListConfigurationLiteVoBean)vo.getElectiveList().getBean();
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean();
		this.bed = vo.getBed();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultant().getBean();
		this.anticipatedstay = vo.getAnticipatedStay();
		this.tcidetails = vo.getTCIDetails() == null ? null : (ims.ccosched.vo.beans.TCIForPatientElectiveListBedInfoDetailsVoBean)vo.getTCIDetails().getBean();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientLite_IdentifiersVoBean)vo.getPatient().getBean();
		this.electiveliststatus = vo.getElectiveListStatus() == null ? null : (ims.RefMan.vo.beans.ElectiveListStatusVoBean)vo.getElectiveListStatus().getBean();
		if(vo.getElectiveListStatusHistory() != null)
		{
			this.electiveliststatushistory = new ims.vo.RefVoBean[vo.getElectiveListStatusHistory().size()];
			for(int electiveliststatushistory_i = 0; electiveliststatushistory_i < vo.getElectiveListStatusHistory().size(); electiveliststatushistory_i++)
			{
				this.electiveliststatushistory[electiveliststatushistory_i] = new ims.vo.RefVoBean(vo.getElectiveListStatusHistory().get(electiveliststatushistory_i).getBoId(),vo.getElectiveListStatusHistory().get(electiveliststatushistory_i).getBoVersion());
			}
		}
		this.electivelistreason = vo.getElectiveListReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getElectiveListReason().getBean();
		this.referral = vo.getReferral() == null ? null : (ims.RefMan.vo.beans.CATSReferralWithContextPasVoBean)vo.getReferral().getBean();
		this.erod = vo.getEROD() == null ? null : (ims.RefMan.vo.beans.ReferralErodForCancellationVoBean)vo.getEROD().getBean();
		if(vo.getERODHistory() != null)
		{
			this.erodhistory = new ims.vo.RefVoBean[vo.getERODHistory().size()];
			for(int erodhistory_i = 0; erodhistory_i < vo.getERODHistory().size(); erodhistory_i++)
			{
				this.erodhistory[erodhistory_i] = new ims.vo.RefVoBean(vo.getERODHistory().get(erodhistory_i).getBoId(),vo.getERODHistory().get(erodhistory_i).getBoVersion());
			}
		}
		this.pathwayclock = vo.getPathwayClock() == null ? null : (ims.pathways.vo.beans.PathwayClockVoBean)vo.getPathwayClock().getBean();
		this.dateonlist = vo.getDateOnList() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOnList().getBean();
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getPrimaryProcedure().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.electivelist = vo.getElectiveList() == null ? null : (ims.RefMan.vo.beans.ElectiveListConfigurationLiteVoBean)vo.getElectiveList().getBean(map);
		this.ward = vo.getWard() == null ? null : (ims.core.vo.beans.LocationLiteVoBean)vo.getWard().getBean(map);
		this.bed = vo.getBed();
		this.consultant = vo.getConsultant() == null ? null : (ims.core.vo.beans.HcpLiteVoBean)vo.getConsultant().getBean(map);
		this.anticipatedstay = vo.getAnticipatedStay();
		this.tcidetails = vo.getTCIDetails() == null ? null : (ims.ccosched.vo.beans.TCIForPatientElectiveListBedInfoDetailsVoBean)vo.getTCIDetails().getBean(map);
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientLite_IdentifiersVoBean)vo.getPatient().getBean(map);
		this.electiveliststatus = vo.getElectiveListStatus() == null ? null : (ims.RefMan.vo.beans.ElectiveListStatusVoBean)vo.getElectiveListStatus().getBean(map);
		if(vo.getElectiveListStatusHistory() != null)
		{
			this.electiveliststatushistory = new ims.vo.RefVoBean[vo.getElectiveListStatusHistory().size()];
			for(int electiveliststatushistory_i = 0; electiveliststatushistory_i < vo.getElectiveListStatusHistory().size(); electiveliststatushistory_i++)
			{
				this.electiveliststatushistory[electiveliststatushistory_i] = new ims.vo.RefVoBean(vo.getElectiveListStatusHistory().get(electiveliststatushistory_i).getBoId(),vo.getElectiveListStatusHistory().get(electiveliststatushistory_i).getBoVersion());
			}
		}
		this.electivelistreason = vo.getElectiveListReason() == null ? null : (ims.vo.LookupInstanceBean)vo.getElectiveListReason().getBean();
		this.referral = vo.getReferral() == null ? null : (ims.RefMan.vo.beans.CATSReferralWithContextPasVoBean)vo.getReferral().getBean(map);
		this.erod = vo.getEROD() == null ? null : (ims.RefMan.vo.beans.ReferralErodForCancellationVoBean)vo.getEROD().getBean(map);
		if(vo.getERODHistory() != null)
		{
			this.erodhistory = new ims.vo.RefVoBean[vo.getERODHistory().size()];
			for(int erodhistory_i = 0; erodhistory_i < vo.getERODHistory().size(); erodhistory_i++)
			{
				this.erodhistory[erodhistory_i] = new ims.vo.RefVoBean(vo.getERODHistory().get(erodhistory_i).getBoId(),vo.getERODHistory().get(erodhistory_i).getBoVersion());
			}
		}
		this.pathwayclock = vo.getPathwayClock() == null ? null : (ims.pathways.vo.beans.PathwayClockVoBean)vo.getPathwayClock().getBean(map);
		this.dateonlist = vo.getDateOnList() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOnList().getBean();
		this.primaryprocedure = vo.getPrimaryProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getPrimaryProcedure().getBean(map);
	}

	public ims.RefMan.vo.PatientElectiveListBedAdmissionVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.RefMan.vo.PatientElectiveListBedAdmissionVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.PatientElectiveListBedAdmissionVo vo = null;
		if(map != null)
			vo = (ims.RefMan.vo.PatientElectiveListBedAdmissionVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.RefMan.vo.PatientElectiveListBedAdmissionVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.RefMan.vo.beans.ElectiveListConfigurationLiteVoBean getElectiveList()
	{
		return this.electivelist;
	}
	public void setElectiveList(ims.RefMan.vo.beans.ElectiveListConfigurationLiteVoBean value)
	{
		this.electivelist = value;
	}
	public ims.core.vo.beans.LocationLiteVoBean getWard()
	{
		return this.ward;
	}
	public void setWard(ims.core.vo.beans.LocationLiteVoBean value)
	{
		this.ward = value;
	}
	public String getBed()
	{
		return this.bed;
	}
	public void setBed(String value)
	{
		this.bed = value;
	}
	public ims.core.vo.beans.HcpLiteVoBean getConsultant()
	{
		return this.consultant;
	}
	public void setConsultant(ims.core.vo.beans.HcpLiteVoBean value)
	{
		this.consultant = value;
	}
	public Integer getAnticipatedStay()
	{
		return this.anticipatedstay;
	}
	public void setAnticipatedStay(Integer value)
	{
		this.anticipatedstay = value;
	}
	public ims.ccosched.vo.beans.TCIForPatientElectiveListBedInfoDetailsVoBean getTCIDetails()
	{
		return this.tcidetails;
	}
	public void setTCIDetails(ims.ccosched.vo.beans.TCIForPatientElectiveListBedInfoDetailsVoBean value)
	{
		this.tcidetails = value;
	}
	public ims.core.vo.beans.PatientLite_IdentifiersVoBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientLite_IdentifiersVoBean value)
	{
		this.patient = value;
	}
	public ims.RefMan.vo.beans.ElectiveListStatusVoBean getElectiveListStatus()
	{
		return this.electiveliststatus;
	}
	public void setElectiveListStatus(ims.RefMan.vo.beans.ElectiveListStatusVoBean value)
	{
		this.electiveliststatus = value;
	}
	public ims.vo.RefVoBean[] getElectiveListStatusHistory()
	{
		return this.electiveliststatushistory;
	}
	public void setElectiveListStatusHistory(ims.vo.RefVoBean[] value)
	{
		this.electiveliststatushistory = value;
	}
	public ims.vo.LookupInstanceBean getElectiveListReason()
	{
		return this.electivelistreason;
	}
	public void setElectiveListReason(ims.vo.LookupInstanceBean value)
	{
		this.electivelistreason = value;
	}
	public ims.RefMan.vo.beans.CATSReferralWithContextPasVoBean getReferral()
	{
		return this.referral;
	}
	public void setReferral(ims.RefMan.vo.beans.CATSReferralWithContextPasVoBean value)
	{
		this.referral = value;
	}
	public ims.RefMan.vo.beans.ReferralErodForCancellationVoBean getEROD()
	{
		return this.erod;
	}
	public void setEROD(ims.RefMan.vo.beans.ReferralErodForCancellationVoBean value)
	{
		this.erod = value;
	}
	public ims.vo.RefVoBean[] getERODHistory()
	{
		return this.erodhistory;
	}
	public void setERODHistory(ims.vo.RefVoBean[] value)
	{
		this.erodhistory = value;
	}
	public ims.pathways.vo.beans.PathwayClockVoBean getPathwayClock()
	{
		return this.pathwayclock;
	}
	public void setPathwayClock(ims.pathways.vo.beans.PathwayClockVoBean value)
	{
		this.pathwayclock = value;
	}
	public ims.framework.utils.beans.DateBean getDateOnList()
	{
		return this.dateonlist;
	}
	public void setDateOnList(ims.framework.utils.beans.DateBean value)
	{
		this.dateonlist = value;
	}
	public ims.core.vo.beans.ProcedureLiteVoBean getPrimaryProcedure()
	{
		return this.primaryprocedure;
	}
	public void setPrimaryProcedure(ims.core.vo.beans.ProcedureLiteVoBean value)
	{
		this.primaryprocedure = value;
	}

	private Integer id;
	private int version;
	private ims.RefMan.vo.beans.ElectiveListConfigurationLiteVoBean electivelist;
	private ims.core.vo.beans.LocationLiteVoBean ward;
	private String bed;
	private ims.core.vo.beans.HcpLiteVoBean consultant;
	private Integer anticipatedstay;
	private ims.ccosched.vo.beans.TCIForPatientElectiveListBedInfoDetailsVoBean tcidetails;
	private ims.core.vo.beans.PatientLite_IdentifiersVoBean patient;
	private ims.RefMan.vo.beans.ElectiveListStatusVoBean electiveliststatus;
	private ims.vo.RefVoBean[] electiveliststatushistory;
	private ims.vo.LookupInstanceBean electivelistreason;
	private ims.RefMan.vo.beans.CATSReferralWithContextPasVoBean referral;
	private ims.RefMan.vo.beans.ReferralErodForCancellationVoBean erod;
	private ims.vo.RefVoBean[] erodhistory;
	private ims.pathways.vo.beans.PathwayClockVoBean pathwayclock;
	private ims.framework.utils.beans.DateBean dateonlist;
	private ims.core.vo.beans.ProcedureLiteVoBean primaryprocedure;
}
