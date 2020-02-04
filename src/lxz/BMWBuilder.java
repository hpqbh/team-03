package lxz;
/**
 * 宝马建造者
 */
public class BMWBuilder extends BuilderModel{
    @Override
    public CarFactory buildCarFactory(String name, String engine, String carRack, String wheel) {
       BMWCarModel bmw = new BMWCarModel();
        bmw.setName(name);
        bmw.setEngine(engine);
        bmw.setCarRack(carRack);
        bmw.setWheel(wheel);
        return bmw;

}
}
