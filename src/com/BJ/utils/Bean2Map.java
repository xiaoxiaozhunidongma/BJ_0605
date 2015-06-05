package com.BJ.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Bean2Map {

//	 public static Map convertBean(Object bean) 
//	            throws  IllegalAccessException, InvocationTargetException { 
//	        Class type = bean.getClass(); 
//	        Map returnMap = new HashMap(); 
//	        BeanInfo beanInfo = Introspector.getBeanInfo(type); 
//
//	        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors(); 
//	        for (int i = 0; i< propertyDescriptors.length; i++) { 
//	            PropertyDescriptor descriptor = propertyDescriptors[i]; 
//	            String propertyName = descriptor.getName(); 
//	            if (!propertyName.equals("class")) { 
//	                Method readMethod = descriptor.getReadMethod(); 
//	                Object result = readMethod.invoke(bean, new Object[0]); 
//	                if (result != null) { 
//	                    returnMap.put(propertyName, result); 
//	                } else { 
//	                    returnMap.put(propertyName, ""); 
//	                } 
//	            } 
//	        } 
//	        return returnMap; 
//	    } 
	
	public static Map ConvertObjToMap(Object obj){
        Map<String,Object> reMap = new HashMap<String,Object>();
        if (obj == null) 
         return null;
        Field[] fields = obj.getClass().getDeclaredFields();
        try {
         for(int i=0;i<fields.length;i++){
          try {
           Field f = obj.getClass().getDeclaredField(fields[i].getName());
           f.setAccessible(true);
                 Object o = f.get(obj);
                 reMap.put(fields[i].getName(), o);
          } catch (NoSuchFieldException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
          } catch (IllegalArgumentException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
          } catch (IllegalAccessException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
          }
         }
        } catch (SecurityException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
        } 
        return reMap;
       }
}
