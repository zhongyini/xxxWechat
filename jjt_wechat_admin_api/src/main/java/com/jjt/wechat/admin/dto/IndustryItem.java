package com.jjt.wechat.admin.dto;

import java.io.Serializable;

public class IndustryItem implements Serializable {

	private static final long serialVersionUID = -6794551213218857981L;

	public IndustryItem() {
	}

	public IndustryItem(String template_id, String firTitle,String  content,String industryFileName) {
		this.template_id = template_id;
		this.firTitle = firTitle;
		this.content = content;
		this.industryFileName=  industryFileName;
	}

	private String template_id;

	private String firTitle;

	private String industryFileName;

	private String  content;

	public String getTemplate_id() {
		return template_id;
	}

	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}

	public String getFirTitle() {
		return firTitle;
	}

	public void setFirTitle(String firTitle) {
		this.firTitle = firTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIndustryFileName() {
		return industryFileName;
	}

	public void setIndustryFileName(String industryFileName) {
		this.industryFileName = industryFileName;
	}

	

}
