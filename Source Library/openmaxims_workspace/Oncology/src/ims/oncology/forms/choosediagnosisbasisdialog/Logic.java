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
// This code was generated by Rory Fitzpatrick using IMS Development Environment (version 1.60 build 2791.17293)
// Copyright (C) 1995-2007 IMS MAXIMS plc. All rights reserved.

package ims.oncology.forms.choosediagnosisbasisdialog;

import ims.core.vo.lookups.DiagnosisBasisofDiagnosis;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.enumerations.DialogResult;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		if( form.getGlobalContext().Oncology.getSelectedDiagnosisForPrimaryTumourDetailsIsNotNull()
			&& form.getGlobalContext().Oncology.getSelectedDiagnosisForPrimaryTumourDetails().getBasisofDiagnosisIsNotNull() )
		{
			for(int i = 0 ; i < form.getGlobalContext().Oncology.getSelectedDiagnosisForPrimaryTumourDetails().getBasisofDiagnosis().size() ; i++)
			{
				DiagnosisBasisofDiagnosis basisVo = form.getGlobalContext().Oncology.getSelectedDiagnosisForPrimaryTumourDetails().getBasisofDiagnosis().get(i);
				form.chklistBasis().newRow(basisVo, basisVo.getText());
			}
		}
	}
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		DiagnosisBasisofDiagnosis[] selectedValues = form.chklistBasis().getValues();

		if (selectedValues == null || selectedValues.length == 0)
		{
			engine.showMessage("Please either choose a Basis of Diagnosis or Cancel.", "Warning", MessageButtons.OK, MessageIcon.WARNING);
			return;
		}
		
		form.getGlobalContext().Oncology.setSelectedBasisOfDiagnosis(selectedValues[0]);
		engine.close(DialogResult.OK);
	}
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().Oncology.setSelectedBasisOfDiagnosis(null);
		engine.close(DialogResult.CANCEL);
	}
}
