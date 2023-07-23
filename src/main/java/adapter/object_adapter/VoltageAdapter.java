package adapter.object_adapter;

/**
 * @ClassName VoltageAdapter
 * @Author shuai
 * @create 2023/7/19 10:05
 * @Instruction 采用对象适配器的方式
 */
public class VoltageAdapter implements IVoltage5V{

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        return src/44;
    }
}
