package action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SubscriptionSubject
 * @Author shuai
 * @create 2023/7/25 15:18
 * @Instruction 具体主题角色类
 */
public class SubscriptionSubject implements Subject{

    //定义一个集合，用来存储多个观察者对象
    private List<Observer> weiXinUserList=new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {

        //微信公众号的产生新消息，通知到所有的订阅者
        for(Observer observer:weiXinUserList){
            observer.update(message);
        }
    }
}
