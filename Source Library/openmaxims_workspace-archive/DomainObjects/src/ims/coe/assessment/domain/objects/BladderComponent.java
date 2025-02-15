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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 16/04/2014, 12:34
 *
 */
package ims.coe.assessment.domain.objects;

/**
 * 
 * @author Sinead McDermott
 * Generated.
 */


public class BladderComponent extends ims.nursing.assessment.domain.objects.AssessmentComponent implements java.io.Serializable {
	public static final int CLASSID = 1012100005;
	private static final long serialVersionUID = 1012100005L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private ims.nursing.assessment.domain.objects.BladderContinence continence;
	private ims.nursing.assessment.domain.objects.BladderMicturition bladderMicturition;
	private ims.domain.lookups.LookupInstance assistanceContinence;
	/** 
	  * Collection of ims.coe.assessment.domain.objects.BladderSkills.
	  */
	private java.util.List bladderSkills;
    public BladderComponent (Integer id, int ver)
    {
    	super(id, ver);
    }
    public BladderComponent ()
    {
    	super();
    }
    public BladderComponent (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.coe.assessment.domain.objects.BladderComponent.class;
	}


	public ims.nursing.assessment.domain.objects.BladderContinence getContinence() {
		return continence;
	}
	public void setContinence(ims.nursing.assessment.domain.objects.BladderContinence continence) {
		this.continence = continence;
	}

	public ims.nursing.assessment.domain.objects.BladderMicturition getBladderMicturition() {
		return bladderMicturition;
	}
	public void setBladderMicturition(ims.nursing.assessment.domain.objects.BladderMicturition bladderMicturition) {
		this.bladderMicturition = bladderMicturition;
	}

	public ims.domain.lookups.LookupInstance getAssistanceContinence() {
		return assistanceContinence;
	}
	public void setAssistanceContinence(ims.domain.lookups.LookupInstance assistanceContinence) {
		this.assistanceContinence = assistanceContinence;
	}

