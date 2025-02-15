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

package ims.generalmedical.vo.beans;

public class NeuroReflexPeripheralTestsVoBean extends ims.vo.ValueObjectBean
{
	public NeuroReflexPeripheralTestsVoBean()
	{
	}
	public NeuroReflexPeripheralTestsVoBean(ims.generalmedical.vo.NeuroReflexPeripheralTestsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.peripheralreflex = vo.getPeripheralReflex() == null ? null : (ims.vo.LookupInstanceBean)vo.getPeripheralReflex().getBean();
		this.rightfinding = vo.getRightFinding() == null ? null : (ims.vo.LookupInstanceBean)vo.getRightFinding().getBean();
		this.leftfinding = vo.getLeftFinding() == null ? null : (ims.vo.LookupInstanceBean)vo.getLeftFinding().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.generalmedical.vo.NeuroReflexPeripheralTestsVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.peripheralreflex = vo.getPeripheralReflex() == null ? null : (ims.vo.LookupInstanceBean)vo.getPeripheralReflex().getBean();
		this.rightfinding = vo.getRightFinding() == null ? null : (ims.vo.LookupInstanceBean)vo.getRightFinding().getBean();
		this.leftfinding = vo.getLeftFinding() == null ? null : (ims.vo.LookupInstanceBean)vo.getLeftFinding().getBean();
	}

	public ims.generalmedical.vo.NeuroReflexPeripheralTestsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.generalmedical.vo.NeuroReflexPeripheralTestsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.generalmedical.vo.NeuroReflexPeripheralTestsVo vo = null;
		if(map != null)
			vo = (ims.generalmedical.vo.NeuroReflexPeripheralTestsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.generalmedical.vo.NeuroReflexPeripheralTestsVo();
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
	public ims.vo.LookupInstanceBean getPeripheralReflex()
	{
		return this.peripheralreflex;
	}
	public void setPeripheralReflex(ims.vo.LookupInstanceBean value)
	{
		this.peripheralreflex = value;
	}
	public ims.vo.LookupInstanceBean getRightFinding()
	{
		return this.rightfinding;
	}
	public void setRightFinding(ims.vo.LookupInstanceBean value)
	{
		this.rightfinding = value;
	}
	public ims.vo.LookupInstanceBean getLeftFinding()
	{
		return this.leftfinding;
	}
	public void setLeftFinding(ims.vo.LookupInstanceBean value)
	{
		this.leftfinding = value;
	}

	private Integer id;
	private int version;
	private ims.vo.LookupInstanceBean peripheralreflex;
	private ims.vo.LookupInstanceBean rightfinding;
	private ims.vo.LookupInstanceBean leftfinding;
}
