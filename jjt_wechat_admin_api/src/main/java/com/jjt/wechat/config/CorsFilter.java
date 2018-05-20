package com.jjt.wechat.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorsFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

//	@Autowired
//	private TokenHelper tokenHelper;
	@Autowired
	protected AppConfig appConfig;

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		// HttpServletRequest request = (HttpServletRequest) req;

//		response.addHeader("Access-Control-Allow-Origin", appConfig.allowOrigin);
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Methods",
				"POST, GET, PUT, OPTIONS, DELETE");
		response.addHeader("Access-Control-Max-Age", "3600");
		response.addHeader("Access-Control-Allow-Headers",
				"Origin, X-Requested-With, Content-Type, Accept, token, x-access-token");
		response.addHeader("Access-Control-Expose-Headers", "x-access-token");
		// String path = request.getServletPath();
		// if(!path.contains("login")){
		// //验证token
		// String tonkenString = request.getHeader("x-access-token");
		// System.out.println(tonkenString);
		// }

		// System.out.println(path);

		//

		chain.doFilter(req, res);

	}

	@Override
	public void destroy() {

	}

}