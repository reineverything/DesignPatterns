package action.observer;

/**
 * @ClassName WeiXInUser
 * @Author shuai
 * @create 2023/7/25 15:23
 * @Instruction
 */
public class WeiXInUser implements Observer{
    private String name;

    public WeiXInUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"-"+message);
    }
}
