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

package ims.clinical.forms.internalreferral;

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

		public boolean getClinicalReferralRefIsNotNull()
		{
			return !cx_ClinicalClinicalReferralRef.getValueIsNull(context);
		}
		public ims.clinical.vo.ClinicalReferralsRefVo getClinicalReferralRef()
		{
			return (ims.clinical.vo.ClinicalReferralsRefVo)cx_ClinicalClinicalReferralRef.getValue(context);
		}
		public void setClinicalReferralRef(ims.clinical.vo.ClinicalReferralsRefVo value)
		{
			cx_ClinicalClinicalReferralRef.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalClinicalReferralRef = new ims.framework.ContextVariable("Clinical.ClinicalReferralRef", "_cv_Clinical.ClinicalReferralRef");
		public boolean getLinkedPatientDocumentIsNotNull()
		{
			return !cx_ClinicalLinkedPatientDocument.getValueIsNull(context);
		}
		public ims.core.documents.vo.PatientDocumentRefVo getLinkedPatientDocument()
		{
			return (ims.core.documents.vo.PatientDocumentRefVo)cx_ClinicalLinkedPatientDocument.getValue(context);
		}
		public void setLinkedPatientDocument(ims.core.documents.vo.PatientDocumentRefVo value)
		{
			cx_ClinicalLinkedPatientDocument.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalLinkedPatientDocument = new ims.framework.ContextVariable("Clinical.LinkedPatientDocument", "_cv_Clinical.LinkedPatientDocument");
		public boolean getClinicalReferraNotesIsNotNull()
		{
			return !cx_ClinicalClinicalReferraNotes.getValueIsNull(context);
		}
		public ims.clinical.vo.ClinicalReferralNotesVoCollection getClinicalReferraNotes()
		{
			return (ims.clinical.vo.ClinicalReferralNotesVoCollection)cx_ClinicalClinicalReferraNotes.getValue(context);
		}
		public void setClinicalReferraNotes(ims.clinical.vo.ClinicalReferralNotesVoCollection value)
		{
			cx_ClinicalClinicalReferraNotes.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalClinicalReferraNotes = new ims.framework.ContextVariable("Clinical.ClinicalReferraNotes", "_cv_Clinical.ClinicalReferraNotes");
		public boolean getSaveInternalReferralNoteIsNotNull()
		{
			return !cx_ClinicalSaveInternalReferralNote.getValueIsNull(context);
		}
		public Boolean getSaveInternalReferralNote()
		{
			return (Boolean)cx_ClinicalSaveInternalReferralNote.getValue(context);
		}
		public void setSaveInternalReferralNote(Boolean value)
		{
			cx_ClinicalSaveInternalReferralNote.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalSaveInternalReferralNote = new ims.framework.ContextVariable("Clinical.SaveInternalReferralNote", "_cv_Clinical.SaveInternalReferralNote");
		public boolean getClinicalReferralStatusHistoryIsNotNull()
		{
			return !cx_ClinicalClinicalReferralStatusHistory.getValueIsNull(context);
		}
		public ims.clinical.vo.ClinicalReferralStatusVoCollection getClinicalReferralStatusHistory()
		{
			return (ims.clinical.vo.ClinicalReferralStatusVoCollection)cx_ClinicalClinicalReferralStatusHistory.getValue(context);
		}
		public void setClinicalReferralStatusHistory(ims.clinical.vo.ClinicalReferralStatusVoCollection value)
		{
			cx_ClinicalClinicalReferralStatusHistory.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ClinicalClinicalReferralStatusHistory = new ims.framework.ContextVariable("Clinical.ClinicalReferralStatusHistory", "_cv_Clinical.ClinicalReferralStatusHistory");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientDocumentsCollectionForClinicalReferralIsNotNull()
		{
			return !cx_CorePatientDocumentsCollectionForClinicalReferral.getValueIsNull(context);
		}
		public ims.core.vo.PatientDocumentVoCollection getPatientDocumentsCollectionForClinicalReferral()
		{
			return (ims.core.vo.PatientDocumentVoCollection)cx_CorePatientDocumentsCollectionForClinicalReferral.getValue(context);
		}
		public void setPatientDocumentsCollectionForClinicalReferral(ims.core.vo.PatientDocumentVoCollection value)
		{
			cx_CorePatientDocumentsCollectionForClinicalReferral.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientDocumentsCollectionForClinicalReferral = new ims.framework.ContextVariable("Core.PatientDocumentsCollectionForClinicalReferral", "_cv_Core.PatientDocumentsCollectionForClinicalReferral");
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
		public boolean getRieMessageIsNotNull()
		{
			return !cx_CoreRieMessage.getValueIsNull(context);
		}
		public String getRieMessage()
		{
			return (String)cx_CoreRieMessage.getValue(context);
		}
		public void setRieMessage(String value)
		{
			cx_CoreRieMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreRieMessage = new ims.framework.ContextVariable("Core.RieMessage", "_cv_Core.RieMessage");

		private ims.framework.Context context;
	}

	public ClinicalContext Clinical;
	public CoreContext Core;
}
