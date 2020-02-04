package hjp.com.lovo.homework;

public class WholeCarBuilder extends CarBuilder {
    @Override
    public Car car(String carName, String yinQing, String cheJia, String cheLun) {
        WholeCar car = new WholeCar();
        car.setCarName(carName);
        car.setCheJia(cheJia);
        car.setCheLun(cheLun);
        car.setYinQin(yinQing);
        return car;
    }
}
