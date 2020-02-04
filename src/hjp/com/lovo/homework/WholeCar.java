package hjp.com.lovo.homework;

public class WholeCar extends Car {

    private String carName;
    private String yinQin;
    private String cheLun;
    private String cheJia;

    @Override
    public void getCarName() {
        System.out.println(carName);
    }

    @Override
    public void getYinQin() {
        System.out.println(yinQin);
    }

    @Override
    public void getCheLun() {
        System.out.println(cheLun);
    }

    @Override
    public void getCheJia() {
        System.out.println(cheJia);
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setYinQin(String yinQin) {
        this.yinQin = yinQin;
    }

    public void setCheLun(String cheLun) {
        this.cheLun = cheLun;
    }

    public void setCheJia(String cheJia) {
        this.cheJia = cheJia;
    }
}
