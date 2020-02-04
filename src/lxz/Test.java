package lxz;

public class Test {
    private static BuilderModel bmw = new BMWBuilder();
    private static BuilderModel bc = new BenZBuilder();

    public void BMW(){
        String str =
                bmw.buildCarFactory
                        ("宝马3系","宝马","宝马2020","百路驰").getCarModel();
        System.out.println(str);
    }
    public void BenZ(){
        String str =
                bc.buildCarFactory
                        ("奔驰大g","奔驰","奔驰2019","普利司通").getCarModel();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.BMW();
        t.BenZ();
    }
}
