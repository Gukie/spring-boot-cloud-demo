package org.spring.boot.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author gushu
 * @date 2018/03/24
 */
@SpringBootApplication
@PropertySource(value = { "classpath:test.properties" })
public class ApplicationTest {

}
