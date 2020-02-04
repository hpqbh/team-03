package sl;

public class T {

    public static void main(String[] args) {
        CarBuilder carBuilder = new BmwCarBuilder();
        String str =
                carBuilder.buildCarModel("宝马","发动机","车轮","车架").getCar();
        System.out.println(str);
    }
}
