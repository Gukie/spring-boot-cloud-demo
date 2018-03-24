package org.spring.boot.cloud.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.boot.cloud.other.ApplicationTestOther;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This will not find the "helloService" bean since ApplicationTestOther scan component under package 'org.spring.boot.cloud'
 * 
 * @author gushu
 * @date 2018/03/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={ApplicationTestOther.class})
public class ServiceNotWorkTest {
	@Autowired
	@Qualifier("helloService")
	private HelloService helloService;
	
	@Test
	public void testSayHello(){
		String expected = "Hello, lokia";
		String actual = helloService.sayHello("lokia");
		Assert.assertEquals(expected, actual);
	}
}
