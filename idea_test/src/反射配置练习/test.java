package 反射配置练习;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("java.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> aClass = Class.forName(className);

        Constructor<?> constructor = aClass.getConstructor();
        Object obj = constructor.newInstance();

        Method m = aClass.getMethod(methodName);
        m.invoke(obj);
    }
}
