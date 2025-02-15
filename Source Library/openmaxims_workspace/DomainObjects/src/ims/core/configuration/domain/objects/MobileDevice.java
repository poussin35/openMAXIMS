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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5589.25814)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated: 12/10/2015, 13:28
 *
 */
package ims.core.configuration.domain.objects;

/**
 * 
 * @author Marius Mihalec
 * Generated.
 */


public class MobileDevice extends ims.domain.DomainObject implements ims.domain.SystemInformationRetainer, java.io.Serializable {
	public static final int CLASSID = 1028100054;
	private static final long serialVersionUID = 1028100054L;
	public static final String CLASSVERSION = "${ClassVersion}";

	@Override
	public boolean shouldCapQuery()
	{
		return true;
	}

	private String uniqueId;
	private String tokenId;
	private String name;
	private String model;
	private String systemName;
	private String systemVersion;
	private Boolean active;
	private String applicationInfo;
	/** SystemInformation */
	private ims.domain.SystemInformation systemInformation = new ims.domain.SystemInformation();
    public MobileDevice (Integer id, int ver)
    {
    	super(id, ver);
    }
    public MobileDevice ()
    {
    	super();
    }
    public MobileDevice (Integer id, int ver, Boolean includeRecord)
    {
    	super(id, ver, includeRecord);
    }
	public Class getRealDomainClass()
	{
		return ims.core.configuration.domain.objects.MobileDevice.class;
	}


	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		if ( null != uniqueId && uniqueId.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for uniqueId. Tried to set value: "+
				uniqueId);
		}
		this.uniqueId = uniqueId;
	}

	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		if ( null != tokenId && tokenId.length() > 150 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for tokenId. Tried to set value: "+
				tokenId);
		}
		this.tokenId = tokenId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if ( null != name && name.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for name. Tried to set value: "+
				name);
		}
		this.name = name;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if ( null != model && model.length() > 100 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for model. Tried to set value: "+
				model);
		}
		this.model = model;
	}

	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		if ( null != systemName && systemName.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for systemName. Tried to set value: "+
				systemName);
		}
		this.systemName = systemName;
	}

	public String getSystemVersion() {
		return systemVersion;
	}
	public void setSystemVersion(String systemVersion) {
		if ( null != systemVersion && systemVersion.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for systemVersion. Tried to set value: "+
				systemVersion);
		}
		this.systemVersion = systemVersion;
	}

	public Boolean isActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getApplicationInfo() {
		return applicationInfo;
	}
	public void setApplicationInfo(String applicationInfo) {
		if ( null != applicationInfo && applicationInfo.length() > 255 ) {
			throw new ims.domain.exceptions.DomainRuntimeException("MaxLength ($MaxLength) exceeded for applicationInfo. Tried to set value: "+
				applicationInfo);
		}
		this.applicationInfo = applicationInfo;
	}

	public ims.domain.SystemInformation getSystemInformation() {
		if (systemInformation == null) systemInformation = new ims.domain.SystemInformation();
		return systemInformation;
	}


	/**
	 * isConfigurationObject
	 * Taken from the Usage property of the business object, this method will return
	 * a boolean indicating whether this is a configuration object or not
	 * Configuration = true, Instantiation = false
	 */
	public static boolean isConfigurationObject()
	{
		if ( "Configuration".equals("Configuration") )
			return true;
		else
			return false;
	}
	// method generated based on 'unique_device' unique index.
	public static boolean recordExistForUniqueIdAndTokenId(ims.domain.ILightweightDomainFactory factory,
		 String uniqueId
	,
	 String tokenId
	)	
	{
		return recordExistForUniqueIdAndTokenId(factory, uniqueId, tokenId, null);
	}	

	// method generated based on 'unique_device' unique index.
	public static boolean recordExistForUniqueIdAndTokenId(ims.domain.ILightweightDomainFactory factory,
		 String uniqueId
	,
	 String tokenId
	, Integer recordId)	
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		
		hql.append("from MobileDevice c where ");
		hql.append(" c.uniqueId = :uniqueId ");
		names[0] = "uniqueId";
		values[0] = uniqueId;		
		hql.append(" and "); 
		hql.append(" c.tokenId = :tokenId ");
		names[1] = "tokenId";
		values[1] = tokenId;		
		if(recordId != null)
		{
			hql.append(" and c.id <> " + recordId);
		}
		
		return factory.count(hql.toString(), names, values) > 0;				
	}	

	// method generated based on 'unique_device' unique index.
	public static MobileDevice getRecordByUniqueIdAndTokenId(ims.domain.ILightweightDomainFactory factory,
	 String uniqueId
	,
	 String tokenId
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from MobileDevice c where ");
		hql.append(" c.uniqueId = :uniqueId ");
		names[0] = "uniqueId";
		values[0] = uniqueId;		
		hql.append(" and "); 
		hql.append(" c.tokenId = :tokenId ");
		names[1] = "tokenId";
		values[1] = tokenId;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (MobileDevice)l.get(0);
	}

	public static MobileDevice getMobileDeviceFromunique_device(ims.domain.ILightweightDomainFactory factory,
	 String uniqueId
	,
	 String tokenId
	)
	{
		String[] names = new String[2];
		Object[] values = new Object[2];
		StringBuffer hql = new StringBuffer();
		hql.append("from MobileDevice c where ");
		hql.append(" c.uniqueId = :uniqueId ");
		names[0] = "uniqueId";
		values[0] = uniqueId;		
		hql.append(" and "); 
		hql.append(" c.tokenId = :tokenId ");
		names[1] = "tokenId";
		values[1] = tokenId;		
		java.util.List l = factory.find(hql.toString(), names, values);
		if (l == null || l.size() == 0) return null;
		if (l.size() > 1) throw new ims.domain.exceptions.DomainRuntimeException("Non-unique get call. " + hql + " returned " + l.size() + " records. " );
		return (MobileDevice)l.get(0);
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
		
		auditStr.append("\r\n*uniqueId* :");
		auditStr.append(uniqueId);
	    auditStr.append("; ");
		auditStr.append("\r\n*tokenId* :");
		auditStr.append(tokenId);
	    auditStr.append("; ");
		auditStr.append("\r\n*name* :");
		auditStr.append(name);
	    auditStr.append("; ");
		auditStr.append("\r\n*model* :");
		auditStr.append(model);
	    auditStr.append("; ");
		auditStr.append("\r\n*systemName* :");
		auditStr.append(systemName);
	    auditStr.append("; ");
		auditStr.append("\r\n*systemVersion* :");
		auditStr.append(systemVersion);
	    auditStr.append("; ");
		auditStr.append("\r\n*active* :");
		auditStr.append(active);
	    auditStr.append("; ");
		auditStr.append("\r\n*applicationInfo* :");
		auditStr.append(applicationInfo);
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
		
		String keyClassName = "MobileDevice";
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
		if (this.getUniqueId() != null)
		{
			sb.append("<uniqueId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getUniqueId().toString()));
			sb.append("</uniqueId>");		
		}
		if (this.getTokenId() != null)
		{
			sb.append("<tokenId>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getTokenId().toString()));
			sb.append("</tokenId>");		
		}
		if (this.getName() != null)
		{
			sb.append("<name>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getName().toString()));
			sb.append("</name>");		
		}
		if (this.getModel() != null)
		{
			sb.append("<model>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getModel().toString()));
			sb.append("</model>");		
		}
		if (this.getSystemName() != null)
		{
			sb.append("<systemName>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSystemName().toString()));
			sb.append("</systemName>");		
		}
		if (this.getSystemVersion() != null)
		{
			sb.append("<systemVersion>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getSystemVersion().toString()));
			sb.append("</systemVersion>");		
		}
		if (this.isActive() != null)
		{
			sb.append("<active>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.isActive().toString()));
			sb.append("</active>");		
		}
		if (this.getApplicationInfo() != null)
		{
			sb.append("<applicationInfo>");
			sb.append(ims.framework.utils.StringUtils.encodeXML(this.getApplicationInfo().toString()));
			sb.append("</applicationInfo>");		
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
			MobileDevice domainObject = getMobileDevicefromXML(itemEl, factory, domMap);

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
			MobileDevice domainObject = getMobileDevicefromXML(itemEl, factory, domMap);

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
		
	public static MobileDevice getMobileDevicefromXML(String xml, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Document doc = new org.dom4j.io.SAXReader().read(new org.xml.sax.InputSource(xml));
		return getMobileDevicefromXML(doc.getRootElement(), factory, domMap);
	}
	
	public static MobileDevice getMobileDevicefromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, java.util.HashMap domMap) throws Exception
	{
		if (el == null)
			return null;
		
		String className = el.attributeValue("type");
		if (!MobileDevice.class.getName().equals(className))
		{
			Class clz = Class.forName(className);
			if (!MobileDevice.class.isAssignableFrom(clz))
				throw new Exception("Element of type = " + className + " cannot be imported using the MobileDevice class");
			String shortClassName = className.substring(className.lastIndexOf(".")+1);
			String methodName = "get" + shortClassName + "fromXML";
			java.lang.reflect.Method m = clz.getMethod(methodName, new Class[]{org.dom4j.Element.class, ims.domain.DomainFactory.class, java.util.HashMap.class});
			return (MobileDevice)m.invoke(null, new Object[]{el, factory, domMap});
		}

		String impVersion = el.attributeValue("classVersion");
		if(!impVersion.equals(MobileDevice.CLASSVERSION))
		{
			throw new Exception("Incompatible class structure found. Cannot import instance.");
		}		
		
		MobileDevice ret = null;
		int extId = Integer.parseInt(el.attributeValue("id"));
		String externalSource = el.attributeValue("source");
		ret = (MobileDevice)factory.getImportedDomainObject(MobileDevice.class, externalSource, extId);	
		if (ret == null)
		{
			ret = new MobileDevice();
		}
		String keyClassName = "MobileDevice";

		ims.configuration.ImportedObject impObj = (ims.configuration.ImportedObject)domMap.get(keyClassName + "_" + externalSource + "_" + extId);
		if (impObj != null)
		{
			return (MobileDevice)impObj.getDomainObject();
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

	public static void fillFieldsfromXML(org.dom4j.Element el, ims.domain.DomainFactory factory, MobileDevice obj, java.util.HashMap domMap) throws Exception
	{
		org.dom4j.Element fldEl;
		fldEl = el.element("uniqueId");
		if(fldEl != null)
		{	
    		obj.setUniqueId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("tokenId");
		if(fldEl != null)
		{	
    		obj.setTokenId(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("name");
		if(fldEl != null)
		{	
    		obj.setName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("model");
		if(fldEl != null)
		{	
    		obj.setModel(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("systemName");
		if(fldEl != null)
		{	
    		obj.setSystemName(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("systemVersion");
		if(fldEl != null)
		{	
    		obj.setSystemVersion(new String(fldEl.getTextTrim()));	
		}
		fldEl = el.element("active");
		if(fldEl != null)
		{	
    		obj.setActive(new Boolean(fldEl.getTextTrim()));	
		}
		fldEl = el.element("applicationInfo");
		if(fldEl != null)
		{	
    		obj.setApplicationInfo(new String(fldEl.getTextTrim()));	
		}
	}

	public static String[] getCollectionFields()
	{
		return new String[]{
		};
	}


	public static class FieldNames	
	{
	public static final String ID = "id";
		public static final String UniqueId = "uniqueId";
		public static final String TokenId = "tokenId";
		public static final String Name = "name";
		public static final String Model = "model";
		public static final String SystemName = "systemName";
		public static final String SystemVersion = "systemVersion";
		public static final String Active = "active";
		public static final String ApplicationInfo = "applicationInfo";
	}
}

