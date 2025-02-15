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

package ims.emergency.forms.emergencyattendancesdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		Emergency = new EmergencyContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getImsReportIdIsNotNull()
		{
			return !cx_CoreImsReportId.getValueIsNull(context);
		}
		public Integer getImsReportId()
		{
			return (Integer)cx_CoreImsReportId.getValue(context);
		}
		public void setImsReportId(Integer value)
		{
			cx_CoreImsReportId.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreImsReportId = new ims.framework.ContextVariable("Core.ImsReportId", "_cv_Core.ImsReportId");
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
	public final class EmergencyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private EmergencyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getEmergencyEpisodeDetailsIsNotNull()
		{
			return !cx_EmergencyEmergencyEpisodeDetails.getValueIsNull(context);
		}
		public ims.emergency.vo.EpisodeDetailsVo getEmergencyEpisodeDetails()
		{
			return (ims.emergency.vo.EpisodeDetailsVo)cx_EmergencyEmergencyEpisodeDetails.getValue(context);
		}
		public void setEmergencyEpisodeDetails(ims.emergency.vo.EpisodeDetailsVo value)
		{
			cx_EmergencyEmergencyEpisodeDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyEmergencyEpisodeDetails = new ims.framework.ContextVariable("Emergency.EmergencyEpisodeDetails", "_cv_Emergency.EmergencyEpisodeDetails");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public EmergencyContext Emergency;
}
