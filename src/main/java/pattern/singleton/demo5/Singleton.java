package pattern.singleton.demo5;

/**
 * 静态内部类方式
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //定义一个静态内部类
    private static class SingletonHolder{

        //在内部类中声明并初始化外部类的对象
        private static final Singleton InSTANCE=new Singleton();//被final修饰就是常量
    }

    //提供公共的访问方式
    //当外界调用Singleton.getInstance方法时，才开始创建SingletonHolder对象并初始化INSTANCE
    public static Singleton getInstance(){
        return SingletonHolder.InSTANCE;
    }
}
