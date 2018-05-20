package com.jjt.wechat.admin.enums;

public enum MaterialPushType {
	/**
	 * 线下活动
	 */
	ACTIVITY("1"),
	/**
	 * 群推
	 */
	PUSH("2");

	private String type;

	private MaterialPushType(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
