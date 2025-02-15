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

package ims.core.forms.patientmedicalinsurance;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.core.domain.PatientMedicalInsurance.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.core.domain.PatientMedicalInsurance domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbCurrentStatusValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbCurrentStatus().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PrivateInsuranceStatus existingInstance = (ims.core.vo.lookups.PrivateInsuranceStatus)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbCurrentStatusLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PrivateInsuranceStatus)
		{
			ims.core.vo.lookups.PrivateInsuranceStatus instance = (ims.core.vo.lookups.PrivateInsuranceStatus)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbCurrentStatusLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PrivateInsuranceStatus existingInstance = (ims.core.vo.lookups.PrivateInsuranceStatus)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbCurrentStatus().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbCurrentStatusLookup()
	{
		this.form.ctnDetails().cmbCurrentStatus().clear();
		ims.core.vo.lookups.PrivateInsuranceStatusCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPrivateInsuranceStatus(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbCurrentStatus().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbCurrentStatusLookupValue(int id)
	{
		ims.core.vo.lookups.PrivateInsuranceStatus instance = ims.core.vo.lookups.LookupHelper.getPrivateInsuranceStatusInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbCurrentStatus().setValue(instance);
	}
	protected final void defaultcmbCurrentStatusLookupValue()
	{
		this.form.ctnDetails().cmbCurrentStatus().setValue((ims.core.vo.lookups.PrivateInsuranceStatus)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PrivateInsuranceStatus.class, engine.getFormName().getID(), ims.core.vo.lookups.PrivateInsuranceStatus.TYPE_ID));
	}
	protected final void oncmbPolicyTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.ctnDetails().cmbPolicyType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PrivateInsurancePolicyType existingInstance = (ims.core.vo.lookups.PrivateInsurancePolicyType)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbPolicyTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.PrivateInsurancePolicyType)
		{
			ims.core.vo.lookups.PrivateInsurancePolicyType instance = (ims.core.vo.lookups.PrivateInsurancePolicyType)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbPolicyTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.PrivateInsurancePolicyType existingInstance = (ims.core.vo.lookups.PrivateInsurancePolicyType)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.ctnDetails().cmbPolicyType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbPolicyTypeLookup()
	{
		this.form.ctnDetails().cmbPolicyType().clear();
		ims.core.vo.lookups.PrivateInsurancePolicyTypeCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getPrivateInsurancePolicyType(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.ctnDetails().cmbPolicyType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbPolicyTypeLookupValue(int id)
	{
		ims.core.vo.lookups.PrivateInsurancePolicyType instance = ims.core.vo.lookups.LookupHelper.getPrivateInsurancePolicyTypeInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.ctnDetails().cmbPolicyType().setValue(instance);
	}
	protected final void defaultcmbPolicyTypeLookupValue()
	{
		this.form.ctnDetails().cmbPolicyType().setValue((ims.core.vo.lookups.PrivateInsurancePolicyType)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.PrivateInsurancePolicyType.class, engine.getFormName().getID(), ims.core.vo.lookups.PrivateInsurancePolicyType.TYPE_ID));
	}
	protected void clearScreen()
	{
	}
	protected void populateScreenFromData(ims.core.vo.PatientAlert value)
	{
		clearScreen();
		if(value == null)
			return;

	}
	protected ims.core.vo.PatientAlert populateDataFromScreen(ims.core.vo.PatientAlert value)
	{
		if(value == null)
			value = new ims.core.vo.PatientAlert();


		return value;
	}
	protected ims.core.vo.PatientAlert populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.core.vo.PatientAlert());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.core.domain.PatientMedicalInsurance domain;
}
