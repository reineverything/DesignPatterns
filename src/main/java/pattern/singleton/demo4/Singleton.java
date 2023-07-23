package pattern.singleton.demo4;

/**
 * 双重检查锁机制
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量
    private static Singleton instance;

    //提供公共的访问方式
    public static Singleton getInstance(){

        //第一次判断，如果instance的值不为null，就可以直接返回对象
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
