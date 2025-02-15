// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.referralappointmentdetailscomponent;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Scheduling = new SchedulingContext(context);
		OCRR = new OCRRContext(context);
		RefMan = new RefManContext(context);
		Rotherham = new RotherhamContext(context);
		ChooseAndBook = new ChooseAndBookContext(context);
		Core = new CoreContext(context);
	}
	public final class SchedulingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private SchedulingContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getBookingAppointmentIsNotNull()
		{
			return !cx_SchedulingBookingAppointment.getValueIsNull(context);
		}
		public ims.scheduling.vo.Booking_AppointmentVo getBookingAppointment()
		{
			return (ims.scheduling.vo.Booking_AppointmentVo)cx_SchedulingBookingAppointment.getValue(context);
		}
		public void setBookingAppointment(ims.scheduling.vo.Booking_AppointmentVo value)
		{
			cx_SchedulingBookingAppointment.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingAppointment = new ims.framework.ContextVariable("Scheduling.BookingAppointment", "_cv_Scheduling.BookingAppointment");
		public boolean getBookingServiceIsNotNull()
		{
			return !cx_SchedulingBookingService.getValueIsNull(context);
		}
		public ims.core.clinical.vo.ServiceRefVo getBookingService()
		{
			return (ims.core.clinical.vo.ServiceRefVo)cx_SchedulingBookingService.getValue(context);
		}
		public void setBookingService(ims.core.clinical.vo.ServiceRefVo value)
		{
			cx_SchedulingBookingService.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingService = new ims.framework.ContextVariable("Scheduling.BookingService", "_cv_Scheduling.BookingService");
		public boolean getBookingSessionIsNotNull()
		{
			return !cx_SchedulingBookingSession.getValueIsNull(context);
		}
		public ims.scheduling.vo.Sch_SessionRefVo getBookingSession()
		{
			return (ims.scheduling.vo.Sch_SessionRefVo)cx_SchedulingBookingSession.getValue(context);
		}
		public void setBookingSession(ims.scheduling.vo.Sch_SessionRefVo value)
		{
			cx_SchedulingBookingSession.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingSession = new ims.framework.ContextVariable("Scheduling.BookingSession", "_cv_Scheduling.BookingSession");
		public boolean getApptCancelStatusIsNotNull()
		{
			return !cx_SchedulingApptCancelStatus.getValueIsNull(context);
		}
		public ims.scheduling.vo.Appointment_StatusVo getApptCancelStatus()
		{
			return (ims.scheduling.vo.Appointment_StatusVo)cx_SchedulingApptCancelStatus.getValue(context);
		}
		public void setApptCancelStatus(ims.scheduling.vo.Appointment_StatusVo value)
		{
			cx_SchedulingApptCancelStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingApptCancelStatus = new ims.framework.ContextVariable("Scheduling.ApptCancelStatus", "_cv_Scheduling.ApptCancelStatus");
		public boolean getTheatreConsultantIsNotNull()
		{
			return !cx_SchedulingTheatreConsultant.getValueIsNull(context);
		}
		public ims.vo.interfaces.IMos getTheatreConsultant()
		{
			return (ims.vo.interfaces.IMos)cx_SchedulingTheatreConsultant.getValue(context);
		}
		public void setTheatreConsultant(ims.vo.interfaces.IMos value)
		{
			cx_SchedulingTheatreConsultant.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreConsultant = new ims.framework.ContextVariable("Scheduling.TheatreConsultant", "_cv_Scheduling.TheatreConsultant");
		public boolean getTheatreProcedureIsNotNull()
		{
			return !cx_SchedulingTheatreProcedure.getValueIsNull(context);
		}
		public ims.core.vo.ProcedureLiteVo getTheatreProcedure()
		{
			return (ims.core.vo.ProcedureLiteVo)cx_SchedulingTheatreProcedure.getValue(context);
		}
		public void setTheatreProcedure(ims.core.vo.ProcedureLiteVo value)
		{
			cx_SchedulingTheatreProcedure.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreProcedure = new ims.framework.ContextVariable("Scheduling.TheatreProcedure", "_cv_Scheduling.TheatreProcedure");
		public boolean getTheatreServiceIsNotNull()
		{
			return !cx_SchedulingTheatreService.getValueIsNull(context);
		}
		public ims.core.vo.ServiceLiteVo getTheatreService()
		{
			return (ims.core.vo.ServiceLiteVo)cx_SchedulingTheatreService.getValue(context);
		}
		public void setTheatreService(ims.core.vo.ServiceLiteVo value)
		{
			cx_SchedulingTheatreService.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreService = new ims.framework.ContextVariable("Scheduling.TheatreService", "_cv_Scheduling.TheatreService");
		public boolean getTheatreAppointmentIsNotNull()
		{
			return !cx_SchedulingTheatreAppointment.getValueIsNull(context);
		}
		public ims.scheduling.vo.BookingAppointmentTheatreVo getTheatreAppointment()
		{
			return (ims.scheduling.vo.BookingAppointmentTheatreVo)cx_SchedulingTheatreAppointment.getValue(context);
		}
		public void setTheatreAppointment(ims.scheduling.vo.BookingAppointmentTheatreVo value)
		{
			cx_SchedulingTheatreAppointment.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreAppointment = new ims.framework.ContextVariable("Scheduling.TheatreAppointment", "_cv_Scheduling.TheatreAppointment");
		public boolean getBookingActivityIsNotNull()
		{
			return !cx_SchedulingBookingActivity.getValueIsNull(context);
		}
		public ims.core.resource.place.vo.ActivityRefVo getBookingActivity()
		{
			return (ims.core.resource.place.vo.ActivityRefVo)cx_SchedulingBookingActivity.getValue(context);
		}
		public void setBookingActivity(ims.core.resource.place.vo.ActivityRefVo value)
		{
			cx_SchedulingBookingActivity.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingActivity = new ims.framework.ContextVariable("Scheduling.BookingActivity", "_cv_Scheduling.BookingActivity");
		public boolean getTheatreTypeIsNotNull()
		{
			return !cx_SchedulingTheatreType.getValueIsNull(context);
		}
		public ims.scheduling.vo.lookups.TheatreType getTheatreType()
		{
			return (ims.scheduling.vo.lookups.TheatreType)cx_SchedulingTheatreType.getValue(context);
		}
		public void setTheatreType(ims.scheduling.vo.lookups.TheatreType value)
		{
			cx_SchedulingTheatreType.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreType = new ims.framework.ContextVariable("Scheduling.TheatreType", "_cv_Scheduling.TheatreType");
		public boolean getBookingAppointmentRefIsNotNull()
		{
			return !cx_SchedulingBookingAppointmentRef.getValueIsNull(context);
		}
		public ims.scheduling.vo.Booking_AppointmentRefVo getBookingAppointmentRef()
		{
			return (ims.scheduling.vo.Booking_AppointmentRefVo)cx_SchedulingBookingAppointmentRef.getValue(context);
		}
		public void setBookingAppointmentRef(ims.scheduling.vo.Booking_AppointmentRefVo value)
		{
			cx_SchedulingBookingAppointmentRef.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingAppointmentRef = new ims.framework.ContextVariable("Scheduling.BookingAppointmentRef", "_cv_Scheduling.BookingAppointmentRef");

		private ims.framework.Context context;
	}
	public final class OCRRContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OCRRContext(ims.framework.Context context)
		{
			this.context = context;

			PathologyResults = new PathologyResultsContext(context);
		}
		public final class PathologyResultsContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private PathologyResultsContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getOrderIsNotNull()
			{
				return !cx_OCRRPathologyResultsOrder.getValueIsNull(context);
			}
			public ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo getOrder()
			{
				return (ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo)cx_OCRRPathologyResultsOrder.getValue(context);
			}
		public void setOrder(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo value)
		{
				cx_OCRRPathologyResultsOrder.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_OCRRPathologyResultsOrder = new ims.framework.ContextVariable("OCRR.PathologyResults.Order", "_cv_OCRR.PathologyResults.Order");
			private ims.framework.Context context;
		}

		public boolean getCurrentPathRadResultIsNotNull()
		{
			return !cx_OCRRCurrentPathRadResult.getValueIsNull(context);
		}
		public ims.ocrr.vo.OcsPathRadResultVo getCurrentPathRadResult()
		{
			return (ims.ocrr.vo.OcsPathRadResultVo)cx_OCRRCurrentPathRadResult.getValue(context);
		}
		public void setCurrentPathRadResult(ims.ocrr.vo.OcsPathRadResultVo value)
		{
			cx_OCRRCurrentPathRadResult.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRCurrentPathRadResult = new ims.framework.ContextVariable("OCRR.CurrentPathRadResult", "_cv_OCRR.CurrentPathRadResult");
		public boolean getResultDisplayDateIsNotNull()
		{
			return !cx_OCRRResultDisplayDate.getValueIsNull(context);
		}
		public ims.framework.utils.Date getResultDisplayDate()
		{
			return (ims.framework.utils.Date)cx_OCRRResultDisplayDate.getValue(context);
		}
		public void setResultDisplayDate(ims.framework.utils.Date value)
		{
			cx_OCRRResultDisplayDate.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRResultDisplayDate = new ims.framework.ContextVariable("OCRR.ResultDisplayDate", "_cv_OCRR.ResultDisplayDate");
		public boolean getReferralAppointmentDetailsOcsOrderVoCollectionIsNotNull()
		{
			return !cx_OCRRReferralAppointmentDetailsOcsOrderVoCollection.getValueIsNull(context);
		}
		public ims.ocrr.vo.ReferralAppointmentDetailsOcsOrderVoCollection getReferralAppointmentDetailsOcsOrderVoCollection()
		{
			return (ims.ocrr.vo.ReferralAppointmentDetailsOcsOrderVoCollection)cx_OCRRReferralAppointmentDetailsOcsOrderVoCollection.getValue(context);
		}
		public void setReferralAppointmentDetailsOcsOrderVoCollection(ims.ocrr.vo.ReferralAppointmentDetailsOcsOrderVoCollection value)
		{
			cx_OCRRReferralAppointmentDetailsOcsOrderVoCollection.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRReferralAppointmentDetailsOcsOrderVoCollection = new ims.framework.ContextVariable("OCRR.ReferralAppointmentDetailsOcsOrderVoCollection", "_cv_OCRR.ReferralAppointmentDetailsOcsOrderVoCollection");

		public PathologyResultsContext PathologyResults;
		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

			EnterAppointmentDetails = new EnterAppointmentDetailsContext(context);
		}
		public final class EnterAppointmentDetailsContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private EnterAppointmentDetailsContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getApptDateIsNotNull()
			{
				return !cx_RefManEnterAppointmentDetailsApptDate.getValueIsNull(context);
			}
			public ims.framework.utils.DateTime getApptDate()
			{
				return (ims.framework.utils.DateTime)cx_RefManEnterAppointmentDetailsApptDate.getValue(context);
			}
		public void setApptDate(ims.framework.utils.DateTime value)
		{
				cx_RefManEnterAppointmentDetailsApptDate.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_RefManEnterAppointmentDetailsApptDate = new ims.framework.ContextVariable("RefMan.EnterAppointmentDetails.ApptDate", "_cv_RefMan.EnterAppointmentDetails.ApptDate");
			private ims.framework.Context context;
		}

		public boolean getSpecimenWorkListItemsIsNotNull()
		{
			return !cx_RefManSpecimenWorkListItems.getValueIsNull(context);
		}
		public ims.ocrr.vo.SpecimenWorkListItemLiteVoCollection getSpecimenWorkListItems()
		{
			return (ims.ocrr.vo.SpecimenWorkListItemLiteVoCollection)cx_RefManSpecimenWorkListItems.getValue(context);
		}
		public void setSpecimenWorkListItems(ims.ocrr.vo.SpecimenWorkListItemLiteVoCollection value)
		{
			cx_RefManSpecimenWorkListItems.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSpecimenWorkListItems = new ims.framework.ContextVariable("RefMan.SpecimenWorkListItems", "_cv_RefMan.SpecimenWorkListItems");
		public boolean getIsProviderCancellationIsNotNull()
		{
			return !cx_RefManIsProviderCancellation.getValueIsNull(context);
		}
		public Boolean getIsProviderCancellation()
		{
			return (Boolean)cx_RefManIsProviderCancellation.getValue(context);
		}
		public void setIsProviderCancellation(Boolean value)
		{
			cx_RefManIsProviderCancellation.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManIsProviderCancellation = new ims.framework.ContextVariable("RefMan.IsProviderCancellation", "_cvp_RefMan.IsProviderCancellation");
		public boolean getSpecimenWorkListItemIsNotNull()
		{
			return !cx_RefManSpecimenWorkListItem.getValueIsNull(context);
		}
		public ims.ocrr.vo.SpecimenWorkListItemLiteVo getSpecimenWorkListItem()
		{
			return (ims.ocrr.vo.SpecimenWorkListItemLiteVo)cx_RefManSpecimenWorkListItem.getValue(context);
		}
		public void setSpecimenWorkListItem(ims.ocrr.vo.SpecimenWorkListItemLiteVo value)
		{
			cx_RefManSpecimenWorkListItem.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManSpecimenWorkListItem = new ims.framework.ContextVariable("RefMan.SpecimenWorkListItem", "_cv_RefMan.SpecimenWorkListItem");
		public boolean getOrderingHCPIsNotNull()
		{
			return !cx_RefManOrderingHCP.getValueIsNull(context);
		}
		public ims.core.vo.MemberOfStaffLiteVo getOrderingHCP()
		{
			return (ims.core.vo.MemberOfStaffLiteVo)cx_RefManOrderingHCP.getValue(context);
		}
		public void setOrderingHCP(ims.core.vo.MemberOfStaffLiteVo value)
		{
			cx_RefManOrderingHCP.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManOrderingHCP = new ims.framework.ContextVariable("RefMan.OrderingHCP", "_cv_RefMan.OrderingHCP");
		public boolean getCatsReferralIsNotNull()
		{
			return !cx_RefManCatsReferral.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
		{
			return (ims.RefMan.vo.CatsReferralRefVo)cx_RefManCatsReferral.getValue(context);
		}
		public void setCatsReferral(ims.RefMan.vo.CatsReferralRefVo value)
		{
			cx_RefManCatsReferral.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");
		public boolean getTCIOutcomeForPatientElectiveListIsNotNull()
		{
			return !cx_RefManTCIOutcomeForPatientElectiveList.getValueIsNull(context);
		}
		public ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo getTCIOutcomeForPatientElectiveList()
		{
			return (ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo)cx_RefManTCIOutcomeForPatientElectiveList.getValue(context);
		}
		public void setTCIOutcomeForPatientElectiveList(ims.RefMan.vo.TCIOutcomeForPatientElectiveListVo value)
		{
			cx_RefManTCIOutcomeForPatientElectiveList.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManTCIOutcomeForPatientElectiveList = new ims.framework.ContextVariable("RefMan.TCIOutcomeForPatientElectiveList", "_cv_RefMan.TCIOutcomeForPatientElectiveList");
		public boolean getPatientElectiveListRefIsNotNull()
		{
			return !cx_RefManPatientElectiveListRef.getValueIsNull(context);
		}
		public ims.RefMan.vo.PatientElectiveListRefVo getPatientElectiveListRef()
		{
			return (ims.RefMan.vo.PatientElectiveListRefVo)cx_RefManPatientElectiveListRef.getValue(context);
		}
		public void setPatientElectiveListRef(ims.RefMan.vo.PatientElectiveListRefVo value)
		{
			cx_RefManPatientElectiveListRef.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientElectiveListRef = new ims.framework.ContextVariable("RefMan.PatientElectiveListRef", "_cv_RefMan.PatientElectiveListRef");

		public EnterAppointmentDetailsContext EnterAppointmentDetails;
		private ims.framework.Context context;
	}
	public final class RotherhamContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RotherhamContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getBookedAppointmentsIsNotNull()
		{
			return !cx_RotherhamBookedAppointments.getValueIsNull(context);
		}
		public ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection getBookedAppointments()
		{
			return (ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection)cx_RotherhamBookedAppointments.getValue(context);
		}
		public void setBookedAppointments(ims.scheduling.vo.ReferralAppointmentDetailsBookingAppointmentVoCollection value)
		{
			cx_RotherhamBookedAppointments.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RotherhamBookedAppointments = new ims.framework.ContextVariable("Rotherham.BookedAppointments", "_cv_Rotherham.BookedAppointments");
		public boolean getAppointmentToLinkIsNotNull()
		{
			return !cx_RotherhamAppointmentToLink.getValueIsNull(context);
		}
		public ims.scheduling.vo.Booking_AppointmentRefVo getAppointmentToLink()
		{
			return (ims.scheduling.vo.Booking_AppointmentRefVo)cx_RotherhamAppointmentToLink.getValue(context);
		}
		public void setAppointmentToLink(ims.scheduling.vo.Booking_AppointmentRefVo value)
		{
			cx_RotherhamAppointmentToLink.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RotherhamAppointmentToLink = new ims.framework.ContextVariable("Rotherham.AppointmentToLink", "_cv_Rotherham.AppointmentToLink");

		private ims.framework.Context context;
	}
	public final class ChooseAndBookContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ChooseAndBookContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getisCABApptIsNotNull()
		{
			return !cx_ChooseAndBookisCABAppt.getValueIsNull(context);
		}
		public Boolean getisCABAppt()
		{
			return (Boolean)cx_ChooseAndBookisCABAppt.getValue(context);
		}
		public void setisCABAppt(Boolean value)
		{
			cx_ChooseAndBookisCABAppt.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ChooseAndBookisCABAppt = new ims.framework.ContextVariable("ChooseAndBook.isCABAppt", "_cv_ChooseAndBook.isCABAppt");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}

	public SchedulingContext Scheduling;
	public OCRRContext OCRR;
	public RefManContext RefMan;
	public RotherhamContext Rotherham;
	public ChooseAndBookContext ChooseAndBook;
	public CoreContext Core;
}
