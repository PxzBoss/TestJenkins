package com.pxz.demo.config;

import com.pxz.demo.filter.CleanFilter;
import com.pxz.demo.filter.HostCleanFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tianxinqi 2019-7-10
 */
@Configuration
public class HostUrlConfig {

	@Bean
	public FilterRegistrationBean shSsoFilterRegistration2() {
		// 初始化过滤器
		FilterRegistrationBean<CleanFilter> registration = new FilterRegistrationBean<CleanFilter>();
		registration.setName("CleanFilter");
		registration.setOrder(0);
		registration.addUrlPatterns("/*");
		registration.setFilter(new CleanFilter());
		return registration;


	}

	@Bean
	public FilterRegistrationBean shSsoFilterRegistration1() {
		// 初始化过滤器
		FilterRegistrationBean<HostCleanFilter> registration = new FilterRegistrationBean<HostCleanFilter>();
		registration.setName("HostCleanFilter");
		registration.setOrder(1);
		registration.addUrlPatterns("/*");
		registration.setFilter(new HostCleanFilter());
		return registration;


	}


}
