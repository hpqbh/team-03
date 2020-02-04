package lxj.com.lovo.homework;

public class T {

    private CarBulider cb = new CarBulider();

    public static void main(String[] args) {
        T t = new T();
        t.getBWM();
        System.out.println("------------------------");
        t.getBenz();
    }

    public void getBWM(){
        Car car = new Car("宝马","V8发动机","大直径轮胎","钛合金车架");
        String str = cb.creatCarFactory(car).getCar();
        System.out.println(str);
    }
    public void getBenz(){
        Car car = new Car("奔驰","V7发动机","小直径轮胎","钛钢合金车架");
        String str = cb.creatCarFactory(car).getCar();
        System.out.println(str);
    }
}
