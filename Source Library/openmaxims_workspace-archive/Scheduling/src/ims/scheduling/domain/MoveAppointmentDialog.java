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

package ims.scheduling.domain;

// Generated from form domain impl
public interface MoveAppointmentDialog extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	/**
	* list sessions for scheduling
	*/
	public ims.scheduling.vo.SessionTheatreVoCollection listSession(ims.framework.utils.Date startDate, ims.framework.utils.Date endDate, ims.core.clinical.vo.ServiceRefVo service, ims.core.resource.place.vo.LocationRefVo location, ims.vo.interfaces.IMos consultant, ims.vo.interfaces.IGenericItem procedure, ims.scheduling.vo.lookups.TheatreType theatreType, Integer timeRequired, Boolean allowOverBook, ims.clinical.vo.lookups.AnaestheticType anaestheticType);

	// Generated from form domain interface definition
	/**
	* getSessionSearchCriteriaByAppointment
	*/
	public ims.scheduling.vo.SessionSearchCriteriaVo getSessionSearchCriteriaByAppointment(ims.scheduling.vo.Booking_AppointmentRefVo appointment);

	// Generated from form domain interface definition
	/**
	* moveAppointment - move an appointment from one SessionParentChildSlot to another updating the status's and comments - also updating the Session,TheatreProcedures and SessionAppointmentOrder bo's
	*/
	public void moveAppointment(ims.scheduling.vo.SessionParentChildSlotVo fromSlot, ims.scheduling.vo.SessionParentChildSlotVo toSlot) throws ims.domain.exceptions.StaleObjectException;

	// Generated from form domain interface definition
	/**
	* getMoveAppointmentDialogData
	*/
	public ims.scheduling.vo.MoveAppointmentDataVo getMoveAppointmentDialogData(ims.scheduling.vo.SessionParentChildSlotRefVo fromSlot, ims.scheduling.vo.SessionParentChildSlotRefVo toSlot);

	// Generated from form domain interface definition
	public ims.scheduling.vo.SessionTheatreVo getSession(ims.scheduling.vo.Sch_SessionRefVo session);
}
