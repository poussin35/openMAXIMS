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

package ims.emergency.forms.edwhiteboardnewdialog;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Emergency = new EmergencyContext(context);
		Core = new CoreContext(context);
	}
	public final class EmergencyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private EmergencyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getWhiteBoardConfigIsNotNull()
		{
			return !cx_EmergencyWhiteBoardConfig.getValueIsNull(context);
		}
		public ims.emergency.vo.WhiteBoardConfigVo getWhiteBoardConfig()
		{
			return (ims.emergency.vo.WhiteBoardConfigVo)cx_EmergencyWhiteBoardConfig.getValue(context);
		}
		public void setWhiteBoardConfig(ims.emergency.vo.WhiteBoardConfigVo value)
		{
			cx_EmergencyWhiteBoardConfig.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyWhiteBoardConfig = new ims.framework.ContextVariable("Emergency.WhiteBoardConfig", "_cv_Emergency.WhiteBoardConfig");
		public boolean getTrackingIsNotNull()
		{
			return !cx_EmergencyTracking.getValueIsNull(context);
		}
		public ims.emergency.vo.TrackingRefVo getTracking()
		{
			return (ims.emergency.vo.TrackingRefVo)cx_EmergencyTracking.getValue(context);
		}
		public void setTracking(ims.emergency.vo.TrackingRefVo value)
		{
			cx_EmergencyTracking.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyTracking = new ims.framework.ContextVariable("Emergency.Tracking", "_cv_Emergency.Tracking");
		public boolean getTrackingPublicAreaIsNotNull()
		{
			return !cx_EmergencyTrackingPublicArea.getValueIsNull(context);
		}
		public Boolean getTrackingPublicArea()
		{
			return (Boolean)cx_EmergencyTrackingPublicArea.getValue(context);
		}
		public void setTrackingPublicArea(Boolean value)
		{
			cx_EmergencyTrackingPublicArea.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_EmergencyTrackingPublicArea = new ims.framework.ContextVariable("Emergency.TrackingPublicArea", "_cvp_Emergency.TrackingPublicArea");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

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

	public EmergencyContext Emergency;
	public CoreContext Core;
}
