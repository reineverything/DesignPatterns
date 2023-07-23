package pattern.singleton.demo1;

public class Client {
    public static void main(String[] args) {
        //创建Singleton类的对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance2==instance1);
    }
}
