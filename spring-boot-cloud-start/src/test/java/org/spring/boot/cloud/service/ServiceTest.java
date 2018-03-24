package org.spring.boot.cloud.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.boot.cloud.ApplicationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author gushu
 * @date 2018/03/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={ApplicationTest.class})
public class ServiceTest {

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
