package lh.com.lovo.homework;

/**
 * 汽车工厂
 */
public abstract class CarFactoryModel {
        //构建汽车名字
        public abstract String getName();
        //构建引擎
        public abstract void getEngine();
        //构建车架
        public abstract void getCarRack();
        //构建车轮
        public abstract void getWheel();

        final public String getCarModel(){
            this.getEngine();
            this.getCarRack();
            this.getWheel();

            return "创建汽车:"+this.getName();
        }
}
