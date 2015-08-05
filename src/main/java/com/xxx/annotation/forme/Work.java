/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：Work.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年8月5日 Create
 * 1.1 Kai.Zhao 2015年8月5日 TODO
 */
package com.xxx.annotation.forme;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Work {

	public enum Priority {
		LOW, MEDIUM, HIGH
	}

	Priority priority() default Priority.MEDIUM;

	String[] tags() default "";

	String createdBy() default "Just For Fun";

	String lastModified() default "08/08/2015";

}
