package com.giantflyingsaucer.springsetterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring-config.xml");
        DoSomething ds = (DoSomething)appContext.getBean("doSomething");
        System.out.println(ds.toString());
    }
}
