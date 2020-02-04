package lh.com.lovo.homework;

/**
 * 奔驰车建造者
 */
public class BenZCarBuilder extends JianZaoZheModel{
    @Override
    public CarFactoryModel buildCarFactoryModel(String name, String engine, String carRack, String wheel) {
        BenZCarModel ab = new BenZCarModel();
        ab.setName(name);
        ab.setEngine(engine);
        ab.setCarRack(carRack);
        ab.setWheel(wheel);
        return ab;
    }
}
