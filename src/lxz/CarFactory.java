package lxz;

/**
 * 汽车工厂
 */
public abstract class CarFactory {

    public abstract String getName();

    public abstract void getEngine();

    public abstract void getCarRack();

    public abstract void getWheel();

    final public String getCarModel(){
        this.getEngine();
        this.getCarRack();
        this.getWheel();

        return "汽车创建成功";
    }
}
