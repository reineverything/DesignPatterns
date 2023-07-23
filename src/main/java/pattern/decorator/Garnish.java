package pattern.decorator;

/**
 * @ClassName Garnish
 * @Author shuai
 * @create 2023/7/22 10:30
 * @Instruction 装饰者类。抽象装饰角色
 */
public abstract class Garnish extends FastFood{

    //声明快餐类对象
    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);//调用父类的构造方法
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
