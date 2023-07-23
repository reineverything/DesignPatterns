package adapter.class_adapter;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/18 10:50
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());//传入实现接口的类（多态）
    }
}
