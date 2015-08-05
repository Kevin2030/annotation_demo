/*
 * Copyright (C) 1993-2015 Kingdee Inc.All Rights Reserved.
 * 
 * FileName：KaiZhao.java
 * 
 * Description：TODO
 * 
 * History：
 * 1.0 Kai.Zhao 2015年8月5日 Create
 * 1.1 Kai.Zhao 2015年8月5日 TODO
 */
package com.xxx.annotation.forme;

/**
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
public class KaiZhao {

	@Id(id = 123)
	private int id;

	@Name(name = "KaiZhao")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
