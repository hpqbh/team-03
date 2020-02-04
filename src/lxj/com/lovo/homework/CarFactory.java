package lxj.com.lovo.homework;

/**
 * 汽车工厂
 */
public abstract class CarFactory {

    public abstract void getCarName();

    public abstract void getEngine();

    public abstract void getWheel();

    public abstract void getCarFrame();

    public final String getCar(){
        this.getCarName();
        this.getEngine();
        this.getWheel();
        this.getCarFrame();

        return "创建汽车完毕";
    }


}
