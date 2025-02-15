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

package ims.ocrr.vo.beans;

public class PathologyLocationServiceVoBean extends ims.vo.ValueObjectBean
{
	public PathologyLocationServiceVoBean()
	{
	}
	public PathologyLocationServiceVoBean(ims.ocrr.vo.PathologyLocationServiceVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.location = vo.getLocation() == null ? null : (ims.ocrr.vo.beans.PathologyLocationVoBean)vo.getLocation().getBean();
		this.contact = vo.getContact() == null ? null : (ims.core.vo.beans.ServiceContactVoBean)vo.getContact().getBean();
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.ocrr.vo.PathologyLocationServiceVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.location = vo.getLocation() == null ? null : (ims.ocrr.vo.beans.PathologyLocationVoBean)vo.getLocation().getBean(map);
		this.contact = vo.getContact() == null ? null : (ims.core.vo.beans.ServiceContactVoBean)vo.getContact().getBean(map);
		this.service = vo.getService() == null ? null : (ims.core.vo.beans.ServiceLiteVoBean)vo.getService().getBean(map);
	}

	public ims.ocrr.vo.PathologyLocationServiceVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.ocrr.vo.PathologyLocationServiceVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.ocrr.vo.PathologyLocationServiceVo vo = null;
		if(map != null)
			vo = (ims.ocrr.vo.PathologyLocationServiceVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.ocrr.vo.PathologyLocationServiceVo();
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
	public ims.ocrr.vo.beans.PathologyLocationVoBean getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.ocrr.vo.beans.PathologyLocationVoBean value)
	{
		this.location = value;
	}
	public ims.core.vo.beans.ServiceContactVoBean getContact()
	{
		return this.contact;
	}
	public void setContact(ims.core.vo.beans.ServiceContactVoBean value)
	{
		this.contact = value;
	}
	public ims.core.vo.beans.ServiceLiteVoBean getService()
	{
		return this.service;
	}
	public void setService(ims.core.vo.beans.ServiceLiteVoBean value)
	{
		this.service = value;
	}

	private Integer id;
	private int version;
	private ims.ocrr.vo.beans.PathologyLocationVoBean location;
	private ims.core.vo.beans.ServiceContactVoBean contact;
	private ims.core.vo.beans.ServiceLiteVoBean service;
}
