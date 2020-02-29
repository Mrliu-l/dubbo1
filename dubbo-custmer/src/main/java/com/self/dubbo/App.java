package com.self.dubbo;

import com.self.IPayInterface;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *ßß
 */
public class App {
    public static void main( String[] args ) {
        //dubbo://192.168.0.110:20880/com.self.IPayInterface
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"application-consumer.xml"});
        context.start();

        IPayInterface payService = (IPayInterface) context.getBean("payService");
        String result = payService.pay();
        System.out.println(result);
    }
}
