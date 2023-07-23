package pattern.decorator;

/**
 * @ClassName Egg
 * @Author shuai
 * @create 2023/7/22 10:33
 * @Instruction 培根类，具体装饰者角色
 */
public class Bacon extends Garnish {


    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
    }

    @Override
    public float cost() {
        return getFastFood().getPrice() + getPrice();
    }

    @Override
    public String getDesc() {
        //super.getDesc()-培根
        return super.getDesc()+getFastFood().getDesc();
    }
}
