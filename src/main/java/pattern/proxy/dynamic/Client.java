package pattern.proxy.dynamic;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/20 16:14
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {

        //通过代理对象工厂来获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();
        ITeacherDao proxyObject = proxyFactory.getProxyObject();
        proxyObject.teach();
    }
}
