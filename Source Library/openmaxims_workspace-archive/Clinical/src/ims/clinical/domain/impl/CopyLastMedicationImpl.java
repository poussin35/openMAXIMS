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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.71 build 3876.15807)
// Copyright (C) 1995-2010 IMS MAXIMS. All rights reserved.

package ims.clinical.domain.impl;

import ims.clinical.domain.base.impl.BaseCopyLastMedicationImpl;
import ims.core.admin.domain.objects.CareContext;
import ims.core.patient.vo.PatientRefVo;
import ims.core.vo.CareContextLiteVo;
import ims.core.vo.PatientMedicationVoCollection;
import ims.core.vo.domain.CareContextLiteVoAssembler;
import ims.core.vo.domain.PatientMedicationVoAssembler;
import ims.core.vo.lookups.ContextType;
import ims.framework.utils.DateTime;

import java.util.ArrayList;

public class CopyLastMedicationImpl extends BaseCopyLastMedicationImpl
{

	private static final long serialVersionUID = 1L;


	public PatientMedicationVoCollection listMedications(PatientRefVo patientRef, DateTime startDateTime)
	{
		// Check patient
		if (patientRef == null || !patientRef.getID_PatientIsNotNull())
			return null;

		// Get last care context (of type INPATIET)
		StringBuilder ccQuery = new StringBuilder();
		ccQuery.append("select cc from PatientMedication as pmed join pmed.careContext as cc where pmed.patient.id = :PAT_ID and cc.context.id = :CC_TYPE and (pmed.isRIE is null or pmed.isRIE = 0) and (pmed.isDiscontinued is null or pmed.isDiscontinued = 0)");
		
		ArrayList<String> paramCCNames = new ArrayList<String>();
		ArrayList<Object> paramCCValues = new ArrayList<Object>();
		
		paramCCNames.add("PAT_ID");
		paramCCNames.add("CC_TYPE");
		paramCCValues.add(patientRef.getID_Patient());
		paramCCValues.add(ContextType.INPATIENT.getID());
		
		if (startDateTime != null)
		{
			ccQuery.append(" and cc.startDateTime <= :DATE");
			paramCCNames.add("DATE");
			paramCCValues.add(startDateTime.getJavaDate());
		}
		
		ccQuery.append(" order by cc.startDateTime desc");

		CareContextLiteVo careContext = CareContextLiteVoAssembler.create((CareContext) getDomainFactory().findFirst(ccQuery.toString(), paramCCNames, paramCCValues));
		
		if (careContext == null || !careContext.getID_CareContextIsNotNull())
			return null;
		
		String hqlQuery = "select pmed from PatientMedication as pmed where pmed.patient.id = :PAT_ID and pmed.careContext.id = :CC_ID and (pmed.isDiscontinued is null or pmed.isDiscontinued is false)";
		ArrayList<String> paramPMedNames = new ArrayList<String>();
		ArrayList<Object> paramPMedValues = new ArrayList<Object>();
		
		paramPMedNames.add("PAT_ID");
		paramPMedNames.add("CC_ID");
		paramPMedValues.add(patientRef.getID_Patient());
		paramPMedValues.add(careContext.getID_CareContext());
		
		return PatientMedicationVoAssembler.createPatientMedicationVoCollectionFromPatientMedication(getDomainFactory().find(hqlQuery, paramPMedNames, paramPMedValues));
	}
}
