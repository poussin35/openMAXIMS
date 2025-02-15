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

package ims.admin.forms.approleadmin;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.domain.DomainInterface.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.domain.DomainInterface domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void bindgrdFormAccessContextLookup()
	{
		this.form.grdFormAccess().ContextComboBox().clear();
		ims.admin.vo.lookups.FormAccessContextCollection lookupCollection = ims.admin.vo.lookups.LookupHelper.getFormAccessContext(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdFormAccess().ContextComboBox().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void bindgrdFormAccessAllowedAccessLookup()
	{
		this.form.grdFormAccess().answerBoxColumnClear(1);
		ims.admin.vo.lookups.FormReadWriteCollection lookupCollection = ims.admin.vo.lookups.LookupHelper.getFormReadWrite(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.grdFormAccess().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	protected final void bindgrdAccessAccessLookup()
	{
		this.form.lyr1().tabGrid().grdAccess().answerBoxColumnClear(1);
		ims.admin.vo.lookups.FormReadWriteCollection lookupCollection = ims.admin.vo.lookups.LookupHelper.getFormReadWrite(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyr1().tabGrid().grdAccess().answerBoxColumnNewOption(1, lookupCollection.get(x));
		}
	}
	protected final void bindgrdAccessRIPLookup()
	{
		this.form.lyr1().tabGrid().grdAccess().answerBoxColumnClear(2);
		ims.admin.vo.lookups.FormReadWriteCollection lookupCollection = ims.admin.vo.lookups.LookupHelper.getFormReadWrite(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyr1().tabGrid().grdAccess().answerBoxColumnNewOption(2, lookupCollection.get(x));
		}
	}
	protected final void bindgrdAccessEndedLookup()
	{
		this.form.lyr1().tabGrid().grdAccess().answerBoxColumnClear(3);
		ims.admin.vo.lookups.FormReadWriteCollection lookupCollection = ims.admin.vo.lookups.LookupHelper.getFormReadWrite(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.lyr1().tabGrid().grdAccess().answerBoxColumnNewOption(3, lookupCollection.get(x));
		}
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.domain.DomainInterface domain;
}
