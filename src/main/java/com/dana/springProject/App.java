package com.dana.springProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext factory = new FileSystemXmlApplicationContext("src/main/spring.xml");

        Alien obj1 = (Alien) factory.getBean("alien");
        obj1.code();

        System.out.println(obj1.getAge());

    }
}
