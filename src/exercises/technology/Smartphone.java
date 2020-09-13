package exercises.technology;

public class Smartphone extends Computer {
    public Double batteryLife;

    public Double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(Double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public Smartphone() {
        this.batteryLife = 1.0;
    }

    public Smartphone(Double battery) {
        this.batteryLife = battery;
    }

    public Integer catPictureCount () {
        return 9001;
    }
}
