package pattern.decorator;

/**
 * @ClassName FiredNoodles
 * @Author shuai
 * @create 2023/7/22 10:29
 * @Instruction 炒面，具体构建类
 */
public class FiredNoodles extends FastFood{

    public FiredNoodles(){
        super(12,"炒面");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
