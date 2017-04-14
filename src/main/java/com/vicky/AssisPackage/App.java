package com.vicky.AssisPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vicky.AssisPackage.model.Hello;
import com.vicky.AssisPackage.model.World;

/**
 * Hello world!
 *
 */
public class App
{

    private static final String PATH = "C:\\software\\eclipse-jee-luna-SR2-win32-x86_64\\eclipse\\workspace\\AssisPackage\\src\\main\\resources\\beans.xml";
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.getName());
        Hello helloCopy = (Hello) context.getBean("hello");
        helloCopy.setName("Hello World!");
        System.out.println(hello.getName());

        World world = (World)context.getBean("world");
        World worldCopy = (World)context.getBean("world");
        System.out.println(world == worldCopy);
/*
        FileSystemXmlApplicationContext fileContext = new FileSystemXmlApplicationContext(PATH);
        Hello hello_again = (Hello) context.getBean("hello");
        System.out.println(hello_again.getName());
        System.out.println(helloCopy == hello_again);*/
    }
}
