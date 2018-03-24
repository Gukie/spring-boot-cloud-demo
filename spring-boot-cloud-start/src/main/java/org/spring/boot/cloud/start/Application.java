package org.spring.boot.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.spring.boot.cloud"})
public class Application 
{
    public static void main( String[] args )
    {
       SpringApplication.run(Application.class, args);
    }
}
