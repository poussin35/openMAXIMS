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

package ims.ccosched.domain;

// Generated from form domain impl
public interface ActivityView extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* list Activity Groups
	*/
	public ims.dto.client.Sd_activity_grp listActivityGroups(String act_ind_grp) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list Activities
	*/
	public ims.dto.client.Sd_activity listActivities(String act_ind, String grp_act_ind) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list Activity Action
	*/
	public ims.dto.client.Sd_activity_action listActivityAction(String act_ind, String action_act_ind) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get Lookup Instance
	*/
	public ims.dto.client.Lkup getLookupInstance(String lkup_type) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list Hcps
	*/
	public ims.dto.client.Clinical_team listHcps(String cons_firm_id) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list Booked Patients
	*/
	public ims.dto.client.Sd_aalst_pb listBookedPatients(String appt_head_id, String eb_isbooked, String activitygrp, String activity_id, String eststartdt, String opa_date, String action_id, String act_priorty, String act_consult, String act_status, String actstat, String actdstat) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* list Patients - Sd_aalst service
	*/
	public ims.dto.client.Sd_aalst lisPatients(String appt_head_id, String activitygrp, String activity_id, String eststartdt, String opa_date, String action_id, String act_priorty, String act_consult, String act_status, String actstat, String actdstat) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get a specific Patient
	*/
	public ims.core.vo.Patient getPatient(ims.core.vo.PatientShort patient) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* get Patient
	*/
	public ims.dto.client.Patient getPatient(String pkey) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.ccosched.vo.PatTreatmentPlanLiteVo getTreatmentPlan(Integer actionIdFromDTO) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* get a specific Patient
	*/
	public ims.core.vo.PatientShort getPatient(ims.core.patient.vo.PatientRefVo patient) throws ims.domain.exceptions.DomainInterfaceException, ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	public ims.core.vo.HcpLiteVoCollection listHCPs();

	// Generated from form domain interface definition
	/**
	* Return mappings for a Lookup Instance
	*/
	public ims.vo.LookupInstVo getMappings(ims.vo.LookupInstVo instance);

	// Generated from form domain interface definition
	/**
	* Return collection of Lookup Instances based on type id
	*/
	public ims.vo.LookupInstanceCollection getLookupInstances(ims.vo.LookupTypeVo type);
}
