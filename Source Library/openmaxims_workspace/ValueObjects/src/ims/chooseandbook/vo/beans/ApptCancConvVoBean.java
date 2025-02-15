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

package ims.chooseandbook.vo.beans;

public class ApptCancConvVoBean extends ims.vo.ValueObjectBean
{
	public ApptCancConvVoBean()
	{
	}
	public ApptCancConvVoBean(ims.chooseandbook.vo.ApptCancConvVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.cid = vo.getCid() == null ? null : (ims.chooseandbook.vo.beans.ConvIdVoBean)vo.getCid().getBean();
		this.current = vo.getCurrent() == null ? null : (ims.chooseandbook.vo.beans.SeqPointVoBean)vo.getCurrent().getBean();
		this.points = vo.getPoints() == null ? null : vo.getPoints().getBeanCollection();
		this.msguids = vo.getMsgUids() == null ? null : vo.getMsgUids().getBeanCollection();
		this.dummy = vo.getDummy();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.chooseandbook.vo.ApptCancConvVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.cid = vo.getCid() == null ? null : (ims.chooseandbook.vo.beans.ConvIdVoBean)vo.getCid().getBean(map);
		this.current = vo.getCurrent() == null ? null : (ims.chooseandbook.vo.beans.SeqPointVoBean)vo.getCurrent().getBean(map);
		this.points = vo.getPoints() == null ? null : vo.getPoints().getBeanCollection();
		this.msguids = vo.getMsgUids() == null ? null : vo.getMsgUids().getBeanCollection();
		this.dummy = vo.getDummy();
	}

	public ims.chooseandbook.vo.ApptCancConvVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.chooseandbook.vo.ApptCancConvVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.chooseandbook.vo.ApptCancConvVo vo = null;
		if(map != null)
			vo = (ims.chooseandbook.vo.ApptCancConvVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.chooseandbook.vo.ApptCancConvVo();
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
	public ims.chooseandbook.vo.beans.ConvIdVoBean getCid()
	{
		return this.cid;
	}
	public void setCid(ims.chooseandbook.vo.beans.ConvIdVoBean value)
	{
		this.cid = value;
	}
	public ims.chooseandbook.vo.beans.SeqPointVoBean getCurrent()
	{
		return this.current;
	}
	public void setCurrent(ims.chooseandbook.vo.beans.SeqPointVoBean value)
	{
		this.current = value;
	}
	public ims.chooseandbook.vo.beans.ConvPointVoBean[] getPoints()
	{
		return this.points;
	}
	public void setPoints(ims.chooseandbook.vo.beans.ConvPointVoBean[] value)
	{
		this.points = value;
	}
	public ims.chooseandbook.vo.beans.ConvUidVoBean[] getMsgUids()
	{
		return this.msguids;
	}
	public void setMsgUids(ims.chooseandbook.vo.beans.ConvUidVoBean[] value)
	{
		this.msguids = value;
	}
	public Boolean getDummy()
	{
		return this.dummy;
	}
	public void setDummy(Boolean value)
	{
		this.dummy = value;
	}

	private Integer id;
	private int version;
	private ims.chooseandbook.vo.beans.ConvIdVoBean cid;
	private ims.chooseandbook.vo.beans.SeqPointVoBean current;
	private ims.chooseandbook.vo.beans.ConvPointVoBean[] points;
	private ims.chooseandbook.vo.beans.ConvUidVoBean[] msguids;
	private Boolean dummy;
}
