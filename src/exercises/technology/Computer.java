package exercises.technology;

public class Computer {
    public String manufacturer;
    public String operatingSystem;
    private String owner;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOwner() {
        return owner;
    }

    public Computer() {
        this.manufacturer = "HP";
        this.operatingSystem = "Windows";
        this.owner = "Nunya Business";
    }

    public Computer(String manufacturer, String operatingSystem, String owner) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.owner = owner;
    }
}
