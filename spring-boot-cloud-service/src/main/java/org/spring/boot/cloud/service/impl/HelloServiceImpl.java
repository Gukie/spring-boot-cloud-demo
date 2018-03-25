package org.spring.boot.cloud.service.impl;

import org.spring.boot.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author gushu
 * @date 2018/03/24
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService{

	@Value("${project.name}")
	private String appName;
	
	
	@Override
	public String sayHello(String msg) {
		return "Hello, "+msg+",welcome to "+appName;
	}

}
