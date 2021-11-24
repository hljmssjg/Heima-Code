package 反射;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(10);
        array.add(20);

        Class<? extends ArrayList> c = array.getClass();

        Method m = c.getMethod("add", Object.class);

        m.invoke(array,"hello");
        System.out.println(array);

    }
}
