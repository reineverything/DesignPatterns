package pattern.builder.demo3;


/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/18 10:01
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {

        /**
         * 链式编程，要求中间每一步函数的返回值都是该对象
         */
        Computer computer=new Computer.Builder()
                .cpu("intel")
                .memory("金士顿")
                .screen("三星屏幕")
                .mainboard("华硕")
                .build();

        System.out.println(computer);
    }
}
