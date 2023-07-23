package adapter.object_adapter;



/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/19 10:08
 * @Instruction
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
