package pattern.builder.demo1;

/**
 * @ClassName Director
 * @Author shuai
 * @create 2023/7/17 15:50
 * @Instruction 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    //组装自行车
    public Bike construct(){
        //执行装备车架、车座
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
