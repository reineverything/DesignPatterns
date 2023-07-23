package adapter.class_adapter;

/**
 * @ClassName VoltageAdapter
 * @Author shuai
 * @create 2023/7/18 10:42
 * @Instruction
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int srcV=output220V();
        int dstV=srcV/44;//转成5V
        return dstV;
    }
}
