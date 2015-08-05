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

import com.xxx.annotation.forme.Work.Priority;

/**
 * 
 * @author Kai.Zhao
 * @version 1.0
 * @see
 */
@Work(priority = Priority.HIGH, createdBy = "xxx.com", tags = { "sales", "ok" })
public class KaiZhao {

	@Id(id = 123)
	private int id;

	@Name(name = "KaiZhao")
	private String name;

	@IsWork
	public void workA() {
		throw new RuntimeException("This test always failed");
	}

	@IsWork(enabled = false)
	public void workB() {
		throw new RuntimeException("This test always passed");
	}

	@IsWork(enabled = true)
	public void workC() {
		if (10 > 1) {
		}
	}

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