	public java.util.List getBladderSkills() {
		if ( null == bladderSkills ) {
			bladderSkills = new java.util.ArrayList();
		}
		return bladderSkills;
	}
	public void setBladderSkills(java.util.List paramValue) {
		this.bladderSkills = paramValue;
	}

	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Instantiation".equals("Configuration") )
			return true;
		else
			return false;
	}





	public int getClassId() {
		return CLASSID;
	}

	public String getClassVersion()
	{
		return CLASSVERSION;
	}

	public String toAuditString()
	{
		StringBuffer auditStr = new StringBuffer();
		
		auditStr.append(super.toAuditString());
		auditStr.append("\r\n*continence* :");
		if (continence != null)
		{
			auditStr.append(toShortClassName(continence));
				
		    auditStr.append(continence.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*bladderMicturition* :");
		if (bladderMicturition != null)
		{
			auditStr.append(toShortClassName(bladderMicturition));
				
		    auditStr.append(bladderMicturition.getId());
		}
	    auditStr.append("; ");
		auditStr.append("\r\n*assistanceContinence* :");
		if (assistanceContinence != null)
			auditStr.append(assistanceContinence.getText());
	    auditStr.append("; ");
		auditStr.append("\r\n*bladderSkills* :");
		if (bladderSkills != null)
		{
		int i4=0;
		for (i4=0; i4<bladderSkills.size(); i4++)
		{
			if (i4 > 0)
				auditStr.append(",");
			ims.coe.assessment.domain.objects.BladderSkills obj = (ims.coe.assessment.domain.objects.BladderSkills)bladderSkills.get(i4);
		    if (obj != null)
			{
				if (i4 == 0)
				{
				auditStr.append(toShortClassName(obj));
				auditStr.append("[");
				}
		        auditStr.append(obj.getId());
			}
		}
		if (i4 > 0)
			auditStr.append("] " + i4);
		}
	    auditStr.append("; ");
		return auditStr.toString();
	}
	
	public String toXMLString()
	{
		return toXMLString(new java.util.HashMap());
	}
	
	public String toXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append("<class type=\"" + this.getClass().getName() + "\" ");		
		sb.append(" id=\"" + this.getId() + "\""); 
		sb.append(" source=\"" + ims.configuration.EnvironmentConfig.getImportExportSourceName() + "\" ");
		sb.append(" classVersion=\"" + this.getClassVersion() + "\" ");
		sb.append(" component=\"" + this.getIsComponentClass() + "\" >");
		
		if (domMap.get(this) == null)
		{
			domMap.put(this, this);
			sb.append(this.fieldsToXMLString(domMap));
		}
		sb.append("</class>");
		
		String keyClassName = "BladderComponent";
		String externalSource = ims.configuration.EnvironmentConfig.getImportExportSourceName();
		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + this.getId());
		if (impObj == null)
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(this.getId());
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(this);
			impObj.setLocalId(this.getId()); 
    		impObj.setClassName(keyClassName); 
			domMap.put(keyClassName + "_" + externalSource + "_" + this.getId(), impObj);
		}
		
		return sb.toString();
	}

	public String fieldsToXMLString(java.util.HashMap domMap)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(super.fieldsToXMLString(domMap));
		if (this.getContinence() != null)
		{
			sb.append("<continence>");
			sb.append(this.getContinence().toXMLString(domMap)); 	
			sb.append("</continence>");		
		}
		if (this.getBladderMicturition() != null)
		{
			sb.append("<bladderMicturition>");
			sb.append(this.getBladderMicturition().toXMLString(domMap)); 	
			sb.append("</bladderMicturition>");		
		}
		if (this.getAssistanceContinence() != null)
		{
			sb.append("<assistanceContinence>");
			sb.append(this.getAssistanceContinence().toXMLString()); 
			sb.append("</assistanceContinence>");		
		}
		if (this.getBladderSkills() != null)
		{
			if (this.getBladderSkills().size() > 0 )
			{
			sb.append("<bladderSkills>");
			sb.append(ims.domain.DomainObject.toXMLString(this.getBladderSkills(), domMap));
			sb.append("</bladderSkills>");		
			}
		}
		return sb.toString();
	}
		
	public static java.util.List fromListXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.List list, java.util.HashMap domMap) throws Exception
	{
		if (list == null)
		 list = new java.util.ArrayList();
		fillListFromXMLString(list, el, factory, domMap);
		return list;
	}
	
	public static java.util.Set fromSetXMLString(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.Set set, java.util.HashMap domMap) throws Exception
	{
		if (set == null)
			 set = new java.util.HashSet();
		fillSetFromXMLString(set, el, factory, domMap);
		return set;
	}
	
	private static void fillSetFromXMLString(java.util.Set set, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			BladderComponent domainObject = getBladderComponentfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!set.contains(domainObject)) 
				set.add(domainObject);
			newSet.add(domainObject);			
		}
		
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = set.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			set.remove(iter.next());
		}		
	}
	
	private static void fillListFromXMLString(java.util.List list, org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return;
		
		java.util.List cl = el.elements("class");
		int size = cl.size();
		
		for(int i=0; i<size; i++) 
		{
			org.dom4j.Element itemEl = (org.dom4j.Element)cl.get(i);
			BladderComponent domainObject = getBladderComponentfromXML(itemEl, factory, domMap);

			if (domainObject == null)
			{
				continue;
			}

			int domIdx = list.indexOf(domainObject);
			if (domIdx == -1)
			{
				list.add(i, domainObject);
			}
			else if (i != domIdx && i < list.size())
			{
				Object tmp = list.get(i);
				list.set(i, list.get(domIdx));
				list.set(domIdx, tmp);
			}
		}		
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=list.size();
		while (i1 > size)
		{
			list.remove(i1-1);
			i1=list.size();
		}
	}
		
	public static BladderComponent getBladderComponentfromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getBladderComponentfromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static BladderComponent getBladderComponentfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!BladderComponent.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!BladderComponent.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the BladderComponent class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (BladderComponent)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(BladderComponent.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		BladderComponent ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (BladderComponent)factory.getImportedDomainObject(BladderComponent.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new BladderComponent();
		}
		String keyClassName = "BladderComponent";
		Class clz = ret.getClass().getSuperclass();
		while (!clz.equals(ims.domain.DomainObject.class))
		{
			int dotIndex = clz.getName().lastIndexOf(".") + 1;
			keyClassName = clz.getName().substring(dotIndex); 
			clz = clz.getSuperclass();
		}

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (BladderComponent)impObj.getDomainObject();
		}
		else
		{
    		impObj = new ims.configuration.ImportedObject();
    		impObj.setExternalId(extId);
    		impObj.setExternalSource(externalSource);
    		impObj.setDomainObject(ret);
			domMap.put(keyClassName + "_" + externalSource + "_" + extId, impObj);
		}
		fillFieldsfromXML(el, factory, ret, domMap);
		return ret;
	}

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, BladderComponent obj, java.util.HashMap domMap) throws Exception
	{
		ims.nursing.assessment.domain.objects.AssessmentComponent.fillFieldsfromXML(el, factory, obj, domMap);
		org.dom4j.Element fldEl;
		fldEl = el.element("continence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setContinence(ims.nursing.assessment.domain.objects.BladderContinence.getBladderContinencefromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("bladderMicturition");
		if(fldEl != null)
		{
			fldEl = fldEl.element("class");		
			obj.setBladderMicturition(ims.nursing.assessment.domain.objects.BladderMicturition.getBladderMicturitionfromXML(fldEl, factory, domMap)); 
		}
		fldEl = el.element("assistanceContinence");
		if(fldEl != null)
		{
			fldEl = fldEl.element("lki");
			obj.setAssistanceContinence(ims.domain.lookups.LookupInstance.fromXMLString(fldEl, factory)); 	
		}
		fldEl = el.element("bladderSkills");
		if(fldEl != null)
		{
			fldEl = fldEl.element("list");	
			obj.setBladderSkills(ims.coe.assessment.domain.objects.BladderSkills.fromListXMLString(fldEl, factory, obj.getBladderSkills(), domMap));
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		 "bladderSkills"
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String Continence = "continence";
		public static final String BladderMicturition = "bladderMicturition";
		public static final String AssistanceContinence = "assistanceContinence";
		public static final String BladderSkills = "bladderSkills";
	}
}

