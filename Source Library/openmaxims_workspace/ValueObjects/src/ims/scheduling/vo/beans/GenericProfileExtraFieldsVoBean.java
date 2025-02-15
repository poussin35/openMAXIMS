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

package ims.scheduling.vo.beans;

public class GenericProfileExtraFieldsVoBean extends ims.vo.ValueObjectBean
{
	public GenericProfileExtraFieldsVoBean()
	{
	}
	public GenericProfileExtraFieldsVoBean(ims.scheduling.vo.GenericProfileExtraFieldsVo vo)
	{
		this.profilesslots = vo.getProfilesSlots() == null ? null : vo.getProfilesSlots().getBeanCollection();
		this.dummyid = vo.getDummyId();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.GenericProfileExtraFieldsVo vo)
	{
		this.profilesslots = vo.getProfilesSlots() == null ? null : vo.getProfilesSlots().getBeanCollection();
		this.dummyid = vo.getDummyId();
	}

	public ims.scheduling.vo.GenericProfileExtraFieldsVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.GenericProfileExtraFieldsVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.GenericProfileExtraFieldsVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.GenericProfileExtraFieldsVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.GenericProfileExtraFieldsVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public ims.scheduling.vo.beans.Profile_SlotGenericVoBean[] getProfilesSlots()
	{
		return this.profilesslots;
	}
	public void setProfilesSlots(ims.scheduling.vo.beans.Profile_SlotGenericVoBean[] value)
	{
		this.profilesslots = value;
	}
	public Integer getDummyId()
	{
		return this.dummyid;
	}
	public void setDummyId(Integer value)
	{
		this.dummyid = value;
	}

	private ims.scheduling.vo.beans.Profile_SlotGenericVoBean[] profilesslots;
	private Integer dummyid;
}
