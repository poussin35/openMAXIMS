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

package ims.core.vo.beans;

public class PDSAdvancedSearchResultVoBean extends ims.vo.ValueObjectBean
{
	public PDSAdvancedSearchResultVoBean()
	{
	}
	public PDSAdvancedSearchResultVoBean(ims.core.vo.PDSAdvancedSearchResultVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.nhsnumber = vo.getNHSNumber();
		this.surname = vo.getSurname();
		this.uppersurname = vo.getUpperSurname();
		this.forename = vo.getForename();
		this.upperforename = vo.getUpperForename();
		this.preferredname = vo.getPreferredName();
		this.gender = vo.getGender() == null ? null : (ims.vo.LookupInstanceBean)vo.getGender().getBean();
		this.dateofbirth = vo.getDateOfBirth() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOfBirth().getBean();
		this.dateofdeath = vo.getDateOfDeath() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOfDeath().getBean();
		this.primarycareinfo = vo.getPrimaryCareInfo();
		this.confidentialitycode = vo.getConfidentialityCode();
		this.nhsnumbertype = vo.getNHSNumberType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNHSNumberType().getBean();
		this.title = vo.getTitle() == null ? null : (ims.vo.LookupInstanceBean)vo.getTitle().getBean();
		this.nametype = vo.getNameType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNameType().getBean();
		this.namesuffix = vo.getNamesuffix();
		this.pdsaddresses = vo.getPDSAddresses() == null ? null : vo.getPDSAddresses().getBeanCollection();
		this.pdstellecoms = vo.getPDSTellecoms() == null ? null : vo.getPDSTellecoms().getBeanCollection();
		this.pdserrcreationtime = vo.getPdsErrCreationTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getPdsErrCreationTime().getBean();
		this.pdserrinteractionid = vo.getPdsErrInteractionId();
		this.pdserrprocessingcode = vo.getPdsErrProcessingCode();
		this.pdserrqueryresponsecode = vo.getPdsErrQueryResponseCode();
		this.pdserrid = vo.getPdsErrId();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PDSAdvancedSearchResultVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.nhsnumber = vo.getNHSNumber();
		this.surname = vo.getSurname();
		this.uppersurname = vo.getUpperSurname();
		this.forename = vo.getForename();
		this.upperforename = vo.getUpperForename();
		this.preferredname = vo.getPreferredName();
		this.gender = vo.getGender() == null ? null : (ims.vo.LookupInstanceBean)vo.getGender().getBean();
		this.dateofbirth = vo.getDateOfBirth() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOfBirth().getBean();
		this.dateofdeath = vo.getDateOfDeath() == null ? null : (ims.framework.utils.beans.DateBean)vo.getDateOfDeath().getBean();
		this.primarycareinfo = vo.getPrimaryCareInfo();
		this.confidentialitycode = vo.getConfidentialityCode();
		this.nhsnumbertype = vo.getNHSNumberType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNHSNumberType().getBean();
		this.title = vo.getTitle() == null ? null : (ims.vo.LookupInstanceBean)vo.getTitle().getBean();
		this.nametype = vo.getNameType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNameType().getBean();
		this.namesuffix = vo.getNamesuffix();
		this.pdsaddresses = vo.getPDSAddresses() == null ? null : vo.getPDSAddresses().getBeanCollection();
		this.pdstellecoms = vo.getPDSTellecoms() == null ? null : vo.getPDSTellecoms().getBeanCollection();
		this.pdserrcreationtime = vo.getPdsErrCreationTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getPdsErrCreationTime().getBean();
		this.pdserrinteractionid = vo.getPdsErrInteractionId();
		this.pdserrprocessingcode = vo.getPdsErrProcessingCode();
		this.pdserrqueryresponsecode = vo.getPdsErrQueryResponseCode();
		this.pdserrid = vo.getPdsErrId();
	}

