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

package ims.clinical.vo.beans;

public class HospitalAtNightCutOverPointsConfigVoBean extends ims.vo.ValueObjectBean
{
	public HospitalAtNightCutOverPointsConfigVoBean()
	{
	}
	public HospitalAtNightCutOverPointsConfigVoBean(ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttime = vo.getStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTime().getBean();
		this.endtime = vo.getEndTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getEndTime().getBean();
		this.hospital = vo.getHospital() == null ? null : new ims.vo.RefVoBean(vo.getHospital().getBoId(), vo.getHospital().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.starttime = vo.getStartTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getStartTime().getBean();
		this.endtime = vo.getEndTime() == null ? null : (ims.framework.utils.beans.TimeBean)vo.getEndTime().getBean();
		this.hospital = vo.getHospital() == null ? null : new ims.vo.RefVoBean(vo.getHospital().getBoId(), vo.getHospital().getBoVersion());
	}

	public ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo vo = null;
		if(map != null)
			vo = (ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinical.vo.HospitalAtNightCutOverPointsConfigVo();
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
	public ims.framework.utils.beans.TimeBean getStartTime()
	{
		return this.starttime;
	}
	public void setStartTime(ims.framework.utils.beans.TimeBean value)
	{
		this.starttime = value;
	}
	public ims.framework.utils.beans.TimeBean getEndTime()
	{
		return this.endtime;
	}
	public void setEndTime(ims.framework.utils.beans.TimeBean value)
	{
		this.endtime = value;
	}
	public ims.vo.RefVoBean getHospital()
	{
		return this.hospital;
	}
	public void setHospital(ims.vo.RefVoBean value)
	{
		this.hospital = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.TimeBean starttime;
	private ims.framework.utils.beans.TimeBean endtime;
	private ims.vo.RefVoBean hospital;
}
