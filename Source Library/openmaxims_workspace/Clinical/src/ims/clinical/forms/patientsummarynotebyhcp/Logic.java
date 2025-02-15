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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 3999.26423)
// Copyright (C) 1995-2011 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.patientsummarynotebyhcp;

import java.util.ArrayList;

import ims.clinical.vo.PatientSummaryNoteByHcpShortVo;
import ims.clinical.vo.PatientSummaryNoteByHcpShortVoCollection;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.domain.exceptions.DomainInterfaceException;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.domain.exceptions.UniqueKeyViolationException;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.FormOpenException;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Event handler region
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		initialize();

		open();
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}

	@Override
	protected void onRecbrNotesValueChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		// Set selected instance
		form.getLocalContext().setSelectedSummaryNote(domain.getSummaryNote(form.recbrNotes().getValue()));

		// Populate instance controls
		populateInstanceControls(form.getLocalContext().getSelectedSummaryNote());

		// Update controls state
		updateControlsState();
	}


	@Override
	protected void onImbSpellCheckClick() throws PresentationLogicException
	{
		// Call spell check for note
		form.richNote().spellCheck();		
	}

	@Override
	protected void onBtnNewClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Create a new instance
		newInstance();
	}

	@Override
	protected void onBtnEditClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Update current instance
		updateInstance();
	}

	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Refresh screen on successful save
		if (save())
			open();
	}

	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		// Refresh screen
		open();
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Form function
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void initialize() throws FormOpenException
	{
		// Clear local context for selected record
		form.getLocalContext().setSelectedSummaryNote(null);
		
		// Initialise authoring information component
		form.ccAuthoringInfo().setIsRequiredPropertyToControls(Boolean.TRUE);
		
		form.ccAuthoringInfo().setEnabledAuthoringHCP(Boolean.FALSE);
		form.ccAuthoringInfo().setEnabledDateTime(Boolean.FALSE);
	}
	
	public void open() throws ims.framework.exceptions.PresentationLogicException
	{
		// Clear screen
		clearScreen();
		
		// Refresh summary note - might have fallen at save (validation or another note for the same HCP existed)
		form.getLocalContext().setSelectedSummaryNote(domain.getSummaryNote(form.getLocalContext().getSelectedSummaryNote()));

		// List summary notes to record browser
		populateRecordBrowser(domain.listSummaryNotes(form.getGlobalContext().Core.getPatientShort()));

		// Reselect & populate instance controls with last selected instance or with last entered
		form.getLocalContext().setSelectedSummaryNote(domain.getSummaryNote(form.recbrNotes().getValue()));
		populateInstanceControls(form.getLocalContext().getSelectedSummaryNote());

		// Set form to VIEW mode
		form.setMode(FormMode.VIEW);
	}

	public void newInstance() throws ims.framework.exceptions.PresentationLogicException
	{
		// Clear instance controls
		clearInstanceControls();
		
		// Clear local context for selected instance
		form.getLocalContext().setSelectedSummaryNote(null);
		
		// Default authoring information data
		AuthoringInformationVo authInfo = new AuthoringInformationVo();
		authInfo.setAuthoringDateTime(new DateTime());
		authInfo.setAuthoringHcp((HcpLiteVo) domain.getHcpLiteUser());
		form.ccAuthoringInfo().setValue(authInfo);
		
		// Enable HCP editing
		form.ccAuthoringInfo().setEnabledAuthoringHCP(Boolean.TRUE);
		
		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}

	public void updateInstance()
	{
		// Disable HCP editing
		form.ccAuthoringInfo().setEnabledAuthoringHCP(Boolean.FALSE);
		
		// Set form to EDIT mode
		form.setMode(FormMode.EDIT);
	}

	public boolean save() throws ims.framework.exceptions.PresentationLogicException
	{
		try
		{
			// Get data from screen
			form.getLocalContext().setSelectedSummaryNote(populateDataFromInstanceControls(form.getLocalContext().getSelectedSummaryNote()));

			// Validate UI Rules & VO
			String[] errors = validateUIRules();
			errors = form.getLocalContext().getSelectedSummaryNote().validate(errors);

			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}

			form.getLocalContext().setSelectedSummaryNote(domain.saveSummaryNote(form.getLocalContext().getSelectedSummaryNote()));

			// Assume successful save
			return true;
		}
		catch (DomainInterfaceException e)
		{
			engine.showMessage(e.getMessage());
			e.printStackTrace();
			return false;
		}
		catch (StaleObjectException e)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			e.printStackTrace();
			open();
			return false;
		}
		catch (ForeignKeyViolationException e)
		{
			engine.showMessage(e.getMessage());
			e.printStackTrace();
			return false;
		}
		catch (UniqueKeyViolationException e)
		{
			engine.showMessage(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	private void clearScreen()
	{
		// Clear record browser
		form.recbrNotes().clear();

		// Clear instance controls
		clearInstanceControls();
	}

	public void clearInstanceControls()
	{
		// Clear authoring information and notes controls
		form.ccAuthoringInfo().setValue(null);
		form.richNote().setValue(null);
	}

	public void updateControlsState()
	{
		if (FormMode.VIEW.equals(form.getMode()))
		{
			form.btnNew().setVisible(true);
			form.btnNew().setEnabled(!Boolean.TRUE.equals(form.getLocalContext().getHcpRecordExists()));
			form.btnEdit().setVisible(form.recbrNotes().getValue() != null);
		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Data exchange functions
	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------

	private void populateRecordBrowser(PatientSummaryNoteByHcpShortVoCollection summaryNotes)
	{
		// Clear record browser
		form.recbrNotes().clear();
		form.getLocalContext().setHcpRecordExists(Boolean.FALSE);

		// Terminate function if notes collection is null
		if (summaryNotes == null)
			return;

		// Iterate notes collection
		for (PatientSummaryNoteByHcpShortVo note : summaryNotes)
		{
			// Skip null notes
			if (note == null)
				continue;
			
			// Build string to be displayed
			StringBuilder displayText = new StringBuilder();

			displayText.append(note.getAuthoringInformation().getAuthoringHcpIsNotNull() ? note.getAuthoringInformation().getAuthoringHcp().toString() : "");
			displayText.append(" - " + note.getAuthoringInformation().getAuthoringDateTime().toString());

			if (note.getSystemInformationIsNotNull() && note.getSystemInformation().getLastupdateDateTime() != null)
				displayText.append(" - " + note.getSystemInformation().getLastupdateDateTime().toString());

			// Add note to record browser
			form.recbrNotes().newRow(note, displayText.toString());
			
			if (note.getAuthoringInformation().getAuthoringHcpIsNotNull() && note.getAuthoringInformation().getAuthoringHcp().equals(domain.getHcpLiteUser()))
				form.getLocalContext().setHcpRecordExists(Boolean.TRUE);
		}

		// Selected last recorded note (if any)
		if (summaryNotes.size() > 0)
			form.recbrNotes().setValue(summaryNotes.get(0));

		// Reselect previously saved note (or last selected note)
		if (form.getLocalContext().getSelectedSummaryNoteIsNotNull())
			form.recbrNotes().setValue(form.getLocalContext().getSelectedSummaryNote());
	}

	private void populateInstanceControls(PatientSummaryNoteByHcpShortVo summaryNote)
	{
		// Clear instance controls
		clearInstanceControls();
		
		// Terminate function if summary note is null
		if (summaryNote == null)
			return;
		
		// Set instance controls value
		form.ccAuthoringInfo().setValue(summaryNote.getAuthoringInformation());
		form.richNote().setValue(summaryNote.getSummaryNote());
	}

	private PatientSummaryNoteByHcpShortVo populateDataFromInstanceControls(PatientSummaryNoteByHcpShortVo summaryNote)
	{
		if (summaryNote == null)
		{
			// Set data for new instance
			summaryNote = new PatientSummaryNoteByHcpShortVo();
			summaryNote.setPatient(form.getGlobalContext().Core.getPatientShort());
		}

		// Populate data from instance controls
		summaryNote.setAuthoringInformation(form.ccAuthoringInfo().getValue());
		summaryNote.setSummaryNote(form.richNote().getValue());

		// Return instance value
		return summaryNote;
	}

	public String[] validateUIRules()
	{
		ArrayList<String> errorList = new ArrayList<String>();
		
		if (form.ccAuthoringInfo().getValue() != null && !form.ccAuthoringInfo().getValue().getAuthoringHcpIsNotNull())
		{
			errorList.add("Authoring HCP is mandatory.");
		}
		
		if (errorList.size() == 0)
			return null;
		
		String[] errors = new String[errorList.size()];
		
		for (int i = 0; i < errorList.size(); i++)
			errors[i] = errorList.get(i);

		return errors;
	}
}
