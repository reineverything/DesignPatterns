package pattern.singleton.demo1;


/**
 * 饿汉式，静态成员变量的方式
 */

/**
 * 私有的构造方法使得外界无法直接创建该类对象，为了使得外界能够获得该类对象，提供一个公共的获取对象的方法，这个方式必须是静态的，因为无法创建类对象。静态方法无法直接调
 * 类中的非静态成员变量
 */
public class Singleton {


    //1。私有构造方法。
    private Singleton(){}

    //2.在本类中创建本类对象
    private static Singleton instance=new Singleton();

    //3.提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }


}
