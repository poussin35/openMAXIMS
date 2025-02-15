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

package ims.core.forms.externalresourcesearchcomponent;

public abstract class BaseLogic extends Handlers implements IComponent
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.ExternalResourceSearchComponent.class;
	}
	public final void setContext(ims.framework.UIComponentEngine engine, GenForm form, ims.core.domain.ExternalResourceSearchComponent domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	public void setMode(ims.framework.enumerations.FormMode mode)
	{
		form.setMode(mode);
	}
	public ims.framework.enumerations.FormMode getMode()
	{
		return form.getMode();
	}
	protected final void oncmbStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PreActiveActiveInactiveStatus existingInstance = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PreActiveActiveInactiveStatus)
		{
			ims.core.vo.lookups.PreActiveActiveInactiveStatus instance = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PreActiveActiveInactiveStatus existingInstance = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbStatusLookup()
	{
		this.form.cmbStatus().clear();
		ims.core.vo.lookups.PreActiveActiveInactiveStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPreActiveActiveInactiveStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbStatusLookupValue(int id)
	{
		ims.core.vo.lookups.PreActiveActiveInactiveStatus instance = ims.core.vo.lookups.LookupHelper.getPreActiveActiveInactiveStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbStatus().setValue(instance);
	}
	protected final void defaultcmbStatusLookupValue()
	{
		this.form.cmbStatus().setValue((ims.core.vo.lookups.PreActiveActiveInactiveStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PreActiveActiveInactiveStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.PreActiveActiveInactiveStatus.TYPE_ID));
	}
	protected final void oncmbHCPTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbHCPType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbHCPTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.HcpDisType)
		{
			ims.core.vo.lookups.HcpDisType instance = (ims.core.vo.lookups.HcpDisType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbHCPTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.HcpDisType existingInstance = (ims.core.vo.lookups.HcpDisType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbHCPType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbHCPTypeLookup()
	{
		this.form.cmbHCPType().clear();
		ims.core.vo.lookups.HcpDisTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getHcpDisType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbHCPType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbHCPTypeLookupValue(int id)
	{
		ims.core.vo.lookups.HcpDisType instance = ims.core.vo.lookups.LookupHelper.getHcpDisTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbHCPType().setValue(instance);
	}
	protected final void defaultcmbHCPTypeLookupValue()
	{
		this.form.cmbHCPType().setValue((ims.core.vo.lookups.HcpDisType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.HcpDisType.class, engine.getFormName().getID(), ims.core.vo.lookups.HcpDisType.TYPE_ID));
	}
	protected final void oncmbResourceTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbResourceType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ExternalResourceType existingInstance = (ims.core.vo.lookups.ExternalResourceType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbResourceTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.ExternalResourceType)
		{
			ims.core.vo.lookups.ExternalResourceType instance = (ims.core.vo.lookups.ExternalResourceType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbResourceTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ExternalResourceType existingInstance = (ims.core.vo.lookups.ExternalResourceType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbResourceType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbResourceTypeLookup()
	{
		this.form.cmbResourceType().clear();
		ims.core.vo.lookups.ExternalResourceTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getExternalResourceType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbResourceType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbResourceTypeLookupValue(int id)
	{
		ims.core.vo.lookups.ExternalResourceType instance = ims.core.vo.lookups.LookupHelper.getExternalResourceTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbResourceType().setValue(instance);
	}
	protected final void defaultcmbResourceTypeLookupValue()
	{
		this.form.cmbResourceType().setValue((ims.core.vo.lookups.ExternalResourceType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.ExternalResourceType.class, engine.getFormName().getID(), ims.core.vo.lookups.ExternalResourceType.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.ExternalResourceSearchComponent domain;
}