	public ims.core.vo.PDSAdvancedSearchResultVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PDSAdvancedSearchResultVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PDSAdvancedSearchResultVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PDSAdvancedSearchResultVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PDSAdvancedSearchResultVo();
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
	public String getNHSNumber()
	{
		return this.nhsnumber;
	}
	public void setNHSNumber(String value)
	{
		this.nhsnumber = value;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String value)
	{
		this.surname = value;
	}
	public String getUpperSurname()
	{
		return this.uppersurname;
	}
	public void setUpperSurname(String value)
	{
		this.uppersurname = value;
	}
	public String getForename()
	{
		return this.forename;
	}
	public void setForename(String value)
	{
		this.forename = value;
	}
	public String getUpperForename()
	{
		return this.upperforename;
	}
	public void setUpperForename(String value)
	{
		this.upperforename = value;
	}
	public String getPreferredName()
	{
		return this.preferredname;
	}
	public void setPreferredName(String value)
	{
		this.preferredname = value;
	}
	public ims.vo.LookupInstanceBean getGender()
	{
		return this.gender;
	}
	public void setGender(ims.vo.LookupInstanceBean value)
	{
		this.gender = value;
	}
	public ims.framework.utils.beans.DateBean getDateOfBirth()
	{
		return this.dateofbirth;
	}
	public void setDateOfBirth(ims.framework.utils.beans.DateBean value)
	{
		this.dateofbirth = value;
	}
	public ims.framework.utils.beans.DateBean getDateOfDeath()
	{
		return this.dateofdeath;
	}
	public void setDateOfDeath(ims.framework.utils.beans.DateBean value)
	{
		this.dateofdeath = value;
	}
	public String getPrimaryCareInfo()
	{
		return this.primarycareinfo;
	}
	public void setPrimaryCareInfo(String value)
	{
		this.primarycareinfo = value;
	}
	public String getConfidentialityCode()
	{
		return this.confidentialitycode;
	}
	public void setConfidentialityCode(String value)
	{
		this.confidentialitycode = value;
	}
	public ims.vo.LookupInstanceBean getNHSNumberType()
	{
		return this.nhsnumbertype;
	}
	public void setNHSNumberType(ims.vo.LookupInstanceBean value)
	{
		this.nhsnumbertype = value;
	}
	public ims.vo.LookupInstanceBean getTitle()
	{
		return this.title;
	}
	public void setTitle(ims.vo.LookupInstanceBean value)
	{
		this.title = value;
	}
	public ims.vo.LookupInstanceBean getNameType()
	{
		return this.nametype;
	}
	public void setNameType(ims.vo.LookupInstanceBean value)
	{
		this.nametype = value;
	}
	public String getNamesuffix()
	{
		return this.namesuffix;
	}
	public void setNamesuffix(String value)
	{
		this.namesuffix = value;
	}
	public ims.core.vo.beans.PDSAddrVoBean[] getPDSAddresses()
	{
		return this.pdsaddresses;
	}
	public void setPDSAddresses(ims.core.vo.beans.PDSAddrVoBean[] value)
	{
		this.pdsaddresses = value;
	}
	public ims.core.vo.beans.PDSTelecomVoBean[] getPDSTellecoms()
	{
		return this.pdstellecoms;
	}
	public void setPDSTellecoms(ims.core.vo.beans.PDSTelecomVoBean[] value)
	{
		this.pdstellecoms = value;
	}
	public ims.framework.utils.beans.DateTimeBean getPdsErrCreationTime()
	{
		return this.pdserrcreationtime;
	}
	public void setPdsErrCreationTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.pdserrcreationtime = value;
	}
	public String getPdsErrInteractionId()
	{
		return this.pdserrinteractionid;
	}
	public void setPdsErrInteractionId(String value)
	{
		this.pdserrinteractionid = value;
	}
	public String getPdsErrProcessingCode()
	{
		return this.pdserrprocessingcode;
	}
	public void setPdsErrProcessingCode(String value)
	{
		this.pdserrprocessingcode = value;
	}
	public String getPdsErrQueryResponseCode()
	{
		return this.pdserrqueryresponsecode;
	}
	public void setPdsErrQueryResponseCode(String value)
	{
		this.pdserrqueryresponsecode = value;
	}
	public String getPdsErrId()
	{
		return this.pdserrid;
	}
	public void setPdsErrId(String value)
	{
		this.pdserrid = value;
	}

	private Integer id;
	private int version;
	private String nhsnumber;
	private String surname;
	private String uppersurname;
	private String forename;
	private String upperforename;
	private String preferredname;
	private ims.vo.LookupInstanceBean gender;
	private ims.framework.utils.beans.DateBean dateofbirth;
	private ims.framework.utils.beans.DateBean dateofdeath;
	private String primarycareinfo;
	private String confidentialitycode;
	private ims.vo.LookupInstanceBean nhsnumbertype;
	private ims.vo.LookupInstanceBean title;
	private ims.vo.LookupInstanceBean nametype;
	private String namesuffix;
	private ims.core.vo.beans.PDSAddrVoBean[] pdsaddresses;
	private ims.core.vo.beans.PDSTelecomVoBean[] pdstellecoms;
	private ims.framework.utils.beans.DateTimeBean pdserrcreationtime;
	private String pdserrinteractionid;
	private String pdserrprocessingcode;
	private String pdserrqueryresponsecode;
	private String pdserrid;
}
