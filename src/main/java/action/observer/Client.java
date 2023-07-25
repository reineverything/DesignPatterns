package action.observer;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/25 15:25
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {

        //创建微信公众号
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        //创建微信用户
        WeiXInUser user1 = new WeiXInUser("张三");
        WeiXInUser user2 = new WeiXInUser("李四");

        //用户订阅公众号
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);

        //公众号发布消息
        subscriptionSubject.notify("今天是疯狂星期四，来抢券！");

        //用户李四取消订阅
        subscriptionSubject.detach(user2);

        //再次发布消息
        subscriptionSubject.notify("明天有暴雨，要做好准备！");
    }
}
