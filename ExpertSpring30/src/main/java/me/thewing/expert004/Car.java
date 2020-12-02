package me.thewing.expert004;

import me.thewing.expert004.Tire;
import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
