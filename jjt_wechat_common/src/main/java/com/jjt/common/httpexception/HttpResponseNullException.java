package com.jjt.common.httpexception;

public class HttpResponseNullException extends Exception{

	private static final long serialVersionUID = -7291795181848286081L;

	public HttpResponseNullException() {
		super("http response is null");
	}

}
