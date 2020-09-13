package exercises.technology;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void testNewComputerManufacturer() {
        Computer test = new Computer();
        assertEquals(test.manufacturer, "HP");
    }

    @Test
    public void testNewComputerManufacturer2() {
        Computer test = new Computer("Dell", "Windows", "Enos Presley");
        assertEquals(test.manufacturer, "Dell");
    }

    @Test
    public void testNewComputerOperatingSystem() {
        Computer test = new Computer();
        assertEquals(test.operatingSystem, "Windows");
    }

    @Test
    public void testNewLaptopInheritance() {
        Laptop test = new Laptop();
        assertEquals(test.manufacturer, "HP");
    }

    @Test
    public void testNewLaptopOwner() {
        Laptop test = new Laptop();
        assertEquals(test.getOwner(), null);
    }

    @Test
    public void testNewLaptopScreenSize() {
        Laptop test = new Laptop(25.0);
        assertEquals(test.screenSize, 25.0, 100000000);
    }

    @Test
    public void testNewSmartphoneInheritance() {
        Smartphone test = new Smartphone();
        assertEquals(test.manufacturer, "HP");
    }

    @Test
    public void testNewSmartphoneOwner() {
        Smartphone test = new Smartphone();
        assertEquals(test.getOwner(), null);
    }

    @Test
    public void testNewSmartphoneBatteryLife() {
        Smartphone test = new Smartphone(2.0);
        assertEquals(test.batteryLife, 2.0, 100000000);
    }
}
