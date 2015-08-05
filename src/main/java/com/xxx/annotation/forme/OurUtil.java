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
import java.lang.reflect.Method;

/**
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class OurUtil {

	public static void main(String[] args) {
		System.out.println("Testing...");
		int passed = 0, failed = 0, count = 0, ignore = 0;
		Class<KaiZhao> obj = KaiZhao.class;
		if (obj.isAnnotationPresent(Work.class)) {
			Work work = obj.getAnnotation(Work.class);
			System.out.printf("%nPriority :%s", work.priority());
			System.out.printf("%nCreatedBy :%s", work.createdBy());
			System.out.printf("%nTags :");
			int targetLenth = work.tags().length;
			for (String tag : work.tags()) {
				if (targetLenth > 1) {
					System.out.print(tag + ", ");
				} else {
					System.out.print(tag);
				}
				targetLenth--;
			}
			System.out.printf("%nLastModified :%s%n%n", work.lastModified());
		}

		Method[] methods = obj.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(IsWork.class)) {
				IsWork isWork = method.getAnnotation(IsWork.class);
				if (isWork.enabled()) {
					try {
						method.invoke(obj.newInstance());
						System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
						passed++;
					} catch (Exception e) {
						System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), e.getCause());
						failed++;
					}
				} else {
					System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
					ignore++;
				}
			}
		}
		System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);

		Field[] fields = obj.getDeclaredFields();
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
