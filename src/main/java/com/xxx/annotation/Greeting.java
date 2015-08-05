/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：Greeting.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年8月5日 Create
 * 1.1 Kai.Zhao 2015年8月5日 TODO
 */
package com.xxx.annotation;

import java.lang.annotation.Inherited;

/**
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
@Inherited
public @interface Greeting {
	public enum FontColor {
		BULE, RED, GREEN
	};

	String name();

	FontColor fontColor() default FontColor.GREEN;
}
