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

package ims.racpc.forms.racpcreferral;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.racpc.domain.RACPCReferral.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.racpc.domain.RACPCReferral domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbReferralSourceValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReferralSource().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReferralSourceLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.SourceOfReferral)
		{
			ims.core.vo.lookups.SourceOfReferral instance = (ims.core.vo.lookups.SourceOfReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReferralSourceLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.SourceOfReferral existingInstance = (ims.core.vo.lookups.SourceOfReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReferralSource().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReferralSourceLookup()
	{
		this.form.cmbReferralSource().clear();
		ims.core.vo.lookups.SourceOfReferralCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getSourceOfReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReferralSource().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReferralSourceLookupValue(int id)
	{
		ims.core.vo.lookups.SourceOfReferral instance = ims.core.vo.lookups.LookupHelper.getSourceOfReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReferralSource().setValue(instance);
	}
	protected final void defaultcmbReferralSourceLookupValue()
	{
		this.form.cmbReferralSource().setValue((ims.core.vo.lookups.SourceOfReferral)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.SourceOfReferral.class, engine.getFormName().getID(), ims.core.vo.lookups.SourceOfReferral.TYPE_ID));
	}
	protected final void oncmbReasonDelayedValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReasonDelayed().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ReasonForAptDelay existingInstance = (ims.core.vo.lookups.ReasonForAptDelay)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReasonDelayedLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.ReasonForAptDelay)
		{
			ims.core.vo.lookups.ReasonForAptDelay instance = (ims.core.vo.lookups.ReasonForAptDelay)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReasonDelayedLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ReasonForAptDelay existingInstance = (ims.core.vo.lookups.ReasonForAptDelay)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReasonDelayed().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReasonDelayedLookup()
	{
		this.form.cmbReasonDelayed().clear();
		ims.core.vo.lookups.ReasonForAptDelayCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getReasonForAptDelay(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReasonDelayed().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReasonDelayedLookupValue(int id)
	{
		ims.core.vo.lookups.ReasonForAptDelay instance = ims.core.vo.lookups.LookupHelper.getReasonForAptDelayInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReasonDelayed().setValue(instance);
	}
	protected final void defaultcmbReasonDelayedLookupValue()
	{
		this.form.cmbReasonDelayed().setValue((ims.core.vo.lookups.ReasonForAptDelay)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.ReasonForAptDelay.class, engine.getFormName().getID(), ims.core.vo.lookups.ReasonForAptDelay.TYPE_ID));
	}
	protected final void oncmbReasonValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbReason().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ReasonForReferral existingInstance = (ims.core.vo.lookups.ReasonForReferral)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.ReasonForReferral)
		{
			ims.core.vo.lookups.ReasonForReferral instance = (ims.core.vo.lookups.ReasonForReferral)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.ReasonForReferral existingInstance = (ims.core.vo.lookups.ReasonForReferral)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbReason().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbReasonLookup()
	{
		this.form.cmbReason().clear();
		ims.core.vo.lookups.ReasonForReferralCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getReasonForReferral(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReasonLookupValue(int id)
	{
		ims.core.vo.lookups.ReasonForReferral instance = ims.core.vo.lookups.LookupHelper.getReasonForReferralInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReason().setValue(instance);
	}
	protected final void defaultcmbReasonLookupValue()
	{
		this.form.cmbReason().setValue((ims.core.vo.lookups.ReasonForReferral)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.ReasonForReferral.class, engine.getFormName().getID(), ims.core.vo.lookups.ReasonForReferral.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.racpc.domain.RACPCReferral domain;
}
