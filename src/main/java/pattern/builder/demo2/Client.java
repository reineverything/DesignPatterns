package pattern.builder.demo2;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/18 9:41
 * @Instruction 重构前的电脑生产
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer("intel","三星屏幕","金士顿","华硕");
        System.out.println(computer);
    }
}
