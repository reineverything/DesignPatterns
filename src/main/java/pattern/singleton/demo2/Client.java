package pattern.singleton.demo2;

public class Client {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1==instance2);//==判断对象地址是否相等
    }
}