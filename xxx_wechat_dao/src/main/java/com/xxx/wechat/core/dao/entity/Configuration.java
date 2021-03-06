package com.xxx.wechat.core.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 系统配置表
 *
 */
@Table(name = "xxx_configuration")
public class Configuration implements Serializable {

	private static final long serialVersionUID = -8659326752435236115L;

	@Id
	@Column(name = "ITEM")
	private String item;
	
	@Column(name = "property")
	private String property;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "TYPE")
	private String type;
	
	@Column(name = "MEMO")
	private String memo;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
