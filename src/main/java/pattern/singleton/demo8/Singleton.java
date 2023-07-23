package pattern.singleton.demo8;

import java.io.Serializable;

public class Singleton implements Serializable {

    private Singleton(){}

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
