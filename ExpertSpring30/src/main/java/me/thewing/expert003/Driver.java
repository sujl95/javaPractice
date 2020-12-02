package me.thewing.expert003;

import me.thewing.expert003.Car;
import me.thewing.expert003.Tire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("expert003.xml");
        Car car = context.getBean("car", Car.class);

        System.out.println(car.getTireBrand());
    }
}
