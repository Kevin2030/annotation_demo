/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：OurUtil.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年8月5日 Create
 * 1.1 Kai.Zhao 2015年8月5日 TODO
 */
package com.xxx.annotation.forme;

import java.lang.reflect.Field;

/**
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class OurUtil {

	public static void main(String[] args) {
		Field[] fields = KaiZhao.class.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(Id.class)) {
				int id = field.getAnnotation(Id.class).id();
				System.out.printf("%s - id '%s' - passed %n", KaiZhao.class.getName(), id);
			}
			if (field.isAnnotationPresent(Name.class)) {
				String name = field.getAnnotation(Name.class).name();
				System.out.printf("%s - name '%s' - passed %n", KaiZhao.class.getName(), name);
			}
		}
	}

}
