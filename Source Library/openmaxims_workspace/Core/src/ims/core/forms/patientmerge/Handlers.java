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

package ims.core.forms.patientmerge;

import ims.framework.delegates.*;

abstract public class Handlers implements ims.framework.UILogic, IFormUILogicCode, ims.framework.interfaces.IClearInfo
{
	abstract protected void bindcmbFromIdTypeLookup();
	abstract protected void defaultcmbFromIdTypeLookupValue();
	abstract protected void bindcmbFromSexLookup();
	abstract protected void defaultcmbFromSexLookupValue();
	abstract protected void bindcmbToIdTypeLookup();
	abstract protected void defaultcmbToIdTypeLookupValue();
	abstract protected void bindcmbToSexLookup();
	abstract protected void defaultcmbToSexLookupValue();
	abstract protected void onMessageBoxClosed(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbFromClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbFromSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbFromIdTypeValueSet(Object value);
	abstract protected void oncmbFromSexValueSet(Object value);
	abstract protected void onGrdFromPatDetailsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbToClearClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onImbToSearchClick() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void onGrdToPatDetailsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException;
	abstract protected void oncmbToIdTypeValueSet(Object value);
	abstract protected void oncmbToSexValueSet(Object value);
	abstract protected void onImbMergeClick() throws ims.framework.exceptions.PresentationLogicException;

	public final void setContext(ims.framework.UIEngine engine, GenForm form)
	{
		this.engine = engine;
		this.form = form;

		this.form.setMessageBoxClosedEvent(new MessageBoxClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(int messageBoxId, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onMessageBoxClosed(messageBoxId, result);
			}
		});
		this.form.setFormOpenEvent(new FormOpen()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object[] args) throws ims.framework.exceptions.PresentationLogicException
			{
				bindLookups();
				onFormOpen(args);
			}
		});
		this.form.setFormDialogClosedEvent(new FormDialogClosed()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
			{
				onFormDialogClosed(formName, result);
			}
		});
		this.form.imbFromClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbFromClearClick();
			}
		});
		this.form.imbFromSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbFromSearchClick();
			}
		});
		this.form.cmbFromIdType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbFromIdTypeValueSet(value);
			}
		});
		this.form.cmbFromSex().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbFromSexValueSet(value);
			}
		});
		this.form.grdFromPatDetails().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdFromPatDetailsSelectionChanged();
			}
		});
		this.form.imbToClear().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbToClearClick();
			}
		});
		this.form.imbToSearch().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbToSearchClick();
			}
		});
		this.form.grdToPatDetails().setSelectionChangedEvent(new GridSelectionChanged()
		{
			private static final long serialVersionUID = 1L;
			public void handle(ims.framework.enumerations.MouseButton mouseButton) throws ims.framework.exceptions.PresentationLogicException
			{
				onGrdToPatDetailsSelectionChanged();
			}
		});
		this.form.cmbToIdType().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbToIdTypeValueSet(value);
			}
		});
		this.form.cmbToSex().setValueSetEvent(new ComboBoxValueSet()
		{
			private static final long serialVersionUID = 1L;
			public void handle(Object value)
			{
				oncmbToSexValueSet(value);
			}
		});
		this.form.imbMerge().setClickEvent(new Click()
		{
			private static final long serialVersionUID = 1L;
			public void handle() throws ims.framework.exceptions.PresentationLogicException
			{
				onImbMergeClick();
			}
		});
	}
	protected void bindLookups()
	{
		bindcmbFromIdTypeLookup();
		bindcmbFromSexLookup();
		bindcmbToIdTypeLookup();
		bindcmbToSexLookup();
	}
	protected void rebindAllLookups()
	{
		bindcmbFromIdTypeLookup();
		bindcmbFromSexLookup();
		bindcmbToIdTypeLookup();
		bindcmbToSexLookup();
	}
	protected void defaultAllLookupValues()
	{
		defaultcmbFromIdTypeLookupValue();
		defaultcmbFromSexLookupValue();
		defaultcmbToIdTypeLookupValue();
		defaultcmbToSexLookupValue();
	}

	public void free()
	{
		this.engine = null;
		this.form = null;
	}
	public abstract void clearContextInformation();
	protected ims.framework.UIEngine engine;
	protected GenForm form;
}
