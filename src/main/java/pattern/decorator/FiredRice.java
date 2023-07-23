package pattern.decorator;

/**
 * @ClassName FiredRice
 * @Author shuai
 * @create 2023/7/22 10:26
 * @Instruction 炒饭，具体构建角色
 */
public class FiredRice extends FastFood{

    //通过无参构造给父类的成员变量赋值
    public FiredRice(){
        super(10,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
