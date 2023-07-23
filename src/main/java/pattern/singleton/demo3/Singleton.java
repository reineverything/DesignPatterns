package pattern.singleton.demo3;

/**
 * 懒汉式：线程不安全的方式
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量instance
    private static Singleton instance;

    //对外提供返回方式
    public synchronized static Singleton getInstance(){

        //这里判断，如果已经有了Singleton对象，就直接返回，否则直接new
        if(instance ==null){
            /**
             * 这里会有线程冲突的问题，当线程1、线程2同时执行时，当线程1占用cpu时，此处instance==null，假设线程2占用cpu，线程1卡住，判断instance=null.
             * 可能导致的结果时，new了两次。
             */
            return new Singleton();
        }
        return instance;
    }
}