package lxj.com.lovo.homework;

public class Car extends CarFactory {

    private String carName;

    private String engine;

    private String wheel;

    private String carFrame;

    public Car(String carName, String engine, String wheel, String carFrame) {
        this.carName = carName;
        this.engine = engine;
        this.wheel = wheel;
        this.carFrame = carFrame;
    }

    public Car() {
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setCarFrame(String carFrame) {
        this.carFrame = carFrame;
    }

    @Override
    public void getCarName() {
        System.out.println(carName);
    }

    @Override
    public void getEngine() {
        System.out.println(engine);
    }

    @Override
    public void getWheel() {
        System.out.println(wheel);
    }

    @Override
    public void getCarFrame() {
        System.out.println(carFrame);
    }
}
