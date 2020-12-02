package me.thewing.expert006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("expert.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car.getTireBrand());
    }
}
