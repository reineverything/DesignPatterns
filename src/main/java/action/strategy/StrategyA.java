package action.strategy;

/**
 * @ClassName StrategyA
 * @Author shuai
 * @create 2023/7/25 9:19
 * @Instruction
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
