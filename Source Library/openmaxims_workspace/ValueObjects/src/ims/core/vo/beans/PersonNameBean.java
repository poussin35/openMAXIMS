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

public class PersonNameBean extends ims.vo.ValueObjectBean
{
	public PersonNameBean()
	{
	}
	public PersonNameBean(ims.core.vo.PersonName vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.nametype = vo.getNameType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNameType().getBean();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.middlename = vo.getMiddleName();
		this.title = vo.getTitle() == null ? null : (ims.vo.LookupInstanceBean)vo.getTitle().getBean();
		this.uppersurname = vo.getUpperSurname();
		this.upperforename = vo.getUpperForename();
		this.namesuffix = vo.getNamesuffix();
		this.objectidentifier = vo.getObjectidentifier();
		this.beffdate = vo.getBeffdate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getBeffdate().getBean();
		this.beffdatecnf = vo.getBeffdatecnf();
		this.betdate = vo.getBetdate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getBetdate().getBean();
		this.betdatecnf = vo.getBetdatecnf();
		this.pdsupdatemode = vo.getPdsUpdateMode() == null ? null : (ims.vo.LookupInstanceBean)vo.getPdsUpdateMode().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PersonName vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.nametype = vo.getNameType() == null ? null : (ims.vo.LookupInstanceBean)vo.getNameType().getBean();
		this.surname = vo.getSurname();
		this.forename = vo.getForename();
		this.middlename = vo.getMiddleName();
		this.title = vo.getTitle() == null ? null : (ims.vo.LookupInstanceBean)vo.getTitle().getBean();
		this.uppersurname = vo.getUpperSurname();
		this.upperforename = vo.getUpperForename();
		this.namesuffix = vo.getNamesuffix();
		this.objectidentifier = vo.getObjectidentifier();
		this.beffdate = vo.getBeffdate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getBeffdate().getBean();
		this.beffdatecnf = vo.getBeffdatecnf();
		this.betdate = vo.getBetdate() == null ? null : (ims.framework.utils.beans.DateBean)vo.getBetdate().getBean();
		this.betdatecnf = vo.getBetdatecnf();
		this.pdsupdatemode = vo.getPdsUpdateMode() == null ? null : (ims.vo.LookupInstanceBean)vo.getPdsUpdateMode().getBean();
	}

	public ims.core.vo.PersonName buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PersonName buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PersonName vo = null;
		if(map != null)
			vo = (ims.core.vo.PersonName)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PersonName();
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
	public ims.vo.LookupInstanceBean getNameType()
	{
		return this.nametype;
	}
	public void setNameType(ims.vo.LookupInstanceBean value)
	{
		this.nametype = value;
	}
	public String getSurname()
	{
		return this.surname;
	}
	public void setSurname(String value)
	{
		this.surname = value;
	}
	public String getForename()
	{
		return this.forename;
	}
	public void setForename(String value)
	{
		this.forename = value;
	}
	public String getMiddleName()
	{
		return this.middlename;
	}
	public void setMiddleName(String value)
	{
		this.middlename = value;
	}
	public ims.vo.LookupInstanceBean getTitle()
	{
		return this.title;
	}
	public void setTitle(ims.vo.LookupInstanceBean value)
	{
		this.title = value;
	}
	public String getUpperSurname()
	{
		return this.uppersurname;
	}
	public void setUpperSurname(String value)
	{
		this.uppersurname = value;
	}
	public String getUpperForename()
	{
		return this.upperforename;
	}
	public void setUpperForename(String value)
	{
		this.upperforename = value;
	}
	public String getNamesuffix()
	{
		return this.namesuffix;
	}
	public void setNamesuffix(String value)
	{
		this.namesuffix = value;
	}
	public String getObjectidentifier()
	{
		return this.objectidentifier;
	}
	public void setObjectidentifier(String value)
	{
		this.objectidentifier = value;
	}
	public ims.framework.utils.beans.DateBean getBeffdate()
	{
		return this.beffdate;
	}
	public void setBeffdate(ims.framework.utils.beans.DateBean value)
	{
		this.beffdate = value;
	}
	public Boolean getBeffdatecnf()
	{
		return this.beffdatecnf;
	}
	public void setBeffdatecnf(Boolean value)
	{
		this.beffdatecnf = value;
	}
	public ims.framework.utils.beans.DateBean getBetdate()
	{
		return this.betdate;
	}
	public void setBetdate(ims.framework.utils.beans.DateBean value)
	{
		this.betdate = value;
	}
	public Boolean getBetdatecnf()
	{
		return this.betdatecnf;
	}
	public void setBetdatecnf(Boolean value)
	{
		this.betdatecnf = value;
	}
	public ims.vo.LookupInstanceBean getPdsUpdateMode()
	{
		return this.pdsupdatemode;
	}
	public void setPdsUpdateMode(ims.vo.LookupInstanceBean value)
	{
		this.pdsupdatemode = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean nametype;
	private String surname;
	private String forename;
	private String middlename;
	private ims.vo.LookupInstanceBean title;
	private String uppersurname;
	private String upperforename;
	private String namesuffix;
	private String objectidentifier;
	private ims.framework.utils.beans.DateBean beffdate;
	private Boolean beffdatecnf;
	private ims.framework.utils.beans.DateBean betdate;
	private Boolean betdatecnf;
	private ims.vo.LookupInstanceBean pdsupdatemode;
}
