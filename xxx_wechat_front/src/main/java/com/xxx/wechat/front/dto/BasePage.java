package com.xxx.wechat.front.dto;

import java.util.List;

public class BasePage {

	public BasePage(long count,List<?> list) {
		this.count = count;
		this.list = list;
	}
	
	private long count;
	
	private List<?> list;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	
	
	
}
