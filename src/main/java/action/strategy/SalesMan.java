package action.strategy;

/**
 * @ClassName SalesMan
 * @Author shuai
 * @create 2023/7/25 9:21
 * @Instruction 促销员，环境类
 */
public class SalesMan {

    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}
