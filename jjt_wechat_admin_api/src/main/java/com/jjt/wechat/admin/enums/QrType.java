package com.jjt.wechat.admin.enums;

public enum QrType {
	/**
	 * 临时0
	 */
	TEMP("0"),
	/**
	 * 永久1
	 */
	PERMANENT("1");

	private String type;

	private QrType(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
