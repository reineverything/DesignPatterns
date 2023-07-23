package pattern.builder.demo1;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/17 17:25
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {

        MobileBuilder mobileBuilder = new MobileBuilder();
        Director director = new Director(mobileBuilder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
