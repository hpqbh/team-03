package sl;

public class BenziCarBuilder extends CarBuilder{
    public CarModel buildCarModel(String carName, String engine, String carriageWheel, String carframe) {
        BenziCarModel car = new BenziCarModel();
        car.setCarName(carName);
        car.setEngine(engine);
        car.setCarriageWheel(carriageWheel);
        car.setCarframe(carframe);

        return car;
    }
}
