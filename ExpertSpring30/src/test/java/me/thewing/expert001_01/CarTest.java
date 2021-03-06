package me.thewing.expert001_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void 자동차_장착_타이어브랜드_테스트() {
        Car car = new Car(new KoreaTire());

        assertEquals("장착된 타이어 : 코리아 타이어", car.getTireBrand());
    }

    @Test
    public void 자동차_장착_타이어브랜드_테스트2() {
        Tire tire2 = new AmericaTire();
        Car car = new Car(tire2);

        assertEquals("장착된 타이어 : 미국 타이어", car.getTireBrand());
    }
}