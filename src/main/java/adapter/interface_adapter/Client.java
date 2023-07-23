package adapter.interface_adapter;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/19 11:05
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {

        AbsAdapter absAdapter=new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("匿名内部类实现m1");
            }
        };

        absAdapter.m1();

        System.out.println(absAdapter.getClass());
    }
}
