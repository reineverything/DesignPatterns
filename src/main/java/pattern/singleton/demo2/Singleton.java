package pattern.singleton.demo2;


/**
 * 饿汉式，静态代码块
 */
public class Singleton {

    //私有构造方法
    private Singleton() {
    }

    //声明Singleton类型的属性
    private static Singleton instance;//null，定义属性时没有赋值，而是在静态代码块中赋值

    static {
        instance = new Singleton();
    }

    //创建公共的可以调用instance的方法
    public static Singleton getInstance() {
        return instance;
    }

}