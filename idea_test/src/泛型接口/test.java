package 泛型接口;

public class test {
    public static void main(String[] args) {
        GenericImplement<String> GI = new GenericImplement<String>();

        GI.show("林青霞");

        GenericImplement<Object> GI2 = new GenericImplement<Object>();

        GI2.show("林青霞");
        GI2.show(30);

    }
}
