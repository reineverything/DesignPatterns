package action.strategy;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/25 9:23
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {
        //春节来了，使用策略A
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
