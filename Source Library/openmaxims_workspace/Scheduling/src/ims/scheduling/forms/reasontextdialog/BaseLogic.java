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

package ims.scheduling.forms.reasontextdialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.scheduling.domain.ReasonTextDialog.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.scheduling.domain.ReasonTextDialog domain)
	{
		setContext(engine, form);
		this.domain = domain;
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
					ims.scheduling.vo.lookups.CancelAppointmentReason existingInstance = (ims.scheduling.vo.lookups.CancelAppointmentReason)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbReasonLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.scheduling.vo.lookups.CancelAppointmentReason)
		{
			ims.scheduling.vo.lookups.CancelAppointmentReason instance = (ims.scheduling.vo.lookups.CancelAppointmentReason)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbReasonLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.scheduling.vo.lookups.CancelAppointmentReason existingInstance = (ims.scheduling.vo.lookups.CancelAppointmentReason)listOfValues.get(x);
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
		ims.scheduling.vo.lookups.CancelAppointmentReasonCollection lookupCollection = ims.scheduling.vo.lookups.LookupHelper.getCancelAppointmentReason(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbReason().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbReasonLookupValue(int id)
	{
		ims.scheduling.vo.lookups.CancelAppointmentReason instance = ims.scheduling.vo.lookups.LookupHelper.getCancelAppointmentReasonInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbReason().setValue(instance);
	}
	protected final void defaultcmbReasonLookupValue()
	{
		this.form.cmbReason().setValue((ims.scheduling.vo.lookups.CancelAppointmentReason)domain.getLookupService().getDefaultInstance(ims.scheduling.vo.lookups.CancelAppointmentReason.class, engine.getFormName().getID(), ims.scheduling.vo.lookups.CancelAppointmentReason.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.scheduling.domain.ReasonTextDialog domain;
}
