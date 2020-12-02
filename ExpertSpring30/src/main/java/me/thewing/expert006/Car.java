package me.thewing.expert006;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import javax.annotation.Resource;

public class Car {
    @Resource
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
