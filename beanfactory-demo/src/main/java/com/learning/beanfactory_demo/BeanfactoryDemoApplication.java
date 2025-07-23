package com.learning.beanfactory_demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.beanfactory_demo.beans.GreetingService;

@SpringBootApplication
public class BeanfactoryDemoApplication {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 BeanFactory beanFactory = context;
		GreetingService greetingService = beanFactory.getBean("greetingService", GreetingService.class);
		greetingService.sayHello();
		context.close();
	}
}
//java -cp target/beanfactory-demo-0.0.1-SNAPSHOT.jar com.learning.beanfactory_demo.BeanfactoryDemoApplication