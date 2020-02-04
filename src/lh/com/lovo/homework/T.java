package lh.com.lovo.homework;

public class T {
    private static JianZaoZheModel car = new BwmCarBuilder();
    private static JianZaoZheModel car2 = new BenZCarBuilder();
    public static void main(String[] args) {
        T a = new T();
        a.Bwm();
        a.BenZ();
    }

    public void Bwm(){
        String str =
                car.buildCarFactoryModel
                        ("宝马","哈雷","好车架","橡胶车轮").getCarModel();
        System.out.println(str);
    }
    public void BenZ(){
        String str =
                car2.buildCarFactoryModel
                        ("奔驰","彗星","坏车架","塑料车轮").getCarModel();
        System.out.println(str);
    }
}
