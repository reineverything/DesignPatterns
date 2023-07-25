package action.observer;


/**
 * @ClassName Subject
 * @Author shuai
 * @create 2023/7/25 15:13
 * @Instruction 抽象主题角色
 */
public interface Subject {

    //添加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
    void notify(String message);
}
