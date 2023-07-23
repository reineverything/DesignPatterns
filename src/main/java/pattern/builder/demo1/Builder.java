package pattern.builder.demo1;

/**
 * @ClassName Builder
 * @Author shuai
 * @create 2023/7/17 15:20
 * @Instruction 构建者类
 */
public abstract class Builder {

    //声明bike类型的对象并赋值
    protected Bike bike=new Bike();

    //构建车架
    public abstract void buildFrame();

    //构建座椅
    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
