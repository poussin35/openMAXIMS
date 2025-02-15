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
// This code was generated by Callum Wells using IMS Development Environment (version 1.20 build 40805.900)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.nursing.forms.skinreviewdialog;

import ims.nursing.vo.SkinAssessment;
import ims.nursing.vo.SkinAssessmentFindings;
import ims.nursing.vo.SkinAssessmentReview;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.DateTime;
import ims.nursing.vo.lookups.SkinWoundType;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		if(screenOpenedFromReview())
		{
			//set the details from SkinReview
			populateControlsFromReviewVO();
		}
		else
		{
			//set the details from SkinChart
			populateControlsFromFindingVO();
			form.checkBoxDiscontinueAssessment().setVisible(false);
			form.labelDiscontinue().setVisible(false);
		}
	}
	protected void onBCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		clearGlobalContext();
		engine.close(DialogResult.CANCEL);
	}
	protected void onBSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		boolean closeDialog = false;
		
		if ((form.grpInfection().getValue() != null && form.grpInfection().getValue().equals(GenForm.grpInfectionEnumeration.radioButtonInfectionYes)) && (form.grpSwab().getValue() != null && !form.grpSwab().getValue().equals(GenForm.grpSwabEnumeration.radioButtonSwabYes)))
		{
			engine.showMessage("If an infection is suspected, 'Swab Taken' must be set to Yes ");	//wdev-12411
			return;
		}
		if ((form.grpInfection().getValue() != null && form.grpInfection().getValue().equals(GenForm.grpInfectionEnumeration.radioButtonInfectionYes)) && (form.grpTraced().getValue() != null && !form.grpTraced().getValue().equals(GenForm.grpTracedEnumeration.radioButtonTracedYes)))
		{
			engine.showMessage("If an infection is suspected, 'Wound Traced' must be set to Yes ");
			return;
		}
		if(screenOpenedFromReview())
			closeDialog = populateReviewVO();
		else
			closeDialog = populateFindingVO();
		
		if(closeDialog)
		{
			clearGlobalContext();
			engine.close(DialogResult.OK);
		}
	}
	
	private void clearGlobalContext()
	{
		form.getGlobalContext().COE.SkinBodyChart.setReviewDialog(new Boolean(false));
	}
	
	private void populateControlsFromFindingVO()
	{
		SkinAssessmentFindings findingVO = form.getGlobalContext().COE.SkinBodyChart.getFindingsVO(); 
		SkinAssessment skinAssessment = form.getGlobalContext().COE.SkinBodyChart.getSelectedSkinAssessment();
		if(skinAssessment != null)
		{
			//Date/Time
			if(skinAssessment.getDateTimeInitiated() != null)
			{
				form.dteReviewDate().setValue(skinAssessment.getDateTimeInitiated().getDate());
				form.timReviewTime().setValue(skinAssessment.getDateTimeInitiated().getTime());
			}
			//HCP
			if(skinAssessment.getHcpInitiated() != null)
				form.txtHCP().setValue(skinAssessment.getHcpInitiated().toString());
		}
		
		//Finding
		if(findingVO.getWoundType() != null)
			form.txtFinding().setValue(findingVO.getWoundType().getText());
		//Site
		form.textBoxSite().setValue(findingVO.getSiteName());
		//Site Details
		form.textBoxSiteDetails().setValue(findingVO.getSiteDetails());
		//How Long
		form.textBoxHowLong().setValue(findingVO.getHowLongIsItPresent());
		//Pressure Sore Grade - display when we have the Wound Type - Pressure Sore
		if(findingVO.getWoundType() != null && findingVO.getWoundType().equals(SkinWoundType.PRESSURESORE))
			form.cmbPressureGrade().setValue(findingVO.getPressureSoreGrade());
		else
			setVisiblePressureSore(false);			
		//Length
		form.decBoxLength().setValue(findingVO.getLength());
		//Width
		form.decBoxWidth().setValue(findingVO.getWidth());
		//Depth
		form.decBoxDepth().setValue(findingVO.getDepth());
		//Wound Bed
		form.cmbWoundBed().setValue(findingVO.getWoundBed());
		//Surrounding Skin
		form.cmbSurroundingSkin().setValue(findingVO.getSurroundingSkin());
		//Exudate Amount
		form.cmbExudateAmount().setValue(findingVO.getExudateAmount());
		//Exudate Type
		form.cmbExudateType().setValue(findingVO.getExudateType());
		//Odour
		form.cmbOdour().setValue(findingVO.getOdour());
		//Pain
		form.cmbPain().setValue(findingVO.getPain());
		//Infection Suspected
		if(findingVO.getInfectionSuspected() != null)
		{
			if(findingVO.getInfectionSuspected().booleanValue())
				form.grpInfection().setValue(GenForm.grpInfectionEnumeration.radioButtonInfectionYes);
			else
				form.grpInfection().setValue(GenForm.grpInfectionEnumeration.radioButtonInfectionNo);
		}
		//Swab taken
		if(findingVO.getSwabTaken() != null)
		{
			if(findingVO.getSwabTaken().booleanValue())
				form.grpSwab().setValue(GenForm.grpSwabEnumeration.radioButtonSwabYes);
			else
				form.grpSwab().setValue(GenForm.grpSwabEnumeration.radioButtonSwabNo);
		}
		//Wound Traced
		if(findingVO.getWoundTraced() != null)
		{
			if(findingVO.getWoundTraced().booleanValue())
				form.grpTraced().setValue(GenForm.grpTracedEnumeration.radioButtonTracedYes);
			else
				form.grpTraced().setValue(GenForm.grpTracedEnumeration.radioButtonTracedNo);
		}
		//Cleansed With
		form.cmbCleansedWith().setValue(findingVO.getCleansedWith());
		//Primary Dressing
		form.cmbPrimary().setValue(findingVO.getPrimaryDressing());
		//Secondary Dressing
		form.cmbSecondary().setValue(findingVO.getSecondaryDressing());
		//Frequency of Change
		form.cmbFrequency().setValue(findingVO.getFrequencyOfChange());
		//Comment
		form.textBoxComment().setValue(findingVO.getComment());
		//Discontinue
		if(findingVO.getIsDiscontinuedAssess() != null && findingVO.getIsDiscontinuedAssess().booleanValue())
			form.checkBoxDiscontinueAssessment().setValue(true);
	}
	
	private void populateControlsFromReviewVO()
	{
		SkinAssessmentFindings findingVO = form.getGlobalContext().COE.SkinBodyChart.getFindingsVO();
		SkinAssessmentReview   reviewVO  = form.getGlobalContext().COE.SkinBodyChart.getReviewVO();
		
		//Populated from findingVO---------------------------------------
		//Date/Time
		if(reviewVO.getDateTimeReview() != null)
		{
			form.dteReviewDate().setValue(reviewVO.getDateTimeReview().getDate());
			form.timReviewTime().setValue(reviewVO.getDateTimeReview().getTime());
		}
		//HCP
		if(reviewVO.getHCPReview() != null)
			form.txtHCP().setValue(reviewVO.getHCPReview().toString());
		//Finding
		if(findingVO.getWoundType() != null)
			form.txtFinding().setValue(findingVO.getWoundType().getText());
		//Site
		form.textBoxSite().setValue(findingVO.getSiteName());
		//Discontinue
		if(findingVO.getIsDiscontinuedAssess() != null && findingVO.getIsDiscontinuedAssess().booleanValue())
			form.checkBoxDiscontinueAssessment().setValue(true);
		//How Long
		setVisibleHowLongPresent(false);
		//form.textBoxHowLong().setValue(findingVO.getHowLongIsItPresent());
		//---------------------------------------------------------------
		
		//Site Details
		form.textBoxSiteDetails().setValue(reviewVO.getSiteDetails());
		
		//Pressure Sore Grade - display when we have the Wound Type - Pressure Sore
		if(findingVO.getWoundType() != null && findingVO.getWoundType().equals(SkinWoundType.PRESSURESORE))
			form.cmbPressureGrade().setValue(reviewVO.getPressureSoreGrade());			
		else
			setVisiblePressureSore(false);
		//Length
		form.decBoxLength().setValue(reviewVO.getLength());
		//Width
		form.decBoxWidth().setValue(reviewVO.getWidth());
		//Depth
		form.decBoxDepth().setValue(reviewVO.getDepth());
		//Wound Bed
		form.cmbWoundBed().setValue(reviewVO.getWoundBed());
		//Surrounding Skin
		form.cmbSurroundingSkin().setValue(reviewVO.getSurroundingSkin());
		//Exudate Amount
		form.cmbExudateAmount().setValue(reviewVO.getExudateAmount());
		//Exudate Type
		form.cmbExudateType().setValue(reviewVO.getExudateType());
		//Odour
		form.cmbOdour().setValue(reviewVO.getOdour());
		//Pain
		form.cmbPain().setValue(reviewVO.getPain());
		//Infection Suspected
		if(reviewVO.getInfectionSuspected() != null)
		{
			if(reviewVO.getInfectionSuspected().booleanValue())
				form.grpInfection().setValue(GenForm.grpInfectionEnumeration.radioButtonInfectionYes);
			else
				form.grpInfection().setValue(GenForm.grpInfectionEnumeration.radioButtonInfectionNo);
		}
		//Swab taken
		if(reviewVO.getSwabTaken() != null)
		{
			if(reviewVO.getSwabTaken().booleanValue())
				form.grpSwab().setValue(GenForm.grpSwabEnumeration.radioButtonSwabYes);
			else
				form.grpSwab().setValue(GenForm.grpSwabEnumeration.radioButtonSwabNo);
		}
		//Wound Traced
		if(reviewVO.getWoundTraced() != null)
		{
			if(reviewVO.getWoundTraced().booleanValue())
				form.grpTraced().setValue(GenForm.grpTracedEnumeration.radioButtonTracedYes);
			else
				form.grpTraced().setValue(GenForm.grpTracedEnumeration.radioButtonTracedNo);
		}
		//Cleansed With
		form.cmbCleansedWith().setValue(reviewVO.getCleansedWith());
		//Primary Dressing
		form.cmbPrimary().setValue(reviewVO.getPrimaryDressing());
		//Secondary Dressing
		form.cmbSecondary().setValue(reviewVO.getSecondaryDressing());
		//Frequency of Change
		form.cmbFrequency().setValue(reviewVO.getFrequencyOfChange());
		//Comment
		form.textBoxComment().setValue(reviewVO.getComment());
	}
	
	public boolean populateReviewVO()
	{
		//	Do extra checking if necessary...
		SkinAssessmentFindings findingVO = form.getGlobalContext().COE.SkinBodyChart.getFindingsVO();
		SkinAssessmentReview   reviewVO  = form.getGlobalContext().COE.SkinBodyChart.getReviewVO();
		//Date & Time
		if(form.dteReviewDate().getValue() == null)
		{
			engine.showMessage("Please enter a Date");
			return false;
		}
		if(form.timReviewTime().getValue() == null)
		{
			engine.showMessage("Please enter a Time");
			return false;
		}
		reviewVO.setDateTimeReview(new DateTime(form.dteReviewDate().getValue(), form.timReviewTime().getValue()));
		//Site Details
	 	reviewVO.setSiteDetails(form.textBoxSiteDetails().getValue());
		//How Long - now the attribute is in findingVO
		//reviewVO.setHowLongIsItPresent(form.textBoxHowLong().getValue());
		//Pressure Sore Grade
		reviewVO.setPressureSoreGrade(form.cmbPressureGrade().getValue());
		//Length
		reviewVO.setLength(form.decBoxLength().getValue());
		//Width
		reviewVO.setWidth(form.decBoxWidth().getValue());
		//Depth
		reviewVO.setDepth(form.decBoxDepth().getValue());
		//Wound Bed
		reviewVO.setWoundBed(form.cmbWoundBed().getValue());
		//Surrounding Skin
		reviewVO.setSurroundingSkin(form.cmbSurroundingSkin().getValue());
		//Exudate Amount
		reviewVO.setExudateAmount(form.cmbExudateAmount().getValue());
		//Exudate Type
		reviewVO.setExudateType(form.cmbExudateType().getValue());
		//Odour
		reviewVO.setOdour(form.cmbOdour().getValue());
		//Pain
		reviewVO.setPain(form.cmbPain().getValue());
		//Infection Suspected
		if(form.grpInfection().getValue() != null)
		{
			if(form.grpInfection().getValue().equals(GenForm.grpInfectionEnumeration.radioButtonInfectionYes))
				reviewVO.setInfectionSuspected(new Boolean(true));
			else if(form.grpInfection().getValue().equals(GenForm.grpInfectionEnumeration.radioButtonInfectionNo))
				reviewVO.setInfectionSuspected(new Boolean(false));
		}
		//Swab taken
		if(form.grpSwab().getValue() != null)
		{
			if(form.grpSwab().getValue().equals(GenForm.grpSwabEnumeration.radioButtonSwabYes))
				reviewVO.setSwabTaken(new Boolean(true));
			else if (form.grpSwab().getValue().equals(GenForm.grpSwabEnumeration.radioButtonSwabNo))
				reviewVO.setSwabTaken(new Boolean(false));
		}
		//Wound Traced
		if(form.grpTraced() != null)
		{
			if(form.grpTraced().getValue().equals(GenForm.grpTracedEnumeration.radioButtonTracedYes))
				reviewVO.setWoundTraced(new Boolean(true));
			if(form.grpTraced().getValue().equals(GenForm.grpTracedEnumeration.radioButtonTracedNo))
				reviewVO.setWoundTraced(new Boolean(false));
		}
		//Cleansed With
		reviewVO.setCleansedWith(form.cmbCleansedWith().getValue());
		//Primary Dressing
		reviewVO.setPrimaryDressing(form.cmbPrimary().getValue());
		//Secondary Dressing
		reviewVO.setSecondaryDressing(form.cmbSecondary().getValue());
		//Frequency of Change
		reviewVO.setFrequencyOfChange(form.cmbFrequency().getValue());
		//Comment
		reviewVO.setComment(form.textBoxComment().getValue());
		
		//Discontinue
		if(form.checkBoxDiscontinueAssessment().getValue())
			findingVO.setIsDiscontinuedAssess(new Boolean (true));
		else
			findingVO.setIsDiscontinuedAssess(new Boolean (false));
	 	
		//Set the VO back to the context
	 	form.getGlobalContext().COE.SkinBodyChart.setFindingsVO(findingVO);
	 	form.getGlobalContext().COE.SkinBodyChart.setReviewVO(reviewVO);
		return true;
	}
	 public boolean populateFindingVO()
	 {
	 	//Do extra checking if necessary
	 	SkinAssessmentFindings findingVO = form.getGlobalContext().COE.SkinBodyChart.getFindingsVO();
		//Site Details
	 	findingVO.setSiteDetails(form.textBoxSiteDetails().getValue());
		//How Long
		findingVO.setHowLongIsItPresent(form.textBoxHowLong().getValue());
		//Pressure Sore Grade
		findingVO.setPressureSoreGrade(form.cmbPressureGrade().getValue());
		//Length
		findingVO.setLength(form.decBoxLength().getValue());
		//Width
		findingVO.setWidth(form.decBoxWidth().getValue());
		//Depth
		findingVO.setDepth(form.decBoxDepth().getValue());
		//Wound Bed
		findingVO.setWoundBed(form.cmbWoundBed().getValue());
		//Surrounding Skin
		findingVO.setSurroundingSkin(form.cmbSurroundingSkin().getValue());
		//Exudate Amount
		findingVO.setExudateAmount(form.cmbExudateAmount().getValue());
		//Exudate Type
		findingVO.setExudateType(form.cmbExudateType().getValue());
		//Odour
		findingVO.setOdour(form.cmbOdour().getValue());
		//Pain
		findingVO.setPain(form.cmbPain().getValue());
		//Infection Suspected
		if(form.grpInfection().getValue() != null)
		{
			if(form.grpInfection().getValue().equals(GenForm.grpInfectionEnumeration.radioButtonInfectionYes))
				findingVO.setInfectionSuspected(new Boolean(true));
			else if(form.grpInfection().getValue().equals(GenForm.grpInfectionEnumeration.radioButtonInfectionNo))
				findingVO.setInfectionSuspected(new Boolean(false));
		}
		//Swab taken
		if(form.grpSwab().getValue() != null)
		{
			if(form.grpSwab().getValue().equals(GenForm.grpSwabEnumeration.radioButtonSwabYes))
				findingVO.setSwabTaken(new Boolean(true));
			else if (form.grpSwab().getValue().equals(GenForm.grpSwabEnumeration.radioButtonSwabNo))
				findingVO.setSwabTaken(new Boolean(false));
		}
		//Wound Traced
		if(form.grpTraced() != null)
		{
			if(form.grpTraced().getValue().equals(GenForm.grpTracedEnumeration.radioButtonTracedYes))
				findingVO.setWoundTraced(new Boolean(true));
			if(form.grpTraced().getValue().equals(GenForm.grpTracedEnumeration.radioButtonTracedNo))
				findingVO.setWoundTraced(new Boolean(false));
		}
		//Cleansed With
		findingVO.setCleansedWith(form.cmbCleansedWith().getValue());
		//Primary Dressing
		findingVO.setPrimaryDressing(form.cmbPrimary().getValue());
		//Secondary Dressing
		findingVO.setSecondaryDressing(form.cmbSecondary().getValue());
		//Frequency of Change
		findingVO.setFrequencyOfChange(form.cmbFrequency().getValue());
		//Comment
		findingVO.setComment(form.textBoxComment().getValue());
		//Discontinue
		if(form.checkBoxDiscontinueAssessment().getValue())
			findingVO.setIsDiscontinuedAssess(new Boolean (true));
		else
			findingVO.setIsDiscontinuedAssess(new Boolean (false));
	 	
		//Set the VO back to the context
	 	form.getGlobalContext().COE.SkinBodyChart.setFindingsVO(findingVO);
	 	return true;
	 }
	 
	 private boolean screenOpenedFromReview()
	 {
		if(form.getGlobalContext().COE.SkinBodyChart.getReviewDialog() != null && 
				form.getGlobalContext().COE.SkinBodyChart.getReviewDialog().booleanValue())
			return true;
		
		return false;
	 }
	 
	 private void setVisiblePressureSore(boolean bValue)
	 {
	 	form.labelPressureSore().setVisible(bValue);
		form.cmbPressureGrade().setVisible(bValue);
	 }
	 
	 private void setVisibleHowLongPresent(boolean bValue)
	 {
	 	form.textBoxHowLong().setVisible(bValue);
	 	form.labelHowLongPresent().setVisible(bValue);
	 }
}
