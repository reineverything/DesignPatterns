package pattern.singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1，获取字节码对象
        Class clazz=Singleton.class;
        //2，获取无参构造方法
        Constructor constructor = clazz.getDeclaredConstructor();

        //3，由于这个无参构造方法是私有的，所以需要对无参构造取消访问检查
        constructor.setAccessible(true);

        //4，创建Singleton对象
        Singleton instance1 = (Singleton) constructor.newInstance();
        Singleton instance2 = (Singleton) constructor.newInstance();
        System.out.println(instance1 == instance2);
    }
}
