package hjp.com.lovo.homework;

public class T {
    public static void main(String[] args) {
        CarBuilder carBuilder = new WholeCarBuilder();
        String str = carBuilder.car("奔驰","引擎","车架 ","车轮").getWholeCar();
        System.out.println(str);

        System.out.println("===========");

        CarBuilder carBuilder1 = new WholeCarBuilder();
        String str1 = carBuilder.car("宝马","引擎","车架 ","车轮").getWholeCar();
        System.out.println(str);
    }
}
