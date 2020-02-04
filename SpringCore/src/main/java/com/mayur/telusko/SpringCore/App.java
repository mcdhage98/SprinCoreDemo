package com.mayur.telusko.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //BeanFactory factory = XmlBeanFactory(new FileSystemResource("spring.xml")); 
        
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        Alien a=(Alien) factory.getBean("Alien");
        System.out.println(a.code());
        System.out.println("age :"+ ((Alien) a).getAge());
        
        System.out.println(""+a.getLaptop().compile());
        
        Alien a1=(Alien) factory.getBean("Alien1");
        System.out.println(a1.code());
        System.out.println("age of Alien1 :"+ ((Alien) a1).getAge());
        
        System.out.println("Alien1"+a1.getLaptop().compile());
        ;
    }
}
