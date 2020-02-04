package sl;

public abstract class CarModel {

    //获取汽车名
    public abstract String getCarName();

    //获取引擎
    public abstract void getEngine();

    //获取车轮
    public abstract void getCarriageWheel();

    //获取车架
    public abstract void getCarframe();

    final public  String  getCar(){
        this.getEngine();
        this.getCarriageWheel();
        this.getCarframe();

        return "构造汽车：" + this.getCarName();
    }
}
