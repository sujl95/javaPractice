package me.thewing.expert002;

import me.thewing.expert002.Tire;

public class Car {
    Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
