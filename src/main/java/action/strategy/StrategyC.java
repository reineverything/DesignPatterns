package action.strategy;

/**
 * @ClassName StrategyA
 * @Author shuai
 * @create 2023/7/25 9:19
 * @Instruction
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000加1元换购200元商品");
    }
}
