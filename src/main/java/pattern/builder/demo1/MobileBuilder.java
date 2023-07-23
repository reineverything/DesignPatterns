package pattern.builder.demo1;

/**
 * @ClassName MobileBike
 * @Author shuai
 * @create 2023/7/17 15:29
 * @Instruction 具体的构建者：用来构建摩拜单车对象
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("摩拜单车车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("摩拜单车座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
