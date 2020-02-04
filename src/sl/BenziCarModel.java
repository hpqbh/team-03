package sl;

public class BenziCarModel extends CarModel{

    private String carName;

    private String engine;

    private String carriageWheel;

    private String carframe;

    @Override
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public void getEngine() {
        System.out.println(engine);
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void getCarriageWheel() {
        System.out.println(carriageWheel);
    }

    public void setCarriageWheel(String carriageWheel) {
        this.carriageWheel = carriageWheel;
    }

    @Override
    public void getCarframe() {
        System.out.println(carframe);
    }

    public void setCarframe(String carframe) {
        this.carframe = carframe;
    }
}
