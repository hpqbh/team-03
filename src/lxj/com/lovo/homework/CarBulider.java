package lxj.com.lovo.homework;

/**
 * 汽车实际建造者
 */
public class CarBulider extends CarBuliderModel {

    @Override
    public CarFactory creatCarFactory(Car car) {
        return car;
    }
}
