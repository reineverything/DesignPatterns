package adapter.class_adapter;

/**
 * @ClassName Phone
 * @Author shuai
 * @create 2023/7/18 10:48
 * @Instruction 手机冲电
 */
public class Phone {

    public void charging(IVoltage5V iVoltage5V){
        int dst=iVoltage5V.output5V();
        if(dst==5){
            System.out.println("可以充电");
        }else if(dst>5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
