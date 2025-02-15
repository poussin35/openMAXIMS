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

package ims.assessment.vo;

/**
 * Linked to Assessment.Configuration.GraphicAssessmentFindingQuestion business object (ID: 1028100013).
 */
public class GraphicAssessmentFindingQuestionVo extends ims.assessment.configuration.vo.GraphicAssessmentFindingQuestionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public GraphicAssessmentFindingQuestionVo()
	{
	}
	public GraphicAssessmentFindingQuestionVo(Integer id, int version)
	{
		super(id, version);
	}
	public GraphicAssessmentFindingQuestionVo(ims.assessment.vo.beans.GraphicAssessmentFindingQuestionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.question = bean.getQuestion() == null ? null : bean.getQuestion().buildVo();
		this.ismandatory = bean.getIsMandatory();
		this.activestatus = bean.getActiveStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getActiveStatus());
		this.sequence = bean.getSequence();
		this.allowsmultipleanswers = bean.getAllowsMultipleAnswers();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.beans.GraphicAssessmentFindingQuestionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.question = bean.getQuestion() == null ? null : bean.getQuestion().buildVo(map);
		this.ismandatory = bean.getIsMandatory();
		this.activestatus = bean.getActiveStatus() == null ? null : ims.core.vo.lookups.PreActiveActiveInactiveStatus.buildLookup(bean.getActiveStatus());
		this.sequence = bean.getSequence();
		this.allowsmultipleanswers = bean.getAllowsMultipleAnswers();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.beans.GraphicAssessmentFindingQuestionVoBean bean = null;
		if(map != null)
			bean = (ims.assessment.vo.beans.GraphicAssessmentFindingQuestionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.assessment.vo.beans.GraphicAssessmentFindingQuestionVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("QUESTION"))
			return getQuestion();
		if(fieldName.equals("ISMANDATORY"))
			return getIsMandatory();
		if(fieldName.equals("ACTIVESTATUS"))
			return getActiveStatus();
		if(fieldName.equals("SEQUENCE"))
			return getSequence();
		if(fieldName.equals("ALLOWSMULTIPLEANSWERS"))
			return getAllowsMultipleAnswers();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getQuestionIsNotNull()
	{
		return this.question != null;
	}
	public ims.core.vo.QuestionInformationVo getQuestion()
	{
		return this.question;
	}
	public void setQuestion(ims.core.vo.QuestionInformationVo value)
	{
		this.isValidated = false;
		this.question = value;
	}
	public boolean getIsMandatoryIsNotNull()
	{
		return this.ismandatory != null;
	}
	public Boolean getIsMandatory()
	{
		return this.ismandatory;
	}
	public void setIsMandatory(Boolean value)
	{
		this.isValidated = false;
		this.ismandatory = value;
	}
	public boolean getActiveStatusIsNotNull()
	{
		return this.activestatus != null;
	}
	public ims.core.vo.lookups.PreActiveActiveInactiveStatus getActiveStatus()
	{
		return this.activestatus;
	}
	public void setActiveStatus(ims.core.vo.lookups.PreActiveActiveInactiveStatus value)
	{
		this.isValidated = false;
		this.activestatus = value;
	}
	public boolean getSequenceIsNotNull()
	{
		return this.sequence != null;
	}
	public Integer getSequence()
	{
		return this.sequence;
	}
	public void setSequence(Integer value)
	{
		this.isValidated = false;
		this.sequence = value;
	}
	public boolean getAllowsMultipleAnswersIsNotNull()
	{
		return this.allowsmultipleanswers != null;
	}
	public Boolean getAllowsMultipleAnswers()
	{
		return this.allowsmultipleanswers;
	}
	public void setAllowsMultipleAnswers(Boolean value)
	{
		this.isValidated = false;
		this.allowsmultipleanswers = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.sequence == null)
			listOfErrors.add("Sequence is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		GraphicAssessmentFindingQuestionVo clone = new GraphicAssessmentFindingQuestionVo(this.id, this.version);
		
		if(this.question == null)
			clone.question = null;
		else
			clone.question = (ims.core.vo.QuestionInformationVo)this.question.clone();
		clone.ismandatory = this.ismandatory;
		if(this.activestatus == null)
			clone.activestatus = null;
		else
			clone.activestatus = (ims.core.vo.lookups.PreActiveActiveInactiveStatus)this.activestatus.clone();
		clone.sequence = this.sequence;
		clone.allowsmultipleanswers = this.allowsmultipleanswers;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(GraphicAssessmentFindingQuestionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A GraphicAssessmentFindingQuestionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		GraphicAssessmentFindingQuestionVo compareObj = (GraphicAssessmentFindingQuestionVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getSequence() == null && compareObj.getSequence() != null)
				return -1;
			if(this.getSequence() != null && compareObj.getSequence() == null)
				return 1;
			if(this.getSequence() != null && compareObj.getSequence() != null)
				retVal = this.getSequence().compareTo(compareObj.getSequence());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.question != null)
			count++;
		if(this.ismandatory != null)
			count++;
		if(this.activestatus != null)
			count++;
		if(this.sequence != null)
			count++;
		if(this.allowsmultipleanswers != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.core.vo.QuestionInformationVo question;
	protected Boolean ismandatory;
	protected ims.core.vo.lookups.PreActiveActiveInactiveStatus activestatus;
	protected Integer sequence;
	protected Boolean allowsmultipleanswers;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
