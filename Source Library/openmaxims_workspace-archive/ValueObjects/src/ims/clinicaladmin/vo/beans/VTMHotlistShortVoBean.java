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

package ims.clinicaladmin.vo.beans;

public class VTMHotlistShortVoBean extends ims.vo.ValueObjectBean
{
	public VTMHotlistShortVoBean()
	{
	}
	public VTMHotlistShortVoBean(ims.clinicaladmin.vo.VTMHotlistShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.isglobal = vo.getIsGlobal();
		this.user = vo.getUser() == null ? null : new ims.vo.RefVoBean(vo.getUser().getBoId(), vo.getUser().getBoVersion());
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.VTMHotlistShortVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.isglobal = vo.getIsGlobal();
		this.user = vo.getUser() == null ? null : new ims.vo.RefVoBean(vo.getUser().getBoId(), vo.getUser().getBoVersion());
		this.specialty = vo.getSpecialty() == null ? null : (ims.vo.LookupInstanceBean)vo.getSpecialty().getBean();
	}

	public ims.clinicaladmin.vo.VTMHotlistShortVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinicaladmin.vo.VTMHotlistShortVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.VTMHotlistShortVo vo = null;
		if(map != null)
			vo = (ims.clinicaladmin.vo.VTMHotlistShortVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinicaladmin.vo.VTMHotlistShortVo();
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
	public Boolean getIsGlobal()
	{
		return this.isglobal;
	}
	public void setIsGlobal(Boolean value)
	{
		this.isglobal = value;
	}
	public ims.vo.RefVoBean getUser()
	{
		return this.user;
	}
	public void setUser(ims.vo.RefVoBean value)
	{
		this.user = value;
	}
	public ims.vo.LookupInstanceBean getSpecialty()
	{
		return this.specialty;
	}
	public void setSpecialty(ims.vo.LookupInstanceBean value)
	{
		this.specialty = value;
	}

	private Integer id;
	private int version;
	private Boolean isglobal;
	private ims.vo.RefVoBean user;
	private ims.vo.LookupInstanceBean specialty;
}
