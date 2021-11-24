package 泛型接口;

public class GenericImplement<T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
