package pattern.builder.demo1;

/**
 * @ClassName OfoBuilder
 * @Author shuai
 * @create 2023/7/17 15:46
 * @Instruction 具体构建者，用来构建ofo单车对象
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("ofo单车车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo单车座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
