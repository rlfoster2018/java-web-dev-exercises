package exercises.technology;

public class Laptop extends Computer {

    public Double screenSize;

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Laptop() {
        this.screenSize = 19.0;
    }

    public Laptop(Double size) {
        this.screenSize = size;
    }

    public Boolean isJavaTheBest(){
        return true;
    }
}
