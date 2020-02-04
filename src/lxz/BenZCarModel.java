package lxz;

/**
 *  奔驰车系
 */
public class BenZCarModel extends CarFactory {
    private String name;
    private String engine;
    private String carRack;
    private String wheel;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void getEngine() {
        System.out.println(engine);
    }

    @Override
    public void getCarRack() {
        System.out.println(carRack);
    }

    @Override
    public void getWheel() {
        System.out.println(wheel);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setCarRack(String carRack) {
        this.carRack = carRack;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
}

