package lh.com.lovo.homework;

/**
 * 实际建造者
 */
public class BwmCarBuilder extends JianZaoZheModel {

    @Override
    public CarFactoryModel buildCarFactoryModel(String name, String engine, String carRack, String wheel) {
        BwmCarModel ab = new BwmCarModel();
        ab.setName(name);
        ab.setEngine(engine);
        ab.setCarRack(carRack);
        ab.setWheel(wheel);
        return ab;
    }
}
