package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testInitialGasTank() {
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, testCar.getGasTankLevel(), .001);
    }

    @Test
    public void testGasRange() {
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        testCar.drive(50);
        assertEquals(9, testCar.getGasTankLevel(), .001);
    }

    @Test
    public void testGasRangeTooFar() {
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        testCar.drive(501);
        assertEquals(0,testCar.getGasTankLevel(), .001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreGasThanTank() {
        Car testCar = new Car("Toyota", "Prius", 10, 50);
        testCar.addGas(5);
        fail("Car cannot have more gas in tank than size of tank... moron.");
    }
}
