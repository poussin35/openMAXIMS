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

package ims.clinical.forms.extendedclinicalnotes;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Clinical = new ClinicalContext(context);
		Core = new CoreContext(context);
	}
	public final class ClinicalContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ClinicalContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getReturnToFormModeIsNotNull()
		{
			return !cx_ClinicalReturnToFormMode.getValueIsNull(context);
		}
		public ims.framework.enumerations.FormMode getReturnToFormMode()
		{
			return (ims.framework.enumerations.FormMode)cx_ClinicalReturnToFormMode.getValue(context);
		}
		public void setReturnToFormMode(ims.framework.enumerations.FormMode value)
		{
			cx_ClinicalReturnToFormMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalReturnToFormMode = new ims.framework.ContextVariable("Clinical.ReturnToFormMode", "_cv_Clinical.ReturnToFormMode");
		public boolean getCurrentClinicalNoteIsNotNull()
		{
			return !cx_ClinicalCurrentClinicalNote.getValueIsNull(context);
		}
		public ims.core.vo.ClinicalNotesVo getCurrentClinicalNote()
		{
			return (ims.core.vo.ClinicalNotesVo)cx_ClinicalCurrentClinicalNote.getValue(context);
		}
		public void setCurrentClinicalNote(ims.core.vo.ClinicalNotesVo value)
		{
			cx_ClinicalCurrentClinicalNote.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalCurrentClinicalNote = new ims.framework.ContextVariable("Clinical.CurrentClinicalNote", "_cvp_Clinical.CurrentClinicalNote");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCurrentClinicalContactIsNotNull()
		{
			return !cx_CoreCurrentClinicalContact.getValueIsNull(context);
		}
		public ims.core.vo.ClinicalContactShortVo getCurrentClinicalContact()
		{
			return (ims.core.vo.ClinicalContactShortVo)cx_CoreCurrentClinicalContact.getValue(context);
		}
		public void setCurrentClinicalContact(ims.core.vo.ClinicalContactShortVo value)
		{
			cx_CoreCurrentClinicalContact.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentClinicalContact = new ims.framework.ContextVariable("Core.CurrentClinicalContact", "_cvp_Core.CurrentClinicalContact");
		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextShortVo value)
		{
			cx_CoreCurrentCareContext.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getClinicalNotingModeIsNotNull()
		{
			return !cx_CoreClinicalNotingMode.getValueIsNull(context);
		}
		public ims.core.vo.lookups.ClinicalNotingMode getClinicalNotingMode()
		{
			return (ims.core.vo.lookups.ClinicalNotingMode)cx_CoreClinicalNotingMode.getValue(context);
		}
		public void setClinicalNotingMode(ims.core.vo.lookups.ClinicalNotingMode value)
		{
			cx_CoreClinicalNotingMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreClinicalNotingMode = new ims.framework.ContextVariable("Core.ClinicalNotingMode", "_cv_Core.ClinicalNotingMode");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}

	public ClinicalContext Clinical;
	public CoreContext Core;
}
