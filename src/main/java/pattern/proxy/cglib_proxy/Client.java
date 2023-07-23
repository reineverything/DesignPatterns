package pattern.proxy.cglib_proxy;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/22 9:26
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {

        ProxyFactory proxyFactory = new ProxyFactory();
        TeacherDao proxyObject = proxyFactory.getProxyObject();
        proxyObject.teach();
    }
}
