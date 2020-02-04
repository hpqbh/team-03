package hjp.com.lovo.homework;

public abstract class Car {
    //获取车名
    public abstract void getCarName();
    //获取引擎
    public abstract void getYinQin();
    //获取车轮
    public abstract void getCheLun();
    //获取车架
    public abstract void getCheJia();
    //获整车
    final public  String  getWholeCar(){

        this.getCarName();
        this.getCheJia();
        this.getCheLun();
        this.getYinQin();

        return "获得整车";
    }
}
