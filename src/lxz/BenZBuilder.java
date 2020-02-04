package lxz;
/**
 * 奔驰建造者
 */
public class BenZBuilder extends BuilderModel{
    @Override
    public CarFactory buildCarFactory(String name, String engine, String carRack, String wheel) {
        BenZCarModel bz =  new BenZCarModel();
        bz.setName(name);
        bz.setEngine(engine);
        bz.setCarRack(carRack);
        bz.setWheel(wheel);
        return bz;

}
}
