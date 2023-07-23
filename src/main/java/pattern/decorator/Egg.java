package pattern.decorator;

/**
 * @ClassName Egg
 * @Author shuai
 * @create 2023/7/22 10:33
 * @Instruction 鸡蛋类，具体装饰者角色
 */
public class Egg extends Garnish {


    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getFastFood().getPrice() + getPrice();
    }

    @Override
    public String getDesc() {
        //super.getDesc()-炒饭或者炒粉
        //this.getDesc()-鸡蛋
        return super.getDesc()+getFastFood().getDesc();
    }
}
