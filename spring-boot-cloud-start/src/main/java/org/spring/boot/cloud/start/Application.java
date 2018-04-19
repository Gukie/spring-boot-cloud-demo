package org.spring.boot.cloud.start;

import org.spring.boot.cloud.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * refer: https://www.boraji.com/spring-boot-using-servlet-filter-and-listener-example-1
 * @author gushu
 *
 */
@SpringBootApplication(scanBasePackages={"org.spring.boot.cloud"})
public class Application 
{
	
	@Bean
	public FilterRegistrationBean generateCustomFilter(){
		MyFilter myFilter = new MyFilter();	
		FilterRegistrationBean bean = new FilterRegistrationBean(myFilter);
//		bean.addInitParameter(name, value);
		bean.addUrlPatterns("/");
		return bean;
	}
	
    public static void main( String[] args )
    {
       SpringApplication.run(Application.class, args);
    }
}
