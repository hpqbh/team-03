package lxz;

/**
 * 建造者
 */
public  abstract class BuilderModel {
    public abstract CarFactory buildCarFactory(String name,String engine,String carRack,String wheel);
}
